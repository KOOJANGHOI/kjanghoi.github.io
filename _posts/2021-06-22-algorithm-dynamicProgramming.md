---
layout: post
title: Dynamic programming
subtitle: 
categories: [Algorithm]
tags: [ComputerScience]
---

### Introduction
Dynamic programming solves a problem by partitioning the problem into subproblems. 

- The subproblems are independent: divide-and-conquer method. 
- The subproblems are not independent: dynamic programming. 

![7.1](/assets/images/algorithm/7.1.png)

- A dynamic programming algorithm solves every subproblem just once 3 and saves its answer in a table and then reuse it. 
- Dynamic programming is typically to solve optimization problem

### Optimization problems 
- There can be many possible solutions. 
- Each solution has a value. 
- We find a solution with the optimal (minimum or maximum) value. 
- Such a solution is called an optimal solution to the problem. 

#### Four steps of a dynamic-programming algorithm

- Characterize the structure of an optimal solution. 
- Recursively define the value of an optimal solution. 
- Compute the value of an optimal solution in a bottom-up fashion. 
- Construct an optimal solution from computed information.  

### Assembly-line scheduling 

![7.1](/assets/images/algorithm/7.2.png)

![7.1](/assets/images/algorithm/7.3.png)

#### Brute-force approach
- Enumerate all possible ways and find a fastest way. 
- There are 2^n possible ways: Too many.  

An optimal solution to a problem contains within it an optimal solution to subproblems. 
- In this case, the fastest way to S1,4 contains the fastest way  through either S1,3 or S2,3. 
- Generally, the fastest way through station Si,j contains the  fastest way through either S1,j-1 or S2,j-1.  

#### A recursive solution
- fi[j] denotes the fastest time to finish station Si,j 

![7.1](/assets/images/algorithm/7.4.png)


### Rod cutting 
Given a rod of length n inches and a table of prices pi for i = 1, 2, ... n, determine the maximum revenue rn obtainable by cutting up the rod and selling the pieces. 

![7.1](/assets/images/algorithm/7.5.png)

![7.1](/assets/images/algorithm/7.6.png)


#### Brute-force approach

![7.1](/assets/images/algorithm/7.7.png)

#### Memoized approach

![7.1](/assets/images/algorithm/7.8.png)

![7.1](/assets/images/algorithm/7.9.png)

### Matrix-chain multiplication

![7.1](/assets/images/algorithm/7.10.png)

![7.1](/assets/images/algorithm/7.11.png)

![7.1](/assets/images/algorithm/7.12.png)


#### Running time
- O(n3) time in total 
- Θ(n2) subproblems 
- O(n) time for each subproblem  Space consumption 

#### Space consumption
- Θ(n2) space to store the m and s tables. 


### Elements of dynamic programming

#### Memoization 
- Recursive solution but solve each subproblem only once. 
- Fills the table in recursive way. 
- In most cases, it is slower than dynamic programming. 
- It is useful when only a part of subproblems are solved.  

The running time of a dynamic-programming algorithm depends on the product of two factors. 
- The number of subproblems overall
- How many choices each subproblem has. 

![7.1](/assets/images/algorithm/7.13.png)


#### Longest common subsequence 

![7.1](/assets/images/algorithm/7.14.png)

![7.1](/assets/images/algorithm/7.15.png)

![7.1](/assets/images/algorithm/7.16.png)

![7.1](/assets/images/algorithm/7.17.png)


￼
￼





