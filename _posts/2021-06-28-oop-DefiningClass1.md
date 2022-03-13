---
layout: post
title: Defining class (1)
subtitle: 
categories: [Object-oriented programming]
tags: [ComputerScience]
---

#### Introduction 
Classes are the most important language feature that  makes object-oriented programming (OOP) possible  

Programming in Java consists of defining a number of  classes
- Every program is a class 
- All helping software consists of classes 
- All programmer-defined types are classes  
 

#### A Class Is a Type
A class is a special kind of programmer-defined type, and variables can be declared of a class type  

A value of a class type is called an object or an instance of the class  

If A is a class, then the phrases mean same thing 
- "bla is of type A," 
- "bla is an object of the class A,"
- "bla is an instance of the class A"   

A class determines the types of data that an object can contain, as well as the actions it can perform  


#### The Contents of a Class Definition 
A class definition specifies the data items and methods that all of its objects will have 

- Data items = fields, instance variables
- Data items and methods are sometimes called members of the class
￼
![7.1](/assets/images/object_oriented_programming/4.1.png)

![7.1](/assets/images/object_oriented_programming/4.2.png)


#### The new Operator 
The `new` operator must then be used to create the object and associate it with its variable name    

e.g)
```
ClassName  classVar;
classVar = new ClassName();
```

e.g)
```
 ClassName classVar = new ClassName();  
```

#### Instance Variables
Instance variables can be defined as in the following two examples 

e.g)
```
public String instanceVar1; 
public int instanceVar2; 
```

In order to refer to a particular instance variable, preface it with its object name as follows:

e.g) 
```
objectName.instanceVar1 
objectName.instanceVar2 
```

#### Methods
There are two kinds of methods: 
- Methods that compute and return a value 
   - A method that returns a value must specify the type of that value in its heading
- Methods that perform an action
   - This type of method does not return a value, and is called a void method 

e.g) ` public typeReturned methodName(paramList)`
 

A void method uses the keyword void in its  heading to show that it does not return a  value

e.g)  `public void methodName(paramList)` 


**More About Methods**

A program in Java is just a class that has a main  method  

When you give a command to run a Java program,  the run-time system invokes the method `main`  
- Note that main is a void method, as indicated by  its heading: `public static void main(String[] args) `

#### Local Variables 
Local variable is a variable declared within a method definition 
- All variables declared in the main method are local variables 
- All method parameters are local variables 


#### Global Variables 
Some programming languages include another kind of variable called a global variable  
- The Java language does not have global variables  

#### Blocks 
A block is another name for a compound statement,  that is, a set of Java statements enclosed in braces,{}  

A variable declared within a block is local to that  block, and cannot be used outside the block  

Once a variable has been declared within a block, its name cannot be used for anything else within the same method definition  


#### The `this` Parameter 
All instance variables are understood to have `<the calling object>.` in front of them
 
If an explicit name for the calling object is needed, the keyword this can be used 

e.g)
`myInstanceVariable` always means and is always interchangeable with `this.myInstanceVariable` 

￼![7.1](/assets/images/object_oriented_programming/4.3.png)


#### Information Hiding and Encapsulation 
Information hiding is the practice of **separating how to use a class from the details of its implementation**
 

Abstraction is another term used to express the concept of **discarding details in order to avoid information overload**


Encapsulation means that the data and methods of a class are combined into a single unit (i.e., a class object), which hides the implementation details 
- Knowing the details is unnecessary because interaction with the object occurs via a well-defined and simple interface 
- In Java, hiding details is done by marking them private  

#### A Couple of Important Acronyms: API and ADT 
The API or application programming interface for a class is a description of how to use the class 
- A programmer need only read the API in order to use a well designed class 

An ADT or abstract data type is a data type that is written using good information-hiding techniques 

#### public and private Modifiers 
The modifier `public` means that there are no restrictions on  where an instance variable or method can be used  

The modifier `private` means that an instance variable or method cannot be accessed by name outside of the class  

It is considered good programming practice to make all instance variables private  

Most methods are public, and thus provide controlled access to the object  

Usually, methods are private only if used as helping methods for other methods in the class  

#### Accessor and Mutator Methods 
Accessor methods allow the programmer to obtain the value of an object's instance variables 
- The data can be accessed but not changed
- The name of an accessor method typically starts with the word get  

Mutator methods allow the programmer to change the value of an object's instance variables in a controlled manner 
- Incoming data is typically tested and/or filtered 
- The name of a mutator method typically starts with the word set  

#### Encapsulation 
![7.1](/assets/images/object_oriented_programming/4.4.png)

#### Overloading 
Overloading is when two or more methods in the  same class have the same method name  
￼
![7.1](/assets/images/object_oriented_programming/4.5.png)

To be valid, any two definitions of the method name must have different signatures
- A signature consists of the name of a method together with its parameter list 
- Differing signatures must have different numbers and/or types of parameters  


#### Overloading and Automatic Type Conversion 
If Java cannot find a method signature that exactly matches a method invocation, it will try to use automatic type conversion  

The interaction of overloading and automatic type conversion can have unintended results  

In some cases of overloading, because of automatic type conversion, a single method invocation can be resolved in multiple ways 
- Ambiguous method invocations will produce an error in Java  

#### Pitfall: You Can Not Overload Based on the Type Returned 
The signature of a method only includes the method name and its parameter types 
- **The signature does not include the type returned** 

Java does not permit methods with the same name and different return types in the same class  

#### Constructors 
A constructor is a special kind of method that is designed to initialize the instance variables for an object

e.g) 
```
public ClassName(anyParameters){
	...
}
```

![7.1](/assets/images/object_oriented_programming/4.6.png)
￼
A constructor must have the same name as the class
- A constructor has no type returned, not even void
- Constructors are typically overloaded 

A constructor is called when an object of the class is created using new

e.g)
``` 
ClassName objectName = new ClassName(anyArgs);
```

- The name of the constructor and its parenthesized list of arguments (if any) must follow the new operator 
- This is the only valid way to invoke a constructor because a constructor cannot be invoked like an ordinary method 




￼
￼





