---
layout: post
title: 21.Condition Variables
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

### Why need conditional variables
- There are many cases where a thread wishes to check whether a condition is true before continuing its execution
- Example
	- A parent thread might wish to check whether a child thread has completed
	- There is often called Join()

#### Example: do not wait child thread completed

![1.1](/assets/images/os/30.1.png)

#### Example: spin-wait until child thread completed
- This is hugely inefficient as the parent spins and wastes CPU time. 

![1.1](/assets/images/os/30.2.png)

**How to wait for a condition**
- Wait
	- An explicit queue that threads can put themselves on when some state of execution is not as desired
- Signaling
	- Some other thread, when it changes said state, can wake one of those waiting threads and allow them to continue execution


### Conditional variable : POSIX

#### Declaration
Proper initialization is required

![1.1](/assets/images/os/30.3.png)

#### Operation
- wait() : takes mutex as a parameter
- It release the lock and put the calling thread to sleep
- When the thread wakes up, it must re-acquire the lock
	
![1.1](/assets/images/os/30.4.png)


**Example**
wait using conditional variable until child thread completed

![1.1](/assets/images/os/30.5.png)

![1.1](/assets/images/os/30.6.png)

Parent 
- Create the child thread and continues running itself. 
- Call into thr_join() to wait for the child thread to complete. 
- Acquire the lock 
- Check if the child is done 
- Put itself to sleep by calling wait() 
- Release the lock  

Child
- Print the message “child” 
- Call thr_exit() to wake the parent thread 
- Grab the lock 
- Set the state variable done 
- Signal the parent thus waking it.  






