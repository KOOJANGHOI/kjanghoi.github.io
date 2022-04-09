---
layout: post
title: 3.Adversarial Search and Game-Playing
subtitle: 
categories: [ArtificialIntelligence]
tags: [ComputerScience]
---

**Game playing can be effectively modeled as a search problem** 
- Game trees represent alternate computer/opponent moves 
- Evaluation functions estimate the quality of a given board configuration for the player 
- For many well-known games, computer algorithms based on the adversarial search outperform human world champions  


**Search versus Games** 
(Just)Search–no adversary 
- Solution is a method for finding goal or a path to goal 
- Some Heuristics techniques can find optimal solution 
- Evaluation function is an estimate of cost from start to goal through a given node 
- Examples: path finding, 8-puzzle 

**Games–adversary**
- Solution is strategy that specifies move for every possible opponent reply 
- In many cases, time limits force an approximate solution 
- Utility function is an evaluation about “goodness” of game  state 
- Examples: chess, checkers, Othello, Go  


**Partial Game Tree for Tic-Tac-Toe** 
![1.1](/assets/images/ai/3.1.png)


**Others**
- Minimax Algorithm 
- Alpha-Beta Pruning 


