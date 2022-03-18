---
layout: post
title: Data modeling
subtitle: 
categories: [Database]
tags: [ComputerScience]
---

### 데이터베이스 설계 과정
![1.1](/assets/images/database/3.1.png)￼


### Entity and Attribute

entity
- 실세계에서 독립적으로 존재하는 실체

attribute
- 각 entity를 설명해주는 고유의 특성

![1.1](/assets/images/database/3.2.png)

### Key attribute
![1.1](/assets/images/database/3.3.png)￼

### Relationship
Entity 간 연관성을 나타낸 것
![1.1](/assets/images/database/3.4.png)


### Weak entity type

약한 개체 타입((weak entity type) 
- 자신의 키 애트리뷰트가 없는 개체 타입  

식별 소유자(identifying owner)
- 약한 개체 타입내의 각 개체를 식별하는데 사용되는 개체 타입  

식별 관계 타입(identifying relationship type)
- 약한 개체 타입과 식별 소유자와의 연관성을 표현하는 관계 타입  

부분 키(partial key) 
- 동일한 소유자 개체와 연관된 약한 개체들을 구분하는데 사용되는 애트리뷰트들의 집합 


### ER diagram
ER 모델을 이용한 개념적 설계의 결과를 도면으로 표현한 것 
![1.1](/assets/images/database/3.5.png)




