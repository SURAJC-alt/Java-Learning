# Space Complexity

## What is Space Complexity?

Space Complexity measures **how much memory an algorithm requires as the input size (N) increases.**

It includes both the memory occupied by the input and the additional memory used by the algorithm.

---

# Space Complexity Formula

```
Total Space

=

Input Space

+

Auxiliary Space
```

---

# 1. Input Space

Input Space is the memory required to store the input provided to the algorithm.

Example

```java
int[] arr = new int[100];
```

The memory used by `arr` is **Input Space**.

Since the input is provided to the algorithm, we usually **do not count it** while analyzing algorithms.

---

# 2. Auxiliary Space

Auxiliary Space is the **extra memory** used by the algorithm during execution.

Examples

- Temporary variables
- Additional arrays
- HashMaps
- Queues
- Stacks
- Recursive Call Stack

Interviewers usually ask for **Auxiliary Space**, not Total Space.

---

# Why Do Interviewers Ignore Input Space?

Suppose you receive an array.

```java
int[] arr = new int[n];
```

Every solution receives the same input.

Therefore,

the input memory is fixed.

Interviewers are interested in **how much extra memory your algorithm uses.**

---

# Example 1 — Constant Space

```java
int max = arr[0];

for(int i = 1; i < arr.length; i++){

    if(arr[i] > max){
        max = arr[i];
    }

}
```

Extra memory used

```
max

i
```

Only two integer variables are created.

Regardless of whether

```
N = 10
```

or

```
N = 10,000,000
```

the number of variables remains the same.

Space Complexity

```
O(1)
```

---

# Example 2 — Linear Space

```java
int[] copy = new int[arr.length];

for(int i = 0; i < arr.length; i++){

    copy[i] = arr[i];

}
```

An additional array of size **N** is created.

Extra memory

```
N
```

Space Complexity

```
O(N)
```

---

# Example 3 — Two Arrays

```java
int[] first = new int[n];

int[] second = new int[n];
```

Extra Memory

```
2N
```

Ignore constants

```
2N

↓

N
```

Space Complexity

```
O(N)
```

---

# Example 4 — Matrix

```java
int[][] matrix = new int[n][n];
```

Memory required

```
N × N
```

Space Complexity

```
O(N²)
```

---

# Recursive Space Complexity

Many beginners think recursion uses

```
O(1)
```

because no arrays are created.

This is incorrect.

Every recursive call creates a **Stack Frame**.

---

# What is a Stack Frame?

Whenever a function is called,

Java stores

- Parameters
- Local Variables
- Return Address

inside Stack Memory.

Each recursive call creates a new Stack Frame.

---

# Example

```java
static void print(int n){

    if(n == 5)
        return;

    print(n + 1);

}
```

Call Stack

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
```

Maximum active calls

```
5
```

Space Complexity

```
O(N)
```

because there are **N active stack frames**.

---

# Example — Binary Search

```java
binarySearch(arr, target)
```

Every recursive call divides the search space by half.

Call Stack

```
N

↓

N/2

↓

N/4

↓

N/8
```

Maximum depth

```
log₂(N)
```

Space Complexity

```
O(log N)
```

---

# Example — Merge Sort

Merge Sort creates

- Temporary Array
- Recursive Stack

Auxiliary Array

```
O(N)
```

Recursive Stack

```
O(log N)
```

Overall

```
O(N)
```

because

```
N > log N
```

---

# Space Complexity of Common Data Structures

| Data Structure | Space Complexity |
|---------------|------------------|
| Variable | O(1) |
| Array | O(N) |
| ArrayList | O(N) |
| Linked List | O(N) |
| Stack | O(N) |
| Queue | O(N) |
| HashMap | O(N) |
| HashSet | O(N) |
| Matrix | O(N²) |

---

# Common Algorithm Examples

| Algorithm | Auxiliary Space |
|-----------|-----------------|
| Linear Search | O(1) |
| Binary Search (Iterative) | O(1) |
| Binary Search (Recursive) | O(log N) |
| Bubble Sort | O(1) |
| Selection Sort | O(1) |
| Insertion Sort | O(1) |
| Merge Sort | O(N) |
| Quick Sort | O(log N) (Average) |
| DFS (Recursive) | O(H) |
| BFS | O(N) |

---

# Time Complexity vs Space Complexity

| Time Complexity | Space Complexity |
|----------------|------------------|
| Measures execution time growth | Measures memory growth |
| CPU related | Memory related |
| Number of operations | Amount of memory used |
| Example: O(N log N) | Example: O(N) |

---

# Time-Space Tradeoff

Sometimes we use **more memory** to make an algorithm **faster**.

Example

Without HashMap

```
Time

O(N²)

Space

O(1)
```

With HashMap

```
Time

O(N)

Space

O(N)
```

Extra memory reduces execution time.

This is called the **Time-Space Tradeoff**.

---

---

# Key Points

- **Input Space** → Memory occupied by the input.
- **Auxiliary Space** → Extra memory used by the algorithm.
- Recursive algorithms consume stack memory.
- Constant number of variables → **O(1)**.
- Extra array of size N → **O(N)**.
- Matrix of size N × N → **O(N²)**.
- Binary Search (recursive) → **O(log N)**.
- Merge Sort → **O(N)**.

---

# Summary

- Space Complexity measures memory usage as input size grows.
- Total Space = Input Space + Auxiliary Space.
- Interviewers usually ask for Auxiliary Space.
- Recursive algorithms use stack memory.
- Ignore constant factors while calculating space complexity.
- Always consider both temporary data structures and recursion stack when analyzing an algorithm.