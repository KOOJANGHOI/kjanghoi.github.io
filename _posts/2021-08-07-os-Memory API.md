---
layout: post
title: 8.Memory API
subtitle: 
categories: [OperatingSystem]
tags: [ComputerScience]
---

### Memory API
- malloc()
- sizeof()
- free()
- calloc()
- realloc()
- brk()
- sbrk()

![1.1](/assets/images/os/14.1.png)

#### Memory leak
Unused 이면서 not-freed 된 메모리로 인해서 out of memory 되면 프로그램은 죽는다.