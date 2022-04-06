---
layout: post
title: 24.I/O Devices 
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

### I/O Issue
- How should I/O be integrated into systems ?
- What are the general mechanisms ?
- How can we make the efficiently ?

### I/O Architecture 
CPU는 메모리 버스를 통해 메인메모리와 연결된다.
￼
![1.1](/assets/images/os/36.1.png)

#### Buses 
Data paths that provided to enable information between CPU(s), RAM, and I/O devices. 

#### I/O bus 
- Data path that connects a CPU to an I/O device. 
- I/O bus is connected to I/O device by three hardware components
    - I/O ports
    - H/W interfaces
    - device controllers. 

#### H/W interface
It allows the system software to control its operation

By reading and writing below three registers, the operating system can control device behavior. 
 
- Status register : see the current status of the device
- Command register : tell the device to perform a certain task
- Data register: pass data to the device, or get data from the device


### Memory-mapped I/O
주기억장치의 일부 주소가 I/O를 위해 예약되어있으며, 이 주소에서 read/write 하면 device register로부터 데이터를 읽고 쓰는 결과가 된다. 이 방법은 빠른 response time을 요구하는 장치에 적합하다.

표준입출력의 대안으로 커널이 제공하는 인터페이스. 
- 파일 디스크립터나 파일 구조체 포인터를 통하여 파일에 접근하면, 버퍼를 거쳐 실제 입출력이 진행되는데 , 메모리 매핑을 하면 버퍼가 아니라 페이지를 이용하여 데이터의 처리가 가능해진다.
- 파일을 메모리에 매핑하는 것이다. (메모리 주소와 파일 워드 사이의 1대1 대응) 

#### 장점
- read() , write()의 추가 복사를 방지.()
- 단순하다. (기존의 방식처럼 syscall을 사용할 필요가 없다.)
- 매핑된 영역 탐색은 간단한 포인터 조작으로 가능하다.(lseek()가 필요없다)
- 대용량의 데이터를 사용할 시 성능이 향상된다(상대적으로 작은 버퍼에 비해 4KB의 크기의 페이지를 이용하면 처리 가능한 크기와 처리속도가 빨라진다.)
- 파일로 연결하여 메모리-파일 사이의 동기화가 편하다.(trade-off인 durability를 msync로 해결) 

#### 단점
- 잠재적인 page fault 가능성.
- 메모리 매핑의 단위가 , 페이지 단위의 정수배만 가능하므로 , 작은 크기의 파일에서는 internal fragmentation 이 발생할 수 있다.(ex. 7byte file ->4089byte가 낭비) ==> 충분히 크고 연속적인 빈 공간을 찾기 힘들 수도 있 다.
- 메모리 매핑과 관련된 자료구조를 커널이 작업하는데 overhead가 발생한다. 
- 메모리 맵에 데이터를 경신해도 , 바로 파일과 동기화 되는 것은 아니다. 커널이 여유있을때 동기화를 시행한다. 따라서 개발자가 직접 동기화를 보장받고 싶을때 사용한다. 

### Polling(Programmed I/O) vs Interrupts 
Context-switch는 비싸므로, when device performs very fast, Interrupt will slow down the system.

#### Polling
OS가 device의 status register를 보면서 device ready까지 wait
simple하지만, wait 하는동안 CPU time은 낭비

![1.1](/assets/images/os/36.2.png)￼

#### Interrupt
I/O request 프로세스를 sleep 하고 context-switch 한다.
When the device is finished, wake the process waiting for the I/O by interrupt. 
￼
![1.1](/assets/images/os/36.3.png)

### DMA (Direct Memory Access) 
속도가 느린 I/O device는 하나의 입력을 받은 후에 다음 입력까지 CPU는 다른작업을 할 수 있다. 그러나 반대로 속도가 빠르면 인터럽트가 너무 빈번하게 발생하며 CPU가 다른 작업을 할 시간이 적다 (오버헤드가 크다.)

이것을 해결하기 위해 사용하는 기법이 DMA이다. Device controller는 data를 CPU의 관여 없이 메모리로 이동하며, 인터럽트는 바이트 단위가 아닌 블록 단위로 발생한다.

Copy data in memory by knowing “where the data lives in memory, how much data to copy” 
When completed, DMA raises an interrupt, I/O begins on Disk. 
￼
![1.1](/assets/images/os/36.4.png)

### File system Abstraction 

![1.1](/assets/images/os/36.5.png)

How the OS communicates with the device?  Abstraction.

Abstraction encapsulate any specifics of device interaction. 

If there is a device having many special capabilities, these capabilities will go unused in the generic interface layer. 

Over 70% of OS code is found in device drivers.
- Any device drivers are needed because you might plug it to your system.
- They are primary contributor to kernel crashes, making more bugs. 




