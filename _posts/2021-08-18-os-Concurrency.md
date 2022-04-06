---
layout: post
title: 17.Concurrency An Introduction
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

### Concurrency
- 한 application program 에서 여러가지 일을 동시에 수행할 수 있다.
- 각 일을 처리하기 위해 자식 프로세스를 생성하여 처리할 수 있지만, 프로세스의 생성은 비용이 크며, 자원공유가 쉽지않다. 이 비용을 줄이고 자원공유를 쉽게 하기 위해 도입된 개념이 스레드이다. 
- Unix 구현의 경우에 스레드 생성비용은 프로세스의 생성비용보다 대략 10배정도 빠르다.

### Thread
Thread is a new abstraction for a single running process
- Aka. Light weight process
- For parallelism, use multiple PCs(Program counter)
- They share same address space
- Each thread has its own
    - program counter
    - TCB : thread control block
    - stack
    - set of registers

![1.1](/assets/images/os/26.1.png)

**스택을 스레드마다 독립적으로 할당하는 이유**
스택은 함수 호출 시 전달되는 인자, 되돌아갈 주소값 및 함수 내에서 선언하는 변수 등을 저장하기 위해 사용되는 메모리 공간이므로 스택 메모리 공간이 독립적이라는 것은 독립적인 함수 호출이 가능하다는 것이고 이는 독립적인 실행 흐름이 추가되는 것이다. 따라서 스레드의 정의에 따라 독립적인 실행 흐름을 추가하기 위한 최소 조건으로 독립된 스택을 할당한다.

**PC Register 를 스레드마다 독립적으로 할당하는 이유**
PC 값은 스레드가 명령어의 어디까지 수행하였는지를 나타나게 된다. 스레드는 CPU를 할당받았다가 스케줄러에 의해 다시 선점당한다. 그렇기 때문에 명령어가 연속적으로 수행되지 못하고 어느 부분까지 수행했는지 기억할 필요가 있다. 따라서 PC 레지스터를 독립적으로 할당한다.

![1.1](/assets/images/os/26.2.png)

### Race condition
Due to uncontrolled scheduling

![1.1](/assets/images/os/26.3.png)

### Critical section
- A piece of code that access a shared variable and must not be concurrently executed by more than one thread
- Multiple thread executing critical section can result in a race condition
- Need to support atomicity for critical section (mutual exclusion)


### Lock
Ensure that any such critical section executes as if it were a single atomic instruction
- Execute a series of instructions atomically