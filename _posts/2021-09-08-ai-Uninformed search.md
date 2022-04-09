---
layout: post
title: 1.Uninformed search
subtitle: 
categories: [ArtificialIntelligence]
tags: [ComputerScience]
---

### Search Algorithms 

#### Uninformed search
: Blind = brute-force = exhausted
- Breadth-first 
- Depth-first
- Iterative deepening depth-first
- Uniform cost  

#### Informed Heuristic search
- Greedysearch
- Heuristics
- Hill climbing,  

**Important concepts**
- Completeness : solution이 있다면, 항상 찾는가
- Time complexity
- Space complexity
- Quality of solution : optimal (least-cost) solution을 찾는가 


### Tree-based Search
: initial state부터 시작해서 state space를 점점 확장해 나간다. 매 state마다 goal인지 확인을 한다.

**e.g) Search Tree for the 8 puzzle problem** 

![1.1](/assets/images/ai/1.1.png)

Time and space complexity are measured in terms of
- b: maximum branching factor of the search tree
- d: depth of the least-cost solution
- m: maximum depth of the state space(maybe ∞) 

#### Breadth-First Search (BFS) 
: Expand shallowest unexpanded node  
 
**Implementation**
ForBFS, fringe is a first-in-first-out(FIFO) queue 

![1.1](/assets/images/ai/1.2.png)

**Properties** 
- Complete? Yes 
- Optimal? Yes 
- Time complexity O(b^d) 
- Space complexity O(b^d) 
- Main practical drawback? exponential space complexity  

![1.1](/assets/images/ai/1.3.png)

#### Depth-First Search (DFS) 
: Expand deepest unexpanded node 

**Implementation **
ForDFS, fringe is a Last-in-first-out(LIFO) stack 

**Properties** 
- Complete? Not complete if tree has unbounded depth 
- Optimal? – No 
- Time complexity?  Exponential 
- Space complexity?  Linear  

![1.1](/assets/images/ai/1.4.png)

#### Comparing DFS and BFS 

Time complexity는 같지만, worst case에서는 BFS가 DFS 보다 낫다.
Space complexity 측면에서는 DFS가 Linear 하므로 더 좋다.

일반적으로 space가 작으면 BFS가 유리하고, depth가 깊으면 DFS가 유리하다.


#### Iterative Deepening Search (IDS) 
Run multiple DFS searches with increasing depth-limits 
- Depth limit 안에 goal이 있다고 가정하고, limit을 증가하면서 DFS
- Linear memory + compactness는 보장
- But redundency로 인한 overhead (탐색한 space를 또 탐색)
- space 가 매우 크고 , depth가 알려지지 않았을때 좋다.

![1.1](/assets/images/ai/1.5.png)

#### Comparison of Uninformed Search Algorithms 

![1.1](/assets/images/ai/1.6.png)



