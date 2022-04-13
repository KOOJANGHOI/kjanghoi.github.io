---
layout: post
title: 3.Data Preprocessing
subtitle: 
categories: [Data Science]
tags: [ComputerScience]
---

### Why Preprocess the Data? 

#### Measures for data quality
- Accuracy: correct or wrong, accurate or not
- Completeness: not recorded, unavailable, ...
- Consistency: some modified but some not, dangling, ...
- Timeliness: timely updated? 
- Believability: how trustable the data are correct?
- Interpretability: how easily the data can be understood? 

#### Major Tasks in Data Preprocessing 

**Data cleaning**
:Fill in missing values, smooth noisy data, identify or remove outliers, and resolve inconsistencies 

**Data integration **
: Integration of multiple databases, data cubes, or files 

**Data reduction **
: Dimensionality reduction, Numerosity reduction, Data compression 

**Data transformation and data discretization**
: Normalization, Concept hierarchy generation 

### Data Cleaning 
Data in the Real World Is Dirty
- Lots of potentially incorrect data ,e.g., instrument faulty, human or computer error, transmission error 

### Incomplete (Missing) Data 
: Data is not always available 
- E.g., many tuples have no recorded value for several attributes, such as customer income in sales data. So missing data may need to be inferred  

**How to Handle Missing Data?** 
- Ignore the tuple: usually done when class label is missing (when doing classification)
	- not effective when the % of missing values per attribute is large 
- Fill in the missing value manually: tedious + infeasible? 
- Fill in it automatically with : mean, inferred the most probable value 

#### Noisy Data 
: random error or variance in a measured variable
- E.g duplicate records, inconsistent data 

**How to Handle Noisy Data?** 
- Clustering: detect and remove outliers 
- Combined computer and human inspection: detect suspicious values and check by human (e.g., deal with possible outliers) 

### Data Integration 
: Combines data from multiple sources into a coherent store 

**Detecting and resolving data value conflicts** 
- For the same real world entity, attribute values from different sources are different 
- Possible reasons: different representations, different scales, e.g., cm vs. inch, meter vs. mile  

**Handling Redundancy in Data Integration** 
- Redundant data occur often when integration of multiple databases 
- Careful integration of the data from multiple sources may help reduce/avoid redundancies and inconsistencies (Improves mining speed and quality)


#### Correlation Analysis (Nominal Data)

**Χ2 (chi-square) test **
: chi-square가 클수록 상관관계가 있는것독립이라고 생각해서 두 확률을 곱하고 전체 수로 나눠준 값

![1.1](/assets/images/ds/3.1.png)

**An Example** 
![1.1](/assets/images/ds/3.2.png)


#### Correlation Analysis (Numeric Data)
: also called Pearson’s product moment coefficient 

![1.1](/assets/images/ds/3.3.png)

n개에 대해서 둘 값을 곱하고 , 평균을 n번  빼준다. 그것을 standard-deviation의 곱으로 normalization하고 표본이므로 (n-1)로 나눠준다.

- rA,B = 0: independent 
- rA,B < 0: negatively correlated  

![1.1](/assets/images/ds/3.4.png)

#### Covariance (Numeric Data) 
: Covariance is similar to correlation 

![1.1](/assets/images/ds/3.5.png)

### Data Reduction 
: Obtain a reduced representation of the dataset
- quality를 조금 줄이면서 data의 양을 많이 줄인다.
- Much smaller in volume but yet produces the same (or almost the same) analytical results 

**Why data reduction?** 
- A database/data warehouse may store terabytes of data 
- Complex data analysis may take a very long time to run on the complete data set  

**Data reduction strategies** 
- Dimensionality reduction, e.g., remove unimportant attributes 
	- Wavelet transforms; Principal Components Analysis (PCA)
	- Feature subset selection, feature creation 
- Numerosity reduction (some simply call it: Data Reduction)
	- Regression 
	- Histograms, clustering, sampling
- Data compression  

#### Dimensionality Reduction 

**Curse of dimensionality** 
: if using index ,  multi-dimension에서는 branch pruning이 잘 안되더라
- When dimensionality increases, data becomes increasingly sparse 
- Density and distance between points (which is critical to clustering and outlier analysis) becomes less meaningful  

**Dimensionality reduction**
- Avoid the curse of dimensionality
- Help eliminate irrelevant features and reduce noise
- Reduce time and space required in data mining
- Allow easier visualization   

**Dimensionality reduction techniques** 
- Wavelet transforms
- Principal Component Analysis  

#### Principal Component Analysis (PCA) 
: Find a projection that captures the largest amount of variation in data 
Original data are projected onto a much smaller space (Resulting in dimensionality reduction)

![1.1](/assets/images/ds/3.6.png)

**Steps**

![1.1](/assets/images/ds/3.7.png)

#### Attribute Subset Selection 
: Another way to reduce dimensionality of data (PCA와 달리, original data value가 바뀌지 않음.)

- Redundant attributes : Purchase price of a product and the amount of sales tax paid 
- Irrelevant attributes
	- Contain no information that is useful for the data mining task at hand 
	- E.g., students' ID is often irrelevant to the task of predicting students' GPA 

**Parametric methods (e.g., regression)**
- Assume the data fits some model
- Estimate model parameters
- Store only the parameters 
- Discard the data (except possible outliers)

**Non-parametric methods** 
- Do not assume any models
- Major families: histograms, clustering, and sampling 

#### Data Compression 
: loss가 적절히 있을때, 데이터의 크기를 많이 줄일 수 있다면 (ex, 사람이 눈치챌 수 없는 정도라면 - audio,video.)

**String compression**
: There are extensive theories and well-tuned algorithms
- Typically lossless  

**Audio/video compression **
: Typically lossy compression, with progressive refinement  

**Time sequence **
: Typically short and vary slowly with time  

Dimensionality and numerosity reduction may also be considered as forms of data compression  

![1.1](/assets/images/ds/3.8.png)

### Data Transformation and Data Discretization
: Maps the entire set of values of a given attribute to a new set of replacement values 
Each old value needs to be identified with one of the new values 

#### Methods 
- Normalization: Scaled to fall within a smaller, specified range
	- min-max normalization
	- z-score normalization
	- normalization by decimal scaling 
- Discretization: Concept hierarchy climbing 

### Summary 
![1.1](/assets/images/ds/3.9.png)
