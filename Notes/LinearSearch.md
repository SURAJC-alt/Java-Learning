# Linear Search

## What is Linear Search?

Linear Search (Sequential Search) is the simplest searching algorithm.

It searches for a target element by checking each element one by one from left to right until:

* The target is found.
* The array ends.

It works on both sorted and unsorted arrays.

---

## Example

```java
int[] arr = {18, 12, 19, 77, 29, 50};
int target = 77;
```

### Search Process

```text
Index 0 → 18 
Index 1 → 12 
Index 2 → 19 
Index 3 → 77  Found
```

Output:

```text
Element found at index 3
```

If the target does not exist:

```text
Return -1
```

---

## Algorithm

1. Start from index 0.
2. Compare the current element with the target.
3. If they match, return the index.
4. Otherwise move to the next element.
5. If the entire array is traversed and no match is found, return -1.

---

## Implementation

```java
public static int linearSearch(int[] arr, int target) {

    for (int i = 0; i < arr.length; i++) {

        if (arr[i] == target) {
            return i;
        }
    }

    return -1;
}
```

---

## Dry Run

```java
int[] arr = {10, 20, 30, 40};
int target = 30;
```

### Iteration 1

```text
i = 0
arr[i] = 10
10 == 30 ? no
```

### Iteration 2

```text
i = 1
arr[i] = 20
20 == 30 ? no
```

### Iteration 3

```text
i = 2
arr[i] = 30
30 == 30 ? Found
```

Return:

```java
2
```

---

## Time Complexity

### Best Case: O(1)

Target is present at the first index.

```text
[77, 12, 19, 29]

Target = 77
```

Only one comparison is required.

---

### Worst Case: O(n)

Target is at the last index or does not exist.

```text
[18, 12, 19, 77, 29, 50]

Target = 50
```

or

```text
Target = 100
```

Every element must be checked.

---

## Space Complexity

```text
O(1)
```

No extra data structures are used.

---

## Advantages

* Easy to understand and implement.
* Works on unsorted arrays.
* No preprocessing required.

---

## Disadvantages

* Slow for large datasets.
* Checks elements one by one.
* Less efficient than Binary Search.

---

## When to Use?

Use Linear Search when:

* The dataset is small.
* The array is unsorted.
* Simplicity is more important than performance.

---

## Summery:

* Linear Search scans elements sequentially.
* Works on both sorted and unsorted arrays.
* Returns the index if found, otherwise returns -1.
* Best Case: O(1)
* Worst Case: O(n)
* Space Complexity: O(1)
