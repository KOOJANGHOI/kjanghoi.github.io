---
layout: post
title: 19.Network layer protocols
subtitle: 
categories: [Computer Network]
tags: [ComputerScience]
---

### Recap
Internet: a collection of networks connected by internetworking devices such as routers or gateways. 

“network of Network” as a connectionless TCP/IP Network 

IP Network provides connectionless, unreliable delivery of IP datagrams. 

**connectionless**

each datagram is independent of all others.

**unreliable**

there is no guarantee that datagrams are delivered correctly or at all. 

### Network layer protocols
The network layer in version 4 can be thought of as one main protocol and three auxiliary ones. 

![1.1](/assets/images/cn/19.1.png)

- IP : packetizing, forwarding, delivery of a packet
- ICMP: error handling
- IGMP: multicasting
- ARP: address mapping

### IP Datagram
Packets used by the IP are called datagrams. 

A datagram is a variable-length packet consisting of two parts: header and payload (data). 

The header is 20 to 60 bytes in length and contains information essential to routing and delivery. 
￼
![1.1](/assets/images/cn/19.2.png)

![1.1](/assets/images/cn/19.3.png)￼

**Header**
￼
![1.1](/assets/images/cn/19.4.png)

Network layer at the source, router, and destination 
￼
![1.1](/assets/images/cn/19.5.png)

![1.1](/assets/images/cn/19.6.png)

![1.1](/assets/images/cn/19.7.png)￼
￼
#### IP Datagram Fragmentation 
IP Datagram is divided into fragments and reassembly is done only at the destination

Each fragment (packet) has the same structure as the IP datagram. 

If any of the fragments are lost
- the entire datagram is discarded (and an ICMP message is sent to the sender)  


![1.1](/assets/images/cn/19.8.png)


### ICMPv4
The Internet Control Message Protocol

The IPv4 has no error-reporting or error-correcting mechanism. The IP protocol also lacks a mechanism for host and management queries. The Internet Control Message Protocol version 4 (ICMPv4) has been designed to compensate for the above two deficiencies. 

- ICMP is a protocol used for exchanging control messages. 
- ICMP messages are usually generated and processed by the IP software, not the user process. 
- ICMP uses IP to deliver messages


ICMP messages are divided into two broad categories: error-reporting messages and query messages. 

The error-reporting messages report problems that a router or a host (destination) may encounter when it processes an IP packet. 
￼
![1.1](/assets/images/cn/19.9.png)

The query messages, which occur in pairs, help a host or a network manager get specific information from a router or another host. 

![1.1](/assets/images/cn/19.10.png)



