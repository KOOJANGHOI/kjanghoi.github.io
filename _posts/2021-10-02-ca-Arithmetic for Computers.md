---
layout: post
title: 3.Arithmetic for Computers
subtitle: 
categories: [Computer Architecture]
tags: [ComputerScience]
---

### 1.서론
- 소수나 실수는 어떻게 표현할까 ?
- 컴퓨터로 표현할 수 있는 것보다 더 큰수가 계산의 결과로 나오면 어떻게 할까 ?
- 하드웨어가 실제로 어떻게 곱셈과 나눗셈을 수행하는가 ?

### 2.덧셈과 뺄셈
- 덧셈과 뺄셈에서의 오버플로 발생 조건
- 오버플로 발셍을 무시하는 경우와 인지해야 하는 경우
- 오버플로 탐지와 그 처리

![1.1](/assets/images/ca/3.1.png)

![1.1](/assets/images/ca/3.2.png)

![1.1](/assets/images/ca/3.3.png)

### 3.곱셈
- 종이와 연필로 하는 계산처럼 곱셈 하드웨어도 단순히 자리이동과 덧셈으로 곱셈 연산을 한다.
- 컴파일러는 2의 멱수 곱하기를 통해 shift 명령어를 대체하기도 한다. 더 많은 하드웨어를 사용하면 덧셈을 병렬로 더 빠르게 수행할 수도 있다.

![1.1](/assets/images/ca/3.4.png)

![1.1](/assets/images/ca/3.5.png)

![1.1](/assets/images/ca/3.6.png)

![1.1](/assets/images/ca/3.7.png)

![1.1](/assets/images/ca/3.8.png)

### 4.나눗셈
- 나눗셈은 사용 빈도가 낮은 방면 훨씬 까다롭다

![1.1](/assets/images/ca/3.9.png)

![1.1](/assets/images/ca/3.10.png)

![1.1](/assets/images/ca/3.11.png)

![1.1](/assets/images/ca/3.12.png)

![1.1](/assets/images/ca/3.13.png)

### 5.부동소수점
- 부동소수점 이란, Representation for non-integral numbers 
- 소수점의 위치가 고정되어 있지 않은 수
- 정밀도에 따른 부동소수점 표현 방법
- 정밀도와 표현범위에 따른 절충안으로 소수부분과 지수부분을 결정한다.
- 컴퓨터에서의 부동소수점 연산은 유한하여 실제 연산과 일치하지 않을 수 있다. 예를들어 IEEE 754 표준 부동소수점 표현은 언제나 실제 수의 근삿값 이다. 따라서 이를 인지하고 최소화하는데 주의하여야 한다.

![1.1](/assets/images/ca/3.14.png)

![1.1](/assets/images/ca/3.15.png)

![1.1](/assets/images/ca/3.16.png)

![1.1](/assets/images/ca/3.17.png)

![1.1](/assets/images/ca/3.18.png)

### 9.오류 및 함정

**오류: right shift 연산은 2로 나누어 준 것과 같은 결과를 나타낸다**
- 이는 unsigned integer에서 그러하다. Signed integer 에서는 근접하지만 맞는 값은 아니다.

**함정: 부동소수점의 덧셈은 결합법칙이 성립하지 않는다.**
- 부동소수점 수는 정밀도에 있어서 한계가 있고, 실제 결과의 근삿값을 결과로 취한다. 따라서 c+(a+b) != (c+a)+b 이다.

![1.1](/assets/images/ca/3.19.png)

