---
layout: post
title: AVL Tree
subtitle: 
categories: [Data structure]
tags: [ComputerScience]
---

## AVL Tree

**AVL(Adelson-Velskii and Landis) Tree**

- Height balanced binary search tree 
- for every node in the tree, the heights of its left subtree and right subtree differ by at most 1. (the height of a null subtree is – 1) 

### Balance factor
- the difference in heights between the left and right subtrees of that node 
- BF(T) = hL – hR 
- BF(T)= -1, 0, 1 for any node T  


### Insertion - example
￼
![7.1](/assets/images/data_structure/8.1.png)
![7.1](/assets/images/data_structure/8.2.png)
![7.1](/assets/images/data_structure/8.3.png)
![7.1](/assets/images/data_structure/8.4.png)
￼

### Insertion - ADT

![7.1](/assets/images/data_structure/8.5.png)

Unbalanced tree with respect to the closest parent A (that had a BF of +2 or -2 ) of the new node Y 
- LL type : new node Y is inserted in the left subtree of the left subtree of A 
    - right rotation from A to Y 
- LR type : Y is inserted in the right subtree of the left subtree of A 
    - left rotation(RR rotation) and right rotation (LL rotation)
- RL type : Y is inserted in the left subtree of the right subtree of A
    - right rotation(LL rotation) and left rotation (RR rotation)
- RR type : Y is inserted in the right subtree of the right subtree of A
    - left rotation from A to Y


#### case 1 (single rotation)
an insertion into the left subtree of the left child of the node 
￼
![7.1](/assets/images/data_structure/8.6.png)
![7.1](/assets/images/data_structure/8.7.png)


#### case 2 (double rotation)
an insertion into the right subtree of the left child of the node A 

![7.1](/assets/images/data_structure/8.8.png)
![7.1](/assets/images/data_structure/8.9.png)
￼

#### case 3 (double rotation)
an insertion into the left subtree of the right child of the node A 
￼

![7.1](/assets/images/data_structure/8.10.png)

#### case 4 (single rotation)
an insertion into the right subtree of the right child of the node A 
￼
![7.1](/assets/images/data_structure/8.11.png)

### AVL Tree vs Binary search tree
Every AVL tree is also a binary tree because AVL tree also has the utmost two children.

Each node in the Binary Search tree consists of three fields, i.e., left subtree, node value, and the right subtree.
On the other hand, each node in the AVL tree consists of four fields, i.e., left subtree, node value, right subtree, and the balance factor.

It is complex to implement because in AVL tree, we have to first construct the AVL tree, and then we need to check height balance. If the height is imbalance then we need to perform some rotations to balance the tree.

But after constructing AVL Tree, searching is efficient even when there are large number of nodes in the tree because the height is balanced.
