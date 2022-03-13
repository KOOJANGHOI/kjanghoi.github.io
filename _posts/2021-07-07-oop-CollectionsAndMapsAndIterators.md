---
layout: post
title: Collections, Maps and Iterators
subtitle: 
categories: [Object-oriented programming]
tags: [ComputerScience]
---

### Collections
A Java collection is any class that holds objects and implements the Collection interface 
- For example, the ArrayList<T> class is a Java collection class, and implements all the methods in the Collection interface 
- Collections are used along with iterators 
- The Collection interface is the highest level of Java's framework for collection classes  

All of the collection classes discussed here can be found in package java.util 

![7.1](/assets/images/object_oriented_programming/13.1.png)

### Wildcards 
Classes and interfaces in the collection framework can have parameter type specifications that do not fully specify the type plugged in for the type parameter 
- Because they specify a wide range of argument types, they are known as wildcards 

![7.1](/assets/images/object_oriented_programming/13.2.png)

In the above example, the first argument is of type String, while the second argument can be an ArrayList<T> with any base type 

A bound can be placed on a wildcard specifying that the type used must be an ancestor type or descendent type of some class or interface 
- The notation <? extends String> specifies that the argument plugged in be an object of any descendent class of String 
- The notation <? super String> specifies that the argument plugged in be an object of any ancestor class of String 


### The Collection Framework 
The Collection<T> interface describes the basic operations that all collection classes should implement  

Since an interface is a type, any method can be defined with a parameter of type Collection<T> 
- That parameter can be filled with an argument that is an object of any class in the collection framework  

#### Method Headings in the Collection<T> Interface 

![7.1](/assets/images/object_oriented_programming/13.3.png)

![7.1](/assets/images/object_oriented_programming/13.4.png)

![7.1](/assets/images/object_oriented_programming/13.5.png)

![7.1](/assets/images/object_oriented_programming/13.6.png)

![7.1](/assets/images/object_oriented_programming/13.7.png)

![7.1](/assets/images/object_oriented_programming/13.8.png)

![7.1](/assets/images/object_oriented_programming/13.9.png)

![7.1](/assets/images/object_oriented_programming/13.10.png)

![7.1](/assets/images/object_oriented_programming/13.11.png)

![7.1](/assets/images/object_oriented_programming/13.12.png)

#### Collection Relationships 
There are a number of different predefined classes that implement the Collection<T> interface
- Programmer defined classes can implement it also 
- A method written to manipulate a parameter of type Collection<T> will work for all of these classes, either singly or intermixed 
- There are two main interfaces that extend the Collection<T> interface: The Set<T> interface and the List<T> interface  

Classes that implement the Set<T> interface do not allow an element in the class to occur more than once 
- The Set<T> interface has the same method headings as the Collection<T> interface, but in some cases the semantics (intended meanings) are different 
- Methods that are optional in the Collection<T> interface are required in the Set<T> interface 

Classes that implement the List<T> interface have their elements ordered as on a list 
- Elements are indexed starting with zero 
- A class that implements the List<T> interface allows elements to occur more than once 
- The List<T> interface has more method headings than the Collection<T> interface 
- Some of the methods inherited from the Collection<T> interface have different semantics in the List<T> interface  

#### Concrete Collections Classes 
The concrete class HashSet<T> implements the Set<T> interface, and can be used if additional methods are not needed 
- The HashSet<T> class implements all the methods in the Set<T> interface, and adds only constructors 
- The HashSet<T> class is implemented using a hash table 

The ArrayList<T> and Vector<T> classes implement the List<T> interface, and can be used if additional methods are not needed 
- Both the ArrayList<T> and Vector<T> classes implement all the methods in the interface List<T> 
- Either class can be used when a List<T> with efficient random access to elements is needed  

The concrete class LinkedList<T> is a concrete derived class of the abstract class AbstractSequentialList<T> 
- When efficient sequential movement through a list is needed, the LinkedList<T> class should be used 

The interface SortedSet<T> and the concrete class TreeSet<T> are designed for implementations of the Set<T> interface that provide for rapid retrieval of elements 
- The implementation of the class is similar to a binary tree, but with ways to do inserting that keep the tree balanced 

#### Differences Between ArrayList<T> and Vector<T> 
For most purposes, the ArrayList<T> and Vector<T> are equivalent 
- The Vector<T> class is older, and had to be retrofitted with extra method names to make it fit into the collection framework 
- The ArrayList<T> class is newer, and was created as part of the Java collection framework 
- The ArrayList<T> class is supposedly more efficient than the Vector<T> class also 

#### Pitfall: Omitting the <T> 
When the <T> or corresponding class name is omitted from a reference to a collection class, this is an error for which the compiler may or may not issue an error message (depending on the details of the code), and even if it does, the error message may be quite strange 

Look for a missing <T> or <ClassName> when a program that uses collection classes gets a strange error message or doesn't run correctly 

### The Map Framework 
The Java map framework deals with collections of ordered pairs 
- For example, a key and an associated value 

Objects in the map framework can implement mathematical functions and relations, so can be used to construct database classes  

The map framework uses the Map<T> interface, the AbstractMap<T> class, and classes derived from the AbstractMap<T> class  

![7.1](/assets/images/object_oriented_programming/13.13.png)

#### The Map<K,V> Interface 

![7.1](/assets/images/object_oriented_programming/13.14.png)

![7.1](/assets/images/object_oriented_programming/13.15.png)

![7.1](/assets/images/object_oriented_programming/13.16.png)


#### Concrete Map Classes 
Normally you will use an instance of a Concrete Map Class 

HashMap<K,V> Class
- Internally, the class uses a hash table
- No guarantee as to the order of elements placed in the map. 
- If you require order then you should use the TreeMap<K,V> class or the LinkedHashMap<K,V> class 


### Iterators 
An iterator is an object that is used with a collection to provide sequential access to the collection elements 
- This access allows examination and possible modification of the elements  

An iterator imposes an ordering on the elements of a collection even if the collection itself does not impose any order on the elements it contains 
- If the collection does impose an ordering on its elements, then the iterator will use the same ordering  

#### The Iterator<T> Interface 
Java provides an Iterator<T> interface 
- Any object of any class that satisfies the Iterator<T> interface is an Iterator<T> 

An Iterator<T> does not stand on its own 
- It must be associated with some collection object using the method iterator 
- If c is an instance of a collection class (e.g., HashSet<String>), the following obtains an iterator for c: 

![7.1](/assets/images/object_oriented_programming/13.17.png)

#### Methods in the Iterator<T> Interface 

![7.1](/assets/images/object_oriented_programming/13.18.png)

![7.1](/assets/images/object_oriented_programming/13.19.png)


#### Using an Iterator with a HashSet<T> Object 
A HashSet<T> object imposes no order on the elements it contains 

However, an iterator will impose an order on the elements in the hash set 
- That is, the order in which they are produced by next() 
- Although the order of the elements so produced may be duplicated for each program run, there is no requirement that this must be the case 

e.g)

![7.1](/assets/images/object_oriented_programming/13.20.png)

![7.1](/assets/images/object_oriented_programming/13.21.png)

![7.1](/assets/images/object_oriented_programming/13.22.png)

#### Tip: For-Each Loops as Iterators 
Although it is not an iterator, a for-each loop can serve the same purpose as an iterator 
- A for-each loop can be used to cycle through each element in a collection 

For-each loops can be used with any of the collections discussed here 

e.g)

![7.1](/assets/images/object_oriented_programming/13.23.png)

![7.1](/assets/images/object_oriented_programming/13.24.png)
￼
￼





