---
layout: post
title: 6.Probability, Naïve Bayes Model, Bayesian networks 
subtitle: 
categories: [ArtificialIntelligence]
tags: [ComputerScience]
---

### Bayes’ Rule 
: P(A | B) = P(B | A) P(A) / P(B) 

e.g. 
P(disease | symptom) = P(symptom | disease) P(disease)/ P(symptom) 

Useful for assessing diagnostic probability from causal probability

**Example**
: let M be meningitis(뇌수막염), S be stiff neck,  
P(m)=0.01%, P(s|m)=80%, P(s)=10% 
Then, P(m|s) = P(s|m) P(m) / P(s) = 0.8 × 0.0001 / 0.1 = 0.0008=0.08% 


### Independence 
A and B are independent iff 
- P(A ∧ B) = P(A) · P(B) 
- P(A|B) = P(A) 
- P(B|A) = P(B)

Independence is essential for efficient probabilistic reasoning 

#### Conditional independence
A and B are conditionally independent given C iff 
- P(A | B, C) = P(A | C) 
- P(B | A, C) = P(B | C)
- P(A ∧ B | C) = P(A | C) · P(B | C)  
 
**Examples of Conditional Independence** 
![1.1](/assets/images/ai/6.1.png)

- None of these propositions are independent of one other 
- T and X are conditionally independent given C  (원인변수 C가 주어졌을때(결정됬을때), 결과변수 X와T는 conditionally independent하다. C가 주어지지 않았을때는 X,T는 종속)

### Naïve Bayes Model 
: 2N+1개의 확률을 가지고, 2^N가지의 경우의수의 확률을 구할 수 있음(장점)

![1.1](/assets/images/ai/6.2.png)

P(Cause,Effect1, ... ,Effectn) = P(Cause)∙πiP(Effecti|Cause) 

#### Naïve Bayes Classifier Inference 
￼
![1.1](/assets/images/ai/6.3.png)

### Bayesian networks 
: A simple, graphical notation for conditional independence assertions and hence for compact specification of full joint distributions 

In the simplest case, conditional distribution represented as a conditional probability table (CPT) giving the distribution over Xi for each combination of parent values 

**Example** 

![1.1](/assets/images/ai/6.4.png)
￼
- Variables: Burglary, Earthquake, Alarm, JohnCalls, MaryCalls 

Network topology reflects "causal" knowledge:
- A burglar can make the alarm ringing
- An earthquake can sometimes make the alarm ringing
- The alarm can cause Mary to call
- The alarm can cause John to call 

I'm at work, neighbor John calls to say my alarm is ringing, but neighbor Mary doesn't call. Is there a burglar? 

Pr( Burglary | JohnCalls, ᄀMaryCalls ) = 0.0495 
Pr( ᄀBurglary | JohnCalls, ᄀMaryCalls ) = 0.9505