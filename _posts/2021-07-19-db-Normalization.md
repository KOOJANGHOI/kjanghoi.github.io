---
layout: post
title: Normalization
subtitle: 
categories: [Database]
tags: [ComputerScience]
---

### 정규화
정규형(normal form)이란 테이블 스키마의 바람직한 형태를 정의한 것 

- 바람직하지 못한 테이블 스키마를 더 작은 바람직한 테이블 스키마들로 분할하는 과정 
- 바람직한 테이블 스키마를 정의하기 위한 정규화의 추가 요건
    - 가짜 투플 문제를 해결하는 무손실 조인 분할 특성 

#### 종속성 보존 특성 

용어 
- 수퍼키, 후보키, 기본키, 보조키 
- 주요 애트리뷰트(prime attribute) : 릴레이션 R의 후보키에 속하는 애트리뷰트   

### 제 1 정규형
각 애트리뷰트 도메인이 오직 원자값만을 포함  

투플의 각 애트리뷰트값은 해당 도메인에 속하는 한 값만을 가짐   즉, 아래의 비원자적 애트리뷰트들을 허용하지 않음 
- 복합 애트리뷰트(composite attribute)
- 다치 애트리뷰트(multivalue attribute)
- 중첩 릴레이션(nested relation) 

![1.1](/assets/images/database/7.1.png)

### 제 2 정규형 
테이블스키마 R의 모든 비 주요 애트리뷰트 A가 R의 모든 후보키에 완전 함수적 종속이면 R은 제 2 정규형임 
- 테이블스키마 R의 모든 비 주요 애트리뷰트 A가 R의 어떤 후보키에 부분 함수적 종속이면 R은 제 2 정규형이 아님  
￼
![1.1](/assets/images/database/7.2.png)

### 제 3 정규형 
테이블스키마 R에 존재하는 모든 함수적 종속성 X→A에 대하여 아래 두조건 중 하나가 만족되면 R은 제 3 정규형임
- X 가 R의 수퍼키
- A가 R의 주요 애트리뷰트 

![1.1](/assets/images/database/7.3.png)

BCNF (Boyce-Codd 정규형)  테이블스키마 R에 존재하는 모든 함수적 종속성 X→A에 대하여 아래 조건이 만족되면 R은 BCNF
- X 가 R의 수퍼키 

![1.1](/assets/images/database/7.4.png)

### 요약
각 정규형은 그의 선행 정규형보다 더 엄격한 조건을 가짐 
- 모든 제2 정규형 테이블은 제1 정규형임 
- 모든 제3 정규형 테이블은 제2 정규형임 
- 모든 BCNF 테이블은 제 3 정규형임   

관계 데이타베이스 설계의 목표
- 데이터베이스 내의 각 테이블이 BCNF 혹은 제 3정규형이 되도록 설계  

바람직한 관계 데이타베이스를 설계하기 위해 필요한 추가적인 특성
- 무손실 조인(lossless join) 특성 
- 종속성 보존(dependency preservation) 특성 

### 정규형의 부족한 점
- 애트리뷰트 두개로만 구성된 테이블은 항상 BCNF를 만족함 
- 어떤 데이타베이스도 이와 같이 두개의 애트리뷰트들로만 구성된 테이블들로  설계함으로써 BCNF를 만족하도록 할 수 있음 (문제 점 : 가짜 투플의 발생)

### 분해와 종속성 보존 
릴레이션 R의 애트리뷰트들에 대해 성립하는 함수적 종속성의 집합을 F라고 할때, R에서 분해된 각 테이블 Ri 에서 성립하는 모든 함수적 종속성 집합 Fi의 합집합이 F와 동등(eqivalent) 해야한다. 

![1.1](/assets/images/database/8.1.png)

### 분해와 무손실 (비부가적) 조인 
분해 집합의 테이블들을 조인했을 때 어떠한 가짜 투플도 생성되지 않음을 보장해야 함  

![1.1](/assets/images/database/8.2.png)
![1.1](/assets/images/database/8.3.png)
![1.1](/assets/images/database/8.4.png)
































