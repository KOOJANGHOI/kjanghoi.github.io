---
layout: post
title: 10.Segmentation
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

#### Fragmentation
- Base/bound approach 의 비 효율성
- 연속된 물리메모리에 프로세스를 모두 저장하면 전체 물리메모리는 파편이 많이 생김. 프로세스들이 실행되는 와중에 이를 정리하기 힘듬
 
### Segmentation
- 세그먼트란 논리적으로 나뉜, 특정한 길이로 제한된 주소공간이다.
    - 코드, 힙, 스택 영역 각각 나뉘며 각각 base/bound를 가진다.
- Segmentation fault
    - 허용되지 않은 주소로 물리 메모리가 계산되었을때, 하드웨어가 detect 해서 OS가 segmentation fault를 발생한다.
- Stack & Heap segment growth
    - 스택은 backward, 힙은 forward 하게 메모리가 증가한다.
    - Growth 방향을 나타내는 bit가 필요함 (하드웨어 support)
    - Increase/shrink 방법의 효과적인 방법임

![1.1](/assets/images/os/16.1.png)
￼
#### 구현
프로세서에 Segment map이 존재한다.
- Segment # -> mapping -> base address and limit
- Base + offset = physical address
- Offset exceeds limit -> error

![1.1](/assets/images/os/16.2.png)

#### 문제
- 외부 단편화: 충분하게 연속된 물리메모리가 없으면 세그먼트가 위치할 수 없음
- 압축 비용이 비싸다: 프로세스를 멈추고, 데이터를 옮겨 저장하고, 세그먼트 레지스터 값을 변경해야함
