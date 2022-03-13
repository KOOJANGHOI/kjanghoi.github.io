---
layout: post
title: File I/O
subtitle: 
categories: [Object-oriented programming]
tags: [ComputerScience]
---

### Streams 
A stream is an object that enables the flow of data between a program and some I/O device or file 
- If the data flows into a program, then the stream is called an input stream 
- If the data flows out of a program, then the stream is called an output stream 

Input streams can flow from the keyboard or from a file 
- System.in is an input stream that connects to the keyboard 
￼
![7.1](/assets/images/object_oriented_programming/10.1.png)

Output streams can flow to a screen or to a file 
- System.out is an output stream that connects to the screen 
￼
![7.1](/assets/images/object_oriented_programming/10.2.png)

#### Writing to a Text File 

The class PrintWriter is a stream class that can be used to write to a text file 
- An object of the class PrintWriter has the methods print and println 
- These are similar to the System.out methods of the same names, but are used for text file output, not screen output 

e.g)
￼
![7.1](/assets/images/object_oriented_programming/10.3.png)

#### I/O Exception 
When performing file I/O there are many situations in which an exception, such as FileNotFoundException, may be thrown 

Many of these exception classes are subclasses of the class IOException 
- The class IOException is the root class for a variety of exception classes having to do with input and/or output 
- These exception classes are all checked exceptions
- Therefore, they must be caught or declared in a throws clause 


#### Unchecked Exceptions 
In contrast, the exception classes NoSuchElementException, InputMismatchException, and IllegalStateException are all unchecked exceptions 
- Unchecked exceptions are not required to be caught or declared in a throws clause 


#### Path Names 
When a file name is used as an argument to a constructor for opening a file, it is assumed that the file is in the same directory or folder as the one in which the program is run 
- If it is not in the same directory, the full or relative path name must be given 


- A path name not only gives the name of the file, but also the directory or folder in which the file exists 
- A full path name gives a complete path name, starting from the root directory 
- A relative path name gives the path to the file, starting with the directory in which the program is located  

The way path names are specified depends on the operating system 

A typical UNIX path name that could be used as a file name argument is 
￼
![7.1](/assets/images/object_oriented_programming/10.4.png)

A BufferedReader input stream connected to this file is created as follows: 

![7.1](/assets/images/object_oriented_programming/10.5.png)￼

The Windows operating system specifies path names in a different way 

A typical Windows path name is the following: 
￼
![7.1](/assets/images/object_oriented_programming/10.6.png)

A BufferedReader input stream connected to this file is created as follows: 

![7.1](/assets/images/object_oriented_programming/10.7.png)


￼
￼





