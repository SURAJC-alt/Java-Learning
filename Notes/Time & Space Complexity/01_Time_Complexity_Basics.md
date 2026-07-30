# Time Complexity Basics

## What is Time Complexity?

Time Complexity is a mathematical way of describing **how the running time of an algorithm grows as the input size increases.**

It **does not measure the actual execution time** in seconds.

---

# Time Complexity ≠ Time Taken

One of the biggest misconceptions is:

> **Time Complexity is NOT the amount of time a program takes to execute.**

Actual execution time depends on many external factors:

- Processor (CPU)
- RAM
- Compiler Optimizations
- Programming Language
- Operating System
- Background Processes

Time Complexity ignores all of these factors.

It only measures **how the algorithm scales with increasing input size (N).**

---

# Example

Suppose we perform **Linear Search** on an array containing **1,000,000 elements.**

### Machine A

- Old Computer
- Slow Processor
- Less RAM

Time Taken

```
5 seconds
```

---

### Machine B

- Modern Computer
- Faster CPU
- More RAM

Time Taken

```
0.2 seconds
```

Although the execution time is different,

both machines still have

```
O(n)
```

Time Complexity.

Why?

Because both machines perform the same number of operations relative to the input size.

---

# Real Definition

Time Complexity measures

> **How the number of operations performed by an algorithm grows as the input size (N) increases.**

It focuses on **growth**, not actual running time.

---

# Input Size (N)

The variable **N** represents the size of the input.

Examples

```java
int[] arr = new int[100];
```

```
N = 100
```

---

```java
String name = "Hello";
```

```
N = 5
```

---

# Graph Representation

```
Time
▲
│
│          /
│        /
│      /
│    /
│  /
└────────────────────►
       Input Size (N)
```

As the input size increases,

the running time also increases.

Different algorithms produce different growth curves.

---

# Machine Speed vs Time Complexity

Suppose the running time is represented as

```
Time = k × N
```

Where

```
k
```

represents machine speed.

Fast Computer

```
k = 1
```

Slow Computer

```
k = 5
```

Even though **k** changes,

the growth remains **linear**.

Therefore,

both algorithms still belong to

```
O(n)
```

---

# Why Do We Ignore Hardware?

If Time Complexity depended on hardware,

every programmer would get different answers.

Instead,

Computer Science measures the **algorithm**, not the machine.

This allows algorithms to be compared fairly across different systems.

---

# Three Rules of Time Complexity Analysis

## Rule 1 — Always Consider the Worst Case

When analyzing an algorithm,

we usually consider the **Worst Case**.

Example

Linear Search

Searching for

```
100
```

inside

```
[1,2,3,4,...,100]
```

Worst Case

```
100 is the last element
```

Every element must be checked.

Time Complexity

```
O(n)
```

---

## Rule 2 — Think About Large Inputs

For very small inputs,

performance differences are usually negligible.

Example

```
N = 5
```

Two algorithms may appear equally fast.

However,

when

```
N = 1,000,000
```

the difference becomes significant.

Time Complexity studies algorithm behavior as

```
N → ∞
```

(very large input sizes).

---

## Rule 3 — Ignore Constants and Lower-Order Terms

Consider

```
3N³ + 4N² + 5N + 6
```

When

```
N = 1,000,000
```

The largest term dominates.

Therefore,

```
3N³ + 4N² + 5N + 6

↓

3N³

↓

N³
```

Final Complexity

```
O(N³)
```

---

# Why Do We Ignore Constants?

Example

```
100N
```

and

```
N
```

Both grow linearly.

Although one performs more work,

their growth rate is the same.

Therefore

```
100N

↓

N
```

Complexity

```
O(N)
```

---

# Why Ignore Smaller Terms?

Example

```
N² + N
```

As N becomes very large,

```
N²
```

grows much faster than

```
N
```

So,

```
N² + N

↓

N²
```

Complexity

```
O(N²)
```

---

# Example Simplifications

### Example 1

```
5N + 10
```

↓

```
O(N)
```

---

### Example 2

```
3N² + 6N + 20
```

↓

```
O(N²)
```

---

### Example 3

```
10N³ + 50N² + N
```

↓

```
O(N³)
```

---

### Example 4

```
8
```

↓

```
O(1)
```

---

# Common Time Complexities

| Complexity | Name | Example |
|------------|------|---------|
| O(1) | Constant | Array Index Access |
| O(log N) | Logarithmic | Binary Search |
| O(N) | Linear | Linear Search |
| O(N log N) | Linearithmic | Merge Sort |
| O(N²) | Quadratic | Bubble Sort |
| O(N³) | Cubic | Triple Nested Loops |
| O(2ᴺ) | Exponential | Recursive Fibonacci |
| O(N!) | Factorial | Permutations |

---


# Summary

- Time Complexity describes how an algorithm scales with input size.
- It is different from actual running time.
- Hardware affects execution time, not Time Complexity.
- Worst-case analysis is preferred in interviews.
- Ignore constants and smaller terms.
- Keep only the dominant term to determine the final complexity.