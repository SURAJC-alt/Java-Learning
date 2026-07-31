# Quick Sort

## What is Quick Sort?

**Quick Sort** is a **Divide and Conquer** sorting algorithm that works by selecting a **pivot** element, placing it in its correct sorted position, and recursively sorting the elements on its left and right.

Unlike Bubble Sort or Selection Sort, Quick Sort does **not** place the smallest or largest element in every pass. Instead, each partition guarantees that the **pivot reaches its final sorted position**.

---

# Core Philosophy

## The Pivot

A **pivot** is a reference element chosen from the array.

The pivot can be:

- First element
- Last element
- Middle element
- Random element
- Median (advanced implementations)

Example

```
8 4 7 3 10 5
      ↑
    Pivot
```

---

## Goal of One Partition

After one partitioning step,

- Every element **≤ Pivot** is placed on the left.
- Every element **> Pivot** is placed on the right.

Example

Before

```
8 4 7 3 10 5
```

After Partition

```
4 3 5 | 7 | 8 10
```

Notice

- Left side is **not sorted**.
- Right side is **not sorted**.
- Only the pivot is guaranteed to be in its correct final position.

---

## Divide and Conquer

Once the pivot reaches its correct position, it acts as a permanent divider.

```
Left Part

↓

Pivot

↓

Right Part
```

Quick Sort now recursively sorts

- Left sub-array
- Right sub-array

until every sub-array contains only one element.

---

# Two-Pointer Partitioning Algorithm

To place the pivot correctly without using extra memory, Quick Sort uses the **Two-Pointer Technique**.

Assume

```
low                     high

↓

8 4 7 3 10 5
```

Choose a pivot.

Create two pointers.

```
start = low

end = high
```

---

## Step 1: Move Start Pointer

Move `start` forward while

```
arr[start] <= pivot
```

Stop when

```
arr[start] > pivot
```

This is a **left-side violation**.

---

## Step 2: Move End Pointer

Move `end` backward while

```
arr[end] > pivot
```

Stop when

```
arr[end] <= pivot
```

This is a **right-side violation**.

---

## Step 3: Swap

Swap both incorrect elements.

Example

Before

```
8 4 7 3 10 5
```

Suppose

```
start → 8

end → 5
```

Swap

```
5 4 7 3 10 8
```

Now continue moving both pointers.

---

## Step 4: Repeat

Continue

```
Move Start

↓

Move End

↓

Swap
```

until

```
start > end
```

At this point, place the pivot in its correct position.

---

# Recursion

After partitioning

```
4 3 5 | 7 | 8 10
```

Quick Sort recursively processes

```
4 3 5
```

and

```
8 10
```

Each recursive call performs the same steps until the array becomes sorted.

---

# Recurrence Relation

If

```
k
```

elements go to the left of the pivot,

then

```
T(n)

=

T(k)

+

T(n-k-1)

+

O(n)
```

Where

- `T(k)` → Left recursive call
- `T(n-k-1)` → Right recursive call
- `O(n)` → Time required for partitioning

---

# Best Case

The pivot divides the array into two equal halves.

```
n

↓

n/2      n/2
```

Recurrence

```
T(n)

=

2T(n/2)

+

O(n)
```

Time Complexity

```
O(N log N)
```

---

# Average Case

In practice, the pivot usually creates reasonably balanced partitions.

Time Complexity

```
O(N log N)
```

This is why Quick Sort performs extremely well in real-world applications.

---

# Worst Case

Worst case occurs when the pivot is always

- Smallest element
- Largest element

Example

```
1 2 3 4 5 6
```

Choosing the first element as pivot repeatedly gives

```
0

↓

n-1
```

split every time.

Recurrence

```
T(n)

=

T(n-1)

+

O(n)
```

Time Complexity

```
O(N²)
```

---

# Space Complexity

Quick Sort is an **in-place sorting algorithm**.

Auxiliary Space

```
O(1)
```

Recursive Call Stack

- Best Case

```
O(log N)
```

- Worst Case

```
O(N)
```

---

# Quick Sort vs Merge Sort

| Feature | Quick Sort | Merge Sort |
|---------|------------|------------|
| Technique | Divide & Conquer | Divide & Conquer |
| Stable |  No |  Yes |
| In-place |  Yes |  No |
| Extra Space | O(1) Auxiliary | O(N) |
| Average Time | O(N log N) | O(N log N) |
| Worst Time | O(N²) | O(N log N) |
| Preferred For | Arrays | Linked Lists |

---

# Advantages

- Very fast in practice
- Excellent cache performance
- In-place sorting
- Low memory usage
- Average complexity is **O(N log N)**

---

# Disadvantages

- Worst-case **O(N²)**
- Not stable
- Performance depends on pivot selection

---

# Hybrid Sorting Algorithms

Modern programming languages rarely use a single sorting algorithm.

Instead, they combine multiple algorithms to achieve better performance.

These are called **Hybrid Sorting Algorithms**.

---

## Why Insertion Sort?

Insertion Sort performs extremely well for

- Small arrays
- Nearly sorted arrays

Time Complexity (best case)

```
O(N)
```

Therefore, many sorting libraries switch to Insertion Sort for small partitions.

---

## Python

Python uses

```
TimSort
```

TimSort is a hybrid of

- Merge Sort
- Insertion Sort

It is stable and optimized for real-world data.

---

## Java

For primitive arrays,

```java
Arrays.sort()
```

uses

```
Dual-Pivot Quick Sort
```

Modern implementations may combine

- Dual-Pivot Quick Sort
- Insertion Sort
- Heap Sort (fallback in some implementations)

to achieve consistently fast performance.

---

# Applications

Quick Sort is widely used in

- Java Standard Library
- C++ Standard Library (hybrid implementations)
- Database systems
- Operating Systems
- Search engines
- Competitive Programming

---

# Summary

- Quick Sort is a Divide and Conquer sorting algorithm.
- It works by choosing a pivot, partitioning the array around it, and recursively sorting both sides.
- The pivot reaches its final sorted position after every partition.
- The two-pointer partitioning algorithm efficiently rearranges elements in-place.
- Best and average time complexity are **O(N log N)**, while the worst case is **O(N²)**.
- Compared to Merge Sort, Quick Sort uses much less extra memory and is generally faster for arrays.
- Modern languages use optimized hybrid implementations such as **Dual-Pivot Quick Sort** and **TimSort** to achieve high real-world performance.
