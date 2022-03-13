---
layout: post
title: Polymorphism and Abstract Classes
subtitle: 
categories: [Object-oriented programming]
tags: [ComputerScience]
---

### Introduction to Polymorphism 

There are three main programming mechanisms that constitute object-oriented programming (OOP) 
- Encapsulation
- Inheritance
- Polymorphism 

Polymorphism is the ability to associate many meanings to one method name 
- It does this through a special mechanism known as late binding or dynamic binding 

Inheritance allows a base class to be defined, and other classes derived from it 
- Code for the base class can then be used for its own objects, as well as objects of any derived classes  

Polymorphism allows changes to be made to method definitions in the derived classes, and have those changes apply to the software written for the base class  

### Late Binding 
The process of associating a method definition with a method invocation is called binding 
- If the method definition is associated with its invocation when the code is compiled, that is called early binding 
- If the method definition is associated with its invocation when the method is invoked (at run time), that is called late binding or dynamic binding  

Java uses late binding for all methods (except private, final, and static methods) 
- Because of late binding, a method can be written in a base class to perform a task, even if portions of that task aren't yet defined 
- For an example, the relationship between a base class called Sale and its derived class DiscountSale will be examined  
￼
![7.1](/assets/images/object_oriented_programming/8.1.png)

![7.1](/assets/images/object_oriented_programming/8.2.png)

![7.1](/assets/images/object_oriented_programming/8.3.png)

![7.1](/assets/images/object_oriented_programming/8.4.png)￼
￼
Given the following in a program: 

![7.1](/assets/images/object_oriented_programming/8.5.png)

Output would be: 

![7.1](/assets/images/object_oriented_programming/8.6.png)

Note that when the Sale class was created and compiled, the DiscountSale class and its bill() method did not yet exist 
- These results are made possible by late-binding 


#### Pitfall: No Late Binding for Static Methods 
When the decision of which definition of a method to use is made at compile time, that is called static binding 
- This decision is made based on the type of the variable naming the object  

Java uses static, not late, binding with private, final, and static methods 
- In the case of private and final methods, late binding would serve no purpose 
- However, in the case of a static method invoked using a calling object, it does make a difference  
￼
![7.1](/assets/images/object_oriented_programming/8.7.png)

#### The final Modifier 

A method marked final indicates that it cannot be overridden with a new definition in a derived class  

If final, the compiler can use early binding with the method      
e.g)
```
public final void someMethod() { 
	... 
} 

```
A class marked final indicates that it cannot be used as a base class from which to derive any other classes  

#### Late Binding with toString
One definition of the method println takes a single argument of type Object: 

```
public void println(Object theObject) {
	System.out.println(theObject.toString());
}

```   

In turn, it invokes the version of println that takes a String argument 
- Note that the println method was defined before the Sale class existed 
- Yet, because of late binding, the toString method from the Sale class is used, not the toString from the Object class  

#### Upcasting and Downcasting 
Upcasting is when an object of a derived class is assigned to a variable of a base class (or any ancestor class) 
Because of late binding, toString above uses the definition given in the DiscountSale class 
￼
![7.1](/assets/images/object_oriented_programming/8.8.png)

Downcasting is when a type cast is performed from a base class to a derived class (or from any ancestor class to any descendent class) 
- Downcasting has to be done very carefully 
- In many cases it doesn't make sense, or is illegal:  
￼
![7.1](/assets/images/object_oriented_programming/8.9.png)

#### Tip: Checking to See if Downcasting is Legitimate 
Downcasting to a specific type is only sensible if the object being cast is an instance of that type 
- This is exactly what the instanceof operator tests for: object instanceof ClassName 
- It will return true if object is of type ClassName
- In particular, it will return true if object is an instance of any descendent class of ClassName 


### Introduction to Abstract Classes 

In Chapter 7, the Employee base class and two of its derived classes, HourlyEmployee and SalariedEmployee were defined 

The following method is added to the Employee class
- It compares employees to see if they have the same pay: 
￼
![7.1](/assets/images/object_oriented_programming/8.10.png)

There are several problems with this method: 
- The getPay method is invoked in the samePay method 
- There are getPay methods in each of the derived classes 
- There is no getPay method in the Employee class, nor is there any way to define it reasonably without knowing whether the employee is hourly or salaried  

The ideal situation would be if there were a way to 
- Postpone the definition of a getPay method until the type of the employee were known (i.e., in the derived classes) 
- Leave some kind of note in the Employee class to indicate that it was accounted for 

Surprisingly, Java allows this using abstract classes and methods 

In order to postpone the definition of a method, Java allows an abstract method to be declared 
- An abstract method has a heading, but no method body
- The body of the method is defined in the derived classes 

The class that contains an abstract method is called an abstract class 

#### Abstract Method 
An abstract method is like a placeholder for a method that will be fully defined in a descendent class 
- It has a complete method heading, to which has been added the modifier abstract 
- It cannot be private 
- It has no method body, and ends with a semicolon in place of its body  
￼
![7.1](/assets/images/object_oriented_programming/8.11.png)

#### Abstract Class 
A class that has at least one abstract method is called an abstract class

An abstract class must have the modifier abstract included in its class heading: 

![7.1](/assets/images/object_oriented_programming/8.12.png)￼

An abstract class can have any number of abstract and/or fully defined methods  
If a derived class of an abstract class adds one or does not define all of the abstract methods, then it is abstract also, and must add abstract to its  modifier 
A class that has no abstract methods is called a concrete class 

e.g)

![7.1](/assets/images/object_oriented_programming/8.13.png)￼


#### Pitfall: You Cannot Create Instances of an Abstract Class 
An abstract class can only be used to derive more specialized classes 
- While it may be useful to discuss employees in general, in reality an employee must be a salaried worker or an hourly worker 

An abstract class constructor cannot be used to create an object of the abstract class 
- However, a derived class constructor will include an invocation of the abstract class constructor in the form of super 



￼
￼





