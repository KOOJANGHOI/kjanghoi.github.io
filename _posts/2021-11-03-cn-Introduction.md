---
layout: post
title: 1.Introduction
subtitle: 
categories: [Computer Network]
tags: [ComputerScience]
---

### Syllabus overview
- 데이터 정보의 교환을 위한 데이터통신 규약(프로토콜)에 대한 개념 및 기술
- 데이터 통신 개념
- TCP/IP 5 layering (OSI 7레이어링) 프로토콜을 중심으로 물리계층, 링크계층, 네트워크 계층의 핵심 데이터 통신 기술
- 물리계층 : 액세스 인터페이스 (물리접속, 전송방식, 전송부호화)
- 링크 계층 : 이더넷 프레이밍, 링크 설정 및 해지, 다중화 또는 다중 액세스(LAN), 에러 검출 및 복구 기술, 무선액세스, 브리징 및 스위칭 기술
- 네트워크 계층:  라우팅 기술 등 데이터 통신 이론 전반


### Summary of Data Communications 

**What is communication? **

: The exchange of information between individuals using a common set of symbols, signs, behavior or language

**What is data?** 

: refers to information presented in whatever form is agreed upon by the parties creating and using the data. 

**What is data communication? **

: The exchange of data between two devices via some form of transmission medium such as a wire cable 

**What is Computer Network?**

: A set of devices connected by communication links 

**What is basic components of data communication system?**

: Message/Sender/Receiver/Medium/Protocol  

![1.1](/assets/images/cn/1.1.png)


**What is the difference between Data Communication and Network?**
: Computer Network = data communication + network Intelligence (topology) 

### Basic components of data communication system

**Message**
: data to be communicated
Text, numbers, images, audio, video … etc

![1.1](/assets/images/cn/1.2.png)

**Medium**
: the physical matter that carries the transmission. 

![1.1](/assets/images/cn/1.3.png)

**Protocol**
: A set of rules that governs data communication 

Protocols define 
- format, order of messages sent and received among network entities
- actions taken on message transmission, receipt 

Key elements of protocols
- Syntax: the structure or format of the data
- Semantics: meaning of each section of bits
- Timing & procedure: when and how data can be sent. 

**Communication Entity: Sender & Receiver** 
: Anything capable of sending or receiving information


### Network
:A fully-connected mesh topology 

Point to point communication usually not practical  

![1.1](/assets/images/cn/1.4.png)

#### Network topology
: A network is set of devices (often referred to as nodes) connected by communication links

![1.1](/assets/images/cn/1.5.png)

**Categories of network**
- Wide-areaNetworks(WANs)
- Local-areaNetworks(LANs)
- Metropolitan-areaNetworks(MANs) 

#### Networking Techniques 

**point-to-point vs multipoint**

![1.1](/assets/images/cn/1.6.png)

**Switched vs point-to-point**

![1.1](/assets/images/cn/1.7.png)

**A circuit-switched network**

![1.1](/assets/images/cn/1.8.png)

**A packet-switched network** 

![1.1](/assets/images/cn/1.9.png)

### Internet
: TCP/IP 기반의 네트워크의 네트워크

**TCP/IP**
: 미 국방성에서 개발한 표준 통신 프로토콜로 transmission control protocol/Internetworking protocol의 약자다. 

IP는 네트워크에서 데이터 그램 형식의 패킷을 최종 사용자에게 전달(라우팅)하기 위한 프로토콜이고, TCP는 종단간 사용자의 정보전달을 위한 세그멘트 분할, 재조합, 에러검출 등의 과정을 책임지는 프로토콜이다.  


