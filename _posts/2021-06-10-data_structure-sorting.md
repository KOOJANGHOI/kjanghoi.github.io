---
layout: post
title: Sorting
subtitle: 
categories: [Data structure]
tags: [ComputerScience]
---

### Insertion sort
For each pass P = 1 through n - 1, insertion sort ensures that elements in position 0 through P are in sorted order 

In pass P, move the element in position P left until its correct place is found among the first P elements 

O(n2) comparisons required on average 

any algorithm that sorts by exchanging adjacent elements requires O(n2) time on average 

￼
![7.1](/assets/images/data_structure/12.1.png)


### Heap sort
￼
![7.1](/assets/images/data_structure/12.2.png)

building binary heap of n elements: O(n)

DeleteMin operation n times: O(n log n)

need extra space to save the sorted list: use the last cell in the previous heap 

![7.1](/assets/images/data_structure/12.3.png)
￼
### Merge sort
￼
![7.1](/assets/images/data_structure/12.4.png)

merge two sorted sublists using temporary array 

divide a list into two sublists 

conquer (sort) the sorted sublist into the lis 

![7.1](/assets/images/data_structure/12.5.png)

![7.1](/assets/images/data_structure/12.6.png)

![7.1](/assets/images/data_structure/12.7.png)￼
￼
#### Time complexity : O(NlogN)

- T(1) = 1
-  T(N) = 2T(N/2) + N (N for merging) 
- T(N)/N = T(N/2) / (N/2) + 1 
- T(N/2) / (N/2) = T(N/4) / (N/4) + 1 T(N/4) / (N/4) = T(N/8) / (N/8) + 1
- ...
-  T(2) / (2) = T(1) / (1) + 1 
- T(N)/N = T(1)/1 + log N 
- T(N) = N log N + N = O(N log N) 

### Quick sort

![7.1](/assets/images/data_structure/12.8.png)

#### Divide
partition the array A[l..r] into two subarrays A[l..p-1] and A[p+1..r]

- all elements in A[l..p-1] are less than or equal to a pivot element A[p]
- all elements in A[p+1..r] are greater than pivot element A[p]. 

#### Conquer
sort the two subarrays A[l..p-1] and A[p+1..r] by recursive calls to quicksort. 

since the subarrays are sorted in place, no work is needed. 
￼
![7.1](/assets/images/data_structure/12.9.png)

![7.1](/assets/images/data_structure/12.10.png)


#### Picking the pivot

- use the first element or the last element
	- worst if the input is presorted or in reverse order 
- choose the pivot randomly 
	- safe, but does not reduce the average running time while random number generation is costly 
- median-of-three choose the median of the leftmost, rightmost, and center elements 
	- it eliminates the bad case for the presorted input 
	- experiment shows that the running time is reduced by about 5 percent. 

**worst-case partitioning**

divide n – 1 and pivot 

![7.1](/assets/images/data_structure/12.11.png)￼

**best-case partitioning**

divide n/2 and n/2 elements 

![7.1](/assets/images/data_structure/12.12.png)￼￼

### Analysis
￼
![7.1](/assets/images/data_structure/12.13.png)￼




