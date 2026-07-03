# Insertion Sort

Insertion Sort is a simple **comparison-based sorting algorithm** that builds the final sorted array **one element at a time**.

It is inspired by the way people naturally sort a hand of playing cards. Each new element is picked up and inserted into its correct position within the already sorted portion of the array.

Unlike Bubble Sort and Selection Sort, Insertion Sort performs exceptionally well on **small or nearly sorted datasets**.

---

# 1. How Insertion Sort Works

Insertion Sort divides the array into two parts:

- **Sorted portion** (left side)
- **Unsorted portion** (right side)

Initially, the first element is considered sorted.

During each pass:

1. Pick the first element from the unsorted portion (called the **key**).
2. Compare the key with elements in the sorted portion from right to left.
3. Shift every larger element one position to the right.
4. Insert the key into the empty position created.
5. Repeat until every element has been inserted.

---

# 2. Example

Sort the following array:

```text
[12, 11, 13, 5]
```

### Pass 1

Key = **11**

```text
Shift 12

[12, 12, 13, 5]

Insert 11

[11, 12, 13, 5]
```

---

### Pass 2

Key = **13**

```text
No shifting required

[11, 12, 13, 5]
```

---

### Pass 3

Key = **5**

```text
Shift 13
Shift 12
Shift 11

[11, 11, 12, 13]

Insert 5

[5, 11, 12, 13]
```

The array is now sorted.

---

# 3. Java Implementation

```java
public static void insertionSort(int[] arr) {

    int n = arr.length;

    for (int i = 1; i < n; i++) {

        int key = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > key) {

            arr[j + 1] = arr[j];
            j--;

        }

        arr[j + 1] = key;
    }
}
```

---

# 4. Dry Run

For the array:

```text
[12, 11, 13, 5]
```

| Pass | Array |
|------|-------|
| Initial | `[12, 11, 13, 5]` |
| Pass 1 | `[11, 12, 13, 5]` |
| Pass 2 | `[11, 12, 13, 5]` |
| Pass 3 | `[5, 11, 12, 13]` |

---

# 5. Visualization

Initial Array

```text
[12, 11, 13, 5]
```

After Pass 1

```text
[11, 12, 13, 5]
 --------
 Sorted
```

After Pass 2

```text
[11, 12, 13, 5]
 ------------
   Sorted
```

After Pass 3

```text
[5, 11, 12, 13]
----------------
 Entire array sorted
```

---

# 6. Time Complexity

| Case | Complexity |
|------|------------|
| Best Case | **O(n)** |
| Average Case | **O(n²)** |
| Worst Case | **O(n²)** |

### Why?

- **Best Case:** The array is already sorted, so no shifting is required.
- **Worst Case:** The array is in reverse order, so every element must be shifted.
- **Average Case:** About half of the previous elements are shifted for each insertion.

---

# 7. Space Complexity

Insertion Sort sorts the array **in-place**.

**Space Complexity:** **O(1)**

---

# 8. Number of Swaps

Unlike Bubble Sort and Selection Sort, Insertion Sort mainly performs **shifts** instead of swaps.

This reduces unnecessary write operations and makes the algorithm efficient for nearly sorted arrays.

---

# 9. Advantages

- Very easy to implement.
- Stable sorting algorithm.
- In-place sorting.
- Adaptive (becomes faster if the array is nearly sorted).
- Excellent for small datasets.
- Used inside many advanced sorting algorithms for small subarrays.

---

# 10. Disadvantages

- Slow for large datasets.
- Worst-case time complexity is O(n²).
- Performs many shifts when the array is reverse sorted.

---

# 11. Properties

| Property | Value |
|----------|-------|
| Algorithm Type | Comparison Sort |
| Stable | ✅ Yes |
| In-place | ✅ Yes |
| Adaptive | ✅ Yes |
| Recursive | ❌ No |

---

# 12. Bubble vs Selection vs Insertion

| Feature | Bubble | Selection | Insertion |
|----------|---------|-----------|-----------|
| Main Idea | Swap adjacent elements | Find minimum element | Insert each element into sorted part |
| Stable | Yes | No | Yes |
| Adaptive | Yes (Optimized) | No | Yes |
| Best Time | O(n) | O(n²) | O(n) |
| Worst Time | O(n²) | O(n²) | O(n²) |
| Swaps | Many | Very Few | Mostly Shifts |

---

# Cheat Sheet

| Feature | Value |
|----------|-------|
| Idea | Insert each element into its correct position |
| Elements fixed after each pass | Sorted portion grows by one element |
| Best Time | O(n) |
| Average Time | O(n²) |
| Worst Time | O(n²) |
| Space | O(1) |
| Stable | Yes |
| In-place | Yes |
| Adaptive | Yes |

---
## Summary

- **Algorithm Type:** Comparison-based Sorting
- **Stable:** Yes
- **In-place:** Yes
- **Adaptive:** Yes
- **Worst Time Complexity:** **O(n²)**
- **Average Time Complexity:** **O(n²)**
- **Best Time Complexity:** **O(n)**
- **Space Complexity:** **O(1)**

Insertion Sort repeatedly takes the next unsorted element and inserts it into its correct position within the sorted portion of the array. It is one of the best simple sorting algorithms for **small or nearly sorted datasets**, making it widely used as a component of more advanced sorting algorithms.
