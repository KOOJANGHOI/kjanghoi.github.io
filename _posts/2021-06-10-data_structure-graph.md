---
layout: post
title: Graph
subtitle: 
categories: [DataStructure]
tags: [ComputerScience]
---

## Graph
a graph G = (V, E) 

- V: a set of vertices (or nodes)
- E: a set of edges (or arcs), a pair (v, w) where v, w ∈ V 

### Terminology

#### directed graph (Digraph)

a graph with directed edges 

![7.1](/assets/images/data_structure/11.1.png)

#### edge (u, v)
- u is adjacent to v
- u is initial vertex of (u, v)
- v is terminal vertex of (u, v) 

#### degree of edges
in-degree of a vertex v 
- the number of edges with v as their terminal vertex 

out-degree of a vertex v 
- the number of edges with v as their initial vertex 

#### undirected graph
a graph with undirected edges 


### Graph representation

#### adjacency matrix
- A[u][v] = w if an edge exists between vertices u and v A[u][v] = 0 otherwise. 
- w = 1 or an arbitrary weight associated with edges 
- use a hash table of size V to store a mapping from vertex names to array indices 
- simple but Θ (V^2) space is needed
- appropriate for dense graphs with E approaching to (V^2). 

![7.1](/assets/images/data_structure/11.2.png)

#### adjacency list
- for each vertex, keep a list of adjacent vertices. 
- space requirement: O(E+V)
- appropriate for sparse graphs. 

![7.1](/assets/images/data_structure/11.3.png)

### Topological sort
ordering of vertices in a DAG (Directed Acyclic Graph), such that if there exists a path from vi to vj, then vj appears after vi 

**Example: a topological ordering of courses**

any course sequence that does not violate the prerequisite requirement 

#### algorithm
for each vertex v whose in-degree is zero, print v and remove v and its outgoing edges (which leads to decrementing the in-degree value of v’s adjacent vertices) 
- use either stack or queue to keep track of vertices with indegree =0 
- use adjacency list representation 

![7.1](/assets/images/data_structure/11.4.png)

![7.1](/assets/images/data_structure/11.5.png)

### Graph operation
Many graph problems solved using a search method. 
- Path from one vertex to another. 
- Is the graph connected? 
- Find a spanning tree. 
- Etc. commonly used search methods:  
	- Depth-first search (DFS) 
	- Breadth-first search (DFS)  


### Depth-first search (DFS) 

![7.1](/assets/images/data_structure/11.6.png)

#### Time complexity
- O(n2) when adjacency matrix used
- O(n+e) when adjacency lists used (e is number of edges) 

### Connected Components
as all vertices reachable from the start vertex (including the start vertex) are visited in depth first search, 

- start a depth-first search at any as yet unvisited vertex of the graph. 
- Newly visited vertices (plus edges between them) define a component. 
- Repeat until all vertices are visited. 


### Spanning tree
- Start a depth-first search at any vertex of the graph. 
- If graph is connected, the n-1 edges used to get to unvisited vertices define a spanning tree (depth- first spanning tree). 


### Breadth-first search (BFS)
Visit start vertex and put into a FIFO queue. 

And repeatedly remove a vertex from the queue, visit its unvisited adjacent vertices, put newly visited vertices into the queue. 


#### Time complexity
- Each visited vertex is put on (and so removed from) the queue exactly once. 
- When a vertex is removed from the queue, we examine its adjacent vertices. 
	- O(n) if adjacency matrix used
	- O(vertex degree) if adjacency lists used 
- Total time
	- O(mn), where m is number of vertices in the component that is searched (adjacency matrix) 
	- O(n + sum of component vertex degrees) (adj. lists) 
	- O(n + number of edges in component) 


### Shortest path algorithms
In many practical applications, we consider finding the shortest path from one vertex s to another t 

currently no algorithm can find the path from one source to one vertices (ie. s to t) any faster than finding the path from one source to all vertices 

#### BFS
**Unweighted single shortest path algorithm**

![7.1](/assets/images/data_structure/11.7.png)

#### Dijkstra’s algorithm
**Weighted single shortest path algorithm**


![7.1](/assets/images/data_structure/11.8.png)

![7.1](/assets/images/data_structure/11.9.png)




