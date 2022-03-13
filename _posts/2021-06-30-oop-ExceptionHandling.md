---
layout: post
title: Exception Handling
subtitle: 
categories: [Object-oriented programming]
tags: [ComputerScience]
---

### Introduction to Exception Handling 

Sometimes the best outcome can be when nothing unusual happens 
- However, the case where exceptional things happen must also be prepared for 
- Java exception handling facilities are used when the invocation of a method may cause something exceptional to occur 

Java library software (or programmer-defined code) provides a mechanism that signals when something unusual happens 
- This is called throwing an exception  
In another place in the program, the programmer must provide code that deals with the exceptional case 
- This is called handling the exception  

e.g)

![7.1](/assets/images/object_oriented_programming/9.1.png)￼


#### try-throw-catch Mechanism 

The basic way of handling exceptions in Java consists of the try-throw-catch trio  

The try block contains the code for the basic algorithm 
- It tells what to do when everything goes smoothly 
- It is called a try block because it "tries" to execute the case where all goes as planned 

When an exception is thrown, the execution of the surrounding try block is stopped
- Normally, the flow of control is transferred to another portion of code known as the catch block 
- The value thrown is the argument to the throw operator, and is always an object of some exception class 
- The execution of a throw statement is called throwing an exception 

A throw statement is similar to a method call:

![7.1](/assets/images/object_oriented_programming/9.2.png)￼

In the above example, the object of class ExceptionClassName is created using a string as its argument 

This object, which is an argument to the throw operator, is the exception object thrown 

Instead of calling a method, a throw statement calls a catch block 


When an exception is thrown, the catch block begins execution 
- The catch block has one parameter 
- The exception object thrown is plugged in for the catch block parameter 

The execution of the catch block is called catching the exception, or handling the exception 
- Whenever an exception is thrown, it should ultimately be handled (or caught) by some catch block 

![7.1](/assets/images/object_oriented_programming/9.3.png)
￼
A catch block looks like a method definition that has a parameter of type Exception class
- It is not really a method definition, however 
- A catch block is a separate piece of code that is executed when a program encounters and executes a throw statement in the preceding try block 
- A catch block is often referred to as an exception handler 
- It can have at most one parameter  

![7.1](/assets/images/object_oriented_programming/9.4.png)
￼
The identifier e in the above catch block heading is called the catch block parameter 

The catch block parameter does two things: 
1. It specifies the type of thrown exception object that the catch  block can catch (e.g., an Exception class object above) 
2. It provides a name (for the thrown object that is caught) on which it  can operate in the catch block  
Note: The identifier e is often used by convention, but any non-keyword identifier can be used 

When a try block is executed, two things can happen: 

1. No exception is thrown in the try block
    1. The code in the try block is executed to the end of the block
    2. The catch block is skipped 
    3. The execution continues with the code placed after the catch block 

2. An exception is thrown in the try block and caught in the catch block 
- The rest of the code in the try block is skipped 
- Control is transferred to a following catch block (in simple cases) 
- The thrown object is plugged in for the catch block parameter 
- The code in the catch block is executed
- The code that follows that catch block is executed (if any) 

e.g)
￼
![7.1](/assets/images/object_oriented_programming/9.5.png)

### Exception Classes 

There are more exception classes than just the single class Exception 
- There are more exception classes in the standard Java libraries 
- New exception classes can be defined like any other class  

All predefined exception classes have the following properties: 
- There is a constructor that takes a single argument of type String 
- The class has an accessor method `getMessage` that can recover the string given as an argument to the constructor when the exception object was created  

All programmer-defined classes should have the same properties 

e.g)
￼
![7.1](/assets/images/object_oriented_programming/9.6.png)

#### Exception Classes from Standard Packages 

Numerous predefined exception classes are included in the standard packages that come with Java 

e.g)

![7.1](/assets/images/object_oriented_programming/9.7.png)
￼

The predefined exception class Exception is the root class for all exceptions 
- Every exception class is a descendent class of the class Exception 
- Although the Exception class can be used directly in a class or program, it is most often used to define a derived class 
- The class Exception is in the java.lang package, and so requires no import statement 


#### Defining Exception Classes 
A throw statement can throw an exception object of any exception class 

Instead of using a predefined class, exception classes can be programmer-defined 
- These can be tailored to carry the precise kinds of information needed in the catch block 
- A different type of exception can be defined to identify each different exceptional situation 

Every exception class to be defined must be a derived class of some already defined exception class 

It can be a derived class of any exception class in the standard Java libraries, or of any programmer defined exception class 
- Constructors are the most important members to define in an exception class 
- They must behave appropriately with respect to the variables and methods inherited from the base class 
- Often, there are no other members, except those inherited from the base class 

The following exception class performs these basic tasks only 

e.g)
￼
![7.1](/assets/images/object_oriented_programming/9.8.png)

![7.1](/assets/images/object_oriented_programming/9.9.png)￼

### Multiple catch Blocks 

A try block can potentially throw any number of exception values, and they can be of differing types 
- In any one execution of a try block, at most one exception can be thrown (since a throw statement ends the execution of the try block) 
- However, different types of exception values can be thrown on different executions of the try block 

Each catch block can only catch values of the exception class type given in the catch block heading  
Different types of exceptions can be caught by placing more than one catch block after a try block 
- Any number of catch blocks can be included, but they must be placed in the correct order  

e.g)

![7.1](/assets/images/object_oriented_programming/9.10.png)￼


#### Pitfall: Catch the More Specific Exception First 

When catching multiple exceptions, the order of the catch blocks is important
- When an exception is thrown in a try block, the catch blocks are examined in order
- The first one that matches the type of the exception thrown is the one that is executed 
￼
![7.1](/assets/images/object_oriented_programming/9.11.png)

Because a NegativeNumberException is a type of Exception, all NegativeNumberExceptions will be caught by the first catch block before ever reaching the second block 
- The catch block for NegativeNumberException will never be used! 
- For the correct ordering, simply reverse the two blocks 

### Declaring Exceptions in a throws Clause 

If a method can throw an exception but does not catch it, it must provide a warning 
- This warning is called a throws clause 
- The process of including an exception class in a throws clause is called declaring the exception 
- The following states that an invocation of aMethod could throw AnException  
￼
![7.1](/assets/images/object_oriented_programming/9.12.png)

If a method can throw more than one type of exception, then separate the exception types by commas 

![7.1](/assets/images/object_oriented_programming/9.13.png)
￼

If a method throws an exception and does not catch it, then the method invocation ends immediately  

### Checked and Unchecked Exceptions 

Exceptions that are subject to the catch or declare rule are called checked exceptions 
- The compiler checks to see if they are accounted for with either a catch block or a throws clause 
- The classes Throwable, Exception, and all descendants of the class Exception are checked exceptions  
All other exceptions are unchecked exceptions 
- The class Error and all its descendant classes are called error classes 
- Error classes are not subject to the Catch or Declare Rule 


Checked exceptions must follow the Catch or Declare Rule 
- Programs in which these exceptions can be thrown will not compile until they are handled properly  
Unchecked exceptions are exempt from the Catch or Declare Rule 
- Programs in which these exceptions are thrown simply need to be corrected, as they result from some sort of error  
￼
![7.1](/assets/images/object_oriented_programming/9.14.png)

#### When to Use Exceptions 

Exceptions should be reserved for situations where a method encounters an unusual or unexpected case that cannot be handled easily in some other way  
When exception handling must be used, here are some basic guidelines: 
- Include throw statements and list the exception classes in a throws clause within a method definition 
- Place the try and catch blocks in a different method  
Here is an example of a method from which the exception originates: 
￼
![7.1](/assets/images/object_oriented_programming/9.15.png)

When someMethod is used by an otherMethod, the otherMethod must then deal with the exception: 

![7.1](/assets/images/object_oriented_programming/9.16.png)￼


#### The finally Block 

The finally block contains code to be executed whether or not an exception is thrown in a try block 
- If it is used, a finally block is placed after a try block and its following catch blocks 
￼
![7.1](/assets/images/object_oriented_programming/9.17.png)

If the try-catch-finally blocks are inside a method definition, there are three possibilities when the code is run: 

1. The try block runs to the end, no exception is thrown, and the finally block is executed 
2. An exception is thrown in the try block, caught in one of the catch blocks, and the finally block is executed 
3. An exception is thrown in the try block, there is no matching catch block in the method, the finally block is executed, and then the method invocation ends and the exception object is thrown to the enclosing method  

E.g) Exception Handling with the Scanner Class 

![7.1](/assets/images/object_oriented_programming/9.18.png)

![7.1](/assets/images/object_oriented_programming/9.19.png)

![7.1](/assets/images/object_oriented_programming/9.20.png)

￼
￼





