---
layout: post
title: Tree
subtitle: 
categories: [Data structure]
tags: [ComputerScience]
---

### Tree

- a (Rooted) tree is a finite set T of zero or  more nodes.
	- if there is no node, the tree is empty 
- a distinguished node called the root, r, and zero or more (sub)trees T1, T2,..., Tk, each of whose roots are connected with r by an edge.

![1.1](/assets/images/data_structure/5.1.png)

![5.2](/assets/images/data_structure/5.2.png)

#### terminology 
	
- Each root of T1, T2,..., Tk is a child of r, and r is the parent of each root. 
- The roots of the subtrees are siblings of one another
- If there is an order among the Ti’s, the tree is an ordered tree. 
- The degree of a node is the number of children it has. 
- A leaf is a node of degree 0.(= terminal node) 
- a path between two nodes is a sequence of nodes n1, n2,... nk, such that ni is a parent of ni+1
- the length of a path is the number of edges on the path (the path n1, n2,... nk: length k-1) 
- the depth(level) of a node is the length of the (unique) path from the root to tha t node. (root: depth 0 or depth 1) 
- If there is a path from n1 to n2, n2 is a descendant of n1. (proper descendant if n1 is not n2.) n1 is a ancestor of n2. 


### Binary tree

a finite set of nodes that is either 

- empty or 
- a root node and two disjoint binary trees 


a **full binary** tree of depth k is a binary tree of depth k having 2^k - 1 nodes, (k >=0)

 a **complete binary tree** is a binary tree in which every level, except the last, is completely filled and the last level has all its nodes to the left side 

#### representation - array

![5.3](/assets/images/data_structure/5.3.png)

#### representation - linked list

![5.4](/assets/images/data_structure/5.4.png)

![5.5](/assets/images/data_structure/5.5.png)


#### applications

- Binary Search Tree: representing ordered sets of elements 
- Expression Tree: intermediate representation for expressions used by the compiler 


### Tree traversal

#### Inorder traversal

![5.6](/assets/images/data_structure/5.6.png)


#### Preorder traversal

**Printing structured contents**

![5.7](/assets/images/data_structure/5.7.png)

#### Postorder traversal

![5.8](/assets/images/data_structure/5.8.png)

**Calculating directory size**

![5.9](/assets/images/data_structure/5.9.png)

**Expression evaluation**

![5.10](/assets/images/data_structure/5.10.png)
