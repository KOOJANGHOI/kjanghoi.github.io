---
layout: post
title: 15.Swapping Mechanism
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

### Swapping
메모리의 관리를 위해 사용되는 기법. 표준 Swapping 방식으로는 round-robin 과 같은 스케줄링의 다중 프로그래밍 환경에서 CPU 할당 시간이 끝난 프로세스의 메모리를 보조 기억장치(e.g. 하드디스크)로 내보내고 다른 프로세스의 메모리를 불러 들일 수 있다.
이 과정을 swap (스왑시킨다) 이라 한다. 주 기억장치(RAM)으로 불러오는 과정을 swap-in, 보조 기억장치로 내보내는 과정을 swap-out 이라 한다. swap 에는 큰 디스크 전송시간이 필요하기 때문에 현재에는 메모리 공간이 부족할때 Swapping 이 시작된다.


**OS need a place to stash away portions of address space that currently aren’t in great demand**
- Always need to first arrange for the code or data to be in memory when before calling a function or accessing data. 
- The addition of swap space allows the OS to support the illusion of a large virtual memory for multiple concurrently-running process  

#### Swap space
Reserve some space on the disk for moving pages back and forth

![1.1](/assets/images/os/21.1.png)


#### What If Memory Is Full?
- Page replacement policy에 의해서 OS는 physical memory에서 kick out & replace page
- If accessing page that is not in physical memory, the OS need to swap the page into memory in order to service the page fault


#### Page fault control flow
![1.1](/assets/images/os/21.2.png)

**Page fault control flow (HW)**
![1.1](/assets/images/os/21.3.png)

![1.1](/assets/images/os/21.4.png)
￼
**Page fault control flow (SW)**
![1.1](/assets/images/os/21.5.png)