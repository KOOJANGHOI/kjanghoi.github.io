---
layout: post
title: 18.Thread API
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

### Introduction
Pthread는 thread 생성과 관리를 위한 API를 정의하는 POSIX 표준 (IEEE 1003.1c) 이다. 
이 표준은 API의 행위만 정의하고있으며, 구현은 운영체제에 따라 다르다.



#### Thread Creation 

![1.1](/assets/images/os/27.1.png)

- Thread: used to interact with this thread
- Attr : used to specify any attributes this thread might have
    - Stack, scheduling priority …
- start_routine: the function this thread start running in 
- arg: the argument to be passed to function 
    - A void pointer allows us to pass in any type of argument

#### Wait for a thread to complete 

![1.1](/assets/images/os/27.2.png)

- thread: Specify which thread to wait for
- value_ptr: A pointer to the return value 
    - Because pthread_join() routine changes the value, you need to pass in a pointer to that value. 

#### Example
￼
![1.1](/assets/images/os/27.3.png)

![1.1](/assets/images/os/27.4.png)S

Be careful with how values are returned from a thread

When the variable r returns, it is automatically de-allocated. 
￼
![1.1](/assets/images/os/27.5.png)

Than, pass simpler argument to a thread
￼
![1.1](/assets/images/os/27.6.png)

### Lock
￼
![1.1](/assets/images/os/27.7.png)

- Provide mutual exclusion to a critical section
- All locks must be properly initialized
￼
![1.1](/assets/images/os/27.8.png)


### Conditional variables
￼
![1.1](/assets/images/os/27.9.png)

- Conditional variables are useful when some kind of signaling must take place between threads
- The waiting thread re-checks the condition in a while loop, instead of a simple if statement.
    - Without rechecking, the waiting thread will continue thinking that the condition has changed even though it has not. 
￼
![1.1](/assets/images/os/27.10.png)

- pthread_cond_wait:
    - Put the calling thread to sleep.
    - Wait for some other thread to signal it. 
- pthread_cond_signal:
    - Unblock at least one of the threads that are blocked on the condition variable 





