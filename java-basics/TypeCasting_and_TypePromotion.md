#  Type Casting and Type Promotion in Java

Type casting is the process of converting a value from one data type to another.

Java supports two types of conversions:

1. Widening Conversion (Automatic)
2. Narrowing Conversion (Manual)

---

#  1. Widening Conversion (Automatic Casting)

Widening occurs when a smaller data type is converted into a larger data type.

Since the larger type can safely store all values of the smaller type, Java performs this conversion automatically.

Example:

```java
int smallNumber = 42;

double largeNumber = smallNumber;

System.out.println(largeNumber);
```

Output:

```text
42.0
```

Flow:

```text
int → long → float → double
```

No data is lost during widening conversion.

---

#  2. Narrowing Conversion (Manual Casting)

Narrowing occurs when a larger data type is converted into a smaller data type.

Since data loss may occur, Java requires explicit casting.

Syntax:

```java
(targetType) value
```

Example:

```java
double price = 9.99;

int roundedPrice = (int) price;

System.out.println(roundedPrice);
```

Output:

```text
9
```

### Important

Java does not round the number.

Instead, it removes everything after the decimal point.

```text
9.99 → 9
8.75 → 8
5.01 → 5
```

This process is called **truncation**.

---

#  Primitive Type Hierarchy

```text
byte → short → int → long → float → double
          ↘
           char
```

### Moving Left to Right

```text
byte → int → double
```

Widening Conversion

Automatic

---

### Moving Right to Left

```text
double → int → byte
```

Narrowing Conversion

Manual Casting Required

---

#  Type Promotion in Expressions

When Java performs arithmetic operations, it automatically promotes smaller data types to prevent data loss.

This process is called **Type Promotion**.

---

#  Rule 1: Minimum `int` Rule

Java never performs arithmetic using:

* byte
* short
* char

These types are automatically promoted to `int` before calculations.

Example:

```java
byte a = 40;
byte b = 50;

// byte c = a + b;  Error

int c = a + b; //  Correct
```

Explanation:

```text
byte + byte
      ↓
int + int
      ↓
int result
```

The result becomes an `int`.

---

#  Rule 2: Highest Rank Wins

If multiple data types are present in an expression, the entire expression is promoted to the highest-ranking type.

Ranking:

```text
int → long → float → double
```

Examples:

```java
int a = 10;
double b = 5.5;

double result = a + b;
```

Flow:

```text
int + double
      ↓
double + double
      ↓
double result
```

---

#  Type Promotion Example

```java
byte b = 42;
char c = 'a';
short s = 1024;
int i = 50000;
float f = 5.67f;
double d = 0.1234;

double result = (f * b) + (i / c) - (d * s);
```

### Step 1

```java
f * b
```

```text
float × byte
      ↓
float × float
      ↓
float
```

---

### Step 2

```java
i / c
```

```text
int ÷ char
      ↓
int ÷ int
      ↓
int
```

(`char 'a'` has Unicode value 97)

---

### Step 3

```java
d * s
```

```text
double × short
       ↓
double × double
       ↓
double
```

---

### Step 4

Now Java sees:

```text
float + int - double
```

First:

```text
float + int
      ↓
float + float
      ↓
float
```

Then:

```text
float - double
      ↓
double - double
      ↓
double
```

Final Result:

```text
double
```

Therefore:

```java
double result = ...
```

is required.

---

#  Summary:

### Widening Conversion

* Smaller type → Larger type
* Automatic
* No data loss

Example:

```java
int a = 10;
double b = a;
```

---

### Narrowing Conversion

* Larger type → Smaller type
* Manual casting required
* Data loss may occur

Example:

```java
double a = 9.99;
int b = (int) a;
```

---

### Type Promotion Rules

1. `byte`, `short`, and `char` are promoted to `int` during arithmetic operations.

2. In mixed-type expressions, the result is promoted to the highest-ranking type.

```text
int → long → float → double
```
