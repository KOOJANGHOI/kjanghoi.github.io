---
layout: post
title: Heap sort
subtitle: 
categories: [Algorithm]
tags: [ComputerScience]
---

### Heaps

e.g) binary heap

![7.1](/assets/images/algorithm/5.1.png)

#### Max-heap
: A[PARENT(i)] >= A[i] 

- The parent is bigger than its child 
- The root node has the largest element. 
- The root of any subtree has the largest element among the subtree

#### Min-heap
: A[PARENT(i)] <= A[i] 


#### Heap stored in an array

![7.1](/assets/images/algorithm/5.2.png)

#### Height of a heap
: Θ(logn) Since a heap of n elements is based on a complete binary tree 

#### Max-heapify
: Maintaining the heap property

Let the value at the node “float down” in the max-heap so that the subtree rooted at the node becomes a max-heap

![7.1](/assets/images/algorithm/5.3.png)

**Running time**
: T(n) where n is the number of nodes in subtree

- O(logn)
- #height * time to exchange values
- O(logn) * Θ(1) 

#### Building a heap
: Call MAX-HEAPIFY(A, i) at the rightmost node that has the child from the bottom.
<br> 
(i = Math.floor(A.length / 2))

![7.1](/assets/images/algorithm/5.4.png)

![7.1](/assets/images/algorithm/5.5.png)

![7.1](/assets/images/algorithm/5.6.png)

![7.1](/assets/images/algorithm/5.7.png)

![7.1](/assets/images/algorithm/5.8.png)


#### Running time
**upper bound**
: Each call to MAX-HEAPIFY costs O(logn) time, and there are O(n) such calls, Thus the running time is O(nlogn)

**tighter bound**

![7.1](/assets/images/algorithm/5.9.png)

![7.1](/assets/images/algorithm/5.10.png)

### Heapsort algorithm
- Running time is O(nlogn) like merge sort
- Heapsort  sorts in place like insertion sort


#### Algorithm
- Build max-heap on A[1..n] : O(n) time
- Extract max and max-heapify n times: n * O(logn) 

![7.1](/assets/images/algorithm/5.11.png)

#### Priority queue
: A data structure for maintaining a set S of elements, each with an associated value called a key. 

￼
￼





