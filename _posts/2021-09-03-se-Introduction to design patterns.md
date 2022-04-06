---
layout: post
title: 3.Introduction to design patterns
subtitle: 
categories: [SoftwareEngineering]
tags: [ComputerScience]
---

### Design patterns 
“Each pattern describes a problem which occurs over and over again in our environment, and then describes the core of the solution to that problem, in such a way that you can use this solution a million times over, without ever doing it the same way twice” 
– Christopher Alexander, Architect (1977)

#### Strategy pattern 
**Problem**
:Clients need different variants of an algorithm 

**Solution**
: Create an interface for the algorithm, with an implementing class for each variant of the algorithm 

**Consequences**
- Easily extensible for new algorithm implementations
- Separates algorithm from client context
- Introduces an extra interface and many classes: 
    - Code can be harder to understand
    - Lots of overhead if the strategies are simple 

**Example**
￼
![1.1](/assets/images/se/3.1.png)

![1.1](/assets/images/se/3.2.png)

![1.1](/assets/images/se/3.3.png)


#### Template method pattern 
**Problem**
:An algorithm consists of customizable parts and invariant parts  

**Solution**
: Implement the invariant parts of the algorithm in an abstract class, with abstract (unimplemented) primitive operations representing the customizable parts of the algorithm. Subclasses customize the primitive operations  

**Consequences** 
- Code reuse for the invariant parts of algorithm
- Customization is restricted to the primitive operations
- Inverted (Hollywood-style) control for customization  

**Template method vs. the strategy pattern** 
Both support variation in a larger context 
- Template method uses inheritance + an overridable method 
- Strategy uses an interface and polymorphism(via composition)

#### Iterator design pattern 
**Problem**
:Clients need uniform strategy to access all elements in a container, independent of the container type 

**Solution**
:A strategy pattern for iteration 

**Consequences**
- Hides internal implementation of underlying container
- Easy to change container type – Facilitates communication between parts of the program 







