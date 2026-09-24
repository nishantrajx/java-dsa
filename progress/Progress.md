# DSA Progress

Personal progress tracker for my Java implementation of **Striver's A2Z DSA sheet**. The repository was restarted from a fresh A2Z starting point on 24 September 2026.

> **Progress rule:** An item is marked complete only after I have studied it, attempted it, implemented or understood it, tested it, and reviewed it where applicable.

Archived work is kept as learning history and is not counted toward this journey.

Jump to: [Checklist](#checklist) · [Revision Tracker](#revision-tracker) · [Milestones](#milestones) · [Daily Log](#daily-log)

## Current journey

This is the only place that holds the current position and counts. Update it when an item is completed.

| Metric | Status |
|---|---|
| Start date             | 24 September 2026            |
| Language               | Java                         |
| Roadmap                | Striver's A2Z DSA, 20 steps  |
| Current step           | 01 — Beginner Problems       |
| Current section        | 04 — Patterns                |
| Current problem        | Pattern 1                    |
| Coding problems solved | 0 / 448                      |
| Lessons completed      | 0 / 47                       |
| Current streak         | 0 days                       |
| Longest streak         | 0 days                       |
| Contests               | 16 placeholders, not counted |

Sheet entries: **495 (448 coding problems + 47 lessons)**. Contest placeholders: **16**, not counted.

### Check the counts

Run from the repository root. The checklist is the source of truth, so these numbers should match the table above:

```bash
grep -c "^- \[x\] .*[^)]$" progress/Progress.md   # completed coding problems (lines not ending in "(lesson)")
grep -c "^- \[x\] .*(lesson)$" progress/Progress.md  # completed lessons
grep -c "^- \[ \]" progress/Progress.md          # items still open

```

## Status legend

| Mark | Meaning |
|---|---|
| `[ ]`         | Not started                                                          |
| `[x]`         | Completed                                                            |
| `[R]`         | Needs revision. It stays visible until reviewed again. |

An item marked `[R]` is tracked in the [Revision Tracker](#revision-tracker) until it has been reviewed again.

## Revision tracker

| Problem Reason Revision date Status Notes  |   |   |   |   |
| ------------------------------------------ | - | - | - | - |
|                                            |   |   |   |   |

## Milestones

Coding problems solved:

- [ ] 1
- [ ] 10
- [ ] 25
- [ ] 50
- [ ] 100
- [ ] 200
- [ ] 300
- [ ] 400
- [ ] 448, the whole roadmap

## Session log

### 24 September 2026: repository setup

- [x] Rebuild the A2Z repository structure
- [x] Move previous work into `archive/`
- [x] Update README
- [x] Update Progress.md
- [ ] Commit and push the repository structure

Next: Pattern 1 (Rectangular Star Pattern). Status: not started.

## Daily log

One row per meaningful study or coding session. Approach, complexity and edge cases go in each Java file's header comment.

| Date Step Section Item Code added Status Notes  |                      |          |           |    |             |                                                      |
| ----------------------------------------------- | -------------------- | -------- | --------- | -- | ----------- | ---------------------------------------------------- |
| 2026-09-24                                      | 01 Beginner Problems | Patterns | Pattern 1 | No | Not started | Repository restarted from a fresh A2Z starting point |

## GitHub push journey

A push should represent real progress: studying, coding, documenting, committing, and pushing regularly. Empty commits are never used to keep a streak.

## Archive

`archive/old-a2z/` holds the previous A2Z starting point and `archive/pre-a2z/` holds earlier programming and DSA work. Neither is counted toward this journey.

## Progress principle

Consistency matters more than daily volume. A completed problem means I understood what was asked, attempted it independently, can explain the approach, implemented and tested it, understand its time and space complexity, and recorded what I learned.

The goal is not more checkmarks. It is to get better at solving problems on my own.

## Checklist

## 01 — Beginner Problems

### 01 — Fundamentals of Programming

- [ ] Breaking The Myth (lesson)
- [ ] Programming and What Are Computers? (lesson)
- [ ] How to Think Like a Programmer (lesson)
- [ ] Flowcharts and Pseudocode (lesson)
- [ ] Flowchart Problem-Solving (lesson)
- [ ] Dry Runs, Edge Cases and Debugging (lesson)
- [ ] Programming Languages and Choosing a Path (lesson)

### 02 — Language Basics

- [ ] Learn C++ (lesson)
- [ ] Learn Java (lesson)
- [ ] Learn Python (lesson)

### 03 — Logic Building (Patterns)

- [ ] Easy and Medium (lesson)
- [ ] Hard (lesson)

### 04 — Patterns

- [ ] Pattern 1
- [ ] Pattern 2
- [ ] Pattern 3
- [ ] Pattern 4
- [ ] Pattern 5
- [ ] Pattern 6
- [ ] Pattern 7
- [ ] Pattern 8
- [ ] Pattern 9
- [ ] Pattern 10
- [ ] Pattern 11
- [ ] Pattern 12
- [ ] Pattern 13
- [ ] Pattern 14
- [ ] Pattern 15
- [ ] Pattern 16
- [ ] Pattern 17
- [ ] Pattern 18
- [ ] Pattern 19
- [ ] Pattern 20
- [ ] Pattern 21
- [ ] Pattern 22

### 05 — Time Complexity

- [ ] Theory with examples (lesson)

### 06 — Standard Libraries & Collections

- [ ] STL (lesson)
- [ ] Java Collections (lesson)
- [ ] Python Libraries Part 1 (lesson)
- [ ] Python Libraries Part 2 (lesson)

### 07 — Concept Basics

- [ ] Basic Maths (lesson)
- [ ] Basic Arrays (lesson)
- [ ] Basic Hashing (lesson)
- [ ] Basic String (lesson)

### 08 — Basic Maths

- [ ] Count all Digits of a Number
- [ ] Count number of odd digits in a number
- [ ] Reverse a number
- [ ] Palindrome Number
- [ ] Return the Largest Digit in a Number
- [ ] Factorial of a given number
- [ ] Check if the Number is Armstrong
- [ ] Check for Perfect Number
- [ ] Check for Prime Number
- [ ] Count of Prime Numbers till N
- [ ] GCD of Two Numbers
- [ ] LCM of two numbers
- [ ] Divisors of a Number

### 09 — Basic Arrays

- [ ] Sum of Array Elements
- [ ] Count of odd numbers in Array
- [ ] Check if the Array is Sorted I
- [ ] Reverse an array

### 10 — Basic Hashing

- [ ] Highest Occurring Element in an Array
- [ ] Second Highest Occurring Element
- [ ] Sum of Highest and Lowest Frequency

### 11 — Basic Strings

- [ ] Reverse a String II
- [ ] Palindrome Check
- [ ] Largest Odd Number in a String
- [ ] Longest Common Prefix
- [ ] Isomorphic Strings
- [ ] Rotate String
- [ ] Valid Anagram
- [ ] Sort Characters by Frequency

### 12 — Basic Recursion

- [ ] Recursion Theory (lesson)
- [ ] Recursion Concepts with Parameters (lesson)
- [ ] Sum of First N Numbers
- [ ] Factorial of a Given Number
- [ ] Sum of Array Elements II
- [ ] Reverse a String I
- [ ] Check if String is Palindrome or Not
- [ ] Check if a Number is Prime or Not
- [ ] Reverse an array 2
- [ ] Check if the Array is Sorted II
- [ ] Sum of Digits in a Given Number
- [ ] Fibonacci Number

## 02 — Sorting

### 01 — Algorithms

- [ ] Selection Sort
- [ ] Bubble Sort
- [ ] Insertion Sorting
- [ ] Merge Sorting
- [ ] Quick Sorting
- [ ] Recursive Bubble Sort
- [ ] Recursive Insertion Sort

## 03 — Arrays

### 01 — Fundamentals

- [ ] Linear Search
- [ ] Largest Element
- [ ] Second Largest Element
- [ ] Maximum Consecutive Ones
- [ ] Left Rotate Array by One
- [ ] Left Rotate Array by K Places

### 02 — Logic Building

- [ ] Move Zeros to End
- [ ] Remove duplicates from sorted array
- [ ] Find missing number
- [ ] Union of two sorted arrays
- [ ] Intersection of two sorted arrays

### 03 — FAQs (Medium)

- [ ] Majority Element I
- [ ] Leaders in an Array
- [ ] Rearrange array elements by sign
- [ ] Print the matrix in spiral manner
- [ ] Pascal's Triangle I
- [ ] Pascal's Triangle II
- [ ] Pascal's Triangle III
- [ ] Rotate matrix by 90 degrees
- [ ] Set Matrix Zeroes
- [ ] Two Sum
- [ ] 3 Sum
- [ ] 4 Sum
- [ ] Sort an array of 0's 1's and 2's
- [ ] Kadane's Algorithm
- [ ] Next Permutation

### 04 — FAQs (Hard)

- [ ] Majority Element II
- [ ] Find the repeating and missing number
- [ ] Count Inversions
- [ ] Reverse Pairs
- [ ] Maximum Product Subarray in an Array
- [ ] Merge two sorted arrays without extra space

### 05 — Contest

Contest placeholder. Not counted until a real contest question is added.

## 04 — Hashing

### 01 — Theory

- [ ] Basic Hashing (lesson)

### 02 — FAQs

- [ ] Longest Consecutive Sequence in an Array
- [ ] Longest subarray with sum K
- [ ] Largest Subarray with Sum 0
- [ ] Count subarrays with given sum
- [ ] Count subarrays with given xor K

### 03 — Contest

Contest placeholder. Not counted until a real contest question is added.

## 05 — Binary Search

### 01 — Fundamentals

- [ ] Search X in sorted array
- [ ] Lower Bound
- [ ] Upper Bound

### 02 — Logic Building

- [ ] Search insert position
- [ ] Floor and Ceil in Sorted Array
- [ ] First and last occurrence
- [ ] Search in Rotated Sorted Array I
- [ ] Search in Rotated Sorted Array II
- [ ] Find minimum in Rotated Sorted Array
- [ ] Find out how many times the array is rotated
- [ ] Single element in sorted array
- [ ] Count Occurrences in a Sorted Array

### 03 — On Answers

- [ ] Find square root of a number
- [ ] Find Nth root of a number
- [ ] Find the smallest divisor
- [ ] Koko eating bananas
- [ ] Minimum days to make M bouquets
- [ ] Capacity to Ship Packages Within D Days
- [ ] Kth Missing Positive Number
- [ ] Painter's Partition

### 04 — FAQs

- [ ] Aggressive Cows
- [ ] Book Allocation Problem
- [ ] Find peak element
- [ ] Median of 2 sorted arrays
- [ ] Kth element of 2 sorted arrays
- [ ] Minimize Max Distance to Gas Station
- [ ] Split array - largest sum

### 05 — 2D Arrays

- [ ] Find row with maximum 1's
- [ ] Search in a 2D Matrix
- [ ] Search in 2D matrix - II
- [ ] Find Peak Element - II
- [ ] Matrix Median

### 06 — Contest

Contest placeholder. Not counted until a real contest question is added.

## 06 — Strings (Basic and Medium)

### 01 — Parentheses

- [ ] Remove Outermost Parentheses
- [ ] Maximum Nesting Depth of the Parentheses

### 02 — String Conversions

- [ ] Roman to Integer
- [ ] String to Integer (atoi)

### 03 — Substring Problems

- [ ] Count Number of Substrings (lesson)
- [ ] Longest Palindromic Substring
- [ ] Sum of Beauty of All Substrings

## 07 — Recursion

### 01 — Implementation Problems

- [ ] Pow(x,n)
- [ ] Generate Parentheses
- [ ] Power Set
- [ ] Count Good Numbers
- [ ] Reverse a Stack

### 02 — Subsequence Pattern Problems

- [ ] Learn All Patterns of Subsequences (Theory) (lesson)
- [ ] Check if there exists a subsequence with sum K
- [ ] Count all subsequences with sum K
- [ ] Generate Binary Strings Without Consecutive 1s

### 03 — FAQs (Medium)

- [ ] Combination Sum
- [ ] Combination Sum II
- [ ] Subsets I
- [ ] Subsets II
- [ ] Combination Sum III

### 04 — Hard

- [ ] Letter Combinations of a Phone Number

### 05 — FAQs (Hard)

- [ ] Palindrome partitioning
- [ ] Word Search
- [ ] N Queen
- [ ] Rat in a Maze
- [ ] M Coloring Problem
- [ ] Sudoku Solver
- [ ] Expression Add Operators

### 06 — Contest

Contest placeholder. Not counted until a real contest question is added.

## 08 — Linked-List

### 01 — Fundamentals (Single LL)

- [ ] Introduction to Singly LinkedList (lesson)
- [ ] Traversal in Linked List
- [ ] Deletion in Linked List (lesson)
- [ ] Insertion in Linked List (lesson)
- [ ] Deletion of the head of LL
- [ ] Deletion of the tail of Linked List
- [ ] Deletion of the Kth element of Linked List
- [ ] Delete the element with value X
- [ ] Insertion at the head of Linked List
- [ ] Insertion at the tail of Linked List
- [ ] Insertion at the Kth position of Linked List
- [ ] Insertion before the value X in Linked List
- [ ] Find the length of the Linked List
- [ ] Search in Linked List

### 02 — Fundamentals (Doubly LL)

- [ ] Introduction to Doubly LL (lesson)
- [ ] Deletion in Doubly LL (lesson)
- [ ] Insertion in DLL (lesson)
- [ ] Convert Array to Doubly Linked List
- [ ] Delete Tail of Doubly Linked List
- [ ] Delete Kth Element of Doubly Linked List
- [ ] Removing given node in Doubly Linked List
- [ ] Insert node before head in Doubly Linked List
- [ ] Insert node before tail in Doubly Linked List
- [ ] Insert node before (kth node) in Doubly Linked List
- [ ] Insert before given node in Doubly Linked List
- [ ] Delete head of Doubly Linked List
- [ ] Reverse a Doubly Linked List

### 03 — Logic Building

- [ ] Add two numbers in Linked List
- [ ] Segregate odd and even nodes in Linked List
- [ ] Sort a Linked List of 0's 1's and 2's
- [ ] Remove Nth node from the back of the LL
- [ ] Reverse a LL

### 04 — FAQs (Medium)

- [ ] Add one to a number represented by LL
- [ ] Find Middle of Linked List
- [ ] Delete the middle node in LL
- [ ] Check if LL is palindrome or not
- [ ] Find the intersection point of Y LL
- [ ] Detect a loop in LL
- [ ] Find the starting point in LL
- [ ] Length of loop in LL

### 05 — FAQs (Hard)

- [ ] Reverse LL in group of given size K
- [ ] Rotate a LL
- [ ] Merge two Sorted Lists
- [ ] Flattening of LL
- [ ] Sort LL
- [ ] Clone a LL with random and next pointer

### 06 — FAQs (DLL)

- [ ] Delete all occurrences of a key in DLL
- [ ] Remove duplicates from sorted DLL
- [ ] Find Pairs with Given Sum in Doubly Linked List

### 07 — Contest

Contest placeholder. Not counted until a real contest question is added.

## 09 — Bit Manipulation

### 01 — Theory

- [ ] Introduction to Bits and Tricks (lesson)

### 02 — Bit Fundamentals

- [ ] Check if the i-th bit is Set or Not
- [ ] Check if a Number is Odd or Not
- [ ] Check if a Number is Power of 2 or Not
- [ ] Count the Number of Set Bits
- [ ] Set/Unset the rightmost unset bit (lesson)
- [ ] Swap Two Numbers

### 03 — Problems

- [ ] Minimum Bit Flips to Convert Number
- [ ] Single Number I
- [ ] Single Number II
- [ ] Single Number III
- [ ] Divide two numbers without multiplication and division
- [ ] Power Set — Bit Manipulation
- [ ] XOR of numbers in a given range

### 04 — Contest

Contest placeholder. Not counted until a real contest question is added.

## 10 — Greedy Algorithms

### 01 — Easy

- [ ] Assign Cookies
- [ ] Lemonade Change
- [ ] Fractional Knapsack
- [ ] Jump Game I

### 02 — Scheduling and Interval Problems

- [ ] Shortest Job First
- [ ] Job sequencing Problem
- [ ] N meetings in one room
- [ ] Non-overlapping Intervals
- [ ] Insert Interval
- [ ] Merge Intervals
- [ ] Minimum number of platforms required for a railway

### 03 — Hard

- [ ] Valid Paranthesis Checker
- [ ] Candy
- [ ] Jump Game II

### 04 — Contest

Contest placeholder. Not counted until a real contest question is added.

## 11 — Sliding Window / 2 Pointer

### 01 — Pattern and Template

- [ ] Theory (lesson)

### 02 — Constant Window

- [ ] Maximum Points You Can Obtain from Cards

### 03 — Longest and Smallest Window Problems

- [ ] Longest Substring Without Repeating Characters
- [ ] Max Consecutive Ones III
- [ ] Fruit Into Baskets
- [ ] Longest Substring with At Most K Distinct Characters
- [ ] Longest Repeating Character Replacement
- [ ] Minimum Window Substring
- [ ] Minimum Window Subsequence

### 04 — Counting Subarrays / Substrings Problems

- [ ] Number of Substrings Containing All Three Characters
- [ ] Binary Subarrays with Sum
- [ ] Count Number of Nice Subarrays
- [ ] Subarrays with K Different Integers

### 05 — Contest

Contest placeholder. Not counted until a real contest question is added.

## 12 — Stack / Queues

### 01 — Implementation

- [ ] Implementation using different DS (lesson)
- [ ] Implement Stack using Arrays
- [ ] Implement Queue using Arrays
- [ ] Implement Stack using Queue
- [ ] Implement Queue using Stack
- [ ] Implement stack using Linkedlist
- [ ] Implement queue using Linkedlist
- [ ] Balanced Paranthesis

### 02 — Prefix, Infix and Postfix Conversions

- [ ] Infix to Postfix Conversion
- [ ] Infix to Prefix Conversion
- [ ] Prefix to Infix Conversion
- [ ] Prefix to Postfix Conversion
- [ ] Postfix to Infix Conversion
- [ ] Postfix to Prefix Conversion

### 03 — Monotonic Stack

- [ ] Next Greater Element
- [ ] Next Greater Element 2
- [ ] Asteroid Collision
- [ ] Sum of Subarray Minimums
- [ ] Sum of Subarray Ranges
- [ ] Remove K Digits
- [ ] Next Smaller Element

### 04 — FAQs

- [ ] Implement Min Stack
- [ ] Sliding Window Maximum
- [ ] Trapping Rainwater
- [ ] Largest rectangle in a histogram
- [ ] Maximum Rectangles
- [ ] Stock span problem
- [ ] Celebrity Problem
- [ ] LRU Cache
- [ ] LFU Cache
- [ ] Number of Greater Elements to the Right

### 05 — Contest

Contest placeholder. Not counted until a real contest question is added.

## 13 — Binary Trees

### 01 — Theory / Traversals

- [ ] Introduction (lesson)
- [ ] Inorder Traversal
- [ ] Preorder Traversal
- [ ] Postorder Traversal
- [ ] Level Order Traversal
- [ ] Pre, Post, Inorder in one traversal

### 02 — Medium Problems

- [ ] Maximum Depth in BT
- [ ] Check if two trees are identical or not
- [ ] Check for balanced binary tree
- [ ] Diameter of Binary Tree
- [ ] Maximum path sum
- [ ] Check for symmetrical BTs
- [ ] Children Sum Property in Binary Tree

### 03 — FAQs

- [ ] Zig Zag or Spiral Traversal
- [ ] Boundary Traversal
- [ ] Vertical Order Traversal
- [ ] Top View of BT
- [ ] Bottom view of BT
- [ ] Right/Left View of BT
- [ ] Print root to leaf path in BT
- [ ] LCA in BT
- [ ] Maximum Width of BT
- [ ] Print all nodes at a distance of K in BT
- [ ] Minimum time taken to burn the BT from a given Node
- [ ] Count total nodes in a complete BT
- [ ] Flatten Binary Tree to Linked List

### 04 — Construction Problems

- [ ] Requirements needed to construct a unique BT
- [ ] Construct a BT from Preorder and Inorder
- [ ] Construct a BT from Postorder and Inorder
- [ ] Serialize and De-serialize BT

### 05 — Traversal in Constant Space

- [ ] Morris Inorder Traversal
- [ ] Morris Preorder Traversal

### 06 — Contest

Contest placeholder. Not counted until a real contest question is added.

## 14 — Binary Search Trees

### 01 — Theory and Basics

- [ ] Introduction to BST (lesson)
- [ ] Search in BST
- [ ] Floor and Ceil in a BST
- [ ] Find Min/Max in BST (lesson)

### 02 — Medium

- [ ] Insert a given node in BST
- [ ] Delete a node in BST
- [ ] Kth Smallest and Largest element in BST
- [ ] Check if a tree is a BST or not
- [ ] LCA in BST
- [ ] Construct a BST from a preorder traversal
- [ ] Inorder successor and predecessor in BST

### 03 — FAQs

- [ ] BST iterator
- [ ] Two sum in BST
- [ ] Correct BST with two nodes swapped
- [ ] Largest BST in Binary Tree

### 04 — Contest

Contest placeholder. Not counted until a real contest question is added.

## 15 — Heaps

### 01 — Theory and Implementation

- [ ] Heaps (Theory Video) (lesson)
- [ ] Heapify Algorithm
- [ ] Build heap from a given Array
- [ ] Implement Min Heap
- [ ] Implement Max Heap
- [ ] Check if an array represents a min heap
- [ ] Convert Min Heap to Max Heap
- [ ] Heap Sort
- [ ] K-th Largest element in an array

### 02 — FAQs

- [ ] Kth Largest Element in a Stream of Running Integers
- [ ] Sort K-Sorted Array (lesson)
- [ ] Merge K sorted Lists
- [ ] Replace Elements by Their Rank
- [ ] Task Scheduler
- [ ] Hand of Straights
- [ ] Design Twitter
- [ ] Minimum Cost to Connect Sticks
- [ ] Maximum Sum Combination
- [ ] Find Median from Data Stream
- [ ] Top K Frequent Elements

### 03 — Contest

Contest placeholder. Not counted until a real contest question is added.

## 16 — Graphs

### 01 — Theory and Traversals

- [ ] Introduction to Graph (lesson)
- [ ] Traversal Techniques
- [ ] Connected Components

### 02 — Traversal Problems

- [ ] Number of provinces
- [ ] Number of islands
- [ ] Flood fill algorithm
- [ ] Number of enclaves
- [ ] Rotten Oranges
- [ ] Distance of nearest cell having one
- [ ] Surrounded Regions
- [ ] Number of distinct islands

### 03 — Cycles

- [ ] Detect a cycle in an undirected graph
- [ ] Bipartite graph
- [ ] Topological sort or Kahn's algorithm
- [ ] Detect a cycle in a directed graph

### 04 — Hard Problems

- [ ] Find eventual safe states
- [ ] Course Schedule I
- [ ] Course Schedule II
- [ ] Alien Dictionary
- [ ] Shortest path in DAG
- [ ] Shortest path in undirected graph with unit weights
- [ ] Word ladder I
- [ ] Word ladder II

### 05 — Shortest Path Algorithms

- [ ] Dijkstra's algorithm
- [ ] Print Shortest Path
- [ ] Shortest Distance in a Binary Maze
- [ ] Path with minimum effort
- [ ] Cheapest flight within K stops
- [ ] Minimum multiplications to reach end
- [ ] Number of ways to arrive at destination
- [ ] Bellman ford algorithm
- [ ] Floyd warshall algorithm
- [ ] Find the city with the smallest number of neighbors
- [ ] Network Delay Time
- [ ] Swim in Rising Water

### 06 — Minimum Spanning Tree

- [ ] MST theory (lesson)
- [ ] Disjoint Set
- [ ] Find the MST weight

### 07 — Hard Problems II

- [ ] Number of operations to make network connected
- [ ] Accounts merge
- [ ] Number of islands II
- [ ] Making a large island
- [ ] Most stones removed with same row or column

### 08 — Additional Algorithms

- [ ] Kosaraju's algorithm
- [ ] Bridges in graph
- [ ] Articulation point in graph

### 09 — Contest

Contest placeholder. Not counted until a real contest question is added.

## 17 — Dynamic Programming

### 01 — Introduction

- [ ] Introduction to DP (lesson)

### 02 — 1D DP

- [ ] Climbing stairs
- [ ] Frog Jump
- [ ] Frog jump with K distances
- [ ] Maximum sum of non adjacent elements
- [ ] House robber

### 03 — 2D DP

- [ ] Ninja's training

### 04 — DP on grids

- [ ] Grid unique paths
- [ ] Unique paths II
- [ ] Minimum Falling Path Sum
- [ ] Triangle
- [ ] Cherry pickup II
- [ ] Count Square Submatrices with All Ones (lesson)

### 05 — DP on stocks

- [ ] Best time to buy and sell stock
- [ ] Best time to buy and sell stock II
- [ ] Best time to buy and sell stock III
- [ ] Best time to buy and sell stock IV
- [ ] Best time to buy and sell stock with transaction fees
- [ ] Best Time to Buy and Sell Stock with Cooldown

### 06 — DP on subsequences

- [ ] Subset sum equals to target
- [ ] Partition equal subset sum
- [ ] Partition a set into two subsets with minimum absolute sum difference
- [ ] Count subsets with sum K
- [ ] Count partitions with given difference
- [ ] 0 and 1 Knapsack
- [ ] Minimum coins
- [ ] Target sum
- [ ] Coin change II
- [ ] Unbounded knapsack
- [ ] Rod cutting problem

### 07 — LIS

- [ ] Longest Increasing Subsequence
- [ ] Print Longest Increasing Subsequence
- [ ] Largest Divisible Subset
- [ ] Longest String Chain
- [ ] Longest Bitonic Subsequence
- [ ] Number of Longest Increasing Subsequences

### 08 — DP on strings

- [ ] Longest common subsequence
- [ ] Longest common substring
- [ ] Longest palindromic subsequence
- [ ] Minimum insertions to make string palindrome
- [ ] Minimum insertions or deletions to convert string A to B
- [ ] Shortest common supersequence
- [ ] Distinct subsequences
- [ ] Edit distance
- [ ] Wildcard matching
- [ ] Word Break
- [ ] Count Palindromic Subsequences

### 09 — MCM DP

- [ ] Matrix chain multiplication
- [ ] Burst balloons
- [ ] Palindrome partitioning II
- [ ] Partition Array for Maximum Sum
- [ ] Minimum cost to cut the stick
- [ ] Different Ways to Evaluate a Boolean Expression

### 10 — Contest

Contest placeholder. Not counted until a real contest question is added.

## 18 — Tries

### 01 — Theory

- [ ] Bit Prerequisites for Trie Problems (lesson)
- [ ] Trie Implementation and Operations
- [ ] Trie Implementation and Advanced Operations

### 02 — Problems

- [ ] Longest Word with All Prefixes
- [ ] Number of distinct substrings in a string
- [ ] Maximum XOR of two numbers in an array
- [ ] Maximum XOR with an Element from an Array

## 19 — Strings (Advanced Algo)

### 01 — Medium Problems

- [ ] Reverse every word in a string
- [ ] Minimum number of bracket reversals to make an expression balanced
- [ ] Count and say

### 02 — Advanced Problems (Less asked)

- [ ] Hashing In Strings | Theory (lesson)
- [ ] Rabin Karp Algorithm
- [ ] Z function
- [ ] KMP Algorithm or LPS array
- [ ] Shortest Palindrome
- [ ] Longest happy prefix

### 03 — Contest

Contest placeholder. Not counted until a real contest question is added.

## 20 — Maths

### 01 — Sieve of Eratosthenes

- [ ] Print all primes till N
- [ ] Prime factorisation of a Number
- [ ] Count primes in range L to R

### 02 — Contest

Contest placeholder. Not counted until a real contest question is added.
