---
layout: post
title: 2.Protocol Concepts
subtitle: 
categories: [Computer Network]
tags: [ComputerScience]
---

### Overview 
- What is protocol?
 - Layering 
- End-to-End Arguments 
- Encapsulation 
- A Case Study: the Internet (TCP/IP Layering) 

### Layering

A single-layer protocol 

![1.1](/assets/images/cn/2.1.png)

A three-layer protocol 

![1.1](/assets/images/cn/2.2.png)

#### Two principles of protocol layering 
- The first principle dictates that if we want bidirectional communication, we need to make each layer so that it is able to perform two opposite tasks, one in each direction. 
- The second principle that we need to follow in protocol layering is that the two objects under each layer at both sites should be identical. 

#### Logical connection
: entities can think that there is a logical (imaginary) connection at each layer through which they can send the object created from that layer.

![1.1](/assets/images/cn/2.3.png)

### TCP/IP Protocol 

#### TCP protocol (Transmission Control Protocol)
: System protocol in OS for process-to-process delivery

- Reliable transmission
- Connection-oriented
- Port-based multiplexing

![1.1](/assets/images/cn/2.4.png)

#### IP protocol (Internet Protocol)
: System protocol in OS for node-to-node delivery

- Global addressing (source-to-destination)
- Routing

![1.1](/assets/images/cn/2.5.png)

Each layer takes data from above layer and
- adds header information to create new data unit 
- passes new data unit to layer below  

It is possible by interface between each pair of adjacent layers.

Interface defines what information and services a layer must provide for the layer above it.  

![1.1](/assets/images/cn/2.6.png)

### HTTP Protocol 
: HTTP is hypertext transfer protocol 

- Web’s application layer protocol following client/server model
- Client: browser that requests, receives, “displays” Web objects 
- Server: web server sends objects in response to requests 

![1.1](/assets/images/cn/2.7.png)

### Summary of Internet Protocol 

![1.1](/assets/images/cn/2.8.png)

![1.1](/assets/images/cn/2.9.png)

**Application**

: supporting network applications (ftp, smtp, http)  

**Transport**

: host-host data transfer (TCP , UDP)  

**Network**

: routing of datagrams from source to destination (IP, routing protocols)  

**Link**

: data transfer between neighboring network elements (PPP, ethernet)  

**Physical**

: bits “on the wire”  


