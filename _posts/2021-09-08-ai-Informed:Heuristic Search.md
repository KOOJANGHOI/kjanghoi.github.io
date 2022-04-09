---
layout: post
title: 2.Informed/Heuristic Search
subtitle: 
categories: [ArtificialIntelligence]
tags: [ComputerScience]
---

### Informed/heuristic search
Uninformed search methods have their limits  

**Informed (or heuristic) search uses problem-specific heuristics to improve efficiency** 
- Can provide significant speed-ups in practice. But can still have worst-case exponential time complexity 
- Best-first search
- A* search

**Limitations of uninformed search** 

![1.1](/assets/images/ai/2.1.png)

### Best-first search 
: node마다 evaluation function f(n)을 사용하여 most desirable unexpanded node를 expand 한다.

**Implementation**:
: Order the nodes in fringe by f(n) (by desirability, lowest f(n) first) 

**Note**
evaluation function is an estimate of node quality 
More accurate name for “best first” search would be “seemingly best-first search” 

### Heuristic function 
: “using rules of thumb to find answers” 

**Heuristic function h(n)** 
- Estimate of (optimal) cost from n to goal 
- h(n)=0 if n is a goal node 
- Provides problem-specific knowledge to the search algorithm  

**Heuristic functions for 8-puzzle** 

![1.1](/assets/images/ai/2.1.png)￼

### Greedy best-first search 
- Special case of best-first search 
- Uses h(n) = heuristic function as its evaluation function 
- Expand the node that appears closest to goal  

**Properties** 
- Complete? Not unless it keeps track of all states visited 
- Optimal? No 
- Time? O(bm), can generate all nodes at depth m before finding solution 
    - m = maximum depth of search space 
- Space? O(bm) 
	- again, worst case, can generate all nodes at depth m before finding solution 

### A* Search 
- Expand node based on estimate of total path cost through node 
- Evaluation function f(n) = g(n) + h(n)
    - g(n) = cost so far to reach n 
    - h(n) = estimated cost from n to goal 
    - f(n) = estimated total cost of path through n to goal 
- Efficiency of search will depend on quality of heuristic h(n)  

**Properties** 
- Complete? Yes
	- unless there are infinitely many nodes with f ≤ f(G) ) 
- Optimal? – Yes
	- No other optimal algorithm will expand fewer nodes, for a given heuristic
- Time? Exponential in worst case 
- Space? Exponential in worst case 


#### Admissible heuristics 
A heuristic h(n) is admissible if for every node n, 
h(n) ≤ h*(n), where h*(n) is the true cost to reach the goal  state from n.  

An admissible heuristic never overestimates the cost to reach  the goal, i.e., it is optimistic 

### Local search
: problem의 정의가 goal 까지의 path가 solution이 아닌 경우. Constant state만 기억하면서 계속 좋아지는 방향으로 문제를 푼다.

**E.g. 8-queens problem **
- Keep track of single current state
- Move only to neighboring states
- Ignore paths 

**Advantages** 
- Use very little memory 
- Can often find reasonable solutions in large or infinite(continuous)  state spaces 

**“Pure optimization” problems**
- All states have an objective or heuristic function
- Goal is to find state with max(ormin) objective value
- Does not quite fit into path-cost/goal-state formulation
- Local search can do quite well on these problems. 

### Hill-climbing search 
continuously moves in the direction of increasing value
- terminates when a peak is reached
- A kind of “greedy local best-search” 

Value can be Objective or heuristic function value  

Hill climbing does not look ahead of the immediate neighbors of the current state.  

Can randomly choose among the set of best successors, if multiple have the best value  

Characterized as “trying to find the top of Mount Everest while in a thick fog” 
￼
![1.1](/assets/images/ai/2.1.png)

**Performance of hill-climbing on 8-queens**
: Randomly generated 8-queens starting states...  

14% the time it solves the problem 

86% of the time it get stuck at a local minimum However
- Takes only 4steps on average when it succeeds
- And 3 on average when it gets stuck (among 17 million states)  

하지만 practically, 답을 찾긴 찾지만 전부 찾는지는 보장 못한다.


