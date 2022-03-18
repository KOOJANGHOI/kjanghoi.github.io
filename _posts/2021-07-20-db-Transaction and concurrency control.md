---
layout: post
title: Transaction and concurrency control
subtitle: 
categories: [Database]
tags: [ComputerScience]
---

### 목차
- Transaction
- Introduction to Concurrency Control
- Serializability
- Concurrency Control Techniques 

### Transaction
Series of actions carried out by the user or application, which accesses or changes the contents of a database (read or write)

- (수행의 단위) Logical unit of work on the database 
- Transforms a database from one consistent state to another, although consistency may be violated during transaction 

#### Success or Failure
**Transaction can have one of two outcomes**

Success
- a transaction commits and the database reaches a new consistent state
- The committed transaction cannot be aborted 

Failure
- a transaction aborts, and the database must be restored to the consistent state before the transaction started 
- The transaction is rolled back or undone

### ACID properties 
: DBMS make each transaction preserve these properties using concurrency control and recovery facilities 

**Atomicity**

a transaction’s changes are atomic ('all or nothing' property) 
- A transaction is an atomic unit of work that is either completed in its entirety or not done at all 
- For recovery purposes, the system needs to keep track of when the transaction starts, terminates, and commits or aborts

**Consistency**

a transaction must transform a database from one consistent state to another 

**Isolation**

each transaction is isolated from the concurrent activity of others and, consequently, from the failure of others 

**Durability**

effects of a committed transaction are permanent and must not be lost because of a later failure  

### Read and Write operations
Basic unit of data transfer from the disk to the computer main memory is one block. 

In general, a data item (what is read or written) will be the field of some record in the database, although it may be a larger unit such as a record or even a whole block. 

`read_item(X)`

Reads a database item named X into a program variable. 

- Find the address of the disk block that contains item X. 
- Copy that disk block into a buffer in main memory (if that disk block is not already in some main memory buffer).
- Copy item X from the buffer to the program variable named X. 


`write_item(X)`

Writes the value of program variable X into the database item named X. 

- Find the address of the disk block that contains item X. 
- Copy that disk block into a buffer in main memory (if that disk block is not already in some main memory buffer). 
- Copy item X from the program variable named X into its correct location in the buffer. 
- Store the updated block from the buffer back to disk (either immediately or at some later point in time). 

![1.1](/assets/images/database/9.1.png)

### Concurrency Control 
Process of managing simultaneous transactions on the database without having them interfere with one another. mainly focuses on the isolation property of transactions 

Needs for concurrency control 
- Prevents the interference when two or more transactions are accessing the database simultaneously and at least one is updating data 
- Although two transactions may be correct in themselves, interleaving of operations may produce an incorrect result  

Potential problems caused by concurrency 
- Lost update problem 
- Uncommitted dependency problem 
- Inconsistent analysis problem  

#### Lost update problem 
Successfully completed update is overridden by another transaction 

This occurs when two transactions that access the same database items have their operations interleaved in a way that makes the value of some database item incorrect. 

![1.1](/assets/images/database/9.2.png)

#### Uncommitted Dependency Problem 
The updated item is accessed by another transaction before it is changed back to its original value.  

This occurs when one transaction can see intermediate results of another transaction before it has committed 

![1.1](/assets/images/database/9.3.png)

#### Inconsistent Analysis Problem 
Sometimes referred to as a dirty read or unrepeatable read 

If one transaction is calculating an aggregate summary function on a number of records while other transactions are updating some of these records, the aggregate function may calculate some values before they are updated and others after they are updated. 

![1.1](/assets/images/database/9.4.png)

### Serializability 
The objective of concurrency control is to schedule transactions in such a way as to avoid any interference 

Could run transactions serially, but this limits the degree of concurrency or parallelism in a system 
- Schedule: a sequence of reads and writes by a set of concurrent transactions 
- Serial schedule: a schedule where the operations of each transaction are executed consecutively without any interleaved operations from other transactions 
- Non-serial schedule: a schedule where the operations from a set of concurrent transactions are interleaved 

The objective of serializability is to find non-serial schedules that allow transactions to execute concurrently without interfering with one another 

In other words, want to find non-serial schedules that are equivalent to some serial schedule 
- Such a schedule is called serializable 

Intuitively, two schedules s1 and s2 are equivalent if 
- Every read in s2 accesses the same value as the corresponding read in s1 
- The last values written into the database for every data item should be the same for s1 and s2 

Being serializable implies that the schedule is a correct schedule. 
- It will leave the database in a consistent state. 
- The interleaving is appropriate and will result in a state as if the transactions were serially executed, yet will achieve efficiency due to concurrent execution. 

For Serializability, ordering of read/writes is important 
- If two transactions either read or write completely separate data items, they do not conflict and the order is not important 
- If two transactions only read the same data item, they do not conflict and the order is not important 
- If one transaction writes a data item and another reads or writes the same data item, the order is important  (같은 data에 접근하나 하나 이상의 transaction이 write 할때) 

**Precedence graph**

: A schedule s is serializable iff there is no cycle in the precedence graph 

![1.1](/assets/images/database/9.5.png)

### Concurrency Control Techniques 
Control concurrent transactions executed in a serializable schedule 

Typical techniques 
- Two-phase locking protocol
- Timestamp ordering technique
- Optimistic technique 

#### Locking 
: A transaction must claim a read(shared) or write(exclusive) lock on a data item before read or write 

Most widely used approach in practical systems to ensure serializability 

Basic rules for locking 
- If a transaction has read lock on an item, it can read but not update the item 
- If a transaction has write lock on an item, it can both read and update the item 

![1.1](/assets/images/database/9.6.png)

Incorrect Locking Schedule 

![1.1](/assets/images/database/9.7.png)

- The problem is that the transactions release locks too soon, resulting in loss of total independence and atomicity 
- To guarantee serializability, need an additional protocol concerning the positioning of lock and unlock operations in every transaction 


#### Two-Phase Locking (2PL) Protocol 
: A transaction follows the 2PL protocol if all locking operations precede the first unlock operation in the transaction 

Two phases for transaction 
- Growing phase: acquires all locks but cannot release 
- Shrinking phase: releases locks but cannot acquire any new locks

Any schedule having the only transactions following the 2PL protocol is serializable

**Preventing Lost Update Problem** 
![1.1](/assets/images/database/9.8.png)

**Preventing Uncommitted Dependency Problem** 
![1.1](/assets/images/database/9.9.png)

**Preventing the Inconsistent Analysis Problem**
![1.1](/assets/images/database/9.10.png)

**Shortcomings of 2PL protocol**
- Large locking overhead 
- Deadlock problem 

**Granularity of Locks**

Unit of objects for locking chosen in 2PL protocol Ranging from coarse to fine: 
- Entire database
- File
- Page (or area or database spaced)
- Record
- Field value of a record 

**Tradeoff** 
- The coarser, the lower the degree of concurrency 
- The finer, the more locking information that is needed to be stored 
- Best item size depends on the types of transactions 

**Timestamp Ordering Technique**

Transactions are globally ordered so that older transactions with smaller timestamps get priority in the event of conflict 

A unique identifier created by a DBMS that indicates the relative starting time of a transaction 

Generated by using system clock at the time a transaction starts, or by incrementing a logical counter every time a transaction starts 

Read/write proceeds only if the last update on that data item was carried by an older transaction 

Otherwise, the transaction requesting read/write is restarted and given a new timestamp 

Also, timestamps for data items: read the item 
- Read-timestamp: timestamp of the last transaction to read the item
- Write-timestamp: timestamp of the last transaction to write the item 


Examples) Consider a transaction T with timestamp ts(T) 

When T issues read(x): ts(T) < write_timestamp(x): 
- x has already been updated by a younger (later) transaction 
- The transaction must be aborted and restarted with a new timestamp  

When T issues write(x): ts(T) < read_timestamp(x)
- x has already been read by a younger transaction 
- The transaction must be aborted and restarted with a new timestamp 

When T issues write(x): ts(T) < write_timestamp(x): 
- x has already been written by a younger transaction 
- There is no conflict: Thomas' Write Rule 
- Write can safely be ignored
- Otherwise, the operation is accepted and executed, and then the corresponding ts(T) is updated

![1.1](/assets/images/database/9.11.png)

**Summary**

Advantages
- No locking 
- No deadlock 

Problems
- Checking timestamps for every read/write operation is time consuming
- Each timestamp requires additional storage overhead per data item 
- The cascading rollback is devastating 
   - The rollback of a transaction can lead to a cascading rollback of many other committed and uncommitted transactions 
   - If T1 is rolled back, T2 already used data written by T1 should be also rolled back, etc.  

**Optimistic Technique** 
: Based on assumption that conflict is rare and more efficient to let transactions proceed without delays to ensure serializability 

- At commit, check is made to determine whether conflict has occurred 
- If there is a conflict, the transaction must be rolled back and restarted 
- Potentially allows greater concurrency than previous techniques 


**Three phases**

Read phase 
- Extends from start until immediately before commit 
- Reads values from the database and stores them in a local copy 
- Applies updates to a local copy of the data 

Validation phase 
- Follows the read phase 
- Checks this transaction does not violate any validation condition 

Write phase 
- Follows successful validation phase for update transactions
- Applies updates made to a local copy to the database 

Problems
- Maintenance of a local copy 
- Maintenance and comparisons of the read and write set 
- Management of the information about the already committed transactions 

