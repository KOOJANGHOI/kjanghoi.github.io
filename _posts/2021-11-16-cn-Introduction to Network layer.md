---
layout: post
title: 18.Introduction to Network layer
subtitle: 
categories: [Computer Network]
tags: [ComputerScience]
---

### Network layer services

![1.1](/assets/images/cn/18.1.png)

- Connectionless Delivery (each datagram is treated individually)
	- Hop-by-hop Packet forwarding 
- Unreliable Best Effort Delivery
	- delivery is not guaranteed
	- No error control or flow control
	- Only Error detection. 
- Fragmentation / Reassembly (based on hardware MTU). 
- Routing


**Communication at the network layer**

![1.1](/assets/images/cn/18.2.png)


#### Packet switching
A router, in fact, is a switch that creates a connection between an input port and an output port (or a set of output ports), just as an electrical switch connects the input to the output to let electricity flow.  


**Datagram approach**

A connectionless packet-switched network 
: When the Internet started, to make it simple, the network layer was designed to provide a connectionless service in which the network-layer protocol treats each packet independently, with each packet having no relationship to any other packet. 

The idea was that the network layer is only responsible for delivery of packets from the source to the destination. In this approach, the packets in a message may or may not travel the same path to their destination. 

![1.1](/assets/images/cn/18.3.png)

![1.1](/assets/images/cn/18.4.png)


**Virtual circuit approach**

A virtual-circuit packet-switched network 
: In a connection-oriented service (also called virtual-circuit approach), there is a relationship between all packets belonging to a message. Before all datagrams in a message can be sent, a virtual connection should be set up to define the path for the datagrams. After connection setup, the datagrams can all follow the same path. In this type of service, not only must the packet contain the source and destination addresses, it must also contain a flow label, a virtual circuit identifier that defines the virtual path the packet should follow. 

![1.1](/assets/images/cn/18.5.png)

![1.1](/assets/images/cn/18.6.png)


### Network layer performance
The performance of a network can be measured in terms of delay, throughput, and packet loss. Congestion control is an issue that can improve the performance. 

**delay**

All of us expect instantaneous response from a network, but a packet, from its source to its destination, encounters delays. The delays in a network can be divided into four types: transmission delay, propagation delay, processing delay, and queuing delay 

**throughput**

Throughput at any point in a network is defined as the number of bits passing through the point in a second, which is actually the transmission rate of data at that point. 

**packet loss**

When a router receives a packet while processing another packet, the received packet needs to be stored in the input buffer waiting for its turn. A router, however, has an input buffer with a limited size. A time may come when the buffer is full and the next packet needs to be dropped. The effect of packet loss on the Internet network layer is that the packet needs to be resent, which in turn may create overflow and cause more packet loss. 


### IPv4 Addresses
An IPv4 address is a 32-bit address that uniquely and universally defines the connection of a host or a router to the Internet. The IP address is the address of the connection, not the host or the router. 


#### IP address and MAC address

**connectivity**

IP address uniquely identify host/router on the internet (indirect connectivity) to allow global communication between all devices. (This makes routing feasible)

But MAC address is only valid within the same broadcast network (direct connectivity) 

**Address**

IP address is address of connection. Every network on the Internet is assigned a range of possible IP addresses for use on its network. 

IP addresses are assigned by a central authority (Internet Corporation for Assigned Names and Numbers -- ICANN)  

MAC address is hardware address placed on network interface cards by their manufacturers 

#### IPv4 Address

![1.1](/assets/images/cn/18.7.png)

![1.1](/assets/images/cn/18.8.png)

A Network ID is assigned to an organization by a global authority.  

Host IDs are assigned locally by a system administrator 

Both the Network ID and the Host ID are used for routing.  

![1.1](/assets/images/cn/18.9.png)


**IP Address (4bytes) Allocation History**

- 1981 - IPv4 protocol published 
- 1985 ~ 1/16 of total space 
- 1990 ~ 1/8 of total space 1995 ~ 1/4 of total space 
- 2000 ~ 1/2 of total space 
- IPv4 no more because theoretical limit of 32-bit space is 4 billion devices. But practical limit is upto 0.25 billion devices 

**Forwarding of IP packets**

forwarding means to place the packet in its route to its destination. 

Host and router have forwarding table to find the next hop to deliver the packet to

![1.1](/assets/images/cn/18.10.png)



