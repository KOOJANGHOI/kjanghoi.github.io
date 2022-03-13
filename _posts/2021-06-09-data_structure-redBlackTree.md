---
layout: post
title: Red Black Tree
subtitle: 
categories: [Data structure]
tags: [ComputerScience]
---

## Red black tree
a binary search tree in which every node is colored either red or black 

all properties are based on the extended binary search tree; each null pointer is replaced with an external node 


a pointer to a black child (including the external node) is black; a pointer to a red child is red 


properties of colored nodes
- root and all external nodes are black
- no consecutive red node is on the root-to-external node path
- all root-to-external node paths have the same number of black nodes 

￼
![7.1](/assets/images/data_structure/10.1.png)

