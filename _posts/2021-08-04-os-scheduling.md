---
layout: post
title: 5.Scheduling Introduction
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

### Introduction 
- CPU 스케쥴링이란, 스케쥴링 정책에 맞는 프로세스에게 CPU time을 할당하는것이다.
- 다중 프로그래밍의 목적은 항상 실행될 수 있는 프로세스가 있도록하여 CPU 사용 효율을 극대화 하는데 있다.

### CPU-I/O Burst
프로세스는 실행되는동안 CPU 실행과 I/O 대기의 두 주기를 반복한다.

계산 중심 프로세스(CPU-bound process)는 적은수의 매우 긴 CPU 버스트를 가지며, I/O 중심 프로세스(I/O bound process)는 많은수의 짧은 CPU 버스트를 가진다.

![4.1](/assets/images/os/7.1.png)￼

프로세스의 CPU 버스트는 프로세스의 특성과 시스템마다 다양하지만 보통 아래와 같은 빈도수를 나타낸다. 

![4.1](/assets/images/os/7.2.png)￼


### Scheduling Metrics
- CPU Utilization: 가능한 CPU가 계속 유용한 작업을 하도록 해야한다. 만약 어떤 정해진 시간동안 계속 CPU가 유용한 작업을 하였으면 CPU 효율은 100%가 된다.
- Throughput (처리율):  시간당 완료되는 프로세스의 수
- Turnaround time (반환시간): 하나의 프로세스가 제시된 시간에서 종료될 때 까지 걸린 시간
- Waiting time: 하나의 프로세스가 ready queue에서 대기한 총 시간
- Response time (응답시간): 하나의 프로세스가 제시된 시간에서 CPU를 처음 할당받을때 까지 걸린 시간
- Fairness


### Scheduling Algorithms
- First In, First Out (FIFO) 
	- Convoy effect : 빨리 종료되지만, 늦게 도착한경우 오래 기다림
- Shortest Job First (SJF) 
	- Convoy effect : 비 선점형이기때문에 동일하게 발생
- Shortest Time-to-Completion First (STCF) 
- Round Robin (RR) Scheduling 
	- Job 들을 큐에 넣고, 각 time slice 만큼 실행하면서 context switch 함
	- 일반적으로 공평한 스케쥴링 방법
	- Time slice의 크기에 따라 성능 변함
    	- 적게 선택 : 응답시간은 빠르지만, 잦은 문맥교환
    	- 크케 선택 : 응답시간이 안좋음


