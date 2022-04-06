---
layout: post
title: 4.Concurrency, Basics 
subtitle: 
categories: [SoftwareEngineering]
tags: [ComputerScience]
---

### Parallelism vs Concurrency
 
**Parallelism**
: use extra resources to solve problem faster
￼
![1.1](/assets/images/se/4.1.png)

**Concurrency**
: Correctly and efficiently manage access to shared resources
￼
![1.1](/assets/images/se/4.2.png)

There is some connection
- Common to use threads for both
- If parallel computations need access to shared resources, then the concurrency needs to be managed
- concurrency is required to utilize multiple cores 


### Memory hierarchy
￼
![1.1](/assets/images/se/4.3.png)

### Cache Coherence vs Consistency 

### Memory consistency model
- Total store ordering
- Weak consistency
- Release consistency

### Common concurrency errors

#### Atomicity violations
: code that is meant to execute “atomically” (that is, without interference from other threads) suffers interference from other thread
￼
![1.1](/assets/images/se/4.4.png)

#### Ordering violations 
: Incorrect signaling between a producer and a consumer
￼
![1.1](/assets/images/se/4.5.png)

#### Unintended sharing 
: Threads accidentally sharing objects
￼
![1.1](/assets/images/se/4.6.png)

#### Deadlocks and livelocks 
: Deadlock, waiting for each other to release the lock
￼
![1.1](/assets/images/se/4.7.png)

### Data race
: Data race is good symptom for Atomicity violations, Ordering violations, Unintended sharing 

Two accesses to same memory location and at least one of them is write

#### Data races vs Race conditions
: A data race is a good symptom for a race condition 

#### Race condition 
: Occurs when the computation result depends on scheduling
Due to e.g. events, device interactions, thread interleaving •... 

#### Problems with Locks 

**Deadlock**
: processes that cannot proceed because they are waiting for resources that are held by processes that are waiting for …

**Priority inversion**
: low-priority processes hold a lock required by a higher-priority process

**Convoying**
: several processes need locks in a roughly similar order
If one slow process gets in first, all the other processes slow to speed of the first one

**Kill-tolerance availability**
: if threads are  killed/crash while holding locks, what happens ?

### Lock-free programming
: lock 없이 concurrency 보장. May be h/w support 필요. (e.g. compare-and-set instruction)

Thread-safe access to shared data without the use of synchronization primitives such as mutexes

#### ABA Problem








