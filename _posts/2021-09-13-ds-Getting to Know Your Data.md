---
layout: post
title: 2.Getting to Know Your Data
subtitle: 
categories: [Data Science]
tags: [ComputerScience]
---

### Important Characteristics of Data 
- Dimensionality: Curse of dimensionality 
- Sparsity : Only a small portion of presence 
- Resolution : Patterns depend on the scale
- Distribution : Centrality and dispersion 

### Data Objects and Attribute Types
- data object : entity in real-world and described by attribute 
- attribute : dimension/feature of data object

#### attribute types

**qualitative(categorical)**
- nominal = attributes has no inherent order/ranking
    - names of things. e.g. gender , race
- binary = nominal attributes with only two options(true/false)
    - symmetric binary = equally important // gender
    - asmmetric binary = not equally important // medical test
- ordinal = attributes has meaningful order // grade , size

**quantitative(numeric)**
- discrete = attributes has finite/countably infinite values
    - practically counted
    - zip codes
- continuous = attributes has values as real number
    - represented floating point
    - temperature , weight , height
    - interval = value간의 interval is fixed & ordered // temperature in C/F , dates
    - ratio = true zero point(없음의 의미) & 배수의 의미 // temperature in K , length

### Basic statistical descriptions of data
: to better understand dispersion, tendency

**central tendency**
- mean = 평균/무게중심
	- simple mean // weighted mean // trimmed mean
- median = sorting 후 실제 중간 object
	- middle value(odd) = average of two middle(even)
- mode = value that occurs most frequently in data
	- mean이 median에 비해서 outlier에 영향을 많이 받는다. 대신 incremental하다.

**symmetric vs skewed**
![1.1](/assets/images/ds/2.1.png)

### Summary
- Data attribute types: nominal, binary, ordinal, interval-scaled, ratio
- Scaled  Many types of data sets, e.g.,numerical,text,graph,Web,image
- Gain insight into the data by: 	
	- Basic statistical data description: central tendency, dispersion, graphical displays 
	- Measure data similarity 
