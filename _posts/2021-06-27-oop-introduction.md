---
layout: post
title: Introduction
subtitle: 
categories: [Object-oriented programming]
tags: [ComputerScience]
---

![7.1](/assets/images/object_oriented_programming/1.1.png)


#### Origins of the Java Language 

Created by Sun Microsystems team led by James Gosling (1991) 

Originally designed for programming home appliances and that was difficult task because appliances are controlled by a wide variety of computer processors 

Writing a compiler (translation program) for each type of appliance processor would have been very costly 

Instead, developed intermediate language that is the same for all types of processors : Java byte-code 

Therefore, only a small, easy to write program was needed to translate byte-code into the machine code for each processor  

#### Class, Objects and Methods 

Java is an object-oriented programming (OOP) language 

**OOP**

programming methodology that views a program as consisting of objects that interact with one another by means of actions (called methods) 

**Class**

Objects of the same kind are said to have the same type or be in the same class 
- A class is the name for a type whose values are objects

**Object**

Objects are entities that store data and take actions 

**Method**

The actions that an object can take are called methods 
- Methods can return a value of a single type and/or perform an action 
- All objects within a class have the same methods, but each can have different data values  


#### Java Application Programs 
A Java application program or "regular" Java program is a class with a method named 'main'
- When a Java application program is run, the run-time system automatically invokes the method named 'main' 
- All Java application programs start with the main method 


#### System.out.println
Java programs work by having things called objects perform actions 

**System.out**

an object used for sending output to the screen 

**System.out.println**

the method or action that the System.out object performs 


#### Byte-Code and the Java Virtual Machine 

The compilers for most programming languages translate high-level programs directly into the machine language for a particular computer 
- Since different computers have different machine languages, a different compiler is needed for each one 

In contrast, the Java compiler translates Java programs into byte-code, a machine language for a fictitious computer called the Java Virtual Machine
- Once compiled to byte-code, a Java program can be used on any computer, making it very portable 

Interpreter is the program that translates a program written in Java byte-code into the machine language for a particular computer when a Java program is executed 
- The interpreter translates and immediately executes each byte-code instruction, one after another 
- Translating byte-code into machine code is relatively easy compared to the initial compilation step 


#### Class Loader 
Java programs are divided into smaller parts called classes 

Each class definition is normally in a separate file and compiled separately 

So class Loader a program that connects the byte-code of the classes needed to run a Java program 

In other programming languages, the corresponding program is called a linker 


#### Compiling a Java Program or Class 
Each class definition must be in a file whose name is the same as the class name followed by .java 

e.g) The class `FirstProgram` must be in a file named `FirstProgram.java`

Each class is compiled with the command javac followed by the name of the file in which the class resides 

e.g) `javac FirstProgram.java`

The result is a byte-code program whose filename is the same as the class name followed by .class 

e.g) `FirstProgram.class`



#### Running a Java Program

A Java program can be given the run command `java` after all its classes have been compiled 

Only run the class that contains the main method
- the system will automatically load and run the other classes, if any

The main method begins with the line `public static void main(String[ ] args)`

Follow the run command by the name of the class only (no .java or .class extension) 

e.g) `java FirstProgram`


#### Primitive Types 
![7.1](/assets/images/object_oriented_programming/1.2.png)


#### Constants 

Constant (or literal) is an item in Java which has one specific value that cannot change 

e.g)
- Constants of an integer type may not be written with a decimal point (e.g., 10) 
- Constants of a floating-point type can be written in ordinary decimal fraction form (e.g., 367000.0 or 0.000589) 
- Constant of a floating-point type can also be written in scientific (or floating-point) notation (e.g., 3.67e5 or 5.89e-4) 
- Constants of type char are expressed by placing a  single character in single quotes (e.g., 'Z')  
- Constants for strings of characters are enclosed by  double quotes (e.g., "Welcome to Java")  
- And there are only two boolean type constants, true  and false  

#### The Class String 
There is no primitive type for strings in Java  

- The class String is a predefined class in Java that is used to store and process strings  
- Objects of type String are made up of strings of characters that are written within double quotes  

![7.1](/assets/images/object_oriented_programming/1.3.png)


#### Comments 
A line comment begins with the symbols `//`, and causes the compiler to ignore the remainder of the line

This type of comment is used for the code writer or for a programmer who modifies the code <br> 
(A block comment begins with the symbol pair `/*`, and ends with the symbol pair `*/`)

- The compiler ignores anything in between 
- This type of comment can span several lines 
- This type of comment provides documentation for the users of the program




￼
￼





