---
layout: post
title: 11.Free-Space Management
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

### Free space management
- Splitting : free space를 쪼개서 사용한다.
- Coalescing : nearby free chunks를 merge 한다.
    - If a user requests memory that is bigger than free chunk size, the list will not find such a free chunk. 

![1.1](/assets/images/os/17.1.png)

![1.1](/assets/images/os/17.2.png)
￼
#### API
**`free(void *ptr)`**
Does not take a size parameter. How does the library know the size of memory region that will be back into free list ?

Most allocators store extra information in a header block
- Additional pointers to speed up deallocation
- A magic number for integrity checking
- The size for free region is the size of the header plus the size of the space allocated to the user. 
￼
![1.1](/assets/images/os/17.3.png)

![1.1](/assets/images/os/17.4.png)

![1.1](/assets/images/os/17.5.png)

￼
#### Example

![1.1](/assets/images/os/17.6.png)

**Basic strategies for managing free space**
- Best fit
- Worst fit
- First fit
- Next fix

**Other approaches**
- Segregated List
- Buddy Allocation
￼