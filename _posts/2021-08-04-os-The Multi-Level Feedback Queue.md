---
layout: post
title: 6.The Multi-Level Feedback Queue 
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

### MLFQ
A scheduler learns from the past to predict the future
- 피드백을 통해 Turnaround time을 개선한다

#### Basic Rules
- 우선순위에 따라 여러 큐가 있다.
- 가장 높은 우선순위의 큐에서 pop 될때 cpu time을 할당받는다
- 큐 마다는 RR 정책에 따른다.
- 새로 생성된 Job은 가장 높은 큐에 들어간다.
- Cpu time을 모두 사용했다면 아래 큐로 이동
- Cpu time을 모두 사용하지 않고 나왔다면 동일 큐로 들어감
- 모든 프로세스는 특정 시간이 지나면 위 큐로 이동한다.

#### Problems
- Starvation: Too many interactive 하다면, 오래걸리는 job은 starve 될 수 있다.
- Game the scheduler: I/O bound 한 프로세스들이 높은 우선순위를 차지하게 됨

### Proportional Share
To guarantee that each job obtain a certain percentage of CPU time. 
- Turnaround time, Response time 보다, 각 프로세스들이 특정 퍼센트만큼 cpu를 fair 하게 점유하게 한다

e.g) Lottery scheduling

#### Deterministic Proportional-Share Resource Management

**Stride Scheduling**
- 프로세스마다 ticket 을 갖는다.
- Stride = a large number / ticket

**Pseudo implementation**
![1.1](/assets/images/os/10.1.png)