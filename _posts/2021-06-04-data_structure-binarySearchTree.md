---
layout: post
title: Binary Search Tree
subtitle: 
categories: [Data structure]
tags: [ComputerScience]
---

## Binary search tree

one of the most fundamental problems in data structure design 
- there are a set of records R1, R2,..., Rn which are associated with distinct key values X1, X2,..., Xn, respectively. 
- given a search key x, find the record if it occurs in the set 


for every node X in the tree, 
- the values of all the keys in its left subtree are smaller than the key value in X 
- the values of all the keys in its right subtree are larger than the key value in X 

### Time complexity

#### sequential search
- simply store the keys in a linear array and search sequentially 
- insertion: O(1), searching O(n) 

#### binary search
- searching: O(log n)
- insertion/deletion: O(log n) 

### Binary search tree - ADT

![6.1](/assets/images/data_structure/6.1.png)

#### insert(x,T)
- Insert x into T
- If x already exists, do appropriate action
    - e.g., do nothing, return error message, increment reference count.
￼
![6.2](/assets/images/data_structure/6.2.png)

#### delete(x,T)
- Delete x from dictionary T 
- If x does not exist, issue an error message 

![6.3](/assets/images/data_structure/6.3.png)￼

#### find(x,T)
- Search x in T
- return either True/False or the pointer to the record 

![6.4](/assets/images/data_structure/6.4.png)

![6.5](/assets/images/data_structure/6.5.png)

![6.6](/assets/images/data_structure/6.6.png)