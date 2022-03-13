---
layout: post
title: Defining class (2)
subtitle: 
categories: [Object-oriented programming]
tags: [ComputerScience]
---

### Static Methods 
A static method is one that can be used without a calling object  

A static method still belongs to a class, and its definition is given inside the class definition  

When a static method is defined, the keyword `static` is placed in the method header 

e.g) 
```
public static returnedType myMethod(parameters) {
	...
}  
```

Static methods are invoked using the class name in place of a calling object 

e.g) ` returnedValue = MyClass.myMethod(arguments); `

#### Pitfall: Invoking a Non-static Method Within a Static Method 

A static method cannot refer to an instance variable of the class, and it cannot invoke a non-static method of the class 

A static method has no this, so it cannot use an instance variable or method that has an implicit or explicit this for a calling object 

A static method can invoke another static method, however 

### Static Variable 

A static variable is a variable that belongs to the class as a whole, and not just to one object
 
There is only one copy of a static variable per class, unlike instance variables where each object has its own copy 

All objects of the class can read and change a static variable  

![7.1](/assets/images/object_oriented_programming/5.1.png)

![7.1](/assets/images/object_oriented_programming/5.2.png)

![7.1](/assets/images/object_oriented_programming/5.3.png)


Although a static method cannot access an instance variable, a static method can access a static variable  

A static variable is declared like an instance variable, with the addition of the modifier static  

e.g) `private static int myStaticVariable; `

Static variables can be declared and initialized at the same time 

e.g) `private static int myStaticVariable = 0;`

If not explicitly initialized, a static variable will be automatically initialized to a default value 
- boolean static variables are initialized to false 
- Other primitive types static variables are initialized to the zero of their type 
- Class type static variables are initialized to null  

So, it is always preferable to explicitly initialize static variables rather than rely on the default initialization  

A static variable should always be defined private, unless it is also a defined constant 

The value of a static defined constant cannot be altered, therefore it is safe to make it public  

In addition to static, the declaration for a static defined constant must include the modifier final, which indicates that its value cannot be changed  

e.g) `public static final int BIRTH_YEAR = 1954;`		 

When referring to such a defined constant outside its class, use the name of its class in place of a calling object 

e.g) `int year = MyClass.BIRTH_YEAR `


### Wrapper Classes 
Wrapper classes provide a class type corresponding to each of the primitive types 

This makes it possible to have class types that behave somewhat like primitive types 

The wrapper classes for the primitive types byte, short, long, float, double, and char are (in order) Byte, Short, Long, Float, Double, and Character 

Wrapper classes also contain a number of useful predefined constants and static methods 

#### Boxing
the process of going from a value of a primitive type to an object of its wrapper class 

To convert a primitive value to an "equivalent" class type value, create an object of the corresponding wrapper class using the primitive value as an argument 

The new object will contain an instance variable that stores a copy of the primitive value 

Unlike most other classes, a wrapper class does not have a no-argument constructor 

e.g) `Integer integerObject = new Integer(42);`


#### Unboxing
the process of going from an object of a wrapper class to the corresponding value of a primitive type 

The methods for converting an object from the wrapper classes Byte, Short, Integer, Long, Float, Double, and Character to their corresponding primitive type are (in order) byteValue, shortValue, intValue, longValue, floatValue, doubleValue, and charValue 

None of these methods take an argument 

e.g) `int i = integerObject.intValue();` 

#### Automatic Boxing and Unboxing
Starting with version 5.0, Java can automatically do boxing and unboxing  

Instead of creating a wrapper class object using the new operation (as shown before), it can be done as an automatic type cast

e.g) `Integer integerObject = 42;`

Instead of having to invoke the appropriate method (such as intValue, doubleValue, charValue, etc.) in order to convert from an object of a wrapper class to a value of its associated primitive type, the primitive value can be recovered automatically   

e.g) `int i = integerObject;`


#### Constants and Static Methods in Wrapper Classes 
Wrapper classes include useful constants that provide the largest and smallest values for any of the primitive number types 

e.g)
![7.1](/assets/images/object_oriented_programming/5.4.png)

The Boolean class has names for two constants of type Boolean 
- Boolean.TRUE and Boolean.FALSE are the Boolean objects that correspond to the values true and false of the primitive type boolean 

Wrapper classes have static methods that convert a correctly formed string representation of a number to the number of a given type 

![7.1](/assets/images/object_oriented_programming/5.5.png)

Wrapper classes also have static methods that convert from a numeric value to a string representation of the value 

![7.1](/assets/images/object_oriented_programming/5.6.png)

The Character class contains a number of static  methods that are useful for string processing  

### Variables and Memory 
Values of most data types require more than one byte of storage 

![7.1](/assets/images/object_oriented_programming/5.7.png)

Several adjacent bytes are then used to hold the data item
- The entire chunk of memory that holds the data is called its memory location
- The address of the first byte of this memory location is used as the address for the data item
- A computer's main memory can be thought of as a long list of memory locations of varying sizes 


### Reference 
Every variable is implemented as a location in computer memory  

When the variable is a primitive type, the value of the variable is stored in the memory location assigned to the variable 
- Each primitive type always require the same amount of memory to store its values  

When the variable is a class type, only the memory address (or reference) where its object is located is stored in the memory location assigned to the variable 
- The object named by the variable is stored in some other location in memory 
- Like primitives, the value of a class variable is a fixed size 
- Unlike primitives, the value of a class variable is a memory address or reference 
- The object, whose address is stored in the variable, can be of any size 

Two reference variables can contain the same reference, and therefore name the same object 
- The assignment operator sets the reference (memory address) of one class type variable equal to that of another 
- Any change to the object named by one of theses variables will produce a change to the object named by the other variable, since they are the same object 

e.g) `variable2 = variable1;`

![7.1](/assets/images/object_oriented_programming/5.8.png)

![7.1](/assets/images/object_oriented_programming/5.9.png)

![7.1](/assets/images/object_oriented_programming/5.10.png)

![7.1](/assets/images/object_oriented_programming/5.11.png)

![7.1](/assets/images/object_oriented_programming/5.12.png)

![7.1](/assets/images/object_oriented_programming/5.13.png)


#### Class Parameters 
All parameters in Java are **call-by-value parameters** 

A parameter is a local variable that is set equal to the value of its argument  

Therefore, any change to the value of the parameter cannot change the value of its argument  

Class type parameters appear to behave differently from primitive type parameters  

They appear to behave in a way similar to parameters in languages that have the **call-by-reference parameter passing mechanism**

The value plugged into a class type parameter is a reference (memory address) 

Therefore, the parameter becomes another name for the argument 

Any change made to the object named by the parameter (i.e., changes made to the values of its instance variables) will be made to the object named by the argument, because they are the same object  

Note that, because it still is a call-by-value parameter, any change made to the class type parameter itself (i.e., its address) will not change its argument (the reference or memory address)  

![7.1](/assets/images/object_oriented_programming/5.14.png)

![7.1](/assets/images/object_oriented_programming/5.15.png)

![7.1](/assets/images/object_oriented_programming/5.16.png)

![7.1](/assets/images/object_oriented_programming/5.17.png)

#### Differences Between Primitive and Class-Type Parameters 
A method cannot change the value of a variable of a primitive type that is an argument to the method  

In contrast, a method can change the values of the instance variables of a class type that is an argument to the method  

![7.1](/assets/images/object_oriented_programming/5.18.png)

![7.1](/assets/images/object_oriented_programming/5.19.png)


#### Pitfall: Use of = and == with Variables of a Class Type 
Used with variables of a class type, the assignment operator (=) produces two variables that name the same object 

This is very different from how it behaves with primitive type variables 

The test for equality (==) also behaves differently for class type variables 

The == operator only checks that two class type variables have the same memory address  

Unlike the equals method, it does not check that their instance variables have the same values  

Two objects in two different locations whose instance variables have exactly the same values would still test as being "not equal"  

#### The Constant null 
null is a special constant that may be assigned to a variable of any class type

e.g) `YourClass yourObject = null;`

It is used to indicate that the variable has no "real value"  

It is often used in constructors to initialize class type instance variables when there is no obvious object to use 

null is not an object: It is, rather, a kind of "placeholder" for a reference that does not name any memory location 

Because it is like a memory address, use == or != (instead of equals) to test if a class variable contains null 

e.g) `if (yourObject == null)  . . .`


#### Using and Misusing References 
When writing a program, it is very important to insure that private instance variables remain truly private  

For a primitive type instance variable, just adding the private modifier to its declaration should insure that there will be no privacy leaks  

For a class type instance variable, however, adding the private modifier alone is not sufficient!  

### Copy Constructors 
A copy constructor is a constructor with a single argument of the same type as the class  

The copy constructor should create an object that is a separate, independent object, but with the instance variables set so that it is an exact copy of the argument object  

e.g) Copy Constructor for a Class with Primitive Type Instance Variables 

![7.1](/assets/images/object_oriented_programming/5.20.png)

#### Pitfall: Privacy Leaks 
A problem can occur with incorrectly defined mutator or accessor methods  

![7.1](/assets/images/object_oriented_programming/5.21.png)


### Mutable and Immutable Classes 
The accessor method getName from the Person class appears to contradict the rules for avoiding privacy leaks

![7.1](/assets/images/object_oriented_programming/5.22.png)

Although it appears the same as some of the previous examples, it is not: The class String contains no mutator methods that can change any of the data in a String object  

A class that contains no methods (other than constructors) that change any of the data in an object of the class is called an immutable class 
- Objects of such a class are called immutable objects. It is perfectly safe to return a reference to an immutable object because the object cannot be changed in any way
- The String class is an immutable class 


A class that contains public mutator methods or other public methods that can change the data in its objects is called a mutable class, and its objects are called mutable objects 
- Never write a method that returns a mutable object.
- Instead, use a copy constructor to return a reference to a completely independent copy of the mutable object 


#### Deep Copy Versus Shallow Copy 
A deep copy of an object is a copy that, with one exception, has no references in common with the original 
- Exception: References to immutable objects are allowed to be shared 

![7.1](/assets/images/object_oriented_programming/5.23.png)

Any copy that is not a deep copy is called a shallow copy 
- This type of copy can cause dangerous privacy leaks in a program  

![7.1](/assets/images/object_oriented_programming/5.24.png)

### Packages and Import Statements 
Java uses packages to form libraries of classes  

A package is a group of classes that have been placed in a directory or folder, and that can be used in any program that includes an import statement that names the package 

The import statement must be located at the beginning of the program file: Only blank lines, comments, and package statements may precede it  

#### The Package java.lang 
The package java.lang contains the classes that are fundamental to Java programming 

It is imported automatically, so no import statement is needed 

Classes made available by java.lang include Math, String, and the wrapper classes 

![7.1](/assets/images/object_oriented_programming/5.25.png)


￼
￼





