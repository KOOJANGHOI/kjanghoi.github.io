---
layout: post
title: 10.Error detection and correction
subtitle: 
categories: [Computer Network]
tags: [ComputerScience]
---

### Data link layer duties 
- Error Control: Detecting and correcting transmission errors. (Error & flow)
- Media Access Control: Controlling when computers transmit. Who should send now(Access control) 
- Message Delineation: Identifying the beginning and end of a message. (Framing & Addressing) 


### Error Detection 
Error control is handling network errors caused by problems in transmission, including line noise, not human errors. 

In normal transmission environment, the electromagnetic signal flow through the transmission media is subject to unpredictable interference from heat, magnetism, and other forms of electricity  

This interference can change the shape or timing of a signal which will result in altering the meaning of the data  

![1.1](/assets/images/cn/10.1.png)


#### Main Error Detection mechanism
- Vertical redundancy check(VRC)(or parity check)
- Longitudinal redundancy check(LRC)
- Cyclical redundancy check (CRC)
- Checksum
- Echo checking
- Ignore parity checking


#### Cyclic Redundancy Check (CRC) 
Most powerful of redundancy checking techniques  
- CRC-16 (99.969% effective) and CRC-32 (99.99%) are in common use today  


![1.1](/assets/images/cn/10.2.png)


![1.1](/assets/images/cn/10.3.png)


#### Checksum 
Used by higher protocol (TCP/UDP) 


![1.1](/assets/images/cn/10.4.png)


### Error Correction 

#### Stop-and-Wait protocol


![1.1](/assets/images/cn/10.5.png)


![1.1](/assets/images/cn/10.6.png)


![1.1](/assets/images/cn/10.7.png)


**Error control based on retransmission techniques**

Retransmission is based on automatic repeat request (ARQ)
(Correction is harder. So, Retransmission is simplest approach)

- Stop-and wait ARQ: wait ACK to be sent back for no error  and NAK for error detected 
- Sliding window ARQ
- Go-back-n: if one frame is lost or damaged, all frames sent  since the last frame acknowledgement are retransmitted
- Selective-reject: only specific damaged or lost frame is  retransmitted  


#### STOP-AND-WAIT ARQ 
: To avoid duplication, data frames are alternately labeled thus acknowledgement (ACK) frames are also numbered 0 and 1 alternately. 


**Normal Operation**
- Sender sends frame 0 and waits to receive ACK 1 
- When ACK 1 is received, it sends frame 1 and then waits to receive ACK0 
- Repeat from step 1 and 2 and so on.  


![1.1](/assets/images/cn/10.8.png)


The ACK must be received before the time set for each frame expires (Time-out). 
(frame을 보내고 timeout 안에 ack가 안오면 안보내진것으로 판단)


![1.1](/assets/images/cn/10.9.png)


#### Piggybacking
A method to combine a data frame with an acknowledgement in case both sender and the receiver have data to send. 

![1.1](/assets/images/cn/10.10.png)


#### GO-BACK-N ARQ 
Frame from a sending station are numbered sequentially. If the header of the frame allows m bits fro the sequence number, the sequence numbers range from 0 ~ 

**Sender Sliding Window** 
- Sender uses window to hold the outstanding frames until they are acknowledged 
- Frames to the left of the window are those that have already been acknowledged and can be purged 
- Frames to the right of the window can not be sent until the window slides them  


![1.1](/assets/images/cn/10.11.png)

**Receiver Sliding Window** 
- Size of the window is always 1 
- The receiver is always looking for a specific frame to arrive in a specific order 

![1.1](/assets/images/cn/10.12.png)


**Problem**
- No out-of-order frames 
- Not efficient : Multiple frame maybe retransmitted 


#### SELECTIVE REPEAT ARQ 
Only damaged frame is resent  

**Sender and receiver windows**
- Size of the sender’s window must be one half of 2^m
- Size of the receiver’s window must be same as the sender’s 
- Negative acknowledgement(NACK) is used to define damaged frame 


![1.1](/assets/images/cn/10.13.png)


![1.1](/assets/images/cn/10.14.png)


#### ARQ Performance 

![1.1](/assets/images/cn/10.15.png)





