---
layout: post
title: 20.Lock-based Concurrent Data Structure 
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

### Lock-based concurrent data structure
- By adding locks to data structure makes the structure thread safe
- How locks are added determine both the correctness and performance of the data structure. 


#### Example1
**concurrent counter without lock**
- Simple but not scalable
￼
![1.1](/assets/images/os/29.1.png)


#### Example2
**concurrent counter with single lock**
- But, synchronized counter scales poorly

![1.1](/assets/images/os/29.2.png)

![1.1](/assets/images/os/29.3.png)

![1.1](/assets/images/os/29.4.png)

then, How makes the time to complete the task not increased even though more task?

### Sloppy counter
- Per CPU core, a single local counter and its lock
- A single global counter and its lock
- Sloppiness : How often the local-to-global transfer occurs is determined by a threshold 
    - The smaller S:
        - the more the counter behaves like the non-scalable counter
        - Performance is poor, The global count is always quire accurate. 
    - The bigger S
        - The more scalable the counter.
        - The further off the global value might be from the actual count. 
        - Performance is excellent, The global count lags. 

#### Implementation

![1.1](/assets/images/os/29.5.png)

![1.1](/assets/images/os/29.6.png)





