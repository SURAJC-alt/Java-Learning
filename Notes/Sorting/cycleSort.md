# Cycle Sort 

Cycle Sort is a **comparison-based, in-place sorting algorithm** that places every element directly into its correct position.

This implementation is the specialized version commonly used in coding interviews, where the array contains numbers from **1 to n**.

Instead of repeatedly comparing neighboring elements, Cycle Sort determines the correct index of each value and swaps it directly into its proper position.

---

# Prerequisites

This algorithm works correctly only when:

- The array contains numbers from **1 to n**.
- Every number appears exactly once.

Example:

```text
✔ [3, 5, 2, 1, 4]

✘ [3, 5, 2, 8, 4]

✘ [3, 5, 2, 2, 4]
```

---

# Core Idea

Every number already knows where it belongs.

For an array containing numbers from **1 to n**:

```text
Correct Index = Value - 1
```

Examples

| Value | Correct Index |
|-------|---------------|
| 1 | 0 |
| 2 | 1 |
| 3 | 2 |
| 4 | 3 |
| 5 | 4 |

The algorithm repeatedly places every element into its correct index.

---

# Algorithm

1. Start from index `0`.
2. Find the correct index of the current element.

```text
correctIndex = arr[i] - 1
```

3. If the element is already in its correct position, move to the next index.
4. Otherwise, swap it with the element currently at its correct index.
5. Stay at the same index and repeat until the correct value reaches that position.
6. Continue until the end of the array.

---

# Example

Sort the following array:

```text
[3, 5, 2, 1, 4]
```

### Step 1

Current element = **3**

Correct index = **2**

```text
Swap 3 and 2

[2, 5, 3, 1, 4]
```

---

### Step 2

Current element = **2**

Correct index = **1**

```text
Swap 2 and 5

[5, 2, 3, 1, 4]
```

---

### Step 3

Current element = **5**

Correct index = **4**

```text
Swap 5 and 4

[4, 2, 3, 1, 5]
```

---

### Step 4

Current element = **4**

Correct index = **3**

```text
Swap 4 and 1

[1, 2, 3, 4, 5]
```

---

### Step 5

Current element = **1**

Already at the correct index.

Move to the next element.

The array is now sorted.

---

# Java Implementation

```java
public static void cycleSort(int[] arr) {

    int i = 0;

    while (i < arr.length) {

        int correctIndex = arr[i] - 1;

        if (arr[i] != arr[correctIndex]) {

            int temp = arr[i];
            arr[i] = arr[correctIndex];
            arr[correctIndex] = temp;

        } else {

            i++;

        }
    }
}
```

---

# Dry Run

For the array:

```text
[3, 5, 2, 1, 4]
```

| Step | Array |
|------|-------|
| Initial | `[3, 5, 2, 1, 4]` |
| Swap 3 ↔ 2 | `[2, 5, 3, 1, 4]` |
| Swap 2 ↔ 5 | `[5, 2, 3, 1, 4]` |
| Swap 5 ↔ 4 | `[4, 2, 3, 1, 5]` |
| Swap 4 ↔ 1 | `[1, 2, 3, 4, 5]` |

---

# Visualization

```text
[3,5,2,1,4]

↓

[2,5,3,1,4]

↓

[5,2,3,1,4]

↓

[4,2,3,1,5]

↓

[1,2,3,4,5]
```

---

# Why Doesn't `i` Increase After Every Swap?

Consider:

```text
[3, 1, 2]
```

At index `0`

```text
3 belongs at index 2
```

Swap

```text
[2, 1, 3]
```

Now index `0` contains **2**, which is also incorrect.

If we immediately move to the next index, the **2** would never be placed correctly.

Instead, the algorithm stays at the same index until the correct value arrives there.

Only then does `i` increase.

---

# Time Complexity

| Case | Complexity |
|------|------------|
| Best Case | **O(n)** |
| Average Case | **O(n)** |
| Worst Case | **O(n)** |

Each element is moved directly toward its correct position.

No element is unnecessarily revisited multiple times.

---

# Space Complexity

| Complexity |
|------------|
| **O(1)** |

The algorithm sorts the array without using any additional memory.

---

# Properties

| Property | Value |
|----------|-------|
| Algorithm Type | Index-Based Sorting |
| In-place | ✅ Yes |
| Stable | ❌ No |
| Adaptive | ❌ No |
| Recursive | ❌ No |

---

# Advantages

- Runs in linear time.
- Uses constant extra memory.
- Places elements directly into their correct positions.
- Extremely useful for interview problems involving numbers from **1 to n**.

---

# Disadvantages

- Works only for specific input patterns.
- Not suitable for general sorting problems.
- Not a stable sorting algorithm.

---

# Where Is Cycle Sort Used?

The **1 to n** version is extremely common in coding interviews.

It forms the basis of many array problems, including:

- Find the Missing Number
- Find All Missing Numbers
- Find All Duplicates
- Find the Duplicate Number
- Set Mismatch
- First Missing Positive

Instead of sorting for sorting's sake, the algorithm rearranges elements so these problems become easy to solve.

---

# Key Observations

- Every value has exactly one correct position.
- The correct position is calculated using:

```text
Value - 1
```

- An index is considered finished only when it contains the correct value.
- Every swap places at least one element into its final position.

---

# Summary

- **Algorithm Type:** Index-Based Sorting
- **Works For:** Arrays containing numbers from **1 to n**
- **In-place:** Yes
- **Stable:** No
- **Best Time Complexity:** **O(n)**
- **Average Time Complexity:** **O(n)**
- **Worst Time Complexity:** **O(n)**
- **Space Complexity:** **O(1)**

Cycle Sort repeatedly places each element into its correct index until every value is positioned where it belongs. Its ability to sort in linear time with constant extra space makes it a powerful technique for many interview problems involving arrays with values in a known range.
