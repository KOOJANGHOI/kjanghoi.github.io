---
layout: post
title: 27.File and Directories 
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

### Persistent Storage 
Keep a data intact even if there is a power loss
- A file system has a responsibility to store data persistently on disk
- Hard disk drive, Solid-state storage device 

**Two key abstractions in the virtualization of storage**
- File, Directory 


### File: A Linear array of bytes
사용자는 데이터를 다양한 storage에 저장한다. (Disk, tape ..) 운영체제는 다양한 storage에 대한 균일한 논리적 뷰를 제공하다. 이것이 파일이다.

Each file has low-level name as inode number
- The user is not aware of this name.


### Directory
It contains a list of
- (user-readable name, low-level name) pairs of files
- (user-readable name, low-level name) pairs of directories

![1.1](/assets/images/os/39.1.png)

#### Creating Files 
Use open() system call with O_CREAT flag. 

![1.1](/assets/images/os/39.2.png)

open() system call returns file descriptor. (an integer, and is used to access files) 

#### Reading and Writing Files (Sequentially)

![1.1](/assets/images/os/39.3.png)

![1.1](/assets/images/os/39.4.png)

`open(file descriptor, flags)`
- Return file descriptor (3 in example)
- File descriptor 0, 1, 2, is for standard input/ output/ error. 

`read(file descriptor, buffer pointer, the size of the buffer)`
- Return the number of bytes it read 

`write(file descriptor, buffer pointer, the size of the buffer)`
- Return the number of bytes it write 


#### Reading And Writing, But Not Sequentially)
An open file has a current offset. Determine where the next read or write will begin reading from or writing to within the file. 

![1.1](/assets/images/os/39.5.png)

**Writing Immediately with fsync()** 

![1.1](/assets/images/os/39.6.png)

The file system will buffer writes in memory for some time. At that later point in time, the write(s) will actually be issued to the storage device. 

So, Data can be lost when writing (e.g., the machine crashes). although write seem to complete quickly. 
However, some applications require more than eventual guarantee. 
- e.g) DBMS requires force writes to disk from time to time. 

An Example of fsync(). 
- Filesystem forces all dirty (i.e., not yet written) data to disk for the file referred to by the file description. 
- fsync() returns once all of theses writes are complete. 


#### Other operations

- Renaming Files  : `rename(char* old, char *new)`
- Getting Information About Files : stat(), fstat()
- Removing Files : rm
	- rm call unlink() to remove a file

![1.1](/assets/images/os/39.7.png)

- Making Directories  : mkdir()
- Reading Directories : ls
- Deleting Directories  : rmdir()
	- Require that the directory be empty. If you call rmdir()to a non-empty directory, it will fail. 

### Hard Links and symbolic links

#### Hard Links
Create another way to refer to the same file 
- 원래 파일의 데이터에 접근하는 또 다른 경로 inode를 복사하는 것이기 때문에 , 여러개 만들어도 데이터는 하나다. 
- (link->data<-original file)

- link(old pathname, new one) 
- Link a new file name to an old one 
- The command-line link program

![1.1](/assets/images/os/39.8.png)

- Create another name in the directory. 
- Refer it to the same inode number of the original file.
	- The file is not copied in any way. 
- Then, we now just have two human names (file and file2) that both refer to the same file
	- Two files have same inode number, but two human name (file, file2)

Thus, to remove a file, we just call unlink()

![1.1](/assets/images/os/39.9.png)

reference count
- Track how many different file names have been linked to this inode
- When unlink() is called, the reference count decrements. 
- If the reference count reaches zero, the filesystem free the inode and related data blocks
	- truly “delete” the file !


#### Symbolic Links (Soft Link)
More useful than Hard link.
- 이미 존재하는 파일을 가리키는 새로운 파일 (link -> original file -> data)

![1.1](/assets/images/os/39.10.png)

- Hard Link cannot create to a directory. 
- Hard Link cannot create to a file to other partition.
	- Because inode numbers are only unique within a file system. 

Symbolic links are a third type the file system knows about. 
- A symbolic link holds the pathname of the linked file as data of the link file

![1.1](/assets/images/os/39.11.png)

When remove a original file, symbolic link points noting. 

![1.1](/assets/images/os/39.12.png)

**Examples**

![1.1](/assets/images/os/39.13.png)




