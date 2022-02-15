---
layout: post
title: Greedy algorithm
subtitle: 
categories: [Algorithm]
tags: [ComputerScience]
---

### Introduction
A greedy algorithm always makes the choice that looks best at the moment. 

It makes a locally optimal choice in the hope that this choice will lead to a globally optimal solution. 

=> It makes the choice before the subproblems are solved. 


#### An activity selection problem 
: To select a maximum-size subset of mutually compatible activities.  

- A set of activities: S = {a1, a2, ..., an} 
- Each activity ai has its start time si and finish time fi. 
    - 0 ≤ si < fi < ∞ 
- Activity ai takes place during [si, fi) 
- Activities ai and aj are compatible if the intervals [si, fi) and [sj fj) do not overlap
￼
![7.1](/assets/images/algorithm/8.1.png)
￼
![7.1](/assets/images/algorithm/8.2.png)

![7.1](/assets/images/algorithm/8.3.png)

**Optimal substructure**

![7.1](/assets/images/algorithm/8.4.png)

![7.1](/assets/images/algorithm/8.5.png)

![7.1](/assets/images/algorithm/8.6.png)

![7.1](/assets/images/algorithm/8.7.png)

![7.1](/assets/images/algorithm/8.8.png)
￼
￼
### Elements of the greedy strategy 

#### Greedy-choice property 
- Make the choice before the subproblems are solved. 
- Only one subproblem is generated. 

#### Dynamic programming 
- Make a choice after the subproblems are solved. 
- Several subproblems may be generated.  

#### 0-1 knapsack 
- A thief robbing a store finds n items. 
- The ith item is worth vi dollars and weighs wi pounds. 
- He can carry at most W pounds in his knapsack. 
- The n, vi, wi, and W are integers. 
- Which items should he take?  Fractional knapsack 

=> The greedy strategy does not work. 

(E.g)

![7.1](/assets/images/algorithm/8.9.png)

Fractional knapsack 
- In this case, the thief can take fractions of items. 

=> The greedy strategy works.  
- Compute the value per pound vi/wi for each item. 
Take as much as possible of the item with the greatest value per pound.  




￼
￼





