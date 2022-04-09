---
layout: post
title: 4.Constraint satisfaction problem
subtitle: 
categories: [ArtificialIntelligence]
tags: [ComputerScience]
---

### Constraint Satisfaction Problems (CSP) 
: goal이 주어지는것이 아니라 goal에 대한 constraint가 주어지는 문제

- state is defined by variables Xi with values from domain Di 
- goal test is a set of constraints specifying allowable combinations of values for subsets of variables 
- Allows useful general-purpose algorithms with more power than standard search algorithms 

But in standard search problem, state is a "black box“ 
– any data structure that supports successor function, heuristic function, and goal test 

**Example: Map-Coloring**

![1.1](/assets/images/ai/4.1.png)￼


### Real-world CSPs 

- Assignment problems 
	- e.g., who teaches what class ? 
- Timetabling problems 
	- e.g., which class is offered when and where? 
- Transportation scheduling 
	- e.g., which car uses which road and when ? 
- Factory scheduling 
	- e.g., which job is performed when and about which part ? 

### Overall Complexity for CSP 
- Every solution appears at depth n with n variables -> use depth-first search 
- Path is irrelevant, so can also use complete-state formulation 
- b=(n-l)d at depth l, hence n!·d^n leaves (d=domain size)  

### Backtracking search for CSPs
 Depth-first search for CSPs with single-variable assignments is called backtracking search 
- Backtracking search is the basic uninformed algorithm for CSPs  
- Can solve n-queens for n ≈ 25  
￼
![1.1](/assets/images/ai/4.2.png)

**Backtracking example** 

![1.1](/assets/images/ai/4.3.png)

![1.1](/assets/images/ai/4.4.png)

![1.1](/assets/images/ai/4.5.png)

![1.1](/assets/images/ai/4.6.png)

![1.1](/assets/images/ai/4.7.png)

![1.1](/assets/images/ai/4.8.png)

![1.1](/assets/images/ai/4.9.png)

![1.1](/assets/images/ai/4.10.png)

![1.1](/assets/images/ai/4.11.png)

![1.1](/assets/images/ai/4.12.png)

![1.1](/assets/images/ai/4.13.png)

![1.1](/assets/images/ai/4.14.png)

![1.1](/assets/images/ai/4.15.png)

![1.1](/assets/images/ai/4.16.png)

![1.1](/assets/images/ai/4.17.png)

![1.1](/assets/images/ai/4.18.png)

=> 무식하게 찾는것 같지만 비용은 적어진다.

### Local search for CSPs

![1.1](/assets/images/ai/4.19.png)
