---
layout: post
title: 23.Common Concurrency Problems
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

**What Types Of Bugs Exist?**
￼
![1.1](/assets/images/os/32.1.png)

### Non-Deadlock Bugs
Make up a majority of concurrency bugs. 
- Atomicity violation, order violation


#### Atomicity violation
The desired serializability among multiple memory accesses is violated


**Example: two different thread access same field**
￼
![1.1](/assets/images/os/32.2.png)

Solution: simply add locks around the shared-variable references
￼
![1.1](/assets/images/os/32.3.png)

#### Order-Violation Bugs
The desired order between two memory accesses is flipped

**Example: the code in thread2 seems to assume that the variable ‘mThread’ has already been initialized**
￼
![1.1](/assets/images/os/32.4.png)

Solution: enforce ordering using conditional variables
￼
![1.1](/assets/images/os/32.5.png)

![1.1](/assets/images/os/32.6.png)￼


### Deadlock Bugs 

![1.1](/assets/images/os/32.7.png)

#### Why Do Deadlocks Occur? 
- In large code bases, complex dependencies arise between components. 
- Due to the nature of encapsulation 
    - Hide details of implementations and make software easier to build in a modular way. Such modularity does not mesh well with locking. 

#### Condition for Deadlock 
- If any of these four conditions are not met, deadlock cannot occur. 
￼
![1.1](/assets/images/os/32.8.png)

**How to prevent dead lock?**

#### Circular wait
- Provide a total ordering on lock acquisition
- This approach requires careful design of global locking strategies
- e.g.
    - There are two locks in the system (L1, L2)
    - We can prevent deadlock by always acquiring L1 before L2

#### Hold and wait
- Acquire all locks at once and atomically
- But it require us to know when calling a routine exactly which locks must be held and to acquire them ahead of time.
    - Decrease concurrency 

#### No preemption
- Trylock
- Livelock

#### Mutual exclusion
- Wait-free using hardware instruction
- E.g. compare-and-swap

#### Detect and Recover 
- Many database systems employ deadlock detection and recovery technique. 
    - A deadlock detector runs periodically.
    - Building a resource graph and checking it for cycles.
    - In deadlock, the system need to be restarted. 




