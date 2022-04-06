---
layout: post
title: 14.Paging (Smaller Table)
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

#### One page table for every process in the system
- Large page size cause internal fragmentation
    - 32bit address space with 16KB pages and 4B page table entry
    - Page table size = 1MB
        - Page offset (per byte) = log16K = 14
        - Entries # = 32 - 14 = 18
        - Size = 2^18 * 4B = 1MB
- Small page size makes too much memory for page table
    - 32bit address space with 4KB pages and 4B page table entry
    - Page table size = 4MB
        - Page offset = log4K = 12
        - Entries # = 32 - 12 = 20
        - Size = 2^20 * 4B = 4MB


#### Reduce overhead of page tables

**Hybrid Approach: Paging and Segments**

- 논리적 세그먼트 별 페이지 테이블을 가진다.
    - Each process has three page tables associated with it
    - Base register -> hold physical address of page table
    - Bound register -> indicate the end of page table
- If we have a large but sparsely-used heap, we can still end up with a lot of page table waste. (Still cause fragmentation)

![1.1](/assets/images/os/20.1.png)


#### Multi-level Page Tables 
- Page table을 linear 가 아닌 tree 구조로 관리한다.
- Advantage
    - Only allocates page-table space in proportion to the amount of address space you are using. 
    - The OS can grab the next free page when it needs to allocate or grow a page table. 
- Disadvantage
    - Multi-level table is a small example of a time-space trade-off.
    - Complexity

![1.1](/assets/images/os/20.2.png)
￼

#### X86_64: Four-level page table

![1.1](/assets/images/os/20.3.png)