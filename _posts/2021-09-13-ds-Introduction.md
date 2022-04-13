---
layout: post
title: 1.Introduction
subtitle: 
categories: [Data Science]
tags: [ComputerScience]
---

### What Is Data Mining?
: Extraction of interesting (non-trivial, implicit, previously unknown and potentially useful) patterns or knowledge from huge amount of data  

### Why Not Traditional Data Analysis? 

- Tremendous amount of data
	- Algorithms must be highly scalable to handle such as tera-bytes of data  
- High-dimensionality of data 
	- Micro-array may have tens of thousands of dimensions  
- High complexity of data 
	- Data streams and sensor data
	- Time-series data, temporal data, sequence data
	- Structure data, graphs, social networks and multi-linked data
	- Heterogeneous databases and legacy databases
	- Spatial, spatiotemporal, multimedia, text and Web data
	- Software programs, scientific simulations  

### Knowledge Discovery (KDD) Process 
￼
![1.1](/assets/images/ds/1.1.png)


### Data Mining Functionalities 

- Multidimensional concept description
	- Characterization and discrimination 
- Frequent patterns, association, correlation vs.causality 
- Classification and prediction
	- Construct models (functions) that describe and distinguish classes or concepts for future prediction 
	- Predict some unknown or missing numerical values
- Cluster analysis
	- Maximizing intra-class similarity & minimizing interclass similarity  
- Outlier analysis
	- Data object that does not comply with the general behavior of the data  
- Trend and evolution analysis 
 
**Potential Applications** 
- Market Analysis and Management 
- Corporate Analysis & Risk Management 
- Fraud Detection & Mining Unusual Patterns 

### Are All the “Discovered” Patterns Interesting?
Data mining may generate thousands of patterns. but not all of them are interesting. 

A pattern is interesting if it is easily understood by humans, valid on new or test data with some degree of certainty, potentially useful, novel, or validates some hypothesis that a user seeks to confirm 

Find all the interesting patterns: Completeness 
- Can a data mining system find all the interesting patterns? Do we  need to find all of the interesting patterns? 
- Heuristic vs. exhaustive search 
- Association vs. classification vs. clustering  
