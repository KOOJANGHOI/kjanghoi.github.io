---
layout: post
title: List
subtitle: 
categories: [DataStructure]
tags: [ComputerScience]
---

### Abstract Data Type (ADT) 

ADT is data abstraction where the internal form of the type is hidden behind a set of access function 

values (data) of ADT are created and inspected only by the access functions 

access functions of ADT can be changed without any change of interface 


![2.1](/assets/images/data_structure/2.1.png)

### List ADT

an ordered sequence of element <A1, A2, A3, . . ., AN> 

operations in the List ADT
- MakeEmpty (List L): constructor
- DeleteList (List L): destructor
- Find (List L, Key K): returns the position of the key
- Insert (Key K, Position P, List L): insert K after P in L
- Delete (Key K, List L): delete K from L
- Concat (List L1, List L2): returns the concatenation of L1 and L2 


Simple implementation with array is inefficient because
an estimate of the maximum size of the list is required 
- it requires overestimating the amount of storage needed for the list 

it is hard to insert or delete at the beginning or in the middle of the list 
- worst case: O(N)
- average case: half of the list O(N)
- building a list by N successive inserts: O(N2) 


### List ADT : Linked list
a linked list consists of a series of structures, which are not 
necessarily adjacent in memory 

each structure contains the element and a pointer (Next pointer) to a structure of its successor 

the last cell’s Next pointer points to NULL 

![2.2](/assets/images/data_structure/2.2.png)
￼

#### Operations

![2.3](/assets/images/data_structure/2.3.png)

![2.4](/assets/images/data_structure/2.4.png)

![2.5](/assets/images/data_structure/2.5.png)

![2.6](/assets/images/data_structure/2.6.png)


#### Improvement
- Doubly linked list
- Circularly linked list

![2.7](/assets/images/data_structure/2.7.png)

