---
layout: post
title: 2.Language of the Computer 
subtitle: 
categories: [Computer Architecture]
tags: [ComputerScience]
---

### 1.서론
- 명령어 집합 (instruction set) 이란
- 내장 프로그램 : 데이터와 명령어를 메모리에 숫자로 저장할 수 있는 개념

![1.1](/assets/images/ca/2.1.png)

### 하드웨어 연산
- MIPS 명령어와 어셈블리 언어로의 표현

![1.1](/assets/images/ca/2.2.png)

![1.1](/assets/images/ca/2.3.png)

### 2.피연산자
- 레지스터, 워드의 개념
- MIPS 아키텍쳐에서 레지스터의 크기과 갯수. 그 이유
- 소량의 레지스터로 메모리의 데이터를 읽고 쓸 수 있는 개념 (lw,st 연산자, base register & offset 개념)
- 레지스터 스필링

![1.1](/assets/images/ca/2.4.png)

![1.1](/assets/images/ca/2.5.png)

### 3.부호있는 수와 부호없는 수
- 왜 2진수를 쓰는가
- 음수를 표현하는 방법
- Sign and magnitude
- 2’s complement

![1.1](/assets/images/ca/2.6.png)

![1.1](/assets/images/ca/2.7.png)

![1.1](/assets/images/ca/2.8.png)

![1.1](/assets/images/ca/2.9.png)

### 4.명령어의 컴퓨터 내부 표현
- MIPS 명령어의 기계어 표현
- 내장 프로그램의 개념
- 명령어가 숫자로 표현
- 프로그램은 메모리에 기억되어있어서 숫자처럼 읽고 쓸 수 있다.

![1.1](/assets/images/ca/2.10.png)

![1.1](/assets/images/ca/2.11.png)

![1.1](/assets/images/ca/2.12.png)

![1.1](/assets/images/ca/2.13.png)

![1.1](/assets/images/ca/2.14.png)

![1.1](/assets/images/ca/2.15.png)

### 5.논리 연산 명령어
- 왜 필요한가

![1.1](/assets/images/ca/2.16.png)

### 6.판단을 위한 명령어
- 조건부 분기
- 기본블록(basic block) 개념

![1.1](/assets/images/ca/2.17.png)

![1.1](/assets/images/ca/2.18.png)

![1.1](/assets/images/ca/2.19.png)

![1.1](/assets/images/ca/2.20.png)

### 7.하드웨어의 프로시저 지원
- 프로시저
- 관련된 레지스터들
- 스택포인터
- 새 데이터를 위한 스택,힙의 할당
- 스택과 힙이 서로 마주보면서 할당되는 이유

![1.1](/assets/images/ca/2.21.png)

![1.1](/assets/images/ca/2.22.png)

![1.1](/assets/images/ca/2.23.png)

![1.1](/assets/images/ca/2.24.png)

![1.1](/assets/images/ca/2.25.png)

![1.1](/assets/images/ca/2.26.png)

### 8.MIPS의 주소 지정 방식
- PC-relative addressing

![1.1](/assets/images/ca/2.27.png)

![1.1](/assets/images/ca/2.28.png)

![1.1](/assets/images/ca/2.29.png)

### 9.병렬성과 명령어: 동기화
- 동기화
- 원자적 교환
- Load linked & store conditional
- HW support가 필요한 이유

![1.1](/assets/images/ca/2.30.png)

![1.1](/assets/images/ca/2.31.png)

![1.1](/assets/images/ca/2.32.png)

### 10.프로그램의 번역과 실행
- 번역 계층
- 컴파일러, 어셈블러, 링커, 로더
- 링커와 로더가 왜 필요한지

![1.1](/assets/images/ca/2.33.png)

![1.1](/assets/images/ca/2.34.png)

![1.1](/assets/images/ca/2.35.png)

![1.1](/assets/images/ca/2.36.png)

![1.1](/assets/images/ca/2.37.png)

