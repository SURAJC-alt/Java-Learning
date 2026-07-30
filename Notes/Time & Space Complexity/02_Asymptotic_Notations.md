# Asymptotic Notations

## What are Asymptotic Notations?

Asymptotic Notations are mathematical tools used to describe **how an algorithm grows as the input size (N) becomes very large.**

They allow us to compare algorithms without considering hardware, programming language, or compiler optimizations.

---

# Why Do We Need Asymptotic Notations?

Suppose two algorithms solve the same problem.

Algorithm A

```
5N² + 10N + 15
```

Algorithm B

```
100N² + 50
```

Although their exact operation counts are different,

both grow proportionally to

```
N²
```

Therefore,

both belong to the same complexity class.

---

# Growth Comparison

```
Resource Usage
▲
│
│                    O(2ᴺ)
│                 /
│              /
│          O(N²)
│         /
│      O(N log N)
│     /
│   O(N)
│  /
│ O(log N)
│/
└────────────────────────►
        Input Size (N)
```

The slower the growth,

the more efficient the algorithm.

---

# Types of Asymptotic Notations

There are five important notations:

1. Big-O (O)
2. Big-Omega (Ω)
3. Big-Theta (Θ)
4. Little-o (o)
5. Little-Omega (ω)

---

# 1. Big-O Notation (O)

## Definition

Big-O represents the **Upper Bound** of an algorithm.

It tells us the **maximum possible growth rate**.

In interviews,

Big-O usually refers to the **Worst Case Time Complexity**.

---

## Example

Linear Search

Worst Case

```
Element is at the last index.
```

Every element is checked.

```
O(N)
```

---

Binary Search

Worst Case

```
O(log N)
```

---

## Mathematical Definition

```
f(n) = O(g(n))
```

means

```
f(n)

never grows faster than

g(n)
```

---

## Example

```
5N + 20

↓

O(N)
```

---

```
8N² + 100N

↓

O(N²)
```

---

# 2. Big-Omega (Ω)

## Definition

Big-Omega represents the **Lower Bound**.

It tells us the **minimum amount of work** an algorithm must perform.

Usually associated with the **Best Case**.

---

## Example

Linear Search

Searching for

```
10
```

inside

```
[10,20,30,40]
```

The element is found immediately.

Operations

```
1
```

Complexity

```
Ω(1)
```

---

## Mathematical Meaning

```
f(n) = Ω(g(n))
```

means

```
f(n)

grows at least as fast as

g(n)
```

---

# 3. Big-Theta (Θ)

## Definition

Big-Theta represents the **Exact Growth Rate**.

It provides both

- Upper Bound
- Lower Bound

at the same time.

---

## Example

Binary Search

Best Case

```
O(1)
```

Worst Case

```
O(log N)
```

Therefore,

Binary Search is **not**

```
Θ(log N)
```

for every execution.

---

Linear Traversal

```java
for(int i = 0; i < n; i++)
```

Always performs proportional work.

Therefore

```
Θ(N)
```

---

## Mathematical Meaning

```
f(n) = Θ(g(n))
```

means

```
Both functions grow

at exactly the same rate.
```

---

# 4. Little-o (o)

## Definition

Little-o represents a **Strict Upper Bound**.

The algorithm grows **strictly slower** than the comparison function.

It can never grow equally fast.

---

## Example

```
N²

compared with

N³
```

Since

```
N²

always grows slower than

N³
```

Therefore

```
N² = o(N³)
```

---

## Mathematical Meaning

```
lim

f(n)

─────

g(n)

= 0
```

---

# 5. Little-Omega (ω)

## Definition

Little-Omega represents a **Strict Lower Bound**.

The algorithm grows **strictly faster** than the comparison function.

---

## Example

```
N³

compared with

N²
```

Since

```
N³

always grows faster than

N²
```

Therefore

```
N³ = ω(N²)
```

---

## Mathematical Meaning

```
lim

f(n)

─────

g(n)

= ∞
```

---

# Relationship Between Notations

```
                ▲
                │      ω (Strictly Faster)
                │
                │
                │      O (Upper Bound)
Growth          │──────────────
                │      Θ (Exact Bound)
                │──────────────
                │      Ω (Lower Bound)
                │
                │      o (Strictly Slower)
                └────────────────────────►
                    Input Size (N)
```

---

# Examples

## Example 1

```
5N + 10
```

```
O(N)
```

```
Ω(N)
```

```
Θ(N)
```

---

## Example 2

```
8N² + 2N + 5
```

```
O(N²)
```

```
Ω(N²)
```

```
Θ(N²)
```

---

## Example 3

```
N²

compared with

N³
```

```
N² = o(N³)
```

---

## Example 4

```
N³

compared with

N²
```

```
N³ = ω(N²)
```

---

# Comparison Table

| Notation | Meaning | Growth |
|----------|---------|--------|
| **O(g(n))** | Upper Bound | At most |
| **Ω(g(n))** | Lower Bound | At least |
| **Θ(g(n))** | Tight Bound | Exactly |
| **o(g(n))** | Strict Upper Bound | Strictly Smaller |
| **ω(g(n))** | Strict Lower Bound | Strictly Larger |

---

# Which Notation is Used Most?

In interviews,

almost every interviewer expects **Big-O Notation**.

The other notations are mainly used in:

- Algorithm Analysis
- Research Papers
- Competitive Programming
- Advanced Computer Science

---


# Summary

- Asymptotic Notations compare algorithm growth for very large inputs.
- They ignore hardware and implementation details.
- **Big-O** describes the maximum growth.
- **Big-Ω** describes the minimum growth.
- **Big-Θ** describes the exact growth.
- **Little-o** represents strictly slower growth.
- **Little-ω** represents strictly faster growth.
- Big-O is the notation used most frequently in technical interviews.