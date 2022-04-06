---
layout: post
title: 13.Translation Lookaside Buffers
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

### TLB
- MMU(Memory management unit) 내의 cache
- locality 에 의거하여 popular VPN to PFN을 caching

![1.1](/assets/images/os/19.1.png)

![1.1](/assets/images/os/19.2.png)

#### Basic Algorithm
- extract the VPN and check if the TLB holds the transalation for this VPN (PFN)
- If TLB hit, extract PFN from the relevant TLB entry, and form the desired physical address and access memory. 
- If TLB miss, The hardware accesses the page table to find the translation. 
- updates the TLB with the translation.  

#### Who Handles The TLB Miss? 
- Hardware-managed TLB : CISC
- Software-managed TLB : RISC

#### TLB Entry
- TLB is managed by Full Associative method.
- A typical TLB might have 32,64, or 128 entries
- Hardware search the entire TLB in parallel to find the desired translation 
- other bits: valid bits , protection bits, address-space identifier, dirty bit 
    - Valid bits: valid/invalid
    - Protection bits: read, write, execute, 
    - Address space identifier : to distinguish which entry is meant for which process

![1.1](/assets/images/os/19.3.png)

![1.1](/assets/images/os/19.4.png)