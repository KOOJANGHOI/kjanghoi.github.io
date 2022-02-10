---
layout: post
title: Heap
subtitle: 
categories: [DataStructure]
tags: [ComputerScience]
---

## Heap (priority queue)
the element to be deleted is the one with the highest (or lowest) priority 

priority queue Q supports
- insert (x, Q) 
- deleteMin(Q) or deleteMax(Q) 
￼
![7.1](/assets/images/data_structure/7.1.png)

### Binary min heap
a min heap is a complete binary tree and partially ordered tree in which the key value in each node is no larger than the key values in its children 


#### complete tree 
every level of tree is completely filled, with the exception of the bottom level, which is filled from left to right (With height h, there are between 2h and 2h+1 – 1 nodes) 
￼
![7.1](/assets/images/data_structure/7.2.png)

#### partially ordered tree 
the key of each internal node is less than of equal to the keys of its children 

the smallest element should be at the root 




### Array representation
binary heap can be stored in array since it is complete tree 

![7.1](/assets/images/data_structure/7.3.png)

### ADT

![7.1](/assets/images/data_structure/7.4.png)

![7.1](/assets/images/data_structure/7.5.png)

![7.1](/assets/images/data_structure/7.6.png)
￼
￼
### Build heap
- Build a Heap containing n keys takes O(n log n) with consecutive insertions 
- But it can take O(n) if they are already in array. 
- Starting with the lowest non-leaf node, working back towards root, perform percolating-down on each node of the tree. 


### Heap sort
- building binary heap of n elements: O(n)
- DeleteMin operation n times: O(n log n)
- need extra space to save the sorted list: use the last cell in the previous heap 
￼
![7.1](/assets/images/data_structure/7.7.png)
￼
![7.1](/assets/images/data_structure/7.8.png)
