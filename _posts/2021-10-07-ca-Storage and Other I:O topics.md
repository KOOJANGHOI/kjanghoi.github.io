---
layout: post
title: 6.Storage and Other I/O topics
subtitle: 
categories: [Computer Architecture]
tags: [ComputerScience]
---

### 1. 서론
컴퓨터 설계자들은 오래도록 기존의 작은 컴퓨터를 여러 개를 연결만 하면 강력한 성능의 컴퓨터가 되기를 바래왔고 이것이 멀티프로세서의 근원이 되었다.

이렇게 되면?
- 소프트웨어는 프로세스의 개수가 몇 개든 상관없이 동작해야한다.
- scaleable한 설계: 크고 비효율적인 프로세서를 작으면서도 효율적인 프로세서 여러개로 대치함으로써 단위 에너지 당 성능을 개선할 수 있다.
- 가용성: 하드웨어의 일부가 고장나더라도 동작이 중지되지 않도록 설계할 수 있다

멀티코어 마이크로프로세서가 다시 큰 주목을 받게 된 것은 명시적으로 하드웨어 병렬성을 이용하여 성능을 올리는 것이 클럭 주파수를 올리거나 CPI를 올리는 것보다 에너지 측면에서 더 유리하기 떄문이다.

### 2.병렬처리 프로그램 개발의 어려움
병렬처리 프로그램 (parallel processing program - 여러개의 프로세서를 동시에 사용하는 프로그램) 을 작성하는것은 어려운 일이다. 프로세서의 개수가 증가하면 문제는 더 심각해진다.

병렬 프로그램이 순차 프로그램에 반해 더 높은 성능과 에너지 효율을 얻기 위해서는 아래 문제들에 부딪치게 된다. (8명의 기자가 하나의 기사를 쓰는 비유)
- 작업의 스케쥴링
- 작업을 병렬 조각으로 나누는 일 : Amdahl의 법칙에 의해서 100개의 프로세서를 가지고 90배의 성능 개선을 얻기 위해서는 전체 프로그램에서 순차적인 비율이 0.1% 이하가 되어야한다.
- Load balancing  : 부하를 균등하게 하는 일
- 동기화 시간을 줄이는 일
- 서로 통신하는 오버헤드를 줄이는 일

### 4.하드웨어 멀티스레딩
한 스레드가 실행할 수 없게되면 다른 스레드로 전환하도록 하여 프로세서의 이용률을 높이는 기법

#### Fine grained multithreading

![1.1](/assets/images/ca/6.1.png)
￼
#### Coarse grained multithreading

![1.1](/assets/images/ca/6.2.png)
￼
### 6.GPU
￼
![1.1](/assets/images/ca/6.3.png)

### CPU & GPU

![1.1](/assets/images/ca/6.4.png)

![1.1](/assets/images/ca/6.5.png)

![1.1](/assets/images/ca/6.6.png)

### 7.클라우드, WSC (Warehouse scale computers)

![1.1](/assets/images/ca/6.7.png)

