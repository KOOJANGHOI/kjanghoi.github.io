---
layout: post
title: 4.Limited Direct Execution
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

### System call
프로세스와 운영체체간에 인터페이스.
- 커널이 특정 기능들에 조심스럽게 접근하는것을 허용하는것
- 효율적인 CPU Virtualization을 위해서는 프로그램의 I/O request나 자원 요청을 제어해야한다.
- 많은 high level language는 사용자가 직접 시스템콜을 할 수 있도록 지원한다. 하지만 implementation은 숨겨준다.

#### Interface
- 파일시스템에 접근
- 프로세스 생성/삭제
- 프로세스간 통신
- 메모리 추가 할당
- Trap : User mode -> kernel mode
- Return from trap : Kernel mode -> user mode

#### User mode and Kernel mode
- User mode: 응용프로그램은 하드웨어 자원에 자유롭게 접근할 수 없다.
- Kernel mode: 운영체제는 하드웨어 자원에 접근이 가능하다.

#### Context Switch
- Cooperative approach
    - Yield 시스템콜에 의해서 프로세스가 CPU 할당이 해제된다.
- Non-cooperative approach
    - 스케쥴러가 결정을 내리고, OS가 context switch를 한다.
    - General purpose register, Program counter, kernel stack pointer를 커널스택에 저장하고, 곧바로 실행될 프로세스의 커널스택을 메모리에 로드.






