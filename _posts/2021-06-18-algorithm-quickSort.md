---
layout: post
title: Quick sort
subtitle: 
categories: [Algorithm]
tags: [ComputerScience]
---

### Divide-and-Conquer paradigm 

![7.1](/assets/images/algorithm/6.1.png)

Partition : Θ(n) time. 

![7.1](/assets/images/algorithm/6.2.png)

![7.1](/assets/images/algorithm/6.3.png)


### Performance of quick sort

#### Balanced partitioning
: When PARTITION produces two subproblems of sizes ⌊n/2⌋ and ⌈n/2⌉- 1. 

![7.1](/assets/images/algorithm/6.4.png)

![7.1](/assets/images/algorithm/6.5.png)

#### Unbalanced partitioning

![7.1](/assets/images/algorithm/6.6.png)

![7.1](/assets/images/algorithm/6.7.png)


#### Worst case analysis
: Is the unbalanced partitioning the worst case?  No

Prove T(n) = O(n^2)

![7.1](/assets/images/algorithm/6.8.png)

![7.1](/assets/images/algorithm/6.9.png)

The internal expression is maximized when q = 0 or n-1 

![7.1](/assets/images/algorithm/6.10.png)


#### Average case analysis

![7.1](/assets/images/algorithm/6.11.png)

![7.1](/assets/images/algorithm/6.12.png)

![7.1](/assets/images/algorithm/6.13.png)

![7.1](/assets/images/algorithm/6.14.png)


#### Randomized quicksort 

![7.1](/assets/images/algorithm/6.15.png)

![7.1](/assets/images/algorithm/6.16.png)


￼
￼





