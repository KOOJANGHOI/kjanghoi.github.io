---
layout: post
title: 29.Crash Consistency
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

### Crash Consistency 
Unlike most data structure, file system data structures must persist 
- They must survive over the long haul, stored on devices that retain data despite power loss. 

One major challenge faced by a file system is how to update persistent data structure despite the presence of a power loss or system crash.  

the approaches taken by older file systems
- fsck(file system checker) 
- journaling(write-ahead logging)  

#### The Crash Consistency Problem 
What we’d like to do ideally is move the file system from on consistent state to another atomically 

Unfortunately, we can’t do this easily
- The disk only commits one write at a time
- Crashes or power loss may occur between these updates 

#### Example

![1.1](/assets/images/os/42.1.png)

![1.1](/assets/images/os/42.2.png)

![1.1](/assets/images/os/42.3.png)

![1.1](/assets/images/os/42.4.png)

#### Crash Scenario (1)
only a single write succeeds; there are thus three possible outcomes 

- Just the data block(Db) is written to disk
	- The data is on disk, but there is no inode
	- Thus, it is as if the write never occurred
	- This case is not a problem at all 

- Just the updated inode(I[v2]) is written to disk
	- The inode points to the disk address (5, Db) 
	- But, the Db has not yet been written there
	- We will read garbage data(old contents of address 5) from the disk • Problem : file-system inconsistency 

- Just the updated bitmap (B[v2]) is written to disk
	- The bitmap indicates that block 5 is allocated
	- But there is no inode that points to it
	- Thus, the file system is inconsistent again 
	- Problem : space leak, as block 5 would never be used by the file system 

#### Crash Scenario (2)
two writes succeed and the last one fails 

- The inode(I[v2]) and bitmap(B[v2]) are written to disk, but not data(Db)
	- The file system metadata is completely consistent
	- Problem : Block 5 has garbage in it 

- The inode(I[v2]) and the data block(Db) are written, but not the bitmap(B[v2]) 
	- We have the inode pointing to the correct data on disk
	- Problem : inconsistency between the inode and the old version of the bitmap(B1) 

- The bitmap(B[v2]) and data block(Db) are written, but not the inode(I[v2]) 
	- Problem : inconsistency between the inode and the data bitmap
	- We have no idea which file it belongs to 


### FSCK: The File System Checker
unix tool for finding inconsistencies and repairing them

- Check super block, free block, inode state, inode link, etc
- Such an approach can’t fix all problems 
    - example : The file system looks consistent but the inode points to garbage data.
- The only real goal is to make sure the file system metadata is internally 
consistent. 

#### Basic summary

**Superblock**
- fsck first checks if the superblock looks reasonable 
- Sanity checks : file system size > number of blocks allocated
- Goal : to find suspect superblock
- In this case, the system may decide to use an alternate copy of the superblock 

**Free blocks**
- fsck scans the inodes, indirect blocks, dobule indirect blocks,
- The only real goal is to make sure the file system metadata is internally consistent 

**Inode state**
- Each inode is checked for corruption or other problem 
    - Example : type checking(regular file, directory, symbolic link, etc)
- If there are problems with the inode fields that are not easily fixed. 
    - The inode is considered suspect and cleared by fsck

**Inode Links** 
- fsck also verifies the link count of each allocated inode
    - To verify the link count, fsck scans through the entire directory tree 
- If there is a mismatch between the newly–calculated count and that found within an inode, corrective action must be taken 
    - Usually by fixing the count with in the inode 

**Inode Links**
- If an allocated inode is discovered but no directory refers to it, it is moved to the lost+found directory 

**Duplicates**
- fsck also checks for duplicated pointers
- Example : Two different inodes refer to the same block 
    - If on inode is obviously bad, it may cleared 
    - Alternately, the pointed-to block could be copied  

**Bad blocks** 
- A check for bad block pointers is also performed while scanning through the list of all pointers 
- A pointer is considered “bad” if it obviously points to something outside it valid range 
- Example : It has an address that refers to a block greater than the partition size 
    - In this case, fsck can’t do anything too intelligent; it just removes the pointer 

**Directory checks** 
- fsck does not understand the contents of user files 
    - However, directories hold specifically formatted information created by the file system itself 
    - Thus, fsck performs additional integrity checks on the contents of each directory
- Example 
    - making sure that “.” and “..” are the first entries 
    - each inode referred to in a directory entry is allocated? 
    - ensuring that no directory is linked to more than once in the entire hierarchy  

#### Analysis

Buliding a working fsck requires intricate knowledge of the filesystem 

fsck have a bigger and fundamental problem: too slow 
- scanning the entire disk may take many minutes or hours 
- Performance of fsck became prohibitive as disk grew in capacity and RAIDs grew in popularity 

At a higher level, the basic premise of fsck seems just a tad irrational. 
- It is incredibly expensive to scan the entire disk 
- It works but is wasteful 
- Thus, as disk(and RAIDs) grew, researchers started to look for other solutions 

### Journaling (Write-Ahead Logging) 
디스크에 있는 인덱스가 갱신되기 전에 로그에 기록(data의 변경 이력, matadata)되기 때문에 정전이나 다른 문제 때문에 인덱스에 이상이 생기더라도 다시 시스템을 재가동하면 운영체제가 로그를 보고 인덱스를 재작성 및 복구를 할 수 있게 된다. 

When updating the disk, before overwriting the structures in place, first  write down a little note describing what you are about to do  

Writing this note is the “write ahead” part, and we write it to a structure that we organize as a “log”  

By writing the note to disk, you are guaranteeing that if a crash takes places during the update of the structures you are updating, you can go back and look at the note you made and try again  

Thus, you will know exactly what to fix after a crash, instead of having to scan the entire disk  


#### Example

![1.1](/assets/images/os/42.5.png)

**TxB**
- Transaction begin block 
- It contains some kind of transaction identifier(TID) 

The middle three blocks just contain the exact content of the blocks themselves 
- This is known as physical logging 

**TxE**
- Transaction end block
- Marker of the end of this transaction • It also contain the TID 

**Checkpoint**
- Once this transaction is safely on disk, we are ready to overwrite the old  structures in the file system 
- This process is called checkpointing 
- Thus, to checkpoint the file system, we issue the writes I[v2], B[v2], and Db to their disk locations  

#### Sequence of operations
**Journal write** 
- Write the transaction to the log and wait for these writes to complete • TxB, all pending data, metadata updates, TxE 

**Checkpoint** 
- Write the pending metadata and data updates to their final locations 

#### Writing
- Transaction each one at a time 
	- 5 transactions (TxB, I[v2], B[v2], Dnb, TxE)
	- This is slow because of waiting for each to complete 

- Transaction all block writes at once 
	- Five writes -> a single sequential write : Faster way
	- However, this is unsafe 
	- Given such a big write, the disk internally may perform scheduling and complete small pieces of the big write in any order 
	- Thus, the disk internally may (1) write TxB, I[v2], B[v2], and TxE and only later (2) write Db 
	- Unfortunately, if the disk loses power between (1) and (2) 

![1.1](/assets/images/os/42.6.png)

- Transaction looks like a valid transaction. 
- Further, the file system can’t look at that forth block and know it is wrong. 
- It is much worse if it happens to a critical piece of file system, such as superblock. 
- To avoid this problem, the file system issues the transactional write in two steps
- Journal commit (added) : write the transaction commit block  before journal write

![1.1](/assets/images/os/42.7.png)

#### Recovery

If the crash happens before the transactions is written to the log 
- The pending update is skipped 

If the crash happens after the transactions is written to the log, but before the checkpoint 

Recover the update as follow: 
- Scan the log and lock for transactions that have committed to the disk 
- Transactions are replayed  


#### Finite log size
The larger the log, the longer recovery will take and No further transactions can be committed to the disk 

To address these problems, journaling file systems treat the log as a circular data structure, re-using it over and over 

To do so, the file system must take action some time after a checkpoint. Specifically, once a transaction has been checkpointed, the file system should free the space 

#### Journal super block 
Mark the oldest and newest transactions in the log. 

The journaling system records which transactions have not been check pointed. 

![1.1](/assets/images/os/42.8.png)


#### Metadata Journaling 

There is a still problem in data journaling: writing every data block to disk twice
- Commit to log (journal file), Checkpoint to on-disk location

People have tried a few different things in order to speed up performance. 
- Example : A simpler form of journaling is called ordered journaling (User data is not written to the journal) 

![1.1](/assets/images/os/42.9.png)

**when should we write data blocks to disk?**

- Data Write(added): Write data to final location 
- Journal metadata write(added): Write the begin and metadata to the log 
- Journal commit 
- Checkpoint metadata 
- Free 

![1.1](/assets/images/os/42.10.png)

