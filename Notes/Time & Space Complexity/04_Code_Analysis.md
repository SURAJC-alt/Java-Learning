# Code Analysis

## What is Code Analysis?

Code Analysis is the process of determining an algorithm's **Time Complexity** and **Space Complexity** by examining its code.

Instead of executing the program, we count how the number of operations grows as the input size (**N**) increases.

---

# Steps to Analyze Code

1. Identify loops.
2. Count the number of iterations.
3. Count the work done in each iteration.
4. Multiply the costs of nested loops.
5. Ignore constants and lower-order terms.
6. Write the final Big-O complexity.

---

# Rule 1: Constant Time Operations

Operations that execute exactly once have

```
O(1)
```

Example

```java
int x = 10;
int y = 20;

int sum = x + y;

System.out.println(sum);
```

Every statement executes once.

Time Complexity

```
O(1)
```

---

# Rule 2: Single Loop

Example

```java
for(int i = 0; i < n; i++){

    System.out.println(i);

}
```

Number of iterations

```
N
```

Work per iteration

```
O(1)
```

Total

```
N × O(1)

=

O(N)
```

---

# Rule 3: Multiple Independent Loops

Example

```java
for(int i = 0; i < n; i++){

}

for(int j = 0; j < n; j++){

}
```

First Loop

```
O(N)
```

Second Loop

```
O(N)
```

Total

```
O(N) + O(N)

=

O(2N)

↓

O(N)
```

Add the complexities.

---

# Rule 4: Nested Loops

Example

```java
for(int i = 0; i < n; i++){

    for(int j = 0; j < n; j++){

    }

}
```

Outer Loop

```
N
```

Inner Loop

```
N
```

Total

```
N × N

=

O(N²)
```

Multiply the complexities.

---

# Rule 5: Triple Nested Loops

Example

```java
for(int i = 0; i < n; i++){

    for(int j = 0; j < n; j++){

        for(int k = 0; k < n; k++){

        }

    }

}
```

Total

```
N × N × N

=

O(N³)
```

---

# Rule 6: Variable Increment Loop

Example

```java
for(int i = 1; i <= n; i = i + 2){

}
```

Iterations

```
N / 2
```

Ignore constants

```
N/2

↓

N
```

Time Complexity

```
O(N)
```

---

# Rule 7: Multiplication Loop

Example

```java
for(int i = 1; i < n; i *= 2){

}
```

Values of i

```
1

2

4

8

16

...
```

The loop doubles every iteration.

Iterations

```
log₂(N)
```

Time Complexity

```
O(log N)
```

---

# Rule 8: Division Loop

Example

```java
while(n > 1){

    n /= 2;

}
```

Each iteration halves the input.

```
N

↓

N/2

↓

N/4

↓

N/8
```

Time Complexity

```
O(log N)
```

---

# Rule 9: Different Loop Variables

Example

```java
for(int i = 0; i < n; i++){

    for(int j = 0; j < m; j++){

    }

}
```

Outer Loop

```
N
```

Inner Loop

```
M
```

Total

```
O(N × M)
```

Do **not** replace **M** with **N** unless they are guaranteed to be equal.

---

# Rule 10: Variable Step Nested Loop

Example

```java
for(int i = 1; i <= n; i = i + k){

    for(int j = 1; j <= k; j++){

    }

}
```

Outer Loop

```
N / K
```

Inner Loop

```
K
```

Total

```
(N/K) × K

↓

N
```

Time Complexity

```
O(N)
```

---

# Rule 11: Consecutive Nested Loops

Example

```java
for(int i = 0; i < n; i++){

    for(int j = 0; j < n; j++){

    }

}

for(int k = 0; k < n; k++){

}
```

Nested Loops

```
O(N²)
```

Single Loop

```
O(N)
```

Total

```
O(N² + N)

↓

O(N²)
```

Keep only the dominant term.

---

# Rule 12: Ignore Constants

Example

```java
for(int i = 0; i < 5 * n; i++){

}
```

Iterations

```
5N
```

Ignore constants

```
O(N)
```

---

# Rule 13: Ignore Lower-Order Terms

Example

```
N² + N + 10
```

Largest term

```
N²
```

Final Complexity

```
O(N²)
```

---

# Common Loop Patterns

## Pattern 1

```java
for(int i = 0; i < n; i++)
```

```
O(N)
```

---

## Pattern 2

```java
for(int i = n; i > 0; i--)
```

```
O(N)
```

---

## Pattern 3

```java
for(int i = 1; i < n; i *= 2)
```

```
O(log N)
```

---

## Pattern 4

```java
for(int i = n; i > 1; i /= 2)
```

```
O(log N)
```

---

## Pattern 5

```java
for(int i = 0; i < n; i++){

    for(int j = 0; j < i; j++){

    }

}
```

Iterations

```
1 + 2 + 3 + ...

+ N

=

N(N+1)/2
```

Time Complexity

```
O(N²)
```

---

# Time Complexity Cheat Sheet

| Code Pattern | Complexity |
|--------------|------------|
| One Statement | O(1) |
| Single Loop | O(N) |
| Two Independent Loops | O(N) |
| Nested Loops | O(N²) |
| Triple Nested Loops | O(N³) |
| Loop Doubles Each Time | O(log N) |
| Loop Halves Each Time | O(log N) |
| Nested Different Variables | O(N × M) |
| Variable Step Loop | O(N) |

---

# Summary

- Analyze code by counting iterations.
- Constant work → **O(1)**.
- Single loop → **O(N)**.
- Nested loops → Multiply complexities.
- Independent loops → Add complexities.
- Doubling or halving loops → **O(log N)**.
- Ignore constants and lower-order terms.
- Always express the final answer using Big-O notation.