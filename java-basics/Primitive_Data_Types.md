#  Primitive Data Types in Java

Primitive data types are the most basic data types built directly into the Java language. They are used to store simple, single values such as numbers, characters, and true/false values.

---

##  Characteristics of Primitive Data Types

### 1. Store a Single Value

A primitive variable stores exactly one value at a time.

Examples:

```java
int age = 19;
char grade = 'A';
boolean isJavaFun = true;
```

Each variable contains a single piece of data.

---

### 2. They Are Not Objects

Primitive data types are built directly into Java and are not created from classes.

Because they are not objects, they do not have methods.

Example:

```java
String name = "Suraj";
```

This works because `String` is an object type:

```java
name.toUpperCase();
```

However:

```java
int age = 19;
```

This is invalid:

```java
age.toUpperCase(); // Error
```

because `int` is a primitive type and has no methods.

---

### 3. Store Their Value Directly

Primitive variables directly contain their data value.

Example:

```java
int age = 19;
```

Conceptually:

```text
age
 └── 19
```

The variable directly stores the value.

---

##  Primitive vs Non-Primitive Types

### Primitive Type

```java
int age = 19;
```

```text
age
 └── 19
```

The value is stored directly.

---

### Non-Primitive Type

```java
String name = "Suraj";
```

```text
name
   │
   ▼
"Suraj"
```

The variable refers to an object.

---

##  The 8 Primitive Data Types

| Type    | Stores                  | Size          | Example                     |
| ------- | ----------------------- | ------------- | --------------------------- |
| byte    | Small whole numbers     | 1 byte        | `byte age = 25;`            |
| short   | Small whole numbers     | 2 bytes       | `short salary = 15000;`     |
| int     | Standard whole numbers  | 4 bytes       | `int population = 850000;`  |
| long    | Large whole numbers     | 8 bytes       | `long stars = 9999999999L;` |
| float   | Decimal numbers         | 4 bytes       | `float pi = 3.14F;`         |
| double  | Precise decimal numbers | 8 bytes       | `double price = 19.99;`     |
| char    | Single character        | 2 bytes       | `char grade = 'A';`         |
| boolean | True or False           | JVM dependent | `boolean isJavaFun = true;` |

---

#  Why Do We Need `L` for `long`?

By default, Java treats whole-number literals as `int`.

Example:

```java
long population = 8000000000;
```

This causes an error because Java first interprets `8000000000` as an `int`, and the value exceeds the range of `int`.

Correct:

```java
long population = 8000000000L;
```

The `L` tells Java to treat the literal as a `long`.

---

#  Why Do We Need `F` for `float`?

By default, Java treats decimal literals as `double`.

Example:

```java
float pi = 3.14;
```

This causes an error because Java sees `3.14` as a `double`.

Correct:

```java
float pi = 3.14F;
```

The `F` tells Java to treat the literal as a `float`.

---

## Quick Summary

* Primitive data types are built directly into Java.
* They store simple, single values.
* They are not objects.
* They do not have methods.
* Java provides 8 primitive data types.
* Whole numbers default to `int`.
* Decimal numbers default to `double`.
* Use `L` for `long` literals.
* Use `F` for `float` literals.

```
```
