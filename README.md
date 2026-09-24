# Java DSA: Striver's A2Z

My personal Java repository for **Striver's A2Z DSA sheet**.

The aim is not to finish the sheet or collect solutions. It is to build
problem-solving fundamentals through steady practice, independent thinking,
clean implementation, and regular review.

## Goals

- Build strong data structures and algorithms fundamentals
- Recognise common problem-solving patterns
- Attempt every problem independently before reading a solution
- Write clean, readable Java
- Analyse time and space complexity for every solution
- Get better at debugging and edge cases
- Explain an approach clearly, out loud and in writing
- Keep a consistent Git and GitHub habit
- Prepare for software engineering interviews

## At a glance

| | |
|---|---|
| Started | 24 September 2026 |
| Language | Java |
| Roadmap | Striver's A2Z DSA sheet, 20 steps |
| Sheet entries | 495 (448 coding problems + 47 lessons) |
| Contests | 16 placeholders, not counted |
| Live progress | [`progress/Progress.md`](progress/Progress.md) |

Current position, problems solved, and review notes live in
`Progress.md`, so this file does not need to be updated after every
coding session.

## How things are counted

The sheet has **495 entries**:

| Type | Count | Lives in the repository as |
|---|---:|---|
| Coding problems | 448 | One `.java` file each |
| Lessons (theory and concepts) | 47 | Notes only, no code file |
| **Total sheet entries** | **495** | |
| Contests | 16 | Empty folders, not counted |

- Contest folders exist to mirror the sheet. A contest is counted only
  once a real contest question is added.
- The lesson **Basic Hashing** appears twice in the sheet, under
  Beginner Problems → Concept Basics and Hashing → Theory. Both are
  counted because both entries exist in the sheet. It is a lesson, so
  it has no code file.
- A problem counts as **solved** only after I have understood it,
  attempted it, implemented it, tested it, and reviewed it.
- Placeholder files are not counted as solved work.

## Roadmap

Folder numbers match the step numbers below.

| Step | Topic | Folder | Coding | Lessons |
|---:|---|---|---:|---:|
| 01 | Beginner Problems | `01-beginner-problems/` | 60 | 23 |
| 02 | Sorting | `02-sorting/` | 7 | 0 |
| 03 | Arrays | `03-arrays/` | 32 | 0 |
| 04 | Hashing | `04-hashing/` | 5 | 1 |
| 05 | Binary Search | `05-binary-search/` | 32 | 0 |
| 06 | Strings (Basic and Medium) | `06-strings-basic-and-medium/` | 6 | 1 |
| 07 | Recursion | `07-recursion/` | 21 | 1 |
| 08 | Linked List | `08-linked-list/` | 43 | 6 |
| 09 | Bit Manipulation | `09-bit-manipulation/` | 12 | 2 |
| 10 | Greedy Algorithms | `10-greedy-algorithms/` | 14 | 0 |
| 11 | Sliding Window / 2 Pointer | `11-sliding-window-2-pointer/` | 12 | 1 |
| 12 | Stack / Queues | `12-stack-queues/` | 30 | 1 |
| 13 | Binary Trees | `13-binary-trees/` | 31 | 1 |
| 14 | Binary Search Trees | `14-binary-search-trees/` | 13 | 2 |
| 15 | Heaps | `15-heaps/` | 18 | 2 |
| 16 | Graphs | `16-graphs/` | 44 | 2 |
| 17 | Dynamic Programming | `17-dynamic-programming/` | 51 | 2 |
| 18 | Tries | `18-tries/` | 6 | 1 |
| 19 | Strings (Advanced Algo) | `19-strings-advanced-algo/` | 8 | 1 |
| 20 | Maths | `20-maths/` | 3 | 0 |
| | **Total** | | **448** | **47** |

### Step 01 Sections

| # | Section | Coding | Lessons |
|---:|---|---:|---:|
| 01 | Fundamentals of Programming | 0 | 7 |
| 02 | Language Basics | 0 | 3 |
| 03 | Logic Building (Patterns) | 0 | 2 |
| 04 | Patterns | 22 | 0 |
| 05 | Time Complexity | 0 | 1 |
| 06 | Standard Libraries & Collections | 0 | 4 |
| 07 | Concept Basics | 0 | 4 |
| 08 | Basic Maths | 13 | 0 |
| 09 | Basic Arrays | 4 | 0 |
| 10 | Basic Hashing | 3 | 0 |
| 11 | Basic Strings | 8 | 0 |
| 12 | Basic Recursion | 10 | 2 |
| | **Total** | **60** | **23** |

## Repository Structure

```text
java-dsa/
├── 01-beginner-problems/
├── 02-sorting/
├── 03-arrays/
├── 04-hashing/
├── 05-binary-search/
├── 06-strings-basic-and-medium/
├── 07-recursion/
├── 08-linked-list/
├── 09-bit-manipulation/
├── 10-greedy-algorithms/
├── 11-sliding-window-2-pointer/
├── 12-stack-queues/
├── 13-binary-trees/
├── 14-binary-search-trees/
├── 15-heaps/
├── 16-graphs/
├── 17-dynamic-programming/
├── 18-tries/
├── 19-strings-advanced-algo/
├── 20-maths/
├── archive/
│   ├── old-a2z/
│   └── pre-a2z/
├── progress/
│   └── Progress.md
├── README.md
└── .gitignore