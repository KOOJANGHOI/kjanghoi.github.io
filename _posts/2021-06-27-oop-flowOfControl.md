---
layout: post
title: Flow of control
subtitle: 
categories: [Object-oriented programming]
tags: [ComputerScience]
---


#### Flow of Control 
As in most programming languages, flow of control in Java  refers to branching and looping mechanisms  

- branching mechanisms: if-else, if, and  switch statements  
- loop statements: the while, do-  while, and for statements  
- Most branching and looping statements are controlled by Boolean expressions
   - A Boolean expression evaluates to either true or false 

#### Pitfall: Using == with Strings 
The equality comparison operator `==` can correctly test two values of a primitive type  

However, when applied to two objects such as objects of the String class, `==` tests to see if they are stored in the same memory location, not whether or not they have the same value 
 
In order to test two strings to see if they have equal values, use the method equals, or equalsIgnoreCase 
- `string1.equals(string2)`
- `string1.equalsIgnoreCase(string2) `


#### Loops 
Java has three types of loop statements: the while, the do-while, and the for statements 

- The code that is repeated in a loop is called the body of the loop 
- Each repetition of the loop body is called an iteration of the loop 

**Example**
![7.1](/assets/images/object_oriented_programming/3.1.png)


￼
￼





