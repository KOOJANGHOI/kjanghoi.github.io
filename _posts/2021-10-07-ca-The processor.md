---
layout: post
title: 4.The processor
subtitle: 
categories: [Computer Architecture]
tags: [ComputerScience]
---

### 1.서론
- 컴퓨터 성능의 주요 요인
- 프로세스를 구현하는데 사용되는 원리와 기법
- 파이프라이닝 : 명령어에 대한 상위 수준 해석과 명령어가 프로그램 성능에 미치는 영향

컴퓨터 성능은 세가지 주요 요인, 명령어 개수,클럭사이클, 명령어 당 클럭 사이클 수(CPI)에 의해 결정된다. 프로그램에 필요한 명령어 개수는 컴파일러와 명령어 집합 구조가 결정한다. 클럭 사이클과 CPI는 프로세서의 구현 방법에 의해서 결정된다.

![1.1](/assets/images/ca/4.1.png)

![1.1](/assets/images/ca/4.2.png)

![1.1](/assets/images/ca/4.3.png)

### 2.논리 설계 관례
- 데이터 패스의 구성요소 : 조합소자, 상태소자
- 클러킹 방법론 : 신호를 언제 읽고 쓸지 결정하는 방법론

컴퓨터의 설계에 대하여 논의하기 위해서는 컴퓨터를 구현하고 있는 논리 회로가 어떻게 동작하고 또 컴퓨터가 어떻게 클러킹 되는지를 결정해야 한다.

![1.1](/assets/images/ca/4.4.png)

![1.1](/assets/images/ca/4.5.png)

![1.1](/assets/images/ca/4.6.png)

![1.1](/assets/images/ca/4.7.png)

![1.1](/assets/images/ca/4.8.png)

### 3.데이터 패스 만들기
- 각 명령어들이 어떤 데이터 패스 구성요소를 필요로 하는지
- 데이터 패스 구성요소 
	- instruction memory
	- program counter
	- ALU (adder)
- 산술/논리 명령어, 워드 적재/저장 명령어, 분기 명령어 별 데이터 패스의 구성

![1.1](/assets/images/ca/4.9.png)

![1.1](/assets/images/ca/4.10.png)

![1.1](/assets/images/ca/4.11.png)

![1.1](/assets/images/ca/4.12.png)

![1.1](/assets/images/ca/4.13.png)

![1.1](/assets/images/ca/4.14.png)

### 4.단순한 구현
- 데이터 패스에 제어유닛을 추가한 단순한 구현
- 단일 사이클이 왜 오늘날 사용되지 않는지

![1.1](/assets/images/ca/4.15.png)

![1.1](/assets/images/ca/4.16.png)

![1.1](/assets/images/ca/4.17.png)

![1.1](/assets/images/ca/4.18.png)

### 5.파이프라이닝
- 파이프라이닝 이란
- 단일 사이클 대비 파이프라이닝의 성능
- 파이프라인 해저드
	- Structural
	- Data
	- Control

#### MIPS 명령어 실행의 5단계

![1.1](/assets/images/ca/4.19.png)

#### 간단한 파이프라이닝
- 파이프라이닝은 개별 명령어의 실행시간을 줄이지는 못하지만 대신 명령어 처리량을 증대시킴으로써 성능을 향상시킨다. 실제 프로그램은 수억개의 명령어를 실행하기때문에 명령어 처리량이 중요한 성능의 척도이다

![1.1](/assets/images/ca/4.20.png)

![1.1](/assets/images/ca/4.21.png)

### 6. 파이프라인 해저드
- 다음 명령어가 다음 클럭사이클에 실행될 수 없는 상황. 3가지 종류가 있다.

#### 구조적 해저드

![1.1](/assets/images/ca/4.22.png)

#### 데이터 해저드

![1.1](/assets/images/ca/4.23.png)

![1.1](/assets/images/ca/4.24.png)

#### 제어 해저드

![1.1](/assets/images/ca/4.25.png)

![1.1](/assets/images/ca/4.26.png)

![1.1](/assets/images/ca/4.27.png)

![1.1](/assets/images/ca/4.28.png)

![1.1](/assets/images/ca/4.29.png)

#### 정리
- 파이프라이닝은 동시에 실행되는 명령어의 수를 증가시키며 명령어들이 시작하고 끝나는 속도를 증가시킨다. 파이프라이닝은 각각의 명령어의 실행을 끝내는 데 걸리는 시간을 단축시키지는 않는데, 이 시간을 지연시간 (latency)이라고 부른다.
- 예를들어 다섯 단계의 파이프라인은 한 명령어가 끝나는 데 다섯 클럭 사이클이 걸린다.
- 명령어 집합은 파이프라인 설계를 쉽게 하기도 하고 어렵게하기도 한다. 파이프라인 설계자들은 이미 구조적해저드, 데이터해저드, 제어해저드 들과 맞닥뜨려 이를 해결해왔다. 분기예측, 전방전달은 올바른 결과를 얻으면서도 컴퓨터를 빠르게 하는데 도움을 준다.

### 9.예외
MIPS 구조의 예외처리
- Vectored interrupt : OS는 예외가 시작되는 주소를 보고 그 원인을 안다.

![1.1](/assets/images/ca/4.30.png)

#### 하드웨어와 소프트웨어의 인터페이스

![1.1](/assets/images/ca/4.31.png)

