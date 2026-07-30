# Bitwise Operators

## What are Bitwise Operators?

Bitwise operators work directly on the **binary representation** of numbers.

Instead of operating on decimal values, they manipulate **individual bits (0s and 1s)**.

Since computers store all data in binary, bitwise operations are extremely fast and are widely used in:

- Data Structures & Algorithms
- Operating Systems
- Computer Networks
- Embedded Systems
- Cryptography
- Graphics Programming
- Competitive Programming

---

# Why Use Bitwise Operators?

Normal arithmetic operations like:

```java
+
-
*
/
%
```

are performed using multiple hardware-level operations.

Bitwise operators work **directly on CPU registers**, making many operations faster and more efficient.

Examples:

- Check if a number is even or odd
- Multiply or divide by powers of 2
- Set, clear, or toggle bits
- Store multiple boolean values efficiently
- Solve XOR-based interview problems

---

# Binary Representation Example

Decimal

```
13
```

Binary

```
1101
```

```
8   4   2   1

↓

1   1   0   1
```

Every bit represents a power of 2.

---

# Bitwise AND (&)

The AND operator compares corresponding bits.

A bit becomes **1 only if both bits are 1**.

Truth Table

| A | B | A & B |
|---|---|:-----:|
|0|0|0|
|0|1|0|
|1|0|0|
|1|1|1|

Example

```
12 = 1100

10 = 1010
```

```
1100

1010

----

1000
```

Result

```
8
```

---

## Important Properties

```
X & 0 = 0
```

```
X & 1

=

Least Significant Bit of X
```

```
X & X = X
```

---

## Common Use

### Check Even or Odd

```java
if((n & 1) == 0)
```

Reason

```
Even

↓

Last bit = 0
```

```
Odd

↓

Last bit = 1
```

Examples

```
8

1000

↓

1000 & 0001

=

0
```

Even

```
9

1001

↓

1001 & 0001

=

1
```

Odd

---

# Bitwise OR (|)

OR returns **1 if at least one bit is 1**.

Truth Table

| A | B | A \| B |
|---|---|:------:|
|0|0|0|
|0|1|1|
|1|0|1|
|1|1|1|

Example

```
12 = 1100

10 = 1010
```

```
1100

1010

----

1110
```

Result

```
14
```

---

## Important Properties

```
X | 0 = X
```

```
X | X = X
```

```
X | 1

↓

Forces the bit to become 1
```

---

## Common Use

Used to **set** a bit.

Example

```
1000

|

0010

=

1010
```

---

# Bitwise XOR (^)

XOR returns **1 when the bits are different**.

Truth Table

| A | B | A ^ B |
|---|---|:-----:|
|0|0|0|
|0|1|1|
|1|0|1|
|1|1|0|

Example

```
12 = 1100

10 = 1010
```

```
1100

1010

----

0110
```

Result

```
6
```

---

## Important Properties

```
X ^ X = 0
```

```
X ^ 0 = X
```

```
A ^ B = B ^ A
```

```
(A ^ B) ^ C

=

A ^ (B ^ C)
```

---

## Common Uses

### Swap Without Temporary Variable

```java
a ^= b;
b ^= a;
a ^= b;
```

---

### Find Unique Number

If every element appears twice except one

```
2 3 5 3 2
```

```
2 ^ 3 ^ 5 ^ 3 ^ 2

↓

5
```

Because

```
X ^ X = 0
```

---

# Bitwise NOT (~)

NOT flips every bit.

```
0 → 1

1 → 0
```

Example

```
5

00000101
```

```
~

11111010
```

In Java

```
~5

=

-6
```

This happens because Java stores negative numbers using **Two's Complement**.

---

# Left Shift (<<)

The left shift operator moves bits to the left.

New bits on the right become **0**.

Example

```
5

00000101
```

```
5 << 1
```

```
00001010
```

Result

```
10
```

---

## Mathematical Property

```
a << b

=

a × 2ᵇ
```

Examples

```
5 << 1 = 10
```

```
5 << 2 = 20
```

```
7 << 3 = 56
```

---

# Right Shift (>>)

Moves bits to the right.

Bits shifted out are discarded.

Example

```
20

00010100
```

```
20 >> 2
```

```
00000101
```

Result

```
5
```

---

## Mathematical Property

```
a >> b

=

floor(a / 2ᵇ)
```

Examples

```
20 >> 1 = 10
```

```
20 >> 2 = 5
```

```
64 >> 3 = 8
```

---

# Operator Summary

| Operator | Name | Example |
|-----------|------|---------|
| `&` | AND | `5 & 3` |
| `|` | OR | `5 \| 3` |
| `^` | XOR | `5 ^ 3` |
| `~` | NOT | `~5` |
| `<<` | Left Shift | `5 << 1` |
| `>>` | Right Shift | `20 >> 2` |

---

# Time Complexity

Every bitwise operator works on a fixed number of bits.

```
O(1)
```

---

# Summary

- Bitwise operators manipulate individual bits instead of decimal values.
- **AND (`&`)** is commonly used for masking and checking bits.
- **OR (`|`)** is used to set bits.
- **XOR (`^`)** is used to toggle bits, swap values, and solve unique-element problems.
- **NOT (`~`)** flips all bits and works with Two's Complement for signed integers.
- **Left Shift (`<<`)** multiplies a number by powers of 2.
- **Right Shift (`>>`)** divides a number by powers of 2 (floor division).
- Mastering these operators is essential for bit manipulation, competitive programming, and many technical interviews.