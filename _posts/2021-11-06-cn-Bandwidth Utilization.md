---
layout: post
title: 6.Multiplexing and Spreading 
subtitle: 
categories: [Computer Network]
tags: [ComputerScience]
---

### Multiplexing 
: Multiplexing is the set of techniques that allows the simultaneous transmission of multiple signals across a single data link. 

Multiplexing means breaking up a higher speed circuit into several slower circuits. 

![1.1](/assets/images/cn/6.1.png)


**The main advantage of multiplexing is cost**
- multiplexing is cheaper because fewer network circuits are needed. 

**Four main categories of multiplexing**
- Time division multiplexing (TDM)
- Frequency division multiplexing (FDM)
- Code division multiplexing (CDM)
- Wavelength division multiplexing (WDM)
- Statistical Multiplexing = Asynchronous packet transmission


![1.1](/assets/images/cn/6.2.png)

#### Interleaving
Multiplexer/Demultiplexer process a terminal/host’s unit in turn  

**Character (byte) Interleaving **
Multiplexing perform one/more character(s) or byte(s) at atime(one  byte per unit)  

**Bit Interleaving **
Multiplexing perform on one bit at a time(one bit per unit)  


![1.1](/assets/images/cn/6.3.png)

#### Synchronizing
One or more Framing bit (s) is (are) added to each frame for synchronization between the multiplexer and demultiplexer  

![1.1](/assets/images/cn/6.4.png)
