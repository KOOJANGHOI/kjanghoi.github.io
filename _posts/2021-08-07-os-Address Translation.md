---
layout: post
title: 9.Address Translation
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

### 효율적인 메모리 가상화
효율적인 메모리 가상화를 위해서는 Hardware support가 필요하다.
- Register, Translation look-aside buffers, page-table

**주소 변환에서의 하드웨어의 역할**
- User mode process가 privileged operation을 수행하지 못하도록 막는다.
- 주소공간의 base/bound를 저장할 pair of register 필요

**주소 변환에서의 운영체제의 역할**
- 프로세스가 실행될때 메모리의 빈 공간을 찾는다.
- 프로세스가 종료될때 메모리 할당을 해제한다.
- 프로세스 문맥교환시 PCB에 base/bound를 저장한다.