# Insertion Sort

Insertion Sort is a simple **comparison-based sorting algorithm** that builds a sorted array one element at a time.

During each iteration, the algorithm takes the next element from the unsorted portion and moves it toward its correct position by comparing it with the elements before it.

The process continues until the entire array becomes sorted.

---

# How It Works

1. Assume the first element is already sorted.
2. Pick the next element in the array.
3. Compare it with the element immediately before it.
4. If it is smaller, swap the two elements.
5. Continue moving the element backward until:
   - it reaches the beginning of the array, or
   - it is no longer smaller than the previous element.
6. Repeat the process for every remaining element.

---

# Example

Sort the following array:

```text
[12, 11, 13, 5]
```

### Pass 1

Current element: **11**

```text
12 > 11

Swap

[11, 12, 13, 5]
```

---

### Pass 2

Current element: **13**

```text
12 < 13

No swap needed.

[11, 12, 13, 5]
```

---

### Pass 3

Current element: **5**

```text
Swap with 13

[11, 12, 5, 13]

↓

Swap with 12

[11, 5, 12, 13]

↓

Swap with 11

[5, 11, 12, 13]
```

The array is now sorted.

---

# Java Implementation

```java
public static void insertionSort(int[] arr) {

    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {

        for (int j = i + 1; j > 0; j--) {

            if (arr[j] < arr[j - 1]) {

                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

            } else {
                break;
            }
        }
    }
}
```

---

# Dry Run

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

# Time Complexity

| Case | Complexity |
|------|------------|
| Best Case | **O(n)** |
| Average Case | **O(n²)** |
| Worst Case | **O(n²)** |

- **Best Case:** The array is already sorted, so the inner loop stops immediately.
- **Average Case:** Elements move a moderate distance toward their correct positions.
- **Worst Case:** The array is reverse sorted, causing every element to move to the beginning.

---

# Space Complexity

| Complexity |
|------------|
| **O(1)** |

Insertion Sort sorts the array in-place and requires only a constant amount of extra memory.

---

# Properties

| Property | Value |
|----------|-------|
| Algorithm Type | Comparison Sort |
| Stable | ✅ Yes |
| In-place | ✅ Yes |
| Adaptive | ✅ Yes |
| Recursive | ❌ No |

---

# Advantages

- Easy to understand and implement.
- Efficient for small datasets.
- Performs well on nearly sorted arrays.
- Requires only constant extra memory.
- Preserves the relative order of equal elements.

---

# Disadvantages

- Inefficient for large datasets.
- Worst-case time complexity is **O(n²)**.
- Performance decreases significantly on reverse sorted arrays.

---

# Key Points

- Builds the sorted portion from left to right.
- One new element is placed into its correct position during each pass.
- The inner loop moves backward through the sorted portion.
- The algorithm stops moving an element as soon as it reaches the correct position.
- Works efficiently when the array is already mostly sorted.

---

# Summary

- **Algorithm Type:** Comparison-based Sorting
- **Stable:** Yes
- **In-place:** Yes
- **Adaptive:** Yes
- **Best Time Complexity:** **O(n)**
- **Average Time Complexity:** **O(n²)**
- **Worst Time Complexity:** **O(n²)**
- **Space Complexity:** **O(1)**

Insertion Sort repeatedly inserts each element into its correct position within the sorted portion of the array until the entire array is sorted.
