---
layout: post
title: Console input and output
subtitle: 
categories: [Object-oriented programming]
tags: [ComputerScience]
---

#### System.out.println 

`System.out` is an object that is part of the Java  language  

`println` is a method invoked by the `System.out` object that can be used for console output  
- Every invocation of println ends a line of output   

The data to be output is given as an argument in parentheses<br>
(A plus sign is used to connect more than one item)

**println vs print**

The `print` method is like `println`, except that it does not end a line 
- With `println`, the next output goes on a new line 
- With `print`, the next output goes on the same line 


#### Formatting Output with printf 
Starting with version 5.0, Java includes a method named `printf` that can be used to produce output in a specific format  
- System.out.printf can have any number of arguments 

The first argument is always a format string that contains one or more format specifiers for the remaining arguments  

All the arguments except the first are values to be output to the screen  
￼
![7.1](/assets/images/object_oriented_programming/2.1.png)

#### Importing Packages and Classes 
Libraries in Java are called packages 

A package is a collection of classes that is stored in a manner that makes it easily accessible to any program 

In order to use a class that belongs to a package, the class must be brought into a program using an import statement 
- Classes found in the package java.lang are imported automatically into every Java program 

e.g) `import java.text.NumberFormat;`


#### Console Input 
Starting with version 5.0, Java includes a class for doing simple keyboard input named the `Scanner` class  

In order to use the `Scanner` class, a program must include the following line near the start of the file
`import java.util.Scanner` <br><br>
 
This statement tells Java to 
- Make the Scanner class available to the program 
- Find the Scanner class in a library of classes (i.e., Java package) named java.util  
￼
![7.1](/assets/images/object_oriented_programming/2.2.png)

![7.1](/assets/images/object_oriented_programming/2.3.png)


#### Introduction to File Input/Output 
The Scanner class can also be used to read from files on the disk 
 
Import the necessary classes in addition to Scanner 
- `import java.io.FileInputStream;`
- `import java.io.FileNotFoundException;`

Open the file inside a try/catch block.<br>
If an error occurs while trying to open the file then execution jumps to the catch block 

![7.1](/assets/images/object_oriented_programming/2.4.png)

![7.1](/assets/images/object_oriented_programming/2.5.png)



￼
￼





