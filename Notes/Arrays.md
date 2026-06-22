# Arrays in Java

## Why Do We Need Arrays?

Imagine storing a single roll number:

```java
int rollNo = 19;
```

This is manageable.

But what if you need to store 500 roll numbers?

```java
int rollNo1;
int rollNo2;
int rollNo3;
...
```

This quickly becomes impossible to manage.

Arrays solve this problem by allowing us to store multiple values of the same data type under a single variable name.

---

# Array Declaration and Initialization

## Step 1: Declaration

```java
int[] rnos;
```

At this point:

* A reference variable is created.
* It lives in Stack Memory.
* No actual array exists yet.

```text
Stack
└── rnos
```

---

## Step 2: Memory Allocation

```java
rnos = new int[5];
```

The `new` keyword creates the actual array object in Heap Memory.

```text
Stack               Heap
rnos ───────────► [0,0,0,0,0]
```

Now the reference variable points to the array object.

---

# Array Syntax

```java
datatype[] referenceVariable = new datatype[size];
```

Example:

```java
int[] numbers = new int[5];
```

---

# Memory Management

## Primitive Types

Primitives store actual values.

```java
int x = 10;
```

```text
Stack
└── x = 10
```

---

## Objects

Arrays and Strings are objects.

```java
int[] arr = new int[5];
```

```text
Stack              Heap
arr ─────────► Array Object
```

The Stack stores the reference.

The Heap stores the actual data.

---

# Garbage Collection

Java automatically removes unused objects.

Example:

```java
int[] arr = new int[5];

arr = new int[10];
```

The original array no longer has a reference.

```text
Old Array
↓
Unreachable
↓
Garbage Collector removes it
```

---

# Understanding null

`null` means a reference points to nothing.

```java
String name = null;
```

Valid because String is an object.

```java
int x = null;
```

Invalid because int is a primitive.

---

# Default Values in Arrays

When an array is created, Java automatically initializes every element.

## Integer Array

```java
int[] arr = new int[5];
```

Output:

```text
[0, 0, 0, 0, 0]
```

---

## Boolean Array

```java
boolean[] arr = new boolean[3];
```

Output:

```text
[false, false, false]
```

---

## String Array

```java
String[] arr = new String[3];
```

Output:

```text
[null, null, null]
```

---

# Array Traversal

Traversal means visiting every element.

---

## Traditional for Loop

```java
for(int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

Use when index access is required.

---

## Enhanced For-Each Loop

```java
for(int num : arr) {
    System.out.println(num);
}
```

Here:

```java
num
```

stores a copy of each element during iteration.

Useful when you only need values.

---

## Arrays.toString()

Fastest way to print arrays.

```java
System.out.println(Arrays.toString(arr));
```

Output:

```text
[10, 20, 30]
```

Internally Java loops through the array and builds a formatted String.

---

# Passing Arrays to Methods

Java uses:

## Pass-By-Value of the Reference

Example:

```java
public static void change(int[] arr) {
    arr[0] = 99;
}
```

```java
int[] nums = {1,2,3};

change(nums);

System.out.println(nums[0]);
```

Output:

```text
99
```

---

## Why?

Before method call:

```text
nums ───► [1,2,3]
```

After method call:

```text
nums ───► [99,2,3]
```

Both variables point to the same Heap object.

Changing contents changes the original array.

---

# Multidimensional Arrays (2D Arrays)

## Definition

A 2D array is an array of arrays.

```java
int[][] arr = new int[3][4];
```

Creates:

* 3 rows
* 4 columns

---

# Internal Structure

```text
Stack

arr
 │
 ▼

Heap

Row0 ──► [0,0,0,0]
Row1 ──► [0,0,0,0]
Row2 ──► [0,0,0,0]
```

The parent array stores references to child arrays.

---

# Jagged Arrays

Rows can have different lengths.

```java
int[][] arr = {
    {1,2},
    {3,4,5,6},
    {7}
};
```

Output Structure:

```text
Row 0 → 2 elements
Row 1 → 4 elements
Row 2 → 1 element
```

---

# Traversing a 2D Array

```java
for(int row = 0; row < arr.length; row++) {

    for(int col = 0; col < arr[row].length; col++) {

        System.out.print(arr[row][col] + " ");

    }
}
```

Outer loop:

```java
arr.length
```

controls rows.

Inner loop:

```java
arr[row].length
```

controls columns.

---

# ArrayList

## Problem with Arrays

Arrays have fixed size.

```java
int[] arr = new int[5];
```

Size can never change.

---

# Dynamic Arrays using ArrayList

```java
ArrayList<Integer> list = new ArrayList<>();
```

Elements can be added dynamically.

```java
list.add(10);
list.add(20);
list.add(30);
```

---

# Common Operations

## Add

```java
list.add(50);
```

---

## Get

```java
list.get(0);
```

---

## Update

```java
list.set(0, 100);
```

---

## Remove

```java
list.remove(0);
```

---

## Size

```java
list.size();
```

---

# How ArrayList Works Internally

Suppose:

```java
ArrayList<Integer> list = new ArrayList<>(3);
```

Memory:

```text
[10,20,30]
```

Now:

```java
list.add(40);
```

Capacity exceeded.

Java:

1. Creates a larger array.
2. Copies existing elements.
3. Updates internal reference.
4. Old array becomes garbage.

```text
Old Array
↓
Garbage Collector
```

This process is automatic.

---

# Arrays vs ArrayList

| Feature           | Array  | ArrayList       |
| ----------------- | ------ | --------------- |
| Size              | Fixed  | Dynamic         |
| Primitive Support | Yes    | Wrapper Classes |
| Performance       | Faster | Slightly Slower |
| Built-in Methods  | Few    | Many            |
| Resizable         | No     | Yes             |

---

# Summery:

* Arrays store multiple values of the same data type.
* Arrays are objects stored in Heap Memory.
* Reference variables live in Stack Memory.
* Java automatically initializes array elements.
* Arrays use pass-by-value of the reference.
* A 2D array is an array of arrays.
* Rows can have different lengths (Jagged Arrays).
* ArrayList provides dynamic resizing.
* ArrayList internally uses arrays and automatic resizing.
