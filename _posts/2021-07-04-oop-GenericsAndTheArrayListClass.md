---
layout: post
title: Generics and the ArrayList Class
subtitle: 
categories: [Object-oriented programming]
tags: [ComputerScience]
---

### Introduction to Generics 
Beginning with version 5.0, Java allows class and method definitions that include parameters for types 
- Such definitions are called generics 

Generic programming with a type parameter enables code to be written that applies to any class 


### The ArrayList Class 
ArrayList is a class in the standard Java libraries 

Unlike arrays, which have a fixed length once they have been created, an ArrayList is an object that can grow and shrink while your program is running 
- In general, an ArrayList serves the same purpose as an array, except that an ArrayList can change length while the program is running 

The class ArrayList is implemented using an array as a private instance variable 
- When this hidden array is full, a new larger hidden array is created and the data is transferred to this new array 

Why not always use an ArrayList instead of an array? 
- An ArrayList is less efficient than an array 
- It does not have the convenient square bracket notation 
- The base type of an ArrayList must be a class type (or other reference type): it cannot be a primitive type 
- This last point is less of a problem now that Java provides automatic boxing and unboxing of primitives 

An ArrayList is created and named in the same way as object of any class, except that you specify the base type as follows: 

![7.1](/assets/images/object_oriented_programming/12.1.png)

An initial capacity can be specified when creating an ArrayListas well 
- Specifying an initial capacity does not limit the size to which an ArrayList can eventually grow 

![7.1](/assets/images/object_oriented_programming/12.2.png)

#### Some Methods in the Class ArrayList 
https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

#### The "For Each" Loop 
The ArrayList class is an example of a collection class  

Starting with version 5.0, Java has added a new kind of for loop called a for-each or enhanced for loop 
- This kind of loop has been designed to cycle through all the elements in a collection (like an ArrayList)  
e.g)

![7.1](/assets/images/object_oriented_programming/12.3.png)

![7.1](/assets/images/object_oriented_programming/12.4.png)

![7.1](/assets/images/object_oriented_programming/12.5.png)

### The Vector Class 
The Java standard libraries have a class named Vector that behaves almost exactly the same as the class ArrayList 
- In most situations, either class could be used
- However, the ArrayList class is newer, and is becoming the preferred class 


### Parameterized Classes and Generics 
The class ArrayList is a parameterized class  

It has a parameter, denoted by Base_Type, that can be replaced by any reference type to obtain a class for ArrayLists with the specified base type  

Starting with version 5.0, Java allows class definitions with parameters for types 
- These classes that have type parameters are called parameterized class or generic definitions, or, simply, generics  

### Generics
 Classes and methods can have a type parameter 
- A type parameter can have any reference type (i.e., any class type) plugged in for the type parameter 
- When a specific type is plugged in, this produces a specific class type or method 
- Traditionally, a single uppercase letter is used for a type parameter, but any non-keyword identifier may be used 

A class definition with a type parameter is stored in a file and compiled just like any other class 
- Once a parameterized class is compiled, it can be used like any other class 
- However, the class type plugged in for the type parameter must be specified before it can be used in a program 

Doing this is said to instantiate the generic class 

![7.1](/assets/images/object_oriented_programming/12.6.png)

e.g) A Class Definition with a Type Parameter 

![7.1](/assets/images/object_oriented_programming/12.7.png)

### Class Definition with a Type Parameter 
A class that is defined with a parameter for a type is called a generic class or a parameterized class 
- The type parameter is included in angular brackets after the class name in the class definition heading 
- Any non-keyword identifier can be used for the type parameter, but by convention, the parameter starts with an uppercase letter 
- The type parameter can be used like other types used in the definition of a class  
e.g) A Generic Ordered Pair Class 

![7.1](/assets/images/object_oriented_programming/12.8.png)

![7.1](/assets/images/object_oriented_programming/12.9.png)

![7.1](/assets/images/object_oriented_programming/12.10.png)

![7.1](/assets/images/object_oriented_programming/12.11.png)

![7.1](/assets/images/object_oriented_programming/12.12.png)

![7.1](/assets/images/object_oriented_programming/12.13.png)

![7.1](/assets/images/object_oriented_programming/12.14.png)

#### Pitfall: A Primitive Type Cannot be Plugged in for a Type Parameter 
The type plugged in for a type parameter must always be a reference type 
- It cannot be a primitive type such as int, double, or char 
- However, now that Java has automatic boxing, this is not a big restriction 
- Note: reference types can include arrays 


#### Pitfall: A Class Definition Can Have More Than One Type Parameter 
A generic class definition can have any number of type parameters 
- Multiple type parameters are listed in angular brackets just as in the single type parameter case, but are separated by commas 

e.g) Multiple Type Parameters 

![7.1](/assets/images/object_oriented_programming/12.15.png)

![7.1](/assets/images/object_oriented_programming/12.16.png)

![7.1](/assets/images/object_oriented_programming/12.17.png)

![7.1](/assets/images/object_oriented_programming/12.18.png)

![7.1](/assets/images/object_oriented_programming/12.19.png)

![7.1](/assets/images/object_oriented_programming/12.20.png)

#### Generic Methods 
When a generic class is defined, the type parameter can be used in the definitions of the methods for that generic class  

In addition, a generic method can be defined that has its own type parameter that is not the type parameter of any class 
- A generic method can be a member of an ordinary class or a member of a generic class that has some other type parameter 
- The type parameter of a generic method is local to that method, not to the class  
The type parameter must be placed (in angular brackets) after all the modifiers, and before the returned type 

![7.1](/assets/images/object_oriented_programming/12.21.png)

When one of these generic methods is invoked, the method name is prefaced with the type to be plugged in, enclosed in angular brackets 

![7.1](/assets/images/object_oriented_programming/12.22.png)

e.g) Generic Methods 

![7.1](/assets/images/object_oriented_programming/12.23.png)
￼
￼





