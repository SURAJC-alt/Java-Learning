# Strings & StringBuilder in Java

## Overview

Strings are one of the most frequently used data types in Java. Understanding how Java stores and manages Strings is essential for writing efficient programs and performing well in interviews.

---

# 1. Memory Structure

## Stack vs Heap

Java divides memory into two major areas:

### Stack
Stores:
- Primitive values (`int`, `char`, `double`, etc.)
- References (memory addresses) to objects
- Method calls and local variables

### Heap
Stores:
- Objects
- Arrays
- String objects
- Dynamic memory allocations

Example:

```java
String name = "Suraj";
```

```
Stack                     Heap
------                    ----------------
name  ------------->      "Suraj"
```

The variable `name` stores only the reference.

The actual String object lives in Heap memory.

---

# 2. String Constant Pool (SCP)

Java optimizes memory using the **String Constant Pool**.

Instead of creating duplicate String objects, Java reuses existing literals.

Example:

```java
String a = "Suraj";
String b = "Suraj";
```

Only one object is created.

```
Stack                 Heap

a --------\
           \
            -------> "Suraj"
           /
b --------/
```

Both variables point to the same object.

---

# 3. Using the `new` Keyword

```java
String a = new String("Suraj");
String b = new String("Suraj");
```

Output:

```
Stack

a -----------> Heap Object 1

b -----------> Heap Object 2
```

Even though both contain the same text, Java creates two separate objects.

Therefore,

```java
a == b
```

returns

```java
false
```

---

# 4. Immutability

Strings are **immutable**.

Once created, a String object cannot be modified.

Example:

```java
String name = "Suraj";
name = "Chitragar";
```

Java does **not** modify `"Suraj"`.

Instead,

1. Creates `"Chitragar"` (if it doesn't already exist).
2. Changes the reference.
3. Leaves `"Suraj"` unchanged.

If no references point to `"Suraj"`, it becomes eligible for Garbage Collection.

---

# Why Strings are Immutable

Advantages:

- Memory Optimization (String Pool)
- Thread Safety
- Better Security
- Reliable Hashing
- Efficient Caching

---

# 5. Comparing Strings

## Using `==`

Checks whether two references point to the same object.

```java
String a = "Suraj";
String b = "Suraj";

System.out.println(a == b);
```

Output

```
true
```

---

```java
String a = new String("suraj");
String b = new String("suraj");

System.out.println(a == b);
```

Output

```
false
```

---

## Using `.equals()`

Checks whether the contents are equal.

```java
String a = new String("suraj");
String b = new String("suraj");

System.out.println(a.equals(b));
```

Output

```
true
```

---

# 6. String Performance Problem

Example:

```java
String s = "";

for(int i = 0; i < n; i++){
    s += i;
}
```

Since Strings are immutable,

Every iteration:

- Creates a new String
- Copies previous characters
- Adds new characters
- Discards old String

Total work becomes

```
1 + 2 + 3 + ... + n
```

Time Complexity

```
O(n²)
```

This is inefficient for repeated modifications.

---

# 7. StringBuilder

`StringBuilder` solves this problem.

Instead of creating new objects repeatedly, it modifies the same internal character buffer.

Example

```java
StringBuilder builder = new StringBuilder();

for(int i = 0; i < n; i++){
    builder.append(i);
}
```

Time Complexity

```
O(n)
```

---

# Why StringBuilder?

- Mutable
- Faster
- Less memory usage
- Best for repeated concatenation

---

# 8. Common String Methods

```java
String name = "  Suraj Chitragar  ";
```

### Length

```java
name.length();
```

---

### Character at Index

```java
name.charAt(2);
```

---

### Convert to Character Array

```java
name.toCharArray();
```

---

### Lowercase

```java
name.toLowerCase();
```

---

### Uppercase

```java
name.toUpperCase();
```

---

### First Occurrence

```java
name.indexOf('a');
```

---

### Last Occurrence

```java
name.lastIndexOf('a');
```

---

### Remove Leading & Trailing Spaces

```java
name.strip();
```

---

### Split String

```java
name.split(" ");
```

---

# 9. Common StringBuilder Methods

Create

```java
StringBuilder builder = new StringBuilder();
```

Append

```java
builder.append("Java");
```

Delete Character

```java
builder.deleteCharAt(3);
```

Reverse

```java
builder.reverse();
```

Convert to String

```java
builder.toString();
```

---

# 10. Operator Overloading

Characters behave like integers.

```java
System.out.println('a' + 'b');
```

Output

```
195
```

ASCII Values

```
'a' = 97
'b' = 98
```

97 + 98 = 195

---

If one operand is a String,

```java
System.out.println("a" + 1);
```

Output

```
a1
```

The `+` operator performs String concatenation.

---

# 11. Printing Arrays

```java
int[] arr = {1,2,3};

System.out.println(arr);
```

Output

```
[I@6d06d69c
```

To print properly,

```java
Arrays.toString(arr);
```

Output

```
[1, 2, 3]
```

---

# 12. Pretty Printing

Java provides formatted output using `printf()`.

Example

```java
String name = "Suraj";
int age = 19;

System.out.printf("My name is %s and I am %d years old.", name, age);
```

Output

```
My name is Suraj and I am 19 years old.
```

---

## Formatting Floating Numbers

```java
float pi = 3.141592f;

System.out.printf("%.2f", pi);
```

Output

```
3.14
```

---

# Common Format Specifiers

| Specifier | Description |
|-----------|-------------|
| `%s` | String |
| `%d` | Integer |
| `%f` | Floating Point |
| `%c` | Character |
| `%x` | Hexadecimal |
| `%o` | Octal |
| `%e` | Scientific Notation |

---

# Important Points

- Stack stores references; Heap stores objects.
- String literals are stored in the String Constant Pool.
- Strings are immutable.
- `==` compares references.
- `.equals()` compares values.
- Repeated String concatenation is **O(n²)**.
- `StringBuilder` performs repeated modifications in **O(n)**.
- `Arrays.toString()` prints array contents.
- `printf()` is used for formatted output.

---

# Summary

- Learn **how Strings are stored**, not just how to use them.
- Always use **`.equals()`** for comparing String contents.
- Use **`StringBuilder`** whenever frequent modifications are required.
- Understand the **String Pool** and **immutability**, as they are common interview topics.
