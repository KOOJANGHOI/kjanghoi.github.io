---
layout: post
title: Disjoint Set
subtitle: 
categories: [Data structure]
tags: [ComputerScience]
---

## MST: minimum spanning tree 
￼
![7.1](/assets/images/data_structure/13.1.png)￼

![7.1](/assets/images/data_structure/13.2.png)￼


### Kruskal’s minimum spanning tree 
Using union-find algorithm


### Union-find algorithm

Given a set {1, 2, ..., n} of n elements. 

#### Init(S)
Initialize the elements so that each element i resides in its own singleton set, {i} 
- ex) when S = {1, 2, 3}, [1] = {1}, [2] = {2}, [3] = {3} 

#### Union(v, w)
merge the sets named s and t into a single set 
- ex) Union(1, 2): [1] = {1, 2}, [3] = {3} 

#### Find(S, i)
return the name of the set s that contains the element i. 
- name is an integer identifier of the set 
- the main property of set names is that Find(S, i) = Find(S, j) iff i and j are in the same set 
- Find(S, 1) = 1, Find(S, 2) = 1, Find(S, 1) = Find(S, 2) 


#### Example

![7.1](/assets/images/data_structure/13.3.png)￼

![7.1](/assets/images/data_structure/13.4.png)￼
￼

#### Analysis
- Init() takes O(n), but is done once.
- Union() takes a constant time, O(1).
- Find() takes worst-case time proportional to the height of tree. 


### Path compression 
a simple heuristic to improve running time significantly 
(ALMOST gets rid of the log n factor in the running time O(n log n)) 
If we compress the paths on each Find(), subsequent Find() will go much 
faster. 

“Compress the path” means that when we find the root we set all parent pointers of the node on our find path to the root. 

![7.1](/assets/images/data_structure/13.5.png)

running time of Find2() is still proportional to the height of the tree 

each time you spend lots of time in Find2(), you make the tree flatter, thus making subsequent Find2() faster. 




