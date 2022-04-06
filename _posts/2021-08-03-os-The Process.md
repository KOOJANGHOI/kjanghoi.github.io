---
layout: post
title: 3.The Process
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

### CPU의 구성
- Memory register
- Instruction register
- Instruction pointer
- Arithmetic logic unit
- Control unit (state machine)

#### CPU Virtualization
- 운영체제는 가상의 CPU가 여러개 인것처럼 동작하게 한다.
- 프로세스가 실행되는 시간을 나누면서, 프로세스가 실행되다가 멈추고 다른 프로세스를 실행할 수 있도록 한다.

### 프로세스
- 프로세스는 메모리에 적재되어 CPU의 할당을 받을 수 있는 프로그램.
- 프로세스의 구성
    - CPU 상태 (registers)
        - 프로그램 카운터: 다음에 실행될 명령어
        - 스택 포인터
        - General register
    - 메모리 (address space)
        - 명령어들
        - 데이터 섹션

#### 프로그램 실행
￼
![4.1](/assets/images/os/4.1.png)

#### 프로세스 생성
- 프로그램 코드를 프로세스의 address space에 load한다.
- 프로그램의 런타임 스택이 할당된다.
    - 지역변수, 함수 파라미터, 복귀주소
- 프로그램의 힙이 생성
    - 동적으로 생성될 수 있는 메모리 공간
    - malloc(), free()
- 기타 설정
    - Standard input/output and error
- 프로세스 실행


#### 프로세스 상태 변화
- Running
    - CPU를 할당받아 실행중
- Ready
    - 실행 대기중
- Blocked
    - I/O request를 보냈을때 running에서 blocked. 완료되면 Ready

![4.1](/assets/images/os/4.2.png)


#### Process Control Block, PCB
PCB 는 특정 프로세스에 대한 중요한 정보를 저장 하고 있는 운영체제의 자료구조이다. 운영체제는 프로세스를 관리하기 위해 프로세스의 생성과 동시에 고유한 PCB 를 생성 한다. 프로세스는 CPU 를 할당받아 작업을 처리하다가도 프로세스 전환이 발생하면 진행하던 작업을 저장하고 CPU 를 반환해야 하는데, 이때 작업의 진행 상황을 모두 PCB 에 저장하게 된다. 그리고 다시 CPU 를 할당받게 되면 PCB 에 저장되어있던 내용을 불러와 이전에 종료됐던 시점부터 다시 작업을 수행한다.

**PCB 에 저장되는 정보**
- 프로세스 식별자(Process ID, PID) : 프로세스 식별번호
- 프로세스 상태 : new, ready, running, waiting, terminated 등의 상태를 저장
- 프로그램 카운터 : 프로세스가 다음에 실행할 명령어의 주소
- CPU 레지스터
- CPU 스케쥴링 정보 : 프로세스의 우선순위, 스케줄 큐에 대한 포인터 등
- 메모리 관리 정보 : 페이지 테이블 또는 세그먼트 테이블 등과 같은 정보를 포함
- 입출력 상태 정보 : 프로세스에 할당된 입출력 장치들과 열린 파일 목록
- 어카운팅 정보 : 사용된 CPU 시간, 시간제한, 계정번호 등

![4.1](/assets/images/os/4.3.png)

#### Process API 
- fork
- wait
- exec
- yield


