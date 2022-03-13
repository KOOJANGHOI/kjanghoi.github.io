---
layout: post
title: Divide and conquer
subtitle: 
categories: [Algorithm]
tags: [ComputerScience]
---

### Recurrences
When an algorithm contains a recursive call to itself, its running time can often be described by a recurrence. 

e.g) merge sort

![7.1](/assets/images/algorithm/4.1.png)

### Three methods for solving recurrences
- Substitution method
- Recursion tree method
- Master method


#### Substitution method
- Guess the solution
- Use mathematical induction to prove the guess is right


**Determining an upper bound on the recurrence**
: T(n)=2T(n/2)+n 

<br>
**Guess**
: T(n) = O(nlog(n))

<br>
**Prove**
: T(n) < cnlog(n)

<br>
**Solve(Inductive step)**
: Assume that this bound holds for ⌊n/2⌋, that is, T (⌊n/2⌋) ≤ c ⌊n/2⌋ lg(⌊n/2⌋). 
(Boundary conditions : c ≥ 2 satisfies the inequality)

![7.1](/assets/images/algorithm/4.2.png)
￼

#### Recursion tree method

![7.1](/assets/images/algorithm/4.3.png)

![7.1](/assets/images/algorithm/4.4.png)

![7.1](/assets/images/algorithm/4.5.png)
￼
￼





