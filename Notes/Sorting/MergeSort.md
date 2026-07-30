# Merge Sort

## What is Merge Sort?

Merge Sort is a **Divide and Conquer** sorting algorithm.

Instead of sorting the entire array at once, it:

1. Divides the array into two halves.
2. Recursively sorts both halves.
3. Merges the two sorted halves into one sorted array.

---

# Divide and Conquer

Merge Sort follows three simple steps.

## 1. Divide

Split the array into two equal halves.

```
[8, 3, 4, 12, 5, 6]

↓

[8,3,4]      [12,5,6]
```

---

## 2. Conquer

Recursively divide until every sub-array contains only one element.

```
[8,3,4]

↓

[8,3]

↓

[8] [3]
```

An array containing one element is already sorted.

This is the **Base Condition**.

---

## 3. Merge

Merge the sorted halves back together.

```
[8] [3]

↓

[3,8]

↓

[3,4,8]

↓

[3,4,5,6,8,12]
```

---

# Visualization

```
              [8,3,4,12,5,6]
               /          \
        [8,3,4]        [12,5,6]
         /   \           /    \
      [8,3] [4]      [12,5]  [6]
      /  \             /  \
    [8] [3]        [12] [5]

        ↓ MERGE ↓

    [3,8] [4]    [5,12] [6]

        ↓

   [3,4,8]    [5,6,12]

        ↓

[3,4,5,6,8,12]
```

---

# Base Condition

```java
if(arr.length == 1)
    return arr;
```

An array of size **1** is already sorted.

---

# Merge Operation

Merge Sort merges two **already sorted arrays**.

Example

```
First

[3,8]

Second

[4,6]
```

Result

```
[3,4,6,8]
```

---

# Merge Algorithm

Maintain three pointers.

```
i → First Array

j → Second Array

k → Result Array
```

Algorithm

```
Compare first[i] and second[j]

↓

Copy smaller element

↓

Move corresponding pointer

↓

Repeat

↓

Copy remaining elements
```

---

# Out-of-Place Merge Sort

Creates **new arrays** during recursion.

Example

```java
left = Arrays.copyOfRange(arr, 0, mid);

right = Arrays.copyOfRange(arr, mid, arr.length);
```

Advantages

- Easy to understand
- Cleaner implementation

Disadvantages

- Extra memory required
- Creates many temporary arrays

---

# In-Place Merge Sort

Instead of creating new arrays,

pass only the indices.

```java
mergeSort(arr, start, end);
```

Example

```
Array

[5,4,3,2,1]

↓

start = 0

end = 5

↓

mid = 2
```

Advantages

- Modifies original array
- Less memory allocation

Disadvantages

- More difficult to implement

---

# Recurrence Relation

Merge Sort

```
T(n)

=

2T(n/2)

+

O(n)
```

Meaning

- Sort left half
- Sort right half
- Merge both halves

---

# Time Complexity

Each level performs

```
O(n)
```

work.

Number of levels

```
log₂(n)
```

Therefore

```
O(n × log n)

=

O(n log n)
```

---

## Best Case

```
O(n log n)
```

---

## Average Case

```
O(n log n)
```

---

## Worst Case

```
O(n log n)
```

Merge Sort performs consistently regardless of input order.

---

# Space Complexity

Auxiliary Array

```
O(n)
```

Recursive Call Stack

```
O(log n)
```

Overall

```
O(n)
```

---

# Why Merge Sort is Stable

If two equal elements exist,

their relative order remains unchanged after sorting.

Example

Before

```
5A 3 5B 2
```

After Merge Sort

```
2 3 5A 5B
```

Notice that **5A** still appears before **5B**.

---

# Merge Sort vs Quick Sort

| Feature | Merge Sort | Quick Sort |
|---------|------------|------------|
| Best Case | O(n log n) | O(n log n) |
| Average Case | O(n log n) | O(n log n) |
| Worst Case | O(n log n) | O(n²) |
| Stable |  Yes |  No |
| Extra Space | O(n) | O(log n) |
| Linked List | Excellent | Poor |

---

# Advantages

- Stable Sorting
- Guaranteed O(n log n)
- Efficient for Linked Lists
- Predictable performance
- Easy to parallelize

---

# Disadvantages

- Requires extra memory
- Slower than Quick Sort for small arrays
- Not an in-place algorithm (standard version)

---

# Summary

- Divide the array into two halves.
- Recursively sort both halves.
- Merge the sorted halves.
- Continue until the entire array is sorted.
- Guaranteed **O(n log n)** time complexity.
- Stable but requires extra memory.
