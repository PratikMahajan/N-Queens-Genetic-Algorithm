# N-Queens Genetic-Algorithm
Team Member - Pratik Mahajan, Mansi Raghuwanshi, Varad Desai

## Introduction
Genetic Algorithms are a family of algorithms whose purpose is to solve problems more efficiently than usual standard algorithms by using natural science metaphors with parts of the algorithm being strongly inspired by natural evolutionary behavior; such as the concept of mutation, crossover and natural selection.

## Problem Statement
In 1848, A German Chess player Max Bezzel composed the 8-Queens Problem which aims to place 8 Queens in the chess board in such a way that no two Queens can attack each other. In 1850 Franz Nauck gave the 1st solution to this problem and generalized the problem to N-Queen problem for N non- attacking Queens on an N x N Chessboard. Time complexity of an N-Queen problem is O(n!). Here, we are proposing a heuristic approach to obtain the best solutions for this problem. We are depicting all the arrangements of an N x N board as an N-tuple (c1, c2, c3… cN), where ci represents the position of the queen to be in i th column and c th row. Fig.1 shows an arrangement of 8 x 8 chessboard and its 8-tuple representation.

## How to run the project
Run the RunGeneticNQueens.java (Main for the program )
Note the mutation's are randomly generated so in order to test this please uncomment the rand.setSeed() in GeneticAlgorithm.java 
Random.setSeed(20) -- will always generate the same random values and is introduced just for testing the genetic
algorithm , since otherwise it always generates random population and chromosomes and testing with the random population is very difficult

##Test cases 
Random Seed has been set to 20 for testing purpose. Please comment Line 95-96 in GeneticAlgorithm.java to get correct output for main()


## References
1. https://developers.google.com/optimization/cp/queens
2. https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/
3. https://arxiv.org/pdf/1802.02006.pdf
4. https://kushalvyas.github.io/gen_8Q.html
5. http://mnemstudio.org/genetic-algorithms-n-queens-example-1.htm
6. https://www.kaggle.com/mrknoot/genetic-algorithms-solving-the-n-queens-problem
7. https://datajenius.com/articles/solving-n-queens-with-genetic-algorithms
8. https://ieeexplore.ieee.org/document/6802550