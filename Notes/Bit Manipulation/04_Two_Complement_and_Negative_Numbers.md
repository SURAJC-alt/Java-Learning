# Two's Complement and Negative Numbers

## Why Do Computers Need a Special Representation for Negative Numbers?

Computers store all data in **binary (0s and 1s)**.

Positive numbers are easy to represent:

```
5

↓

00000101
```

But how should a computer represent:

```
-5
```

Simply adding a minus (`-`) sign is not possible because hardware only understands **bits**.

To solve this problem, modern computers use **Two's Complement**.

---

# Signed vs Unsigned Numbers

## Unsigned Numbers

All bits are used to represent the value.

Example (8 bits)

```
00000000

↓

0
```

```
11111111

↓

255
```

Range

```
0 → 255
```

---

## Signed Numbers

The leftmost bit is reserved for the **sign**.

```
MSB

↓

Most Significant Bit
```

```
0

↓

Positive
```

```
1

↓

Negative
```

Example (8 bits)

```
0xxxxxxx

↓

Positive
```

```
1xxxxxxx

↓

Negative
```

---

# Memory Layout (8-bit Signed Integer)

```
MSB                                LSB

↓

+------+------+------+------+------+------+------+------+
|Sign | 64 | 32 | 16 | 8 | 4 | 2 | 1 |
+------+------+------+------+------+------+------+------+
```

The **MSB (Most Significant Bit)** acts as the **sign bit**.

---

# Why Two's Complement?

Early computers used other methods like:

- Sign-Magnitude
- One's Complement

These approaches had problems such as:

- Two representations of zero
- More complex arithmetic circuits

Two's Complement solves these issues by allowing the CPU to perform **addition and subtraction using the same hardware**.

---

# How to Find Two's Complement

There are **3 simple steps**.

---

## Step 1: Write the Positive Binary Number

Example

```
5
```

Binary (8 bits)

```
00000101
```

---

## Step 2: Find One's Complement

Flip every bit.

```
00000101
```

↓

```
11111010
```

This is called the **One's Complement**.

---

## Step 3: Add 1

```
11111010

+

00000001

-----------

11111011
```

Therefore,

```
-5

=

11111011
```

---

# Example: Represent -13

## Step 1

```
13

↓

00001101
```

---

## Step 2

Invert every bit

```
11110010
```

---

## Step 3

Add 1

```
11110010

+

00000001

-----------

11110011
```

Therefore

```
-13

=

11110011
```

---

# Converting Back to Decimal

Suppose we have

```
11111011
```

How do we know its value?

### Step 1

Since the MSB is **1**, it is a negative number.

---

### Step 2

Take Two's Complement again.

Invert

```
11111011

↓

00000100
```

Add 1

```
00000100

+

1

=

00000101
```

Result

```
5
```

Therefore

```
11111011

=

-5
```

---

# Why Does ~5 Equal -6?

Binary of 5

```
00000101
```

Apply NOT (`~`)

```
11111010
```

This binary is already in **Two's Complement** form.

Convert it back:

Invert

```
00000101
```

Add 1

```
00000110
```

```
6
```

Therefore

```
11111010

=

-6
```

Hence,

```java
~5

=

-6
```

---

# Range of Signed Numbers

For an **n-bit signed integer**, one bit is used for the sign.

General Formula

```
Minimum

=

-2^(n-1)
```

```
Maximum

=

2^(n-1) - 1
```

Range

```
[-2^(n-1), 2^(n-1)-1]
```

---

# Example: 8-bit Integer

```
n = 8
```

Minimum

```
-2^(8-1)

=

-2^7

=

-128
```

Maximum

```
2^7 - 1

=

127
```

Range

```
-128

↓

127
```

---

# Common Integer Ranges

| Bits | Minimum | Maximum |
|------|---------:|---------:|
| 8 | -128 | 127 |
| 16 | -32,768 | 32,767 |
| 32 | -2³¹ | 2³¹−1 |
| 64 | -2⁶³ | 2⁶³−1 |

---

# Why is There One More Negative Number?

For an 8-bit integer

Positive numbers

```
1 → 127
```

Negative numbers

```
-1 → -128
```

Zero also requires one binary pattern.

Therefore, the positive side ends at

```
127
```

instead of

```
128
```

---

# Two's Complement Properties

## Positive Numbers

Remain unchanged.

Example

```
7

↓

00000111
```

---

## Negative Numbers

Stored using Two's Complement.

Example

```
-7

↓

11111001
```

---

## Only One Representation of Zero

```
00000000
```

Unlike older systems, Two's Complement has **only one zero**, simplifying arithmetic.

---

# Advantages of Two's Complement

- Simple hardware implementation
- Faster addition and subtraction
- Only one representation of zero
- Easy overflow detection
- Used by almost every modern processor

---

# Java Integer Types

| Type | Size | Range |
|------|-----:|-------:|
| byte | 8 bits | -128 to 127 |
| short | 16 bits | -32,768 to 32,767 |
| int | 32 bits | -2³¹ to 2³¹−1 |
| long | 64 bits | -2⁶³ to 2⁶³−1 |

All Java signed integer types use **Two's Complement**.

---

# Summary

- Computers use **Two's Complement** to represent negative numbers.
- The **MSB** is the sign bit in signed integers.
- To find the Two's Complement:
  1. Write the positive binary number.
  2. Invert all bits (One's Complement).
  3. Add **1**.
- The range of an **n-bit signed integer** is **[-2^(n-1), 2^(n-1)-1]**.
- Java stores all signed integer types (`byte`, `short`, `int`, and `long`) using Two's Complement.
- Understanding Two's Complement is essential for bit manipulation, computer architecture, operating systems, and technical interviews.