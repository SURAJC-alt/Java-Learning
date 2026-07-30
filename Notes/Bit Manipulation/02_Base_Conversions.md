# Base Conversions

## What is Base Conversion?

**Base Conversion** is the process of converting a number from one number system to another.

Common conversions include:

- Decimal → Binary
- Binary → Decimal
- Decimal → Octal
- Octal → Decimal
- Decimal → Hexadecimal
- Hexadecimal → Decimal
- Binary ↔ Octal
- Binary ↔ Hexadecimal

---

# Two Universal Conversion Methods

You don't need separate formulas for every conversion.

Almost all base conversions can be solved using **two methods**:

1. **Decimal → Any Base**
2. **Any Base → Decimal**

Once you know these, every other conversion becomes easy.

---

# Method 1: Decimal → Any Base

## Algorithm

1. Divide the decimal number by the target base.
2. Write down the remainder.
3. Divide the quotient again by the target base.
4. Repeat until the quotient becomes **0**.
5. Read the remainders **from bottom to top**.

---

# Example 1: Decimal → Binary

Convert

```
25₁₀
```

Divide repeatedly by **2**.

| Division | Quotient | Remainder |
|----------|---------:|----------:|
| 25 ÷ 2 | 12 | 1 |
| 12 ÷ 2 | 6 | 0 |
| 6 ÷ 2 | 3 | 0 |
| 3 ÷ 2 | 1 | 1 |
| 1 ÷ 2 | 0 | 1 |

Read the remainders **bottom to top**.

```
11001₂
```

Therefore,

```
25₁₀ = 11001₂
```

---

# Example 2: Decimal → Octal

Convert

```
83₁₀
```

Divide repeatedly by **8**.

| Division | Quotient | Remainder |
|----------|---------:|----------:|
| 83 ÷ 8 | 10 | 3 |
| 10 ÷ 8 | 1 | 2 |
| 1 ÷ 8 | 0 | 1 |

Read upward

```
123₈
```

Therefore,

```
83₁₀ = 123₈
```

---

# Example 3: Decimal → Hexadecimal

Convert

```
255₁₀
```

Divide repeatedly by **16**.

| Division | Quotient | Remainder |
|----------|---------:|----------:|
| 255 ÷ 16 | 15 | 15 (F) |
| 15 ÷ 16 | 0 | 15 (F) |

Read upward

```
FF₁₆
```

Therefore,

```
255₁₀ = FF₁₆
```

---

# Method 2: Any Base → Decimal

## Algorithm

1. Write the digits.
2. Start from the rightmost digit.
3. Assign powers beginning with **0**.
4. Multiply each digit by **Base^Power**.
5. Add all values.

---

# Example 1: Binary → Decimal

Convert

```
101101₂
```

| Bit | Power | Value |
|----:|------:|------:|
|1|2⁵|32|
|0|2⁴|0|
|1|2³|8|
|1|2²|4|
|0|2¹|0|
|1|2⁰|1|

Total

```
32 + 8 + 4 + 1

=

45
```

Therefore,

```
101101₂ = 45₁₀
```

---

# Example 2: Octal → Decimal

Convert

```
257₈
```

| Digit | Power | Value |
|------:|------:|------:|
|2|8²|128|
|5|8¹|40|
|7|8⁰|7|

Total

```
128 + 40 + 7

=

175
```

Therefore,

```
257₈ = 175₁₀
```

---

# Example 3: Hexadecimal → Decimal

Convert

```
3AF₁₆
```

Remember

```
A = 10

F = 15
```

| Digit | Power | Value |
|------:|------:|------:|
|3|16²|768|
|10|16¹|160|
|15|16⁰|15|

Total

```
768 + 160 + 15

=

943
```

Therefore,

```
3AF₁₆ = 943₁₀
```

---

# Binary ↔ Octal

Every **3 binary bits** correspond to **1 octal digit**.

## Binary → Octal

Example

```
101110011₂
```

Group from the right

```
101 110 011
```

Convert each group

```
101 → 5

110 → 6

011 → 3
```

Answer

```
563₈
```

---

## Octal → Binary

Convert

```
572₈
```

Replace each digit with 3 bits

```
5 → 101

7 → 111

2 → 010
```

Answer

```
101111010₂
```

---

# Binary ↔ Hexadecimal

Every **4 binary bits** correspond to **1 hexadecimal digit**.

## Binary → Hex

Example

```
11011111₂
```

Group into 4 bits

```
1101 1111
```

Convert

```
1101 → D

1111 → F
```

Answer

```
DF₁₆
```

---

## Hex → Binary

Convert

```
2A₁₆
```

Replace each digit

```
2 → 0010

A → 1010
```

Answer

```
00101010₂
```

---

# Quick Reference

## Binary Powers

| Power | Value |
|------:|------:|
|2⁰|1|
|2¹|2|
|2²|4|
|2³|8|
|2⁴|16|
|2⁵|32|
|2⁶|64|
|2⁷|128|

---

## Hexadecimal Digits

| Decimal | Hex |
|---------:|----:|
|10|A|
|11|B|
|12|C|
|13|D|
|14|E|
|15|F|

---
# Time Complexity

For a number with **d digits**:

| Conversion | Complexity |
|------------|------------|
| Decimal → Any Base | O(log n) |
| Any Base → Decimal | O(d) |
| Binary ↔ Octal | O(d) |
| Binary ↔ Hex | O(d) |

---

# Summary

- Base conversion allows numbers to be represented in different number systems.
- Use **repeated division** to convert from decimal to any base.
- Use **positional weights (Base^Power)** to convert from any base to decimal.
- Binary and octal are related through **3-bit groups**.
- Binary and hexadecimal are related through **4-bit groups**.
- These conversion techniques form the foundation for bit manipulation, computer architecture, and low-level programming.