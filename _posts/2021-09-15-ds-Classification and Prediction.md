---
layout: post
title: 5.Classification and Prediction
subtitle: 
categories: [Data Science]
tags: [ComputerScience]
---

### Classification and Prediction

**classification**

predicts categorical class labels (discrete or nominal)  classifies data (constructs a model) based on the training set and the values (class labels) in a classifying attribute and uses it in classifying new data  

**prediction**

models continuous-valued functions, i.e., predicts  unknown or missing values  

**공통점**

- 둘다 예측하는것.
- 2-steps : model construction -> model usage
- model accuracy = known label vs classified result label in test dataset
- training dataset <-> test dataset : disjoint, independent otherwise overfitting

**차이점**

- prediction의 domain이 다르다.(categorical class label vs continuous value)
- model이 classifier vs function

### Supervised learning and Unsupervised learning

**Supervised learning**

- The training data (observations, measurements, etc.) are accompanied by labels indicating the class of the observations 
- New data is classified based on the training set 

**Unsupervised learning**

- The class labels of training data is unknown 
- Given a set of measurements, observations, etc. with the aim of establishing the existence of classes or clusters in the data 

**공통점**

machine learning algorithm

**차이점**

- training dataset : data-label // data
- goal : predict outcome/future // find hidden structure
- decision tree , naive bayesian classification , (least square)regression , logistic regression , ensemble // clustering , PCA , SVD , ICAn

#### Issues regarding classification and prediction  
- data preparation : 어떤 data를 사용할 것인가?
- data cleaning : noise/outlier의 제거
- relevance analysis : Remove the irrelevant or redundant attributes 
- transformation: generalization/normalization

#### Evaluating Classification Methods 
- Accuracy of classifier/predictor
- Speed of training time /prediction time
- Robustness : handling to noise/outlier
- Scalability : efficiency in disk-resident database
- Interpretability : understanding and insight provided by the model 


### Decision Tree Induction  

**Examples**
￼
![1.1](/assets/images/ds/5.1.png)

#### Basic algorithm
: A greedy algorithm (top-down recursive divide&conquer)
￼
![1.1](/assets/images/ds/5.2.png)

#### Attribute selection measure

**information gain**
: entropy = degree of heterogeneous
- entropy의 특성상 multi-valued attribute일 수록 homogeneous하게되서 biased

![1.1](/assets/images/ds/5.3.png)

**gain ratio**
: normalization to information gain
- tends to prefer unbalanced splits in which one partition is much smaller than the others 

**gini index**
: binary partition = degree of impurity
- tends to favor tests that result in equal-sized partitions and purity in both partitions 

#### Overfilling & Pruning

**Overfitting**
: Poor accuracy for unseen samples 
- An induced tree may overfit the training data
- Too many branches, some may reflect anomalies due to noise or outliers 

**Pruning as approach to avoid overfitting**
- pre-pruning = goodness의 threshold가 보다 적으면 spilt를 안하고 넘어간다.
- post-pruning = training dataset을 제외한 data를 남겨서 tree를 테스트하여 pruning

**Advantages**
- 다른 classification algorithm에 비해서 상대적으로 빠른 속도
- 사람이 이해하기 쉬운 개념
- sql query와 잘 맞는다.
- 정확도 측정이 쉽다.

**Disadvantages**
- Target(Classification) attribute must be categorial 
- Limited to one target attribute(oneclass) 
- Decision tree algorithms are sometimes unstable (similar to local search !) 
- Trees created from numerical-attribute datasets can be very complex  

#### More details
A tree structure that can be used to split a large set of records into successively smaller sets of records by applying a sequence of simple decision rules  

A decision tree model consists of a set of split rules for dividing a large heterogeneous population into smaller, more homogeneous groups with respect to a particular target variable  

The best split at root or child nodes is defined as one that does the best job of separating the data into groups each of which is homogeneous 
￼
![1.1](/assets/images/ds/5.4.png)

### KNN(k Nearest Neighbor) Classifier 
A method for classifying objects(documents) based on closest exemplary instances(documents) in the attribute vector (document vector) space 

A type of instance-based learning, or lazy learning where classification function is only approximated locally and all computation is deferred until classification process is actually performed 

Classification is delayed till a new instance(document) arrives  

**How to handle categorial attributes?**

: Each categorial(non-numerical) attribute value may be transformed to its corresponding(well-defined) numerical value in order to represent all instances as numerical vectors in an Euclidean space 

**Scaling Attribute Value**

: Sometimes, each attribute value may be scaled by normalization in order to mitigate the effect of the difference of each dimension size. and Attribute scaling often improves the accuracy of kNN classification 
 
**More details**

kNN classification is a Highly effective inductive classification method for noisy training data and complex target functions  

Target function for a whole attribute space may be described as a combination of less complex local approximations  

Learning is very simple (almost nothing to do except for transforming to numeric values and scaling for each instance)  

But, classification may be time-consuming especially when k is big. So, this kind of method is called “lazy learning”  

### Bayesian classification
- A statistical classifier based on bases theorem
- incremental = newly observed data can combined with prior knowledge (training dataset이 늘어남에 따라서, hypothesis가 correct할 확률이 증가/감소)

#### Basic
- X = 예측이 될 데이터 = evidence
- H = X가 class C에 속한다는 hypothesis
- likelihood P(H|X) = X가 observed됬을때, hypothesis H가 hold할 확률
- prior probability P(H) = initially hypothesis H가 hold할 확률
- P(X) = X가 observed 될 확률
- posteriori probability P(X|H) = hypothesis H가 hold할때 , X가 observe될 확률

#### Bayes Theorem
￼
![1.1](/assets/images/ds/5.5.png)

**Informally, this can be written as likelihood = posteriori * prior/evidence** 
- Predicts X belongs to Ci iff the probability P(Ci|X) is the highest among all the P(Ck|X) for all the k classes 
- But require initial knowledge of many probabilities, significant computational cost 

### Naive bayesian classifier
: Bayesian classifier with a simplified assumption (attributes are conditionally independent)

![1.1](/assets/images/ds/5.6.png)

**This greatly reduces the computation cost**
: Only counts the class distribution
- n+1개의 확률을 가지고 , 2^n가지 경우의 확률을 구할 수 있다.
- 구현이 쉽고 대부분의 경우 좋은 결과를 내지만, 실제로 attribute들은  dependent한 경우가 많으므로 정확도의 손실이 있다.

### Lazy vs. Eager Learning 

**Lazy Learner**
lazy at training time (less time in training but more time in predicting)
simply store training dataset until test sample is given

Typical approach: k-nearest neighbor approach 
￼
![1.1](/assets/images/ds/5.7.png)

**Eager Learning**
eager at training time
construct train-model before receiving test sample


### Prediction

**(Numerical)prediction is similar to classification **

But prediction is different from classification
- Classification is to predict a categorical class label
- Prediction models continuous-valued functions to predict a value  

#### Regression
: models relationship between one or more independent variable and a dependent variable
- linear regression = 1 independent value & 1 dependent value
- multiple linear regression = n independent value & 1 dependent value
- non-linear regression = can be transformed into multiple linear regression
￼
![1.1](/assets/images/ds/5.8.png)

#### Classifier Accuracy Measures 

**About classifier : confusion matrix**
￼
![1.1](/assets/images/ds/5.9.png)

**About predictor : loss function**
: measure error between true value and predicted value

#### Test method

**Holdout**

: partitioning data into train/test data by given ratio
random sampling = ratio spilt k times & average result

**Cross-validation**

: spilt whole data into k-mutually exclusive subsets
k-th iteration, test dataset = k-th subset & average result
leave-one-out = small data의 경우 k = # of tuples

**bootstrap**

: sampling tuples uniformly with replacement
.632 bootstrap = training가 0.632%정도 되더라. 그걸 k번하고 weighted-average

#### Ensemble
: use combinations of models to increase accuracy
￼
![1.1](/assets/images/ds/5.10.png)

- bagging = average of k-models prediction
- boosting = weighted-average of k-models predicton



