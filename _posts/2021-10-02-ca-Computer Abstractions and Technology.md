---
layout: post
title: 1.Computer Abstractions and Technology
subtitle: 
categories: [Computer Architecture]
tags: [ComputerScience]
---

### Introduction
오늘날 성능에 관심이 있는 프로그래머라면 1960년대의 단순한 메모리모델을 사라지게만든 두가지 이슈, 메모리의 계층성과 프로세서의 병렬성, 추가적으로 에너지 효율성을 신경써야한다. 이를 위해서는 코드아래의 계층에서 무슨일이 벌어지고있는지를 잘 이해할 필요가 있다. 따라서 경쟁력있는 소프트웨어를 개발하고자하는 프로그래머라면 컴퓨터 구조에 대한 지식을 늘려나갈 필요가 있다.

**What You Will Learn in this Class** 
- 프로그램이 어떻게 machine language로 translate 되는지, 하드웨어는 machine language를 어떻게 실행하는지
- 하드웨어/소프트웨어 인터페이스
- 프로그램의 퍼포먼스는 어떻게 측정되고 향상 시키는지
- Parallel programming 이란 무엇인가

### 프로그램 성능의 이해

**Algorithm**

Determines number of operations executed 

**Programming language, compiler, architecture**

Determine number of machine instructions executed per operation 

**Processor and memory system **

Determine how fast instructions are executed 

**I/O system (including OS)**

 Determines how fast I/O operations are executed 


### 컴퓨터구조 분야의 8가지 위대한 아이디어

![1.1](/assets/images/ca/1.1.png)￼
￼
**Design for Moore’s Law**

: 무어의 법칙을 고여한 설계
18~24개월 마다 칩에 집적되는 트랜지스터(전기로 제어되는 on/off switch)의 수가 2배가 된다는 무어의 법칙은 인텔 창립자 중 한명인 Gordon moore의 1965년 예측에서 비롯된다. 컴퓨터를 설계하는 데에는 수년이 소요되기 때문에 프로젝트의 시작시점보다 종료시점의 기술을 예상하여야 한다.


**Use abstraction to simplify design**

: 설계를 단순화하는 추상화
컴퓨터 설계자와 프로그래머는 무어의법칙에 따라 자원의 수가 급격히 증가함에따라 설계시간이 길어지는것을 방지하기 위해서 생산성을 높이기 위한 기술을 개발해야했다. 하드웨어와 소프트웨어의 생산성을 높이는 핵심기술 중 하나는 여러 수준에서 설계를 명시하는 추상화를 사용하는것이다. 하위수준의 상세한 사항을 안보이게함으로써 상위 수준 모델을 단순화 한다.


**Make the common case fast**

: 자주 생기는 일을 빠르게
자주 생기는 일을 빠르게 만드는것이 드물게 생기는 일을 최적화 하는것보다 성능 개선에 도움이 된다. 아이러니하게도 자주 생기는일은 드물게 생기는 일보다 단순하여 성능을 개선하기 쉬운 경우가 많다. 이 말은 자주 생기는 일이 무엇인지 미리 알고 있다는것을 가정하고있지만, 실제로는 세심한 실험과 측정을 거쳐야만 알 수 있다.

**Performance via parallelism**

: 병렬성을 통한 성능 개선
컴퓨팅의 여명기부터 컴퓨터 설계자들은 작업을 병렬적으로 수행하여 성능을 높이는 설계를 해 왔다.

**Performance via pipelining** 

: 파이프라이닝을 통한 성능 개선
파이프라이닝(pipelining)은 컴퓨터 구조에서 많이 볼 수 있는 병렬성의 특별한 형태이다. 예를 들어 소방차가 없는 시대의 카우보이 영화를 보면 악당이 불을 질렀을때 사람들이 길게 늘어서서 양동이로 물을 나르는 것과 같다. 사람들이 인간사슬을 구성하면 각자 양동이를 들고 왔다 갔다 하는 것보다 훨씬 빨리 물을 나를수있다.

**Performance via prediction**

: 예측을 통한 성능 개선
허락을 구하는 것보다 용서를 구하는 것이 낫다는 말이 있다. 이 말대로라면 예측 (prediction)이 위대한 아이디어가 될 수 있다. 예측을 잘못해서 이를 복구하는 비용이 비싸지 않고 예측이 성공할 확률이 비교적 높은 경유, 예측을 해서 미리 일을 수행하는 것이 평균적으로 빠른 경우가 종종 있다. 

**Hierarchy of memories**

: 메모리의 계층구조
프로그래머는 빠르고 크고 값싼 메모리를 원한다. 왜냐하면 메모리의 속도가 성능을 좌우하고, 메모리의 크기가 풀 수 있는 문제의 크기를 제한하며, 메모리 가격이 오늘날 컴퓨터 가격에서 차지하는 비중이 높기 때문이다. 컴퓨터 설계자들은 이렇게 상충되는 요구를 메모리 계층구조(hierarchy of memories)로 해결하고 있다. 최상위 계층에는 비트당 가격이 제일 비싸지만 작고 빠른 메모리를 사용하고, 최하위 계층에는 느리지만 크고 비트당 가격이 제일 싼 메모리를 사용한다. 추가적으로 캐시를 사용하면 프로그래머에게 최상위 계층만큼 빠르고 최하위 계층만큼 크면서 싼 메인 메모리가 있는 것처럼 보이게 할 수 있다.

**Dependability via redundancy**

: 여유분을 이용한 신용도 개선 컴퓨터는 빠르기만 해서는 안 되고, 신뢰할 수 있어야 한다. 모든 물리 소자는 장애가 발생할 수 있으므로, 장애를 감지하고 장애가 난 소자를 대치할 수 있도록 여유분을 준비하면 컴퓨터의 신용도(dependability)를 개선할 수 있다. 


### 프로그램 밑의 세계
컴퓨터 하드웨어는 아주 단순한 저수준의 명령어를 실행할 수 있을 뿐이다. 복잡한 응용에서 출발해서 단순한 명령어까지 내려가려면 높은 수준의 작업을 단순한 컴퓨터 명렁어로 번역/해독하는 여러겹의 소프트웨어가 필요하다.

![1.1](/assets/images/ca/1.2.png)￼
￼
**Application software** 

Written in high-level language 

**System software **
- Compiler: translates HLL code to machine code 
- Operating System: service code
	- Handling input/output
	- Managing memory and storage
	- Scheduling tasks & sharing resources 

**Hardware **

Processor, memory, I/O controllers 

### Levels of Program Code 
￼
![1.1](/assets/images/ca/1.3.png)￼

**High-level language** 

일반 문장과 훨씬 비슷한 읽기 좋은 코드
프로그래머의 생산성을 높여준다. (Vs assmbly language)
Machine independent language

**Assembly language **

기계 명령어를 기호 형태로 표현한것 

**Hardware representation **

기계가 이해하는 언어 (bits)


### 컴퓨터의 주요 구성요소
￼
![1.1](/assets/images/ca/1.4.png)￼

모든 컴퓨터의 하드웨어는 데이터 입출력, 처리, 저장의 네가지 기본 기능을 수행하며
컴퓨터의 고전적 다섯가지 구성요소는 입력, 출력, 메모리, 프로세서 (데이터패스, 제어유닛)이다.

프로세서는 메모리에서 명령어를 읽는다. 입력장치는 메모리에 데이터를 쓰고, 출력장치는 메모리에서 데이터를 읽는다. 제어 유닛은 데이터패스,메모리,입출력장치의 동작을 결정하는 신호를 보낸다.

#### Inside the Processor (CPU) 

**Datapath**

연산을 수행한다.

**Control**

명령어에 따라 데이터패스,메모리,입출력장치의 동작을 결정하는 신호를 보낸다.

**Memory**

실행중인 프로그램과 프로그램 실행에 필요한 데이터의 저장소

메모리는 DRAM (dynamic random access memory)칩으로 구성되어있는데, DRAM 여러 개를 한데 묶어서 프로그램의 명령어와 데이터를 기억하는 데 사용한다. DRAM에서 RAM이란 말은 자기 테이프 같은 순차 접근 메모리와는 반대로 메모리의 어떤 부분을 읽든지 같은 시간이 걸린다는 것을 의미한다. 

프로세서 내부에는 또 다른 종류의 메모리가 있는데 이것을 캐시 메모리라 한다. 캐시 메모리(cache memory)는 DRAM의 비퍼 역할을 하는 작고 빠른 메모리이다. 캐시는 SRAM(static random access memory)이라는 다른 메모리 기술을 이용한다. SRAM은 DRAM보다 빠르지만 집적도가 낮아서 가격이 비씨다. 
 
### Abstractions 

**Abstraction helps us deal with complexity**

Hide lower-level detail 

**Instruction set architecture (ISA)**

명령어 집합 구조는 컴퓨터 설계자로 하여금 실행 하드웨어와 독립적으로 컴퓨터의 기능을 생각할 수 있게 해 준다. 예를 들면 디지털 시계의 기능(항상 현재 시각을 유지하며, 시각을 표시하고, 알람을 설정하는)을 클럭 하드웨어(수정 발진자, LED디스플레이, 플라스틱 버튼 등)와 분리해서 생각할 수 있다. 이와 같은 선상에서 컴퓨터 설계자는 구조와 구조의 구현(implementation)을 분리해서 생각한다. 

![1.1](/assets/images/ca/1.5.png)

**Application binary interface **

명령어 집합 구조에는 제대로 작동하는 이진 기계어 프로그램 작성을 위해 프로그래머가 알아야 하는 것(예를 들면 명령어, 입출력장치 등) 이 모두 포함된다. 입출력 작업, 메모리 할당 및 기타 저수준 시스템 기능의 세부사항은 운영체제가 감추어서 응용 프로그래머가 이러한 세세한 부분을 걱정하지 않아도 되도록 해 주는 것이 일반적이다. 응용 프로그래머에게 제공되는 기본 명령어 집합과 운영체제 인터페이스를 합쳐서
ABI(application binary interface)라 한다.

**Implementation **

구조 추상화를 준수하는 하드웨어를 의미한다. 

### CPU Clocking 
￼
![1.1](/assets/images/ca/1.6.png)￼

**CPU Time**

프로세서가 프로그램을 실행하기 위해 소비한 시간.
입출력에 걸린 시간이나 다른 프로그램을 실행하는 데 길린시간은 포함하지 않는다.

CPU time은 실제로 사용자 프로그램 실행에 소요된 user cpu time과 운영체제가 이 프로그램을 위한 작업을 수행하기 위해 소비한 system cpu time으로 나뉠 수 있다. 그러나 운영체제의 각 작업이 어떤 프로그램을 위해서 수행되고있는가를 명확히 가려내는것은 어렵고, 운영체제 간의 기능 차이도 있기때문에 두가지를 정확히 구분하는것은 쉽지않다.

Clock period: duration of a clock cycle 
Clock frequency (rate): cycles per second 

CPU Time  
= CPU Clock cycle / Clock rate
= #Instruction * CPI (Cycle per instruction) / Clock rate

### Multiprocessors 

과거의 프로그래머는 코드를 한 줄도 안바꾸고 하드웨어와 컴퓨터구조 그리고 컴파일러의 혁신에만 의존하여도 18개월마다 2배씩 성능 개선을 누릴 수 있었다. 하지만 오늘날 응답시간을 현저히 개선하려면 다중 프로세서의 장점을 살리도록 프로그램을 재작성해야했다. 나아가 새로운 마이크로프로세서에서 더 빠르게 실행되는 이득을 누리기 위해서는 코어의 수가 증가함에따라 코드의 성능을 지속적으로 개선해 나가야 할 것이다.

**명시적 병렬 프로그램을 작성하는것이 어려운 이유**
- 프로그램이 정확하고, 즁요한 문제를 해결하며 편리한 인터페이스를 제공하는것 만으로는 충분하지 않고, 그 위에 실행시간이 빨라야 하기 떄문이다.
- 병렬 하드웨어에서 빠르게 수행된다는것은 각 프로세서가 대략 비슷한 양의 일을 동시에 수행하도록 응용을 분할해야하고 병렬성으로부터 얻을 수 있는 성능의 이득을 침해하지 않도록 분할된 일을 스케쥴링하고 조정하는 오버헤드가 작아야 하기 떄문이다.
    - 통신 및 동기화 오버헤드를 줄이기 위한 각별한 주의가 요구된다.


### Pitfall: Amdahl’s Law
CPU 성능식과 함께 잠재적 성능 개선율을 평가하는 편리한 도구이다.

예) 100초 걸리는 프로그램이 있는데, 그 중 80초는 곱셈 계산에 소요된다. 이 프르그램이 5배 빠르게 실행되도록 하려면 곱셉 속도는 얼마나 개선되어야 할까 ?

20 = 80/n + 20

즉, 곱셈을 아무리 빠르게 하더라도 전체 성능을 5배로 증가시킬 수는 없다.

**Corollary: make the common case fast !**

![1.1](/assets/images/ca/1.7.png)￼
