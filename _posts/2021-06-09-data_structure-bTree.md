---
layout: post
title: B Tree
subtitle: 
categories: [DataStructure]
tags: [ComputerScience]
---

## M-way search tree

Binary Trees are not quite appropriate for data stored on disks 

- disk access is much slower than memory access
- disk is partitioned into blocks (pages) and the access time of a word is the same as that of the entire block containing the word 
- **we need to reduce the number of disk access**

**make each node of the tree wider! (m-way search tree)**


![7.1](/assets/images/data_structure/9.1.png)

![7.1](/assets/images/data_structure/9.2.png)


## B-tree
a B-tree of order m is an m-way search tree with the following properties 

- the root is either a leaf or has at least 2 children
- all non-leaf nodes (except the root) have between ⎡m/2⎤ and m children 
- all leaves are at the same level 

for example,
- when m=3, all internal nodes of B-tree have a degree of either 2 or 3 (2-3 tree)
- when m=4, all internal nodes of B-tree have a degree of 2, 3, or 4 (2-3-4 tree)
- a B-tree of order 2 is full binary tree 

### Analysis

**Height of tree : h**

best case: the tree is splitting widely (m^h leaves) 

![7.1](/assets/images/data_structure/9.3.png)

worst case: the tree is splitting ⎡m/2⎤ways 

![7.1](/assets/images/data_structure/9.4.png)



### ADT

structure

![7.1](/assets/images/data_structure/9.5.png)

#### Search
When we arrive an internal node with key k1 < k2 ,... < km-1, search for x in this list (either linearly or by binary search) 
- if you found x, you are done
- otherwise, find the index i such that ki < x < ki+1 (k0 = -∞ and km = ∞), and recursively search the subtree pointed by pi. 

Complexity = log m · (logn / logm) = O(log n) 

![7.1](/assets/images/data_structure/9.6.png)


#### Insertion
- find the appropriate leaf into which the node can be inserted if the leaf is not full (< m-1 keys), insert it
- if the node overflows, restore the balance

**Restore balance1 - key rotation**


check for siblings for rotation 

![7.1](/assets/images/data_structure/9.7.png)


**Restore balance2 - node split**

if we have a node with m keys after insertion, split the node into three groups 
- (a) a node with the keys from the first to (⎡m/2⎤-1) th
- (b) a node with the ⎡m/2⎤th key
- (c) a node with the keys from (⎡m/2⎤+1) th to m th keys 

- make (a) and (c) as new nodes and insert (b) to the
- parent if the parent overflows, repeat the process
- if the root overflows, create a new node with 2 children 

**Example**

![7.1](/assets/images/data_structure/9.8.png)

![7.1](/assets/images/data_structure/9.9.png)

![7.1](/assets/images/data_structure/9.10.png)

![7.1](/assets/images/data_structure/9.11.png)

![7.1](/assets/images/data_structure/9.12.png)


#### Deletion
find a suitable replacement which is the largest key in the left child (or the smallest in the right) and move it to fill the hole 


**Restore balance1 - key rotation**

![7.1](/assets/images/data_structure/9.13.png)

![7.1](/assets/images/data_structure/9.14.png)


**Restore balance2- node merging**

- no sibling that can be rotated
- move down the intermediate node from the parent and put it in the new node 
- if this might cause underflow in the parent node, repeat the process 

![7.1](/assets/images/data_structure/9.15.png)

**Example**

![7.1](/assets/images/data_structure/9.16.png)

![7.1](/assets/images/data_structure/9.17.png)

![7.1](/assets/images/data_structure/9.18.png)


### B-tree in database system
- number of disk access is O(logm(n))
- each disk access requires O(log m) overhead to determine the direction to branch, but this is done in main memory without a hard disk access, thus negligible. 
- m can be determined as large as possible, but it must still be small enough so that an internal node can fit into one disk block. 
- m is typically between 32 and 256.
- often one or two levels of internal nodes reside in main memory. 

