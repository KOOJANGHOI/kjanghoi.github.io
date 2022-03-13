---
layout: post
title: Sorting
subtitle: 
categories: [Algorithm]
tags: [ComputerScience]
---

### Insertion sort
A sorting algorithm using insertion. 

Given a key and a sorted list of keys, insert the key into the sorted list preserving the sorted order.  

e.g) Insert 3 into <1, 2, _,  4, 5, 6>

![7.1](/assets/images/algorithm/2.1.png)

![7.1](/assets/images/algorithm/2.2.png)

**How to analyze the running time of an algorithm?**

Consider running the algorithm on a specific machine and measure the running time. 	
- We cannot compare the running time of an algorithm on a machine with the running time of another algorithm on another machine. 
- So, we have to measure the running time of every algorithm on a specific machine, which is impossible. 

 Hence, we count the number of instructions used by the algorithm. 
- Arithmetic
- Add, Subtract, Multiply, Divide, remainder, floor, ceiling 
- Data movement
- Load, store, copy 
- Control 
- Conditional branch 
- Unconditional branch 
- Subroutine call and return  

#### Running time

![7.1](/assets/images/algorithm/2.3.png)

![7.1](/assets/images/algorithm/2.4.png)


#### Best case 
If A[1..n] is already sorted, tj = 1 for j = 2, 3,..., n. 

![7.1](/assets/images/algorithm/2.5.png)

#### Worst case
 If A[1..n] is sorted in reverse order, tj = j for j = 2, 3,..., n. 

![7.1](/assets/images/algorithm/2.6.png)

Only the degree of leading term is important. Because we are only interested in the rate of growth or order of growth. 

#### Space consumption
- Θ(n) space. 
- Moreover, the input numbers are sorted in place
- n + c space for some constant c. 


### Merge sort
A sorting algorithm using merge. 

Given two sorted lists of keys, generate a sorted list of the keys in the given sorted lists  

e.g) merge <1, 5, 6, 8>  and < 2, 4, 7, 9>  into < 1, 2, 4, 5, 6, 7, 8, 9> 

![7.1](/assets/images/algorithm/2.7.png)

![7.1](/assets/images/algorithm/2.8.png)

![7.1](/assets/images/algorithm/2.9.png)


#### A divide-and-conquer approach 
- Divide: Divide the n keys into two lists of n/2 keys. 
- Conquer: Sort the two lists recursively using merge sort. 
- Combine: Merge the two sorted lists. 

![7.1](/assets/images/algorithm/2.10.png)

![7.1](/assets/images/algorithm/2.11.png)

![7.1](/assets/images/algorithm/2.12.png)

![7.1](/assets/images/algorithm/2.13.png)

#### Running time

**Divide: Θ(1)**
 The divide step just computes the middle of the subarray, 
which takes constant time. 

**Conquer: 2T (n/2)** 
We recursively solve two subproblems, each of size n/2. 

![7.1](/assets/images/algorithm/2.14.png)

**Combine: Θ(n)** 
We already showed that merging two sorted lists of size n/2 takes Θ(n) time. 

- Let n1 and n2 denote the lengths of two sorted lists. 
- Θ(n1 + n2) time. 
- Main operations: compare and move 
- #comparison ≤ #movement 
- Obviously, #movement = n1 + n2 
- So, #comparison ≤ n1 + n2 
- Hence, #comparison + #movement ≤ 2(n1 + n2) 
- which means Θ(n1 + n2).  

![7.1](/assets/images/algorithm/2.15.png)





