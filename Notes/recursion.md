# Introduction to Recursion

## What is Recursion?

Recursion is a programming technique where a function **calls itself** to solve smaller instances of the same problem.

Instead of using loops, recursion repeatedly breaks a problem into simpler sub-problems until it reaches a stopping point called the **Base Condition**.

---

# Why Learn Recursion?

Recursion is the foundation for many advanced DSA topics:

- Trees
- Binary Search Trees
- AVL Trees
- Segment Trees
- Graphs (DFS)
- Backtracking
- Dynamic Programming

If recursion is weak, these topics become much harder to understand.

---

# Prerequisites

Before learning recursion, you should understand:

- Functions
- Parameters
- Return values
- Stack Memory
- Heap Memory
- Call Stack

---

# Call Stack

Whenever a function is called, Java creates a **Stack Frame**.

Each function call gets its own memory containing:

- Parameters
- Local variables
- Return address

Example:

```java
main()
    ↓
print(1)
    ↓
print(2)
    ↓
print(3)
```

The most recently called function is always at the **top of the stack**.

When a function finishes, its stack frame is removed (popped).

---

# How Recursion Works

Example

```java
static void print(int n) {

    if (n == 5) {
        System.out.println(5);
        return;
    }

    System.out.println(n);

    print(n + 1);
}
```

Execution:

```
print(1)

↓

print(2)

↓

print(3)

↓

print(4)

↓

print(5)

↓

Return

↓

Return

↓

Return
```
<img width="661" height="575" alt="image" src="https://github.com/user-attachments/assets/1a609b18-3507-40f0-93c3-e9c68bd763cb" />

The recursive calls continue until the **Base Condition** is reached.

---

# Base Condition

Every recursive function must have a stopping condition.

Without it, the function keeps calling itself forever.

Example:

```java
if (n == 5)
    return;
```

Without a Base Condition,

Java throws

```
StackOverflowError
```

because the Call Stack becomes full.

---

# Components of Recursion

Every recursive problem contains two parts:

## 1. Base Condition

Stops recursion.

## 2. Recursive Call

Calls the same function with a smaller problem.

Example

```java
return factorial(n - 1);
```

---

# Space Complexity

Unlike loops,

Recursion stores every function call in the stack.

Example

```
print(1)

↓

print(2)

↓

print(3)

↓

print(4)
```

Space Complexity

```
O(n)
```

because **n** stack frames exist simultaneously.

---

# Fibonacci Recursion

Recurrence Relation

```
F(n) = F(n-1) + F(n-2)
```

Base Conditions

```java
if(n < 2)
    return n;
```

Implementation

```java
static int fib(int n){

    if(n < 2)
        return n;

    return fib(n-1) + fib(n-2);
}
```

---

# Recursion Tree

For

```java
fib(4)
```

Tree

```
           4
         /   \
        3     2
      /  \   / \
     2   1  1  0
    / \
   1   0
```
<img width="921" height="401" alt="image" src="https://github.com/user-attachments/assets/fa056e4f-70d2-40c3-a379-9fb577a5535b" />

Java always evaluates the **left recursive call first**, then the right.

---

# Tail Recursion

A recursive function is **Tail Recursive** if the recursive call is the **last statement**.

Example

```java
print(n + 1);
```

No work remains after the recursive call.

Example (Not Tail Recursive)

```java
return fib(n-1) + fib(n-2);
```

After both recursive calls return,

Java still performs the addition.

---

# Five Steps to Solve Any Recursion Problem

1. Identify the smaller sub-problem.
2. Write the recurrence relation.
3. Define the base condition.
4. Draw the recursion tree.
5. Trace the call stack and return values.

---

# Variable Scope in Recursion

### Parameters

Variables needed by future recursive calls.

Example

```java
start
end
target
```

---

### Local Variables

Variables used only inside the current function call.

Example

```java
mid
```

Each recursive call gets its own copy.

---

### Return Values

Used to pass answers back through previous stack frames.

---

# Recursive Binary Search

Recurrence

```
T(n) = T(n/2) + O(1)
```

Implementation

```java
static int search(int[] arr, int target, int start, int end){

    if(start > end)
        return -1;

    int mid = start + (end - start)/2;

    if(arr[mid] == target)
        return mid;

    if(target < arr[mid])
        return search(arr, target, start, mid - 1);

    return search(arr, target, mid + 1, end);
}
```

---

# Important Rule

If the recursive function returns a value,

always return the recursive call.

Correct

```java
return search(...);
```

Wrong

```java
search(...);
```

Otherwise the result is lost.

---

# Types of Recurrence

## Linear Recurrence

Problem size decreases by a constant amount.

Example

```
n → n-1
```

Problems

- Fibonacci
- Factorial

---

## Divide & Conquer

Problem size reduces by a factor.

Example

```
n

↓

n/2

↓

n/4
```

Problems

- Binary Search
- Merge Sort
- Quick Sort

---

# Overlapping Subproblems

Naive Fibonacci repeatedly computes the same values.

Example

```
fib(5)

↓

fib(4)

↓

fib(3)

↓

fib(2)
```

The same `fib(2)` is calculated many times.

Time Complexity

```
O(1.618ⁿ)
```

---


# Key Points

- Every recursion needs a Base Condition.
- Every function call gets its own Stack Frame.
- Recursion uses **O(n)** auxiliary space.
- Always trace recursion using a Recursion Tree.
- Binary Search is an example of Divide & Conquer Recursion.
- Always return recursive calls if the function has a return type.
- Dynamic Programming optimizes recursion by avoiding repeated calculations.
