---
layout: post
title: Interfaces and Inner Classes 
subtitle: 
categories: [Object-oriented programming]
tags: [ComputerScience]
---

### Interfaces 

An interface is something like an extreme case of an abstract class 
- However, an interface is not a class 
- It is a type that can be satisfied by any class that implements the interface  

The syntax for defining an interface is similar to that of defining a class 
- Except the word interface is used in place of class 

An interface specifies a set of methods that any class that implements the interface must have 
- It contains method headings and constant definitions only 
- It contains no instance variables nor any complete method definitions 

An interface serves a function similar to a base class, though it is not a base class 
- Some languages allow one class to be derived from two or more different base classes 
- This multiple inheritance is not allowed in Java
- Instead, Java's way of approximating multiple inheritance is through interfaces 

**An interface and all of its method headings should be declared public**
– They cannot be given private, protected, or package access 

When a class implements an interface, it must make all the methods in the interface  
Because an interface is a type, a method may be written with a parameter of an interface type 
- That parameter will accept as an argument any class that implements the interface 

To implement an interface, a concrete class must do two things: 

1. It must include the phrase implements Interface_Name at the start of the class definition 
    1. If more than one interface is implemented, each is listed, separated by commas 

2. The class must implement all the method headings listed in the definition(s) of the interface(s) 

e.g) Implementation of an Interface 
￼
![7.1](/assets/images/object_oriented_programming/11.1.png)￼
￼
![7.1](/assets/images/object_oriented_programming/11.2.png)

![7.1](/assets/images/object_oriented_programming/11.3.png)

### Abstract Classes Implementing Interfaces 
Abstract classes may implement one or more interfaces 
- Any method headings given in the interface that are not given definitions are made into abstract methods 
- A concrete class must give definitions for all the method headings given in the abstract class and the interface  

e.g)
￼
![7.1](/assets/images/object_oriented_programming/11.4.png)

### Derived Interfaces 

Like classes, an interface may be derived from a base interface 
- This is called extending the interface
- The derived interface must include the phrase 
￼
![7.1](/assets/images/object_oriented_programming/11.5.png)

A concrete class that implements a derived interface must have definitions for any methods in the derived interface as well as any methods in the base interface  

e.g)
￼
![7.1](/assets/images/object_oriented_programming/11.6.png)

### The Comparable Interface 

Using the Comparable interface could provide a single sorting method that covers all these cases 
- sort into decreasing order, or to sort integers or strings instead

The Comparable interface is in the java.lang package, and so is automatically available to any program  
It has only the following method heading that must be implemented: 

![7.1](/assets/images/object_oriented_programming/11.7.png)
￼
It is the programmer's responsibility to follow the semantics of the Comparable interface when implementing it  

#### The Comparable Interface Semantics 

The method compareTo must return 
- A negative number if the calling object "comes before" the parameter other 
- A zero if the calling object "equals" the parameter other 
- A positive number if the calling object "comes after" the parameter other  

If the parameter other is not of the same type as the class being defined, then a ClassCastException should be thrown  

#### Pitfall: Inconsistent Interfaces 

In Java, a class can have only one base class 
- This prevents any inconsistencies arising from different definitions having the same method heading 

In addition, a class may implement any number of interfaces 
- Since interfaces do not have method bodies, the above problem cannot arise 
- However, there are other types of inconsistencies that can arise  

When a class implements two interfaces: 
- One type of inconsistency will occur 
    - if the interfaces have constants with the same name, but with different values 
- Another type of inconsistency will occur 
    - if the interfaces contain methods with the same name but different return types 
    - If a class definition implements two inconsistent interfaces, then that is an error, and the class definition is illegal  

### Inner Classes 

Inner classes are classes defined within other classes 
- The class that includes the inner class is called the outer class 
- There is no particular location where the definition of the inner class (or classes) must be placed within the outer class 
- Placing it first or last, however, will guarantee that it is easy to find 

An inner class definition is a member of the outer class in the same way that the instance variables and methods of the outer class are members 
- An inner class is local to the outer class definition
- The name of an inner class may be reused for something else outside the outer class definition 
- If the inner class is private, then the inner class cannot be accessed by name outside the definition of the outer clas 

**There are two main advantages to inner classes** 
- They can make the outer class more self-contained since they are defined inside a class 
- Both of their methods have access to each other's private methods and instance variables  
Using an inner class as a helping class is one of the most useful applications of inner classes 
- If used as a helping class, an inner class should be marked private  


#### Tip: Inner and Outer Classes Have Access to Each Other's Private Members 
Within the definition of a method of an inner class: 
- It is legal to reference a private instance variable of the outer class 
- It is legal to invoke a private method of the outer class  

Within the definition of a method of the outer class 
- It is legal to reference a private instance variable of the inner class on an object of the inner class 
- It is legal to invoke a (nonstatic) method of the inner class as long as an object of the inner class is used as a calling object 
    - Within the definition of the inner or outer classes, the modifiers public and private are equivalent  

e.g) Class with an Inner Class 
￼
![7.1](/assets/images/object_oriented_programming/11.8.png)

![7.1](/assets/images/object_oriented_programming/11.9.png)

![7.1](/assets/images/object_oriented_programming/11.10.png)￼


#### The .class File for an Inner Class 
Compiling any class in Java produces a .class file  named ClassName.class  
Compiling a class with one (or more) inner classes causes both (or more) classes to be compiled, and produces two (or more) .class files 
￼
![7.1](/assets/images/object_oriented_programming/11.11.png)

### Static Inner Classes 

A normal inner class has a connection between its objects and the outer class object that created the inner class object 
- This allows an inner class definition to reference an instance variable, or invoke a method of the outer class  

There are certain situations, however, when an inner class must be static 
- If an object of the inner class is created within a static method of the outer class 
- If the inner class must have static members  

Since a static inner class has no connection to an object of the outer class, within an inner class method 
- Instance variables of the outer class cannot be referenced – Nonstatic methods of the outer class cannot be invoked  

To invoke a static method or to name a static variable of a static inner class within the outer class, preface each with the name of the inner class and a dot  

### Anonymous Classes 

If an object is to be created, but there is no need to name the object's class, then an anonymous class definition can be used 
- The class definition is embedded inside the expression with the new operator 

Anonymous classes are sometimes used when they are to be assigned to a variable of another type 
- The other type must be such that an object of the anonymous class is also an object of the other type 
- The other type is usually a Java interface  
e.g)

![7.1](/assets/images/object_oriented_programming/11.12.png)

![7.1](/assets/images/object_oriented_programming/11.13.png)

![7.1](/assets/images/object_oriented_programming/11.14.png)


￼
￼





