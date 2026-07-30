# Bubble Sort

Bubble Sort is one of the simplest **sorting algorithms**. It is a comparison-based algorithm that repeatedly compares **adjacent elements** and swaps them if they are in the wrong order.

The name comes from the way the largest unsorted elements **"bubble up"** to the end of the array after each pass, similar to air bubbles rising to the surface of water.

---

# 1. How Bubble Sort Works

Bubble Sort repeatedly traverses the array, comparing neighboring elements and swapping them whenever they are out of order.

### Algorithm

1. Start from the beginning of the array.
2. Compare the current element with the next element.
3. If the current element is greater than the next element, swap them.
4. Move one position to the right and repeat.
5. After one complete pass, the largest unsorted element reaches its correct position at the end.
6. Repeat the process for the remaining unsorted portion until the array is sorted.

---

# 2. Example

Sort the following array:

```text
[5, 1, 4, 2]
```

### Pass 1

```text
Compare 5 and 1 → Swap
[1, 5, 4, 2]

Compare 5 and 4 → Swap
[1, 4, 5, 2]

Compare 5 and 2 → Swap
[1, 4, 2, 5]
```

The largest element (`5`) has reached its correct position.

### Pass 2

```text
Compare 1 and 4 → No Swap
[1, 4, 2, 5]

Compare 4 and 2 → Swap
[1, 2, 4, 5]
```

The last two elements are now sorted.

### Pass 3

```text
Compare 1 and 2 → No Swap
[1, 2, 4, 5]
```

The array is now completely sorted.

---

# 3. Java Implementation

```java
public static void bubbleSort(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {

        for (int j = 0; j < n - i - 1; j++) {

            if (arr[j] > arr[j + 1]) {

                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

            }
        }
    }
}
```

---

# 4. Dry Run

For the array:

```text
[5, 1, 4, 2]
```

| Pass | Array |
|------|-------|
| Initial | `[5, 1, 4, 2]` |
| Pass 1 | `[1, 4, 2, 5]` |
| Pass 2 | `[1, 2, 4, 5]` |
| Pass 3 | `[1, 2, 4, 5]` |

---

# 5. Time Complexity

| Case | Complexity |
|------|------------|
| Best Case (Optimized) | **O(n)** |
| Best Case (Basic Version) | **O(n²)** |
| Average Case | **O(n²)** |
| Worst Case | **O(n²)** |

---

# 6. Space Complexity

Bubble Sort sorts the array **in-place**, meaning it does not require any extra array.

**Space Complexity:** **O(1)**

---

# 7. Advantages

- Very easy to understand and implement.
- Works in-place (constant extra memory).
- Stable sorting algorithm.
- Good for learning sorting fundamentals.

---

# 8. Disadvantages

- Very slow for large datasets.
- Performs many unnecessary comparisons.
- Much less efficient than algorithms like Merge Sort, Quick Sort, or Heap Sort.

---

# 9. Key Points

- Bubble Sort compares **adjacent elements**.
- If two adjacent elements are in the wrong order, they are swapped.
- After each pass, the **largest unsorted element** reaches its correct position.
- The unsorted portion becomes smaller after every pass.
- Bubble Sort is simple but inefficient for large inputs.

---

## Summary

- **Algorithm Type:** Comparison-based Sorting
- **Stable:** Yes
- **In-place:** Yes
- **Worst Time Complexity:** **O(n²)**
- **Average Time Complexity:** **O(n²)**
- **Best Time Complexity:** **O(n)** (Optimized with a swapped flag)
- **Space Complexity:** **O(1)**

Bubble Sort is an excellent algorithm for understanding the basics of sorting, but it is rarely used in real-world applications because more efficient algorithms exist.
