# ArrayList in Java

## 1. What is an ArrayList?

A standard Java array has a major limitation: **its size is fixed once it is created**.

```java
int[] arr = new int[5];
```

The array above can only store 5 elements. If you need a 6th element, the array cannot grow automatically.

An **ArrayList** is a **Dynamic Array** provided by Java that can grow and shrink automatically as elements are added or removed.

---

# 2. Internal Working of ArrayList

Although ArrayList appears dynamic, internally it is built on top of a normal array.

Inside the ArrayList source code:

```java
transient Object[] elementData;
```

This means ArrayList stores its elements inside an internal `Object[]` array.

### Memory Structure

* The internal array stores references (memory addresses).
* Actual objects are stored separately on the Heap.
* ArrayList manages these references automatically.

---

# 3. Capacity vs Size:

## Capacity

Capacity refers to the size of the internal hidden array.

```java
ArrayList<String> list = new ArrayList<>();
```

Initially Java allocates some empty slots internally.

Example:

```text
Capacity = 10
```

---

## Size

Size refers to the number of elements currently stored.

```java
list.add("A");
list.add("B");
```

```text
Size = 2
Capacity = 10
```

---

# 4. How ArrayList Grows:

Suppose:

```text
Capacity = 10
Size = 10
```

Now you add the 11th element.

```java
list.add("New Item");
```

Java performs three steps internally:

## Step 1: Create a Bigger Array

A new larger array is created.

```text
Old Capacity = 10
New Capacity = 15
```

Java usually increases capacity by:

```text
New Capacity = Old Capacity + (Old Capacity / 2)
```

---

## Step 2: Copy Elements

All existing elements are copied into the new array.

```text
Old Array  ->  New Array
```

---

## Step 3: Abandon Old Array

The old array becomes unreachable.

The Garbage Collector later removes it from memory.

---

# 5. Creating an ArrayList

Import ArrayList:

```java
import java.util.ArrayList;
```

Create an ArrayList:

```java
ArrayList<String> list = new ArrayList<>();
```

---

# 6. Understanding the Syntax

## Generics

```java
ArrayList<String> list
```

`<String>` tells Java that this list can only store String objects.

Examples:

```java
ArrayList<Integer> numbers;
ArrayList<Double> marks;
ArrayList<Character> letters;
```

---

## Diamond Operator

```java
new ArrayList<>();
```

The empty angle brackets are called the **Diamond Operator**.

Java automatically infers the type from the left side.

Instead of:

```java
new ArrayList<String>();
```

we can write:

```java
new ArrayList<>();
```

---

# 7. Primitive Types Are Not Allowed

ArrayList stores Objects.

Therefore primitive types cannot be used directly.

❌ Invalid:

```java
ArrayList<int> list = new ArrayList<>();
```

✅ Correct:

```java
ArrayList<Integer> list = new ArrayList<>();
```

---

## Wrapper Classes

| Primitive | Wrapper Class |
| --------- | ------------- |
| int       | Integer       |
| double    | Double        |
| char      | Character     |
| boolean   | Boolean       |
| long      | Long          |
| float     | Float         |
| byte      | Byte          |
| short     | Short         |

Examples:

```java
ArrayList<Integer> numbers = new ArrayList<>();
ArrayList<Double> marks = new ArrayList<>();
ArrayList<Character> letters = new ArrayList<>();
```

---

# 8. Common ArrayList Methods

## add()

```java
fruits.add("Apple");
fruits.add("Banana");
```

Adds elements to the list.

---

## get()

```java
fruits.get(0);
```

Returns the element at a specific index.

---

## set()

```java
fruits.set(1, "Mango");
```

Updates an existing element.

---

## remove()

```java
fruits.remove(0);
```

Removes an element.

---

## size()

```java
fruits.size();
```

Returns the number of elements stored.

---

# Example

```java
ArrayList<String> fruits = new ArrayList<>();

fruits.add("Apple");
fruits.add("Banana");

String firstFruit = fruits.get(0);

fruits.set(1, "Mango");

fruits.remove(0);

int total = fruits.size();
```

---

# 9. Traversing an ArrayList

## Standard For Loop

```java
for (int i = 0; i < cars.size(); i++) {
    System.out.println(cars.get(i));
}
```

### Use When

* You need index values.
* You want to modify elements using indexes.

---

## Enhanced For Loop (For-Each)

```java
for (String car : cars) {
    System.out.println(car);
}
```

Read as:

```text
For each car inside cars
```

### Use When

* You only want to read data.
* Cleaner and easier syntax.

##

---

# 10. The Index Shift Problem

Suppose:

```text
[A, B, C, D]
```

You remove `B`.

```text
[A, C, D]
```

Notice how elements shift left.

If using a forward loop:

```java
for (int i = 0; i < list.size(); i++) {
    if (list.get(i).equals("B") ||
        list.get(i).equals("C")) {

        list.remove(i);
    }
}
```

The loop may accidentally skip elements.

---

# 11. Safe Removal Techniques

## Solution 1: Loop Backwards

```java
for (int i = list.size() - 1; i >= 0; i--) {
    if (list.get(i).equals("B")) {
        list.remove(i);
    }
}
```

### Why It Works

Elements that shift left are already processed.

No indexes are skipped.

---

## Solution 2: Iterator

```java
import java.util.Iterator;

Iterator<String> it = list.iterator();

while (it.hasNext()) {

    String letter = it.next();

    if (letter.equals("B")) {
        it.remove();
    }
}
```

### Important

Use:

```java
it.remove();
```

NOT:

```java
list.remove();
```

while iterating.

---

## Solution 3: removeIf()

Modern Java provides:

```java
list.removeIf(letter -> letter.equals("B")|| letter.equals("C"));
```

This is the cleanest and safest approach.

---

# 12. Enhanced For Loop Warning

Never add or remove elements while using a for-each loop.

```java
for (String item : list) {
    list.remove(item);
}
```

This throws:

```text
ConcurrentModificationException
```

because the collection is modified while being traversed.

---

# Summary

| Concept            | Description                       |
| ------------------ | --------------------------------- |
| ArrayList          | Dynamic version of an array       |
| Internal Structure | Uses an Object[] array internally |
| Capacity           | Total available slots             |
| Size               | Number of stored elements         |
| add()              | Insert element                    |
| get()              | Access element                    |
| set()              | Update element                    |
| remove()           | Delete element                    |
| size()             | Number of elements                |
| Standard for Loop  | Best when indexes are needed      |
| Enhanced for Loop  | Best for reading elements         |
| forEach()          | Modern Java traversal             |
| Iterator           | Safe removal while traversing     |
| removeIf()         | Clean modern removal              |
1. ArrayList is a dynamic array built on top of an internal Object array.
2. Capacity and Size are different concepts.
3. ArrayList automatically resizes itself when capacity is exceeded.
4. Primitive types cannot be stored directly; Wrapper Classes must be used.
5. Use Iterators or removeIf() when removing elements during traversal.
6. Never modify an ArrayList while using an enhanced for loop.
