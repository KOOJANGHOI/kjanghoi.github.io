---
layout: post
title: 12.Media Access Control (MAC)
subtitle: 
categories: [Computer Network]
tags: [ComputerScience]
---

### Problem of Media ACCESS 
Each station has the right to the medium without being controlled by any other station. 

Collision caused by multiple stations that try to send data on medium simultaneously (Frames will be either destroyed or modified) 

**Collision**

the event that occurs when two or more transmitters send at the same time on a shared channel; data will be destroyed.

![1.1](/assets/images/cn/12.1.png)
￼

### Goals of Multiple Access Control Protocols 
MAC Protocols arbitrate access to a common shared channel among a population of users 

![1.1](/assets/images/cn/12.1.png)

￼
**Metric**
- Fair among users
- High efficiency
- Low delay
- Fault tolerant


#### Multiple access protocols

**Random access**
- CSMA: Carrier sense multiple access
- CSMA/CD : CSMA + collision detection

**Controlled access**
- Polling & selecting
- Token passing (Token Ring)

**Channelization**
- Frequency Division
- Time Division

