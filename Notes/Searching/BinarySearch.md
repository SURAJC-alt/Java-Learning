# Binary Search

## What is Binary Search?

Binary Search is an efficient searching algorithm used on **sorted arrays**.

Instead of checking elements one by one like Linear Search, Binary Search repeatedly divides the search space into two halves until the target element is found.

> Requirement: The array must be sorted.

---

## Idea Behind Binary Search

Given a sorted array:

```java
int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
```

Target:

```java
36
```

### Steps

1. Find the middle element.
2. Compare the target with the middle element.
3. If target == middle → return index.
4. If target > middle → search in the right half.
5. If target < middle → search in the left half.
6. Repeat until found or search space becomes empty.

---

## Dry Run

```java
arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48}
target = 36
```

### Iteration 1

```text
start = 0
end = 9

mid = 4
arr[mid] = 11

36 > 11
Search Right Half
```

### Iteration 2

```text
start = 5
end = 9

mid = 7
arr[mid] = 20

36 > 20
Search Right Half
```

### Iteration 3

```text
start = 8
end = 9

mid = 8
arr[mid] = 36

Target Found
```

Output:

```java
8
```

---

## Java Implementation

```java
public static int binarySearch(int[] arr, int target) {

    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target > arr[mid]) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    return -1;
}
```

---

## Why Not Use (start + end) / 2 ?

Many beginners write:

```java
int mid = (start + end) / 2;
```

This works for small arrays but can cause integer overflow when start and end become very large.

Safe approach:

```java
int mid = start + (end - start) / 2;
```

This is the standard interview-friendly implementation.

---

## Time Complexity

### Best Case

```text
O(1)
```

The target is already at the first middle position checked.

---

### Worst Case

```text
O(log n)
```

The search space is cut in half after every comparison.

Example:

```text
1,000,000 elements

Linear Search  -> up to 1,000,000 comparisons
Binary Search  -> about 20 comparisons
```

Because:

```text
2^20 ≈ 1,048,576
```

---

## Space Complexity

```text
O(1)
```

The iterative approach uses only a few variables.

---

## Advantages

* Extremely fast on sorted data.
* Handles large datasets efficiently.
* Much better than Linear Search for large arrays.

---

## Limitations

* Array must be sorted.
* Not suitable for unsorted data.
* Slightly harder to understand than Linear Search.

---

# Order Agnostic Binary Search

## What is it?

Normally Binary Search assumes that the array is sorted in ascending order.

But sometimes we do not know whether the array is:

* Ascending
* Descending

Order Agnostic Binary Search first detects the sorting order and then applies Binary Search accordingly.

---

## Example

Ascending:

```java
{2, 4, 6, 9, 11, 20}
```

Descending:

```java
{90, 75, 18, 12, 6, 4, 3, 1}
```

---

## Detecting Order

```java
boolean isAsc = arr[start] < arr[end];
```

If:

```java
arr[start] < arr[end]
```

then the array is ascending.

Otherwise:

```java
arr[start] > arr[end]
```

the array is descending.

---

## Java Implementation

```java
public static int orderAgnosticBS(int[] arr, int target) {

    int start = 0;
    int end = arr.length - 1;

    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (isAsc) {

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        } else {

            if (target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }

    return -1;
}
```

---

## Summery:

* Binary Search requires sorted data.
* Uses start, end, and mid pointers.
* Eliminates half of the search space every step.
* Worst Case Time Complexity = O(log n).
* Space Complexity = O(1).
* Order Agnostic Binary Search works for both ascending and descending arrays.
