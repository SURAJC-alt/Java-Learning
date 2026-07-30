# Selection Sort

Selection Sort is a simple **comparison-based sorting algorithm** that repeatedly finds the **smallest element** from the unsorted portion of the array and places it at its correct position.

Unlike Bubble Sort, which swaps adjacent elements many times, Selection Sort performs **at most one swap per pass**, making it useful when minimizing write operations is important.

---

# 1. How Selection Sort Works

Selection Sort divides the array into two parts:

- **Sorted portion** (left side)
- **Unsorted portion** (right side)

During each pass:

1. Assume the first element of the unsorted portion is the smallest.
2. Scan the remaining unsorted elements.
3. If a smaller element is found, update the minimum index.
4. After scanning the entire unsorted portion, swap the smallest element with the first unsorted element.
5. Repeat until the array is sorted.

---

# 2. Example

Sort the following array:

```text
[64, 25, 12, 22, 11]
```

### Pass 1

Smallest element = **11**

```text
[11, 25, 12, 22, 64]
```

---

### Pass 2

Smallest element in the remaining array = **12**

```text
[11, 12, 25, 22, 64]
```

---

### Pass 3

Smallest element = **22**

```text
[11, 12, 22, 25, 64]
```

---

### Pass 4

Smallest element = **25**

```text
[11, 12, 22, 25, 64]
```

The array is now sorted.

---

# 3. Java Implementation

```java
public static void selectionSort(int[] arr) {

    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {

        int minIndex = i;

        for (int j = i + 1; j < n; j++) {

            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }

        }

        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}
```

---

# 4. Dry Run

For the array:

```text
[64, 25, 12, 22, 11]
```

| Pass | Array |
|------|-------|
| Initial | `[64, 25, 12, 22, 11]` |
| Pass 1 | `[11, 25, 12, 22, 64]` |
| Pass 2 | `[11, 12, 25, 22, 64]` |
| Pass 3 | `[11, 12, 22, 25, 64]` |
| Pass 4 | `[11, 12, 22, 25, 64]` |

---

# 5. Visualization

Initial Array

```text
[64, 25, 12, 22, 11]
```

After Pass 1

```text
[11, 25, 12, 22, 64]
 ↑
First element fixed
```

After Pass 2

```text
[11, 12, 25, 22, 64]
 ↑   ↑
First two elements fixed
```

After Pass 3

```text
[11, 12, 22, 25, 64]
 ↑   ↑   ↑
First three elements fixed
```

---

# 6. Time Complexity

| Case | Complexity |
|------|------------|
| Best Case | **O(n²)** |
| Average Case | **O(n²)** |
| Worst Case | **O(n²)** |

Selection Sort always scans the remaining unsorted elements to find the smallest value, regardless of whether the array is already sorted.

---

# 7. Space Complexity

Selection Sort sorts the array **in-place**.

**Space Complexity:** **O(1)**

---

# 8. Number of Swaps

One advantage of Selection Sort is that it performs **very few swaps**.

For an array of **n** elements:

- Maximum swaps = **n − 1**

This is much fewer than Bubble Sort, which may perform many swaps.

---

# 9. Advantages

- Easy to understand and implement.
- Uses constant extra memory.
- Performs very few swaps.
- Useful when swapping is expensive.

---

# 10. Disadvantages

- Inefficient for large datasets.
- Always performs O(n²) comparisons.
- Does not take advantage of an already sorted array.
- Generally slower than Merge Sort, Quick Sort, and Heap Sort.

---

# 11. Properties

| Property | Value |
|----------|-------|
| Algorithm Type | Comparison Sort |
| Stable | ❌ No |
| In-place | ✅ Yes |
| Adaptive | ❌ No |
| Recursive | ❌ No |

---

# 12. Bubble Sort vs Selection Sort

| Feature | Bubble Sort | Selection Sort |
|----------|-------------|----------------|
| Main Idea | Swap adjacent elements | Find the minimum element |
| Swaps | Many | At most n − 1 |
| Stable | Yes | No |
| Adaptive | Yes (Optimized) | No |
| Best Case | O(n) (Optimized) | O(n²) |
| Worst Case | O(n²) | O(n²) |

---

# 13. When Should You Use Selection Sort?

Selection Sort is useful when:

- Learning sorting algorithms.
- Working with small datasets.
- Memory writes (swaps) are expensive.

Avoid Selection Sort for:

- Large datasets.
- Competitive programming.
- Production applications.

Algorithms like **Merge Sort**, **Quick Sort**, and **Heap Sort** are significantly more efficient.

---

## Summary

- **Algorithm Type:** Comparison-based Sorting
- **Stable:** No
- **In-place:** Yes
- **Adaptive:** No
- **Worst Time Complexity:** **O(n²)**
- **Average Time Complexity:** **O(n²)**
- **Best Time Complexity:** **O(n²)**
- **Space Complexity:** **O(1)**

Selection Sort repeatedly selects the **smallest element** from the unsorted portion of the array and places it in its correct position. Although it performs fewer swaps than Bubble Sort, it still has quadratic time complexity and is mainly used for educational purposes.
