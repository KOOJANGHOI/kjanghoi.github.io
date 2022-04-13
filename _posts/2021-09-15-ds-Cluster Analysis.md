---
layout: post
title: 6.Cluster Analysis
subtitle: 
categories: [Data Science]
tags: [ComputerScience]
---

### Cluster analysis
- Finding similarities between data according to the characteristics found in the data and grouping similar data objects into clusters 
- Unsupervised learning: no predefined classes

#### Cluster
- A collection of data objects
- Similar to one another within the same cluster
- Dissimilar to the objects in other clusters 

#### What Is Good Clustering? 

A good clustering method will produce high quality clusters with 
- high intra-class similarity 
- low inter-class similarity 

The quality of a clustering result depends on both the similarity measure used by the method and its implementation 

The quality of a clustering method is also measured by its ability to discover some or all of the hidden patterns 

#### A Categorization of Major Clustering Methods  
**Partitioning approach** 

Construct various partitions and then evaluate them by some criterion
- e.g. minimizing the sum of square errors 
- Typical methods: k-means, k-medoids, CLARANS  

**Hierarchical approach** 

Create a hierarchical decomposition of the set of data (or objects) using some criterion 
- Typical methods: Diana, Agnes, BIRCH, ROCK, CHAMELEON  

**Density-based approach** 

Based on connectivity and density functions 
- Typical methods: DBSACN, OPTICS  
￼
![1.1](/assets/images/ds/6.1.png)

### Partitioning Methods 
Construct a partition of a database D of n objects into a set of k clusters, having min sum of squared distances of objects to their representative of a cluster 

![1.1](/assets/images/ds/6.2.png)
￼
Given a k, find a partition of k clusters that optimizes the chosen partitioning criterion 
- Global optimal: exhaustively enumerate all partitions 
- Heuristic methods: k-means and k-medoids algorithms 
- k-means (MacQueen’67): Each cluster is represented by the center of the cluster 
- k-medoids or PAM (Partition around medoids) (Kaufman & Rousseeuw’87): Each cluster is represented by one of the objects in the cluster  

#### K-Means

Given k, the k-means algorithm is implemented in four steps: 
- Partition objects into k nonempty subsets 
- Compute seed points as the centroids of the clusters of the current partition (the centroid is the center, i.e., mean point, of the cluster) 
- Assign each object to the cluster with the nearest seed point 
- Go back to Step 2, stop when no more new assignment 

![1.1](/assets/images/ds/6.3.png)￼

**Example**
￼
![1.1](/assets/images/ds/6.4.png)

**Strength**
- Relatively efficient
- O(tkn), where n is #objects,k is #clusters, and t is #iterations. Normally, k, t << n 
￼
**Comment** 
Often terminates at a local optimum. The global optimum may be found using other techniques such as genetic algorithms

**Weakness** 
- Applicable only when mean is defined (what about categorical data?)
- Need to specify k, the number of clusters, in advance
- Unable to handle noises and outliers
    - Since an object with an extremely large value may substantially distort the distribution of the data 
- Not suitable to discover clusters with non-convex shapes 

**Variations of the K-Means Method** 
- Handling categorical data: k-modes(Huang’98) 
    - Idea: replacing means of clusters with modes 
- PAM (Kaufman and Rousseeuw, 1987)
- CLARA(KaufmannandRousseeuwin1990) 

#### Medoids
- Medoids are representative objects of a data set or a cluster within a data set whose sum of dissimilarities to all the objects in the cluster is minimal.
- Medoids are similar in concept to means or centroids, but medoids are always restricted to be members of the data set. Medoids are most commonly used on data when a mean or centroid cannot be defined, such as graphs

### Hierarchical Methods 
Use distance matrix as clustering criteria. This method does not require the number of clusters k as an input, but needs a termination condition 

**Methods**
- AGNES (Agglomerative Nesting) 
- DIANA (Divisive Analysis) 

**Major weakness of agglomerative clustering methods** 
- do not scale well: time complexity of at least O(n2), where n is the number of total objects 
- can never undo what was done previously  

**Integration of hierarchical with distance-based clustering** 
- BIRCH (1996): uses CF-tree and incrementally adjusts the quality of sub-clusters 
- ROCK (1999): clustering categorical data by neighbor and link analysis 
- CHAMELEON (1999): hierarchical clustering using dynamic modeling  
Density-Based Methods  : Clustering based on density (local cluster criterion), such as density- connected points 

**Major features**
- Discover clusters of arbitrary shape
- Handle noise
- One scan
- Need density parameters as termination condition 

**Several interesting studies**
- DBSCAN: Ester, et al. (KDD’96)
- OPTICS: Ankerst, et al (SIGMOD’99).
- DENCLUE: Hinneburg & D. Keim (KDD’98)
- CLIQUE: Agrawal, et al. (SIGMOD’98) (more grid-based) 

**Basic Concepts** 
￼
![1.1](/assets/images/ds/6.5.png)

![1.1](/assets/images/ds/6.6.png)


### Outlier Analysis 

**What are outliers?** 
- The set of objects are considerably dissimilar from the  remainder of the data  
Problem: Define and find outliers in large data sets

**Applications** 
- Credit card fraud detection
- Telecom fraud detection
- Customer segmentation
- Medical analysis  

**Statistical Approaches** 
: Assume a model underlying distribution that generates data set (e.g. normal distribution) 
￼
![1.1](/assets/images/ds/6.7.png)

**Distance-Based Approach** 
: Introduced to counter the main limitations imposed by statistical methods. We need multi-dimensional analysis without knowing data distribution 
 
![1.1](/assets/images/ds/6.8.png)

### Summary
- Cluster analysis groups objects based on their similarity and has wide applications 
- Measure of similarity can be computed for various types of data 
- Clustering algorithms can be categorized into partitioning methods, hierarchical methods, density-based methods, grid-based methods, and model-based methods 
- Outlier detection and analysis are very useful for fraud detection, etc. and can be performed by statistical, distance-based or deviation-based approaches 
- There are still lots of research issues on cluster analysis  
Considerable progress has been made in scalable clustering methods 
- Partitioning: k-means, k-medoids, CLARANS
- Hierarchical: BIRCH, ROCK, CHAMELEON
- Density-based: DBSCAN, OPTICS, DenClue
- Constraint-based: COD, constrained-clustering 




