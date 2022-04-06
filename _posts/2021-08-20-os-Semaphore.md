---
layout: post
title: 22.Semaphore
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

### Semaphore
- An object with an integer value
- The integer manipulated with two routines
	- sem_wait()
	- sem_post()


#### Initialization

![1.1](/assets/images/os/31.1.png)

- Declare a semaphore s and initialize it to the value 1 
- The second argument, 0, indicates that the semaphore is shared between threads in the same process. 


`sem_wait()`

![1.1](/assets/images/os/31.2.png)

- If the value of the semaphore was one or higher when called sem_wait(), return right away. 
- It will cause the caller to suspend execution waiting for a subsequent  post. 
- When negative, the value of the semaphore is equal to the number of waiting threads. 


`sem_post()`

![1.1](/assets/images/os/31.3.png)

- Simply increments the value of the semaphore. 
- If there is a thread waiting to be woken, wakes one of them up. 

#### Example: A parent thread waiting for its child

![1.1](/assets/images/os/31.4.png)

**Case1: the parent call sem_wait() before the child has called sem_post()**

![1.1](/assets/images/os/31.5.png)


**Case2: The child runs to completion before the parent call sem_wait()** 

![1.1](/assets/images/os/31.6.png)


### Read-Write Lock
- Only a single writer can acquire the lock. 
- Once a reader has acquired a read lock,
	- More readers will be allowed to acquire the read lock too.
	- A writer will have to wait until all readers are finished. 

![1.1](/assets/images/os/31.7.png)

![1.1](/assets/images/os/31.8.png)

The reader-writer locks have fairness problem. 
- It would be relatively easy for reader to starve writer. 
- How to prevent more readers from entering the lock once a writer is waiting? 

#### The Dining Philosophers 
![1.1](/assets/images/os/31.9.png)




