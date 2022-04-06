---
layout: post
title: 28.File system Implementation
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

There are two different aspects to implement file system 

**Data structures** 

What types of on-disk structures are utilized by the file system to organize its data and metadata? 

**Access methods **

How does it map the calls made by a process as open(),read(),write(), etc. 
- Which structures are read during the execution of a particular system call? 


### Implementation of Data structures  

**Divide the disk into blocks**

- Block size is 4 KB. (Example)
- The blocks are addressed from 0 to N -1. 
￼
![1.1](/assets/images/os/40.1.png)

**Data region: Store use data**
￼
![1.1](/assets/images/os/40.2.png)

**Inode table: Holds an array of on-disk nodes**
￼
![1.1](/assets/images/os/40.3.png)

Each inode is referred to by inode number. 
- by inode number, File system calculate where the inode is on the disk. 
- Ex) inode number: 32
    - Calculate the offset into the inode region (32 x sizeof(inode) (256 bytes) = 8192 
    - Add start address of the inode table(12 KB) + inode region(8 KB) = 20 KB 

**Example**

inode tables : 3 ~ 7, inode size : 256 bytes
- 4-KB block can hold 16 inodes.
- The filesystem contains 80 inodes. (maximum number of files) 

![1.1](/assets/images/os/40.4.png)

allocation structures : track whether inodes or data blocks are free of allocated

File system track which inode and data block are free or not. 

In order to manage free space, we have two simple bitmaps. 
- Data bitmap, inode bitmap
- Use bitmap, each bit indicates free(0) or in-use(1) 
- When file is newly created, it allocated inode by searching the inode bitmap and update on-disk bitmap. 
- Pre-allocation policy is commonly used for allocate contiguous blocks.


Superblock: contains information of file system
- The number of nodes, begin location of inode table. Etc
- Thus, when mounting a file system, OS will read the superblock first, to initialize various information.


### The Multi-Level Index : to support bigger files
￼
![1.1](/assets/images/os/40.5.png)

Indirect pointer points to a block that contains more pointers. 
- inode have fixed number of direct pointers (12) and a single indirect pointer
- If a file grows large enough, an indirect block is allocated, inode’s slot for an indirect pointer is set to point to it. 

### Directory Organization 
Directory contains a list of (entry name, inode number) pairs. 

Each directory has two extra files
- ”.” for current directory
- ”..” for parent directory
￼
![1.1](/assets/images/os/40.6.png)

### Access Paths 

Access Paths: Reading a File From Disk 
￼
![1.1](/assets/images/os/40.7.png)

Issue an open(“/foo/bar”, O_RDONLY), 
- Traverse the pathname and thus locate the desired indoe. 
- Begin at the root of the file system (/)
    - In most Unix file systems, the root inode number is 2 
- Filesystem reads in the block that contains inode number 2. 
- Look inside of it to find pointer to data blocks (contents of the  root). 
- By reading in one or more directory data blocks, It will find “foo” directory. 
- Traverse recursively the path name until the desired inode (“bar”) 
- Check finale permissions, allocate a file descriptor for this process and returns file descriptor to user.  

Issue read() to read from the file. 
- Read in the first block of the file, consulting the inode to find the location of such a block. 
- Update the inode with a new last accessed time.
- Update in-memory open file table for file descriptor, the file offset. 

When file is closed: 
- File descriptor should be deallocated, but for now, that is all the file system really needs to do. No dis I/Os take place. 


### Access Paths: Writing to Disk 

![1.1](/assets/images/os/40.8.png)




