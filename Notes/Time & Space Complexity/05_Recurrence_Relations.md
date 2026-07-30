# Recurrence Relations

## What is a Recurrence Relation?

A **Recurrence Relation** is an equation that expresses the running time of a recursive algorithm in terms of its smaller subproblems.

Instead of counting loop iterations, we describe how the algorithm calls itself.

---

# Why Do We Need Recurrence Relations?

Loop-based algorithms can be analyzed by counting iterations.

Recursive algorithms cannot.

Instead, we write a recurrence equation.

Examples:

- Binary Search
- Merge Sort
- Quick Sort
- Tower of Hanoi
- Recursive Tree Traversals

---

# General Form

```
T(n) = Recursive Work + Extra Work
```

where

- **Recursive Work** → Time spent in recursive calls.
- **Extra Work** → Work done outside recursion.

---

# Example 1: Factorial

```java
int factorial(int n){

    if(n == 0)
        return 1;

    return n * factorial(n - 1);

}
```

Recurrence

```
T(n) = T(n-1) + O(1)
```

Explanation

- One recursive call
- Constant work after the call

Final Complexity

```
O(N)
```

---

# Example 2: Fibonacci

```java
int fib(int n){

    if(n <= 1)
        return n;

    return fib(n-1) + fib(n-2);

}
```

Recurrence

```
T(n)

=

T(n-1)

+

T(n-2)

+

O(1)
```

Each function creates two recursive calls.

Final Complexity

```
O(2ᴺ)
```

---

# Example 3: Binary Search

```java
binarySearch(arr, low, high)
```

Each recursive call searches only one half.

Recurrence

```
T(n)

=

T(n/2)

+

O(1)
```

Final Complexity

```
O(log N)
```

---

# Example 4: Merge Sort

Merge Sort

- Divides the array into two halves.
- Recursively sorts both halves.
- Merges them.

Recurrence

```
T(n)

=

2T(n/2)

+

O(n)
```

Final Complexity

```
O(N log N)
```

---

# Common Recurrence Patterns

| Recurrence | Complexity |
|------------|------------|
| T(n)=T(n−1)+1 | O(N) |
| T(n)=T(n−1)+N | O(N²) |
| T(n)=T(n/2)+1 | O(log N) |
| T(n)=T(n/2)+N | O(N) |
| T(n)=2T(n/2)+N | O(N log N) |
| T(n)=2T(n−1)+1 | O(2ᴺ) |

---

# Divide and Conquer

Many recursive algorithms follow the Divide and Conquer approach.

Three Steps

```
Divide

↓

Conquer

↓

Combine
```

Examples

- Merge Sort
- Quick Sort
- Binary Search

---

# General Divide-and-Conquer Formula

```
T(n)

=

aT(n/b)

+

f(n)
```

Where

- **a** → Number of recursive calls.
- **b** → Size reduction factor.
- **f(n)** → Extra work outside recursion.

---

# Binary Search Example

Binary Search divides the array into two halves.

```
T(n)

=

T(n/2)

+

1
```

```
a = 1

b = 2

f(n) = 1
```

Complexity

```
O(log N)
```

---

# Merge Sort Example

Merge Sort

```
T(n)

=

2T(n/2)

+

N
```

```
a = 2

b = 2

f(n)=N
```

Complexity

```
O(N log N)
```

---

# Quick Sort (Average Case)

Recurrence

```
T(n)

=

2T(n/2)

+

N
```

Average Complexity

```
O(N log N)
```

Worst Case

```
O(N²)
```

---

# Solving Recurrence Relations

Common methods

1. Substitution Method
2. Recursion Tree
3. Master Theorem

The **Master Theorem** is the most commonly used in interviews.

---

# Master Theorem

Applicable to recurrences of the form

```
T(n)

=

aT(n/b)

+

f(n)
```

Where

- **a ≥ 1**
- **b > 1**

---

## Case 1

If

```
f(n)

is smaller than

n^(log_b a)
```

Then

```
T(n)

=

Θ(n^(log_b a))
```

Example

```
T(n)

=

4T(n/2)

+

1
```

Complexity

```
Θ(N²)
```

---

## Case 2

If

```
f(n)

=

Θ(n^(log_b a))
```

Then

```
T(n)

=

Θ(n^(log_b a) log N)
```

Example

```
T(n)

=

2T(n/2)

+

N
```

Complexity

```
Θ(N log N)
```

---

## Case 3

If

```
f(n)

grows faster than

n^(log_b a)
```

Then

```
T(n)

=

Θ(f(n))
```

Example

```
T(n)

=

2T(n/2)

+

N²
```

Complexity

```
Θ(N²)
```

---

# Recursion Tree Method

The recurrence is expanded level by level until reaching the base case.

Example

```
T(n)

=

2T(n/2)

+

N
```

Tree

```
            N

        /       \

      N/2      N/2

     /  \      /  \

   N/4 N/4  N/4 N/4
```

Every level contributes

```
N
```

Number of levels

```
log N
```

Total

```
N × log N

=

O(N log N)
```

---

# Akra–Bazzi Theorem

The **Akra–Bazzi Theorem** is a generalized version of the Master Theorem.

It can solve more complex recurrences where the Master Theorem cannot.

General form

```
T(x)

=

a₁T(b₁x)

+

a₂T(b₂x)

+

...

+

g(x)
```

It is mainly used in

- Advanced Algorithms
- Research
- Graduate-level Computer Science

For most coding interviews, **Master Theorem is sufficient**.

---

# Common Interview Examples

| Algorithm | Recurrence | Complexity |
|-----------|------------|------------|
| Factorial | T(n)=T(n−1)+1 | O(N) |
| Binary Search | T(n)=T(n/2)+1 | O(log N) |
| Merge Sort | T(n)=2T(n/2)+N | O(N log N) |
| Recursive Fibonacci | T(n)=T(n−1)+T(n−2) | O(2ᴺ) |
| Tower of Hanoi | T(n)=2T(n−1)+1 | O(2ᴺ) |

---


# Summary

- Recurrence Relations describe the running time of recursive algorithms.
- Divide-and-Conquer algorithms often follow the form **T(n) = aT(n/b) + f(n)**.
- Binary Search → **O(log N)**.
- Merge Sort → **O(N log N)**.
- Recursive Fibonacci → **O(2ᴺ)**.
- The **Master Theorem** is the standard interview technique for solving recurrences.
- The **Akra–Bazzi Theorem** is a more general mathematical tool used for advanced recurrence analysis.