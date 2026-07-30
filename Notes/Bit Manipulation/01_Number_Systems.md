# Number Systems

## What is a Number System?

A **Number System** is a method of representing numbers using a fixed set of symbols (digits).

Each number system has a **base (radix)**, which determines:

- The number of unique digits available.
- The place value of each digit.

---

# What is a Base (Radix)?

The **base** tells us how many unique digits are available before carrying over to the next position.

Examples:

| Base | Digits |
|------|--------|
| Base 2 | 0, 1 |
| Base 8 | 0 – 7 |
| Base 10 | 0 – 9 |
| Base 16 | 0 – 9, A – F |

---

# Why Do Computers Use Binary?

Computers are built using billions of tiny electronic switches called **transistors**.

A transistor has only two stable states:

```
OFF → 0

ON → 1
```

Because hardware naturally understands only these two states, every piece of data inside a computer is stored as **binary**.

Everything eventually becomes binary:

- Numbers
- Characters
- Images
- Videos
- Programs
- Instructions

---

# Common Number Systems

There are four important number systems used in Computer Science.

| Number System | Base | Digits |
|---------------|------|--------|
| Decimal | 10 | 0–9 |
| Binary | 2 | 0,1 |
| Octal | 8 | 0–7 |
| Hexadecimal | 16 | 0–9, A–F |

---

# 1. Decimal Number System (Base 10)

This is the number system humans use every day.

Digits available

```
0 1 2 3 4 5 6 7 8 9
```

Example

```
583
```

Place values

```
5 × 10²

+

8 × 10¹

+

3 × 10⁰
```

```
500 + 80 + 3

=

583
```

---

# 2. Binary Number System (Base 2)

Binary uses only two digits.

```
0

1
```

Each position represents a power of 2.

Example

```
1011₂
```

Place values

```
1 × 2³

+

0 × 2²

+

1 × 2¹

+

1 × 2⁰
```

```
8 + 0 + 2 + 1

=

11₁₀
```

---

# Binary Place Values

```
Bit Position

7   6   5   4   3   2   1   0

↓

128 64 32 16 8 4 2 1
```

Example

```
11001010
```

```
128

+

64

+

8

+

2

=

202
```

---

# 3. Octal Number System (Base 8)

Octal uses

```
0–7
```

Each position represents powers of 8.

Example

```
347₈
```

```
3 × 8²

+

4 × 8¹

+

7 × 8⁰
```

```
192 + 32 + 7

=

231₁₀
```

---

# Why is Octal Useful?

Every **3 binary bits** can be represented by **one octal digit**.

Example

```
101 111 010
```

↓

```
5 7 2
```

Octal

```
572₈
```

---

# 4. Hexadecimal Number System (Base 16)

Hexadecimal uses

```
0 1 2 3 4 5 6 7 8 9

A B C D E F
```

Letters represent

| Symbol | Value |
|---------|------:|
| A | 10 |
| B | 11 |
| C | 12 |
| D | 13 |
| E | 14 |
| F | 15 |

Example

```
2AF₁₆
```

```
2 × 16²

+

10 × 16¹

+

15 × 16⁰
```

```
512 + 160 + 15

=

687₁₀
```

---

# Why is Hexadecimal Used?

Every **4 binary bits** can be represented by **one hexadecimal digit**.

Example

```
1010 1111
```

↓

```
A F
```

Hexadecimal

```
AF₁₆
```

This makes long binary numbers much easier to read.

---

# Binary, Octal and Hex Mapping

| Binary | Octal | Hex |
|---------|------:|----:|
| 000 | 0 | 0 |
| 001 | 1 | 1 |
| 010 | 2 | 2 |
| 011 | 3 | 3 |
| 100 | 4 | 4 |
| 101 | 5 | 5 |
| 110 | 6 | 6 |
| 111 | 7 | 7 |

---

# Hexadecimal Mapping

| Decimal | Hex |
|---------:|----:|
| 0 | 0 |
| 1 | 1 |
| 2 | 2 |
| 3 | 3 |
| 4 | 4 |
| 5 | 5 |
| 6 | 6 |
| 7 | 7 |
| 8 | 8 |
| 9 | 9 |
| 10 | A |
| 11 | B |
| 12 | C |
| 13 | D |
| 14 | E |
| 15 | F |

---

# Why Learn Number Systems?

Understanding number systems is essential for:

- Bit Manipulation
- Computer Architecture
- Memory Addressing
- Networking
- Operating Systems
- Embedded Systems
- Cybersecurity

Many bitwise operations become much easier when you can quickly convert between binary and hexadecimal.

---

# Summary

- A number system is a way of representing numbers.
- The **base** determines the number of available digits.
- Computers use **binary (Base 2)** because hardware has only two electrical states: ON and OFF.
- Octal provides a compact representation of binary using groups of **3 bits**.
- Hexadecimal provides an even more compact representation using groups of **4 bits**.
- Understanding number systems is the foundation for learning bit manipulation and low-level programming.