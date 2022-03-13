---
layout: post
title: Dynamic Allocation
subtitle: 
categories: [Data structure]
tags: [ComputerScience]
---

### Program execution in memory 

data space consists of the stack and the heap 

the stack is used to store statically declared data 
- variables with names
- data declared before compilation 
- access via their identifiers 

the heap is used to store dynamically allocated data 
- variables without names
- get it when you need it
- access by following pointers 

![7.1](/assets/images/data_structure/14.1.png)


### Allocating and freeing dynamic data 

![7.1](/assets/images/data_structure/14.2.png)

![7.1](/assets/images/data_structure/14.3.png)

![7.1](/assets/images/data_structure/14.4.png)

![7.1](/assets/images/data_structure/14.5.png)

![7.1](/assets/images/data_structure/14.6.png)


### Dynamic allocation 

As it can be seen that the length (size) of the array above made is 9. But what if there is a requirement to change this length (size). 

For Example,
- If there is a situation where only 5 elements are needed to be entered in this array. In this case, the remaining 4 indices are just wasting memory in this array. So there is a requirement to lessen the length (size) of the array from 9 to 5.
- Take another situation. In this, there is an array of 9 elements with all 9 indices filled. But there is a need to enter 3 more elements in this array. In this case 3 indices more are required. So the length (size) of the array needs to be changed from 9 to 12.

This procedure is referred to as Dynamic Memory Allocation in C.

Therefore, **Dynamic Memory Allocation** can be defined as a procedure in which the size of a data structure (like Array) is changed during the runtime.

C provides some functions to achieve these tasks. There are 4 library functions provided by C defined under <stdlib.h> header file to facilitate dynamic memory allocation in C programming. 

They are:
- malloc
- calloc
- free
- realloc


#### malloc
`void *malloc (size_t size)`


“malloc” or “memory allocation” method in C is used to dynamically allocate a single large block of memory with the specified size. It returns a pointer of type void which can be cast into a pointer of any form. It initializes each block with default garbage value.


- it returns a pointer to space for an object of size size or NULL if the request cannot be satisfied 

Example
: `int* Ptr = (int*) malloc (20)`

![7.1](/assets/images/data_structure/14.7.png)

![7.1](/assets/images/data_structure/14.8.png)

![7.1](/assets/images/data_structure/14.9.png)


#### calloc
`void *calloc(size_t nobj, size_t size)`


“calloc” or “contiguous allocation” method in C is used to dynamically allocate the specified number of blocks of memory of the specified type. It initializes each block with a default value ‘0’.

- it returns a pointer to space for an array of nobj object of size size or NULL if the request cannot be satisfied

Example
: `int* Ptr = (int *) calloc (4, sizeof(int)) `

![7.1](/assets/images/data_structure/14.10.png)

![7.1](/assets/images/data_structure/14.11.png)

![7.1](/assets/images/data_structure/14.12.png)

#### free
`void free (void *p)`

“free” method in C is used to dynamically de-allocate the memory. The memory allocated using functions malloc() and calloc() is not de-allocated on their own. Hence the free() method is used, whenever the dynamic memory allocation takes place. It helps to reduce wastage of memory by freeing it.

- it deallocates the space pointed to by p
- p must be a pointer to space previously allocated by calloc, malloc, or realloc 

![7.1](/assets/images/data_structure/14.13.png)

![7.1](/assets/images/data_structure/14.14.png)

![7.1](/assets/images/data_structure/14.15.png)


#### realloc
`void realloc(void *p, size_t size)`


“realloc” or “re-allocation” method in C is used to dynamically change the memory allocation of a previously allocated memory. In other words, if the memory previously allocated with the help of malloc or calloc is insufficient, realloc can be used to dynamically re-allocate memory. re-allocation of memory maintains the already present value and new blocks will be initialized with default garbage value.

- it changes the size of the object pointed to by p to size
- the contents will be unchanged up to the minimum of the old and new sizes

Example
: `int* Ptr = (int *) realloc(int* Ptr, 50)`

![7.1](/assets/images/data_structure/14.16.png)

![7.1](/assets/images/data_structure/14.17.png)

![7.1](/assets/images/data_structure/14.18.png)

### Structure
**collection of one or more variables that can be of different type**


- First, create a structure that defines a new data type
- Second, create variable of that new type 

![7.1](/assets/images/data_structure/14.19.png)

#### Passing structure 

![7.1](/assets/images/data_structure/14.20.png)

![7.1](/assets/images/data_structure/14.21.png)

#### Passing address 

![7.1](/assets/images/data_structure/14.22.png)

#### Creating data structure

![7.1](/assets/images/data_structure/14.23.png)

![7.1](/assets/images/data_structure/14.24.png)

![7.1](/assets/images/data_structure/14.25.png)

![7.1](/assets/images/data_structure/14.26.png)




