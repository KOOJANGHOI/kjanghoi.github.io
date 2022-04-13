---
layout: post
title: 4.Mining Frequent Patterns
subtitle: 
categories: [Data Science]
tags: [ComputerScience]
---

### Overview
- Efficient and scalable frequent itemset mining methods 
- Mining various kinds of association rules 
- From association mining to correlation analysis
- Constraint-based association mining 
- Summary  

### Frequent Pattern Analysis
: dataset에 내재된 규칙을 알게 해 준다.

**Frequent pattern**
- a pattern (a set of items, subsequences, substructures, etc.) that occurs frequently in a data set
- Is for discloses an intrinsic and important property of data sets 

**Basic Concepts**
support, confidence, association rule

![1.1](/assets/images/ds/4.1.png)￼

#### Efficient and scalable frequent itemset mining methods
: mining의 time complexity가 data size에 linear하게 증가할수록 좋음

**Scalable mining methods using the downward closure property**
: Any subset of a frequent itemset must be frequent 

**Methods**
- Apriori (Agrawal & Srikant@VLDB’94) 
- Freq. pattern growth (FPgrowth—Han, Pei & Yin @SIGMOD’00) 
- Vertical data format approach (Charm—Zaki & Hsiao @SDM’02) 

### Apriori
: A Candidate Generation-and-Test Approach 

**Motivation**
If there is any itemset which is infrequent, its superset should not be generated/tested! 

**Method** 
- Initially, scan DB once to get frequent 1-itemset 
- Self joining: Generate length (k+1) candidate itemsets from length k frequent itemsets 
- Pruning: Test the candidates against DB
- Terminate when no frequent or candidate set can be generated 

**Example & pseudo code**
￼
![1.1](/assets/images/ds/4.2.png)

![1.1](/assets/images/ds/4.3.png)

**Challenges** 
- Multiple database scans are costly 
- Mining long patterns needs many passes of scanning and generates lots of candidates 

**Improving Apriori**
- Reduce passes of transaction database scans
- Shrink number of candidates
- Facilitate support counting of candidates 

### FP-growth

**Motivation**
FP-tree를 main-memory에 올려서 recursive divide&conquer 방식으로 frequent pattern을 찾겠다.
- Mining Frequent Patterns Without Candidate Generation 
	- Recursively grow frequent patterns by pattern and database partition 

**Method** 
- For each frequent item, construct its conditional pattern-base, and then its conditional FP-tree 
- Repeat the process on each newly created conditional FP-tree 
- Until the resulting FP-tree is empty, or it contains only one path  

**Construct FP-tree from a Transaction Database** 
￼
![1.1](/assets/images/ds/4.4.png)

**Find Patterns Having P From P-conditional Database** 
- Starting at the frequent item header table in the FP-tree 
- Traverse the FP-tree by following the link of each frequent item p 
- Accumulate all of transformed prefix paths of item p to form p’s conditional pattern base 

![1.1](/assets/images/ds/4.5.png)￼

For each pattern-base 
- Accumulate the count for each item in the base 
- Construct the FP-tree for the frequent items of the pattern base 
￼
![1.1](/assets/images/ds/4.6.png)

**Benefits of the FP-tree Structure** 
Completeness
- Preserve complete (i.e., lossless) information for frequent pattern mining
- Never break a long pattern of any transaction 
 
Compactness 
- Remove irrelevant info—infrequent items are gone 
- Items in frequency descending order: the more frequently occurring, the more likely to be shared 
- Never be larger than the original database

### FP-Growth vs. Apriori
- #candidate가 너무 많아지면(적은수의 candidate도 frequent 하다고 볼때) FP-growth over Aproiri
￼
![1.1](/assets/images/ds/4.7.png)

**Why Is FP-Growth the Winner: Divide-and-conquer**
- decompose both the mining task and a database according to the frequent patterns obtained so far
- leads to focused search of smaller databases 

### Constraint-based (Query-Directed) Mining 
: Finding all the patterns in a database autonomously is unrealistic

**Data mining should be an interactive process** 
- User directs what to be mined using a data mining query language (or a graphical user interface

#### Constraint-based mining
- User flexibility: provides constraints on what to be mined
- System optimization: explores such constraints for efficient mining—constraint-based mining 
Constrained Mining vs. Constraint-Based Search 

#### Constrained mining vs. Constraint-based search/reasoning 
- Both are aimed at reducing search space 
- Finding all patterns satisfying constraints vs. finding some (or one) answer in constraint-based search in AI 

#### Constrained mining vs. query processing in DBMS 
- Database query processing requires to find all answers 
- Constrained pattern mining shares a similar philosophy as pushing selections deeply in query processing 

