---
layout: post
title: 16.Swaping Policies
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

### Deciding which page to evict
Encapsulated within the replacement policy of the OS
- For minimize percentage of cache miss 
- For minimize average memory access time

#### A Simple Policy: FIFO 
- Pages were placed in a queue when they enter the system.


**BELADY’S ANOMALY**
We would expect the cache hit rate to increase when the cache gets larger. But in this case, with FIFO, it gets worse. 


#### Using History: LRU, LFU 
- Recency : LRU
- Frequency: LFU


### Page Selection Policy 
**Prefetching**
- The OS guess that a page is about to be used, and thus bring it in ahead of time
￼
![1.1](/assets/images/os/22.1.png)

**Clustering, Grouping**
- Collect a number of pending writes together in memory and write them to disk in one write. 

![1.1](/assets/images/os/22.2.png)


### Thrashing 
계속하여 page fault가 발생하는 현상
프로세스를 실행하는 시간보다 page 교체에 시간이 더 많아지면 발생하였다고 한다.

Multi programming 정도가 높아짐에 따라 CPU utilization이 과도하게 올라갔을경우
Thrashing이 발생하게되고, CPU utilization이 급격하게 떨어진다.

운영체제가 CPU utilization을 감시하면서, 이용률이 낮아지면 새로운 프로세스를 시스템에 추가하면서 다중 프로그래밍 정도를 높이는데, 그 프로세스가 더 많은 페이지를 필요로 하게되면, 페이지 폴트가 발생하고다른 프로세스로부터 프레임들을 가져오게 되는데, 그 프로세스 역시 페이지 폴트가 발생하게되면...  페이징 장치에 대한 queuing이 진행되면서, 프로세스들은 페이징 장치를 기다리게 되면서 준비완료 queue가 비게된다. 그러니까 CPU이용률이 급감한다. 

**해결방법**
- 지역 교환 알고리즘
- 우선순위 교환 알고리즘
- OS가 각 프로세스가 필요로하는 최소한의 프레임의 갯수를 보장해 주어야 한다. (Hard)

Memory is oversubscribed and the memory demands of the set of running processes exceeds the available physical memory. 
- Decide not to run a subset of processes.
- Reduced set of processes working sets fit in memory.

![1.1](/assets/images/os/22.3.png)





