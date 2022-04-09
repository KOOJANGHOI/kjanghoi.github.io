---
layout: post
title: 7.Expectation Maximization 
subtitle: 
categories: [ArtificialIntelligence]
tags: [ComputerScience]
---

**Why do we want hidden variables?** 
￼
![1.1](/assets/images/ai/7.1.png)

Without the case, all the evidence is dependent on each other.
So O(2^n) parameter needs

![1.1](/assets/images/ai/7.2.png)
￼
관측된 variable에 대해서 hidden variable을 하나 만들어 O(n)의 conditional variable complexity로 만든다.

### EM Algorithm 
- Pick initial θ0
- Loop until apparently converged

![1.1](/assets/images/ai/7.3.png)

- Monotonically increasing likelihood 
- Convergence is hard to determine due to plateaus effect
- Problems with local optima 

: global optimum을 보장하지는 않지만 좋아지는 방향으로 계속 가긴함 (like local search)


### Example EM for BN

randomly initialization하고 Pr(H|D,theta) 추정

![1.1](/assets/images/ai/7.4.png)

Iteration 1: Fill in data

![1.1](/assets/images/ai/7.5.png)

Iteration 1: Re-estimate Params

![1.1](/assets/images/ai/7.6.png)

Iteration 2: Fill in data

![1.1](/assets/images/ai/7.7.png)

Iteration 2: Re-estimate Params

![1.1](/assets/images/ai/7.8.png)

Iteration 5:

![1.1](/assets/images/ai/7.9.png)

Iteration 10:

![1.1](/assets/images/ai/7.10.png)
