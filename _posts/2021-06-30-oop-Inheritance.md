---
layout: post
title: Inheritance
subtitle: 
categories: [Object-oriented programming]
tags: [ComputerScience]
---

### Introduction to Inheritance 

Inheritance is one of the main techniques of object-oriented programming (OOP)  

Using this technique, a very general form of a class is first defined and compiled, and then more specialized versions of the class are defined by adding instance variables and methods  
- The specialized classes are said to inherit the methods and instance variables of the general class  

Inheritance is the process by which a new class is created from another class
- The new class is called a derived class 
- The original class is called the base class  

A derived class automatically has all the instance variables and methods that the base class has, and it can have additional methods and/or instance variables as well  
Inheritance is especially advantageous because it allows code to be reused, without having to copy it into the definitions of the derived classes  


### Derived Classes 
When designing certain classes, there is often a natural hierarchy for grouping them 

e.g) A Class Hierarchy 
![7.1](/assets/images/object_oriented_programming/7.1.png)￼
 
When a derived class is defined, it is said to inherit the instance variables and methods of the base class that it extends 

A derived class, also called a subclass, is defined by starting with another already defined class, called a base class or superclass, and adding (and/or changing) methods, instance variables, and static variables 
- The derived class inherits all the public methods, all the public and private instance variables, and all the public and private static variables from the base class 
- The derived class can add more instance variables, static variables, and/or methods 


#### Overriding a Method Definition 
Although a derived class inherits methods from the base class, it can change or override an inherited method if necessary 

In order to override a method definition, a new definition of the method is simply placed in the class definition, just like any other method that is added to the derived class 

#### Pitfall: Overriding Versus Overloading
Do not confuse overriding a method in a derived class with overloading a method name 
- When a method is overridden, the new method definition given in the derived class has the exact same number and types of parameters as in the base class 
- When a method in a derived class has a different signature from the method in the base class, that is overloading 
- Note that when the derived class overloads the original method, it still inherits the original method from the base class as well  

### The final Modifier 
If the modifier final is placed before the definition of a method, then that method may not be redefined in a derived class
If the modifier final is placed before the definition of a class, then that class may not be used as a base class to derive other classes  

### The super Constructor 
A derived class uses a constructor from the base class to initialize all the data inherited from the base class 

In order to invoke a constructor from the base class, it uses a special syntax: 

![7.1](/assets/images/object_oriented_programming/7.2.png)￼

In the above example, super(p1, p2); is a call to the base class constructor 

Tips
- A call to the base class constructor can never use the name of the base class, but uses the keyword super instead 
- A call to super must always be the first action taken in a constructor definition 
- An instance variable cannot be used as an argument to super  

If a derived class constructor does not include an invocation of super, then the no-argument constructor of the base class will automatically be invoked
- This can result in an error if the base class has not defined a no-argument constructor  
Since the inherited instance variables should be initialized, and the base class constructor is designed to do that, then an explicit call to super should always be used  


### The this Constructor 
Within the definition of a constructor for a class, this can be used as a name for invoking another constructor in the same class
- The same restrictions on how to use a call to super apply to the this constructor  
If it is necessary to include a call to both super and this, the call using this must be made first, and then the constructor that is called must call super as its first action  

#### Pitfall: Use of Private Instance Variables from the Base Class 

An instance variable that is private in a base class is not accessible by name in the definition of a method in any other class, not even in a method definition of a derived class 

Instead, a private instance variable of the base class can only be accessed by the public accessor and mutator methods defined in that class 

#### Pitfall: Private Methods Are Effectively Not Inherited 

The private methods of the base class are like private variables in terms of not being directly available  However, a private method is completely unavailable, unless invoked indirectly  
This is possible only if an object of a derived class invokes a public method of the base class that happens to invoke the private method 
This should not be a problem because private methods should just be used as helping methods 
(If a method is not just a helping method, then it should be public, not private)


### Protected and Package Access 

If a method or instance variable is modified by protected (rather than public or private), then it can be accessed by name 
- Inside its own class definition 
- Inside any class derived from it 
- In the definition of any class in the same package 

The protected modifier provides very weak protection compared to the private modifier 
- It allows direct access to any programmer who defines a suitable derived class 
- Therefore, instance variables should normally not be marked protected  

An instance variable or method definition that is not preceded with a modifier has package access 
- Package access is also known as default or friendly access  

Instance variables or methods having package access can be accessed by name inside the definition of any class in the same package 
- However, neither can be accessed outside the package  

### Access Modifiers 
![7.1](/assets/images/object_oriented_programming/7.3.png)

### The Class Object 
In Java, every class is a descendent of the class Object 
- Every class has Object as its ancestor 
- Every object of every class is of type Object, as well as being of the type of its own class  
If a class is defined that is not explicitly a derived class of another class, it is still automatically a derived class of the class Object 

The class Object is in the package java.lang which is always imported automatically.

Having an Object class enables methods to be written with a parameter of type Object 
- A parameter of type Object can be replaced by an object of any class whatsoever 
- For example, some library methods accept an argument of type Object so they can be used with an argument that is an object of any class 

The class Object has some methods that every Java class inherits 
- For example, the equals and toString methods 
- Every object inherits these methods from some ancestor class  

Either the class Object itself, or a class that itself inherited these methods (ultimately) from the class Object 
However, these inherited methods should be overridden with definitions more appropriate to a given class 

Some Java library classes assume that every class has its own version of such methods 

#### The Right Way to Define equals 

Since the equals method is always inherited from the class Object, methods like the following simply overload it:  
However, this method should be overridden, not just overloaded: 

![7.1](/assets/images/object_oriented_programming/7.4.png)￼

The overridden version of equals must meet the following conditions 
- The parameter otherObject of type Object must be type cast to the given class (e.g., Employee) 
- However, the new method should only do this if otherObject really is an object of that class, and if otherObject is not equal to null 
- Finally, it should compare each of the instance variables of both objects 

#### Tip: getClass Versus instanceof 
Many authors suggest using the instanceof operator in the definition of equals 
- Instead of the getClass() method 
- The instanceof operator will return true if the object being tested is a member of the class for which it is being tested 
- However, it will return true if it is a descendent of that class as well 

Both the instanceof operator and the getClass() method can be used to check the class of an object 

However, the getClass() method is more exact

The instanceof operator simply tests the class of an object. but the getClass() method used in a test with == or != tests if two objects were created with the same class 


#### The instanceof Operator 
The instanceof operator checks if an object is of the type given as its second argument object instanceof ClassName 
- This will return true if object is of type ClassName, and otherwise return false 
- Note that this means it will return true if object is the type of any descendent class of ClassName 

#### The getClass() Method 

Every object inherits the same getClass() method from the Object class – This method is marked final, so it cannot be overridden  
An invocation of getClass() on an object returns a representation only of the class that was used with new to create the object 
- The results of any two such invocations can be compared with == or != to determine whether or not they represent the exact same class 

e.g)
(object1.getClass() == object2.getClass())


￼
￼





