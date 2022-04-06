---
layout: post
title: 2.Introduction to Operating System
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

#### 프로그램의 실행
- Instruction fetch from memory
- Instruction decode
- Execute instruction
- Processor move to next instruction


#### 프로그램 실행에서 운영체제의 책임
- 프로그램이 정확하고 효율적으로 실행되도록 한다 (CPU, 메모리를 공유)
- 프로그램이 디바이스들과 상호작용 할수있도록 한다.


#### Virtualization
- 운영체제는 하드웨어 자원을 가상화하여 여러 프로그램이 동시에 실행되는것처럼 동작하게 한다.
	- 프로세서, 메모리, 디스크
- Physical memory는 array of bytes에 불과하며, 프로세스는 address space에 접근하며 운영체제는 address space 를 physical memory에 mapping 한다.


#### System call
- 운영체제가 제공하는 API를 통해 사용자가 운영체제에게 명령할 수 있도록 하는것
	- 프로그램 실행, 메모리 접근, 디바이스 접근

#### Concurrency control
- 멀티스레드 환경에서 여러 명령어가 atomic 하게 실행되는것이 아니기때문에, 여러 명령어가 동시에 실행되는것 처럼 동작하려면 동시성 제어가 필요하다.

#### Persistence
저장장치의 계층구조를 사용하면 같은 데이터가 여러 계층구조에 존재할 수 있다. 한번에 하나의 프로세스만 동작한다면 문제가 되지 않지만, 여러 프로세스가 같은 데이터에 접근하고자하면 모든 프로세스가 최신의 데이터를 얻을 수 있도록 해야한다. 이 문제는 multi processor 환경에서 더욱 심각하다.

Multi processor 환경에서 여러 캐시에 같은 데이터가 동시에 존재할때 하나의 캐시에서 그 값이 변경되면 다른 캐시도 그 변경이 반영되어야한다. (Cache  coherency)





