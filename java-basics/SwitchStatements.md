# Java Programming: Switch Statements

## Introduction

Conditional statements allow us to control the execution flow of a program.

While `if-else` statements are ideal for handling binary conditions (true/false decisions), **switch statements** provide a cleaner way to handle multiple possible values of a single variable.

---

# Traditional Switch Statement

```java
String day = "Monday";

switch (day) {
    case "Monday":
        System.out.println("Start of the work week!");
        break;

    case "Friday":
        System.out.println("Weekend is almost here!");
        break;

    default:
        System.out.println("Just another regular day.");
        break;
}
```

---

## Key Components

### 1. `case`

Each `case` represents a possible value that the switch expression can match.

```java
case "Monday":
```

If the value matches, Java executes the corresponding block.

---

### 2. `break`

The `break` statement immediately terminates the switch block.

```java
break;
```

Without `break`, Java continues executing the code below the matched case.

This behavior is called **Fall-Through**.

Example:

```java
int num = 1;

switch (num) {
    case 1:
        System.out.println("One");

    case 2:
        System.out.println("Two");
}
```

Output:

```text
One
Two
```

Since there is no `break` after Case 1, execution falls through to Case 2.

---

### 3. `default`

The `default` block executes when no case matches.

```java
default:
    System.out.println("Invalid Input");
```

It acts similarly to the final `else` block in an `if-else` chain.

---

# Supported Data Types

Java allows only certain data types inside switch expressions.

| Supported | Data Type |
| --------- | --------- |
| ✅         | int       |
| ✅         | byte      |
| ✅         | short     |
| ✅         | char      |
| ✅         | String    |
| ✅         | Enum      |

Example:

```java
char grade = 'A';

switch (grade) {
    case 'A':
        System.out.println("Excellent");
        break;
}
```

---

# Unsupported Data Types

| Not Supported | Reason                      |
| ------------- | --------------------------- |
| ❌ float       | Precision issues            |
| ❌ double      | Precision issues            |
| ❌ boolean     | Better handled with if-else |

Example:

```java
double value = 2.5;

// Not Allowed
switch(value) {
}
```

This produces a compilation error.

---

# Enhanced Switch Statement (Java 14+)

Modern Java introduced a cleaner switch syntax using the arrow operator (`->`).

```java
String operatorName = "Suraj";

switch (operatorName) {
    case "Suraj" ->
        System.out.println("Assigned to Machine A");

    case "Vinay" ->
        System.out.println("Assigned to Machine B");

    default ->
        System.out.println("Unassigned Operator");
}
```

---

## Advantages of Enhanced Switch

### No Fall-Through

The arrow syntax automatically stops execution after the matched case.

No `break` statement is required.

---

### Multiple Case Labels

Multiple values can be handled together.

```java
String day = "Sunday";

switch (day) {
    case "Saturday", "Sunday" ->
        System.out.println("Weekend");

    default ->
        System.out.println("Weekday");
}
```

---

### Switch as an Expression

A switch can directly return a value.

```java
String day = "Monday";

int code = switch (day) {
    case "Monday" -> 1;
    case "Friday" -> 5;
    default -> 0;
};
```

Output:

```text
1
```

---

# Summary

* `switch` is used for multi-way branching.
* `case` defines possible matching values.
* `break` prevents fall-through in traditional switch statements.
* `default` acts as a fallback option.
* Supported types include `int`, `char`, `String`, and `Enum`.
* Enhanced Switch (`->`) removes the need for `break`.
* Modern switch statements can return values and support multiple case labels.

---
