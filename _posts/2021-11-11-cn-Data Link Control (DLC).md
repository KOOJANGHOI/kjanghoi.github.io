---
layout: post
title: 11.Data Link Control (DLC)
subtitle: 
categories: [Computer Network]
tags: [ComputerScience]
---

### Framing = Packetizing
: For breaking sequence of bits into a frame, first and last bit of the frame are must be determined (frame delineation) 

Typically implemented by network adapter (interface card)  


![1.1](/assets/images/cn/11.1.png)

#### Four approaches

**Clock Based Synchronous**
Time synchronized fixed length frames, high reliability required  
- ex) SONET

**Asynchronous**
Special character to delineate frames, replace character in data stream 
- Byte oriented protocol
- Bit orienter protocol 

**Example: HDLC Frame Format** 

![1.1](/assets/images/cn/11.2.png)




