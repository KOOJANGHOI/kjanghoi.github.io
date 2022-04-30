---
layout: post
title: 9.Introduction to data link layer
subtitle: 
categories: [Computer Network]
tags: [ComputerScience]
---

### Concept of links and nodes 
**Communication at the data-link layer is node-to-node**

A data unit from one point in the Internet needs to pass through many networks (LANs and WANs) to reach another point. Theses LANs and WANs are connected by routers. It is customary to refer to the two end hosts and the routers as nodes and the networks in between as links. 

![1.1](/assets/images/cn/9.1.png)￼

### Services provided by the data-link layer
The data-link layer is located between the physical and the network layers
- The data-link layer provides services to the network layer
- it receives services from the physical layer. 

**Framing, Flow control, Media access control, Addressing, Error control**
￼
![1.1](/assets/images/cn/9.2.png)

### Two categories of links: point-to-point and broadcast links 
Although two nodes are physically connected by a transmission medium such as cable or air, we need to remember that the data-link layer controls how the medium is used. We can have a data-link layer that uses the whole capacity of the medium; we can also have a data-link layer that uses only part of the capacity of the link. In other words, we can have a point-to-point link or a broadcast link. 

To better understand the functionality of and the services provided by the link layer, we can divide the data-link layer into two sublayers: data link control (DLC) and media access control (MAC). This is not unusual because, as we will see in later chapters, LAN protocols actually use the same strategy. 

![1.1](/assets/images/cn/9.3.png)￼

### Link-layer addressing 

IP addresses is like identifiers at the network layer. However, in a internetwork such as the Internet we cannot make a datagram reach its destination using only IP addresses. The source and destination IP addresses define the two ends but cannot define which links the packet should pass through. 

![1.1](/assets/images/cn/9.4.png)

**Three types of link-layer addresses** 
Some link-layer protocols define three types of addresses: unicast, multicast, and broadcast. 
￼

![1.1](/assets/images/cn/9.5.png)

### Address Resolution Protocol (ARP)
ARP is protocol that maps the addresses at the network layer to addresses at the data-link layer. 

Anytime a node has an IP datagram to send to another node in a link, it has the IP address of the receiving node. However, the IP address of the next node is not helpful in moving a frame through a link; we need the link-layer address of the next node.

![1.1](/assets/images/cn/9.6.png)
￼

**ARP Operation**
￼
![1.1](/assets/images/cn/9.7.png)



**ARP Packet**

![1.1](/assets/images/cn/9.8.png)

**Example**

![1.1](/assets/images/cn/9.9.png)







