---
layout: post
title: Relational Data Model
subtitle: 
categories: [Database]
tags: [ComputerScience]
---

### Relational Model
- Database: Relation(혹은 테이블)들의 집합
- Relation: Tuple 의 집합
- Tuple: 실세계의 각 entity 혹은 entity 간의 관계에 대응. Attribute 들의 집합
- Attribute: Tuple에 포함되는 각 entity에 대한 특성 정보

![1.1](/assets/images/database/4.1.png)
![1.1](/assets/images/database/4.2.png)

### Relational Model Constraints
Relation schema에 주는 제약조건으로, 해당 relation에 속하는 모든 instance들이 만족해야 하는 조건

### 키 제약조건
relation에는 후보키에 해당되는 attribute들이 존재해야 한다는 제약조건
￼
![1.1](/assets/images/database/4.3.png)

### 엔티티 무결성 제약조건
데이터베이스의 각 relation schema의 primary key에 해당되는 attribute들에 대한 제약조건.  기본키가 각 투플들을 식별하는 데에 이용되기 때문에 기본키는 어떠한 투플에서도 NULL 값을 가질 수 없음.

### 참조 무결성 제약조건
두 relation을 대상으로 명시하는 제약조건으로, 두 릴레이션 내 연관된 투플들 간의 일관성을 유지하는데 필요
- 한 릴레이션에 있는 투플이 다른 릴레이션에 있는 투플을 참조하려면, 반드시 참조되는 투플이 존재해야함
- 릴레이션 R1의 투플 t1의 FK값은 참조되는 릴레이션 R2의 어떤 투플 t2의 PK와 일치하거나 NULL 값을 가져야 함

![1.1](/assets/images/database/4.4.png)

### Relational Algebra
- Relation 들을 다루는 연산들의 집합으로, 데이터베이스 검색을 위한 질의를 기술하는 데 사용됨.
- Relation은 Relational Algebra에 닫혀있음
    - 관계대수를 이용한 질의의 수행 결과도 릴레이션으로 나타남
    - 둘 이상의 관계 대수 연산들을 결합하여 복잡한 질의를 관계 대수 연산식으로 표현하는 것이 가능
- Select, project, set operation, join .. etc

#### SELECT
![1.1](/assets/images/database/4.5.png)

#### PROJECT
![1.1](/assets/images/database/4.6.png)
![1.1](/assets/images/database/4.7.png)

#### SET OPERATIONS
- UNION, INTERSECTION, SET DIFFERENCE and CARTESIAN PRODUCT  

#### JOIN
테이블 내에 저장된 서로 다른 투플들간의 관계를 파악하는데 사용
- THETA JOIN, EQUI JOIN, NATURAL JOIN





