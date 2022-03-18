---
layout: post
title: Recovery
subtitle: 
categories: [Database]
tags: [ComputerScience]
---

### Why recovery is needed
what causes a Transaction to fail

**A computer failure (system crash)**
A hardware or software error occurs in the computer system during transaction execution. 
If the hardware crashes, the contents of the computer’s internal memory may be lost. 

**A transaction or system error**
Some operation in the transaction may cause it to fail, such as integer overflow or division by zero. In addition, the user may interrupt the transaction during its execution. 

**Local errors or exception conditions detected by the transaction**
Certain conditions necessitate cancellation of the transaction. For example, a condition, such as insufficient account balance in a banking database, may cause a transaction, such as a fund withdrawal from that account, to be canceled. A programmed abort in the transaction causes it to fail. 

**Concurrency control enforcement**
The concurrency control method may decide to abort the transaction, to be restarted later, because several transactions are in a state of deadlock.

**Disk failure**
Some disk blocks may lose their data because of a read or write malfunction or because of a disk read/write head crash. This may happen during a read or a write operation of the transaction. 

**Physical problem**
This refers to an endless list of problems that includes power or air-conditioning failure, fire, theft, sabotage, overwriting disks or tapes by mistake, and mounting of a wrong tape by the operator. 


### System Log : Log or Journal
The log keeps track of all transaction operations that affect the values of database items.


- Needed to permit recovery from transaction failures. 
   - Kept on disk, so it is not affected by any type of failure except for disk or catastrophic failure. 
   - In addition, periodically backed up to archival storage (tape) to guard against such catastrophic failures. 
- update 마다 memory access 하지않고 buffer에 쓰고, buffer가 가득 차거나 commit 되면 거기 까지 log에 쓴다
   - page update의 반영보다 log buffer의 write가 빨라야 한다 (crash 시에 undo를 하기 위함)

If the system crashes, we can recover to a consistent database state by examining the log. 

It is possible to undo the effect of the write operations of a transaction T by tracing backward through the log and resetting all items changed by a write operation of T to their old_values. 

We can also redo the effect of the write operations of a transaction T  by tracing forward through the log and setting all items changed by a write operation of T (that did not get done permanently) to their new_values. 

### Commit Point
When all its operations that access the database have been executed successfully and the effect of all the transaction operations on the database has been recorded in the log.
  
Beyond the commit point, the transaction is said to be committed, and its effect is assumed to be permanently recorded in the database.  

The transaction then writes an entry [commit,T] into the log.  

**Roll Back transactions**
Needed for transactions that have a [start_transaction,T] entry into the log but no commit entry [commit,T] into the log. 

**Redoing transactions**
Transactions that have written their commit entry in the log must also have recorded all their write operations in the log

otherwise they would not be committed, so their effect on the database can be redone from the log entries.  
At the time of a system crash, only the log entries that have been written back to disk are considered in the recovery process because the contents of main memory may be lost.  

**Force writing a log**
Before a transaction reaches its commit point, any portion of the log that has not been written to the disk yet must now be written to the disk.  
This process is called force-writing the log file before committing a transaction. 










