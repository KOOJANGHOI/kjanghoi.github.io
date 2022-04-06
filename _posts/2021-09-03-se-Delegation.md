---
layout: post
title: 2.Delegation, inheritance, and behavioral sub-typing 
subtitle: 
categories: [SoftwareEngineering]
tags: [ComputerScience]
---

### Learning goals
- Be able to explain inheritance and delegation 
- Apply inheritance and delegation appropriately for reuse 
– Understand their tradeoffs 
- Behavioral sub-typing and implications for specification and testing 


### Delegation 
Delegation is simply when one object relies on another object for some subset of its functionality 

When you delegate, you are simply calling up some class which knows what must be done. You do not really care how it does it, all you care about is that the class you are calling knows what needs doing.


### Subtype polymorphism
- Different kinds of objects can be treated uniformly by client code
- Each object behaves according to its type 


### Inheritance and subtyping 

**Inheritance is for code reuse** 
- Write code once and only once 
- Superclass features implicitly available in subclass 

**Subtyping is for polymorphism**
- Accessing objects the same way, but getting different behavior
- Subtype is substitutable for supertype 

### Typical roles for interfaces and classes 
An interface defines expectations/commitments for clients 

A class fulfills the expectations of an interface
- An abstract class is a convenient hybrid
- A subclass specializes a class's implementation 

### Dynamic method dispatch 

What is dynamic method dispatch in case of Java?
- Think of "dispatch" as "determining which method to call".

The "dynamic" part simply says that it is determined at runtime. That is, which method is to be called is determined at runtime.

why do we need that in case of inheritance
- Without inheritance / polymorphism, we wouldn't need this. The type of an expression would be decidable at compile time, and which method that would have been called at runtime would be known when compiling the program.
- With inheritance / polymorphism, we don't know the concrete runtime type of an expression, thus which method to be called must be "dynamically" determined during runtime.

#### Compile time 
- Determine which class to look in
- Determine method signature to be executed 
    - Find all accessible, applicable methods 
    - Select most specific matching method  

#### Runtime 
- Determine dynamic class of the receiver 
- From dynamic class, locate method to invoke 
    - Look for method with the same signature found in compile time 
    - Otherwise search in superclass and etc.  

### Behavioral subtyping 
Let q(x) be a property provable about objects x of type T. Then q(y) should be provable for objects y of type S where S is a subtype of T. 
- principle that subclasses should satisfy the expectations of clients accessing subclass objects through references of superclass type, not just as regards syntactic safety (such as absence of "method-not-found" errors) but also as regards behavioral correctness.

#### Example
Is this Square a behavioral subtype of Rectangle? 
- Yes But the Square is not actually a square... 
- ‘하위형에서 상위형의 불변조건은 반드시 유지되어야 한다.’ 라는 조건이 깨짐
￼
![1.1](/assets/images/se/2.1.png)

### Dependency Injection
OOP에서는 객체간의 통신이 바탕이기 때문에 객체간 Dependency가 존재한다.

Dependency Injection은 decoupling을 통해 의존성을 없애는 것이 아니라 결합도를 낮추는 것: 다양한 상황에 재사용이 가능하다.

#### Example1
Why it is difficult to unit test class B? 
- What if a.complexCalculation computes wrong result? 
￼
![1.1](/assets/images/se/2.2.png)

B implementation depends directly on actual A implementation, therefore we cannot test B as standalone class. 

#### Example2
Now A implementation is absolutely decoupled from B implementation... 
 
![1.1](/assets/images/se/2.3.png)





