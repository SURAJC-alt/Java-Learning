#  Control Flow and Loops in Java

Control flow statements allow a program to make decisions and repeat actions based on conditions.

Java provides:

* `if`
* `if-else`
* `if-else if-else`
* `while`
* `do-while`
* `for`

---

#  1. Decision Making with `if`, `else if`, and `else`

Java uses conditional statements to execute different blocks of code depending on whether a condition is `true` or `false`.

Every condition must evaluate to a `boolean` value.

---

## Basic `if` Statement

```java
int age = 20;

if (age >= 18) {
    System.out.println("Eligible to vote");
}
```

Flow:

```text
Condition
    ↓
 True ?
    ↓
 Execute Block
```

If the condition is false, Java skips the block.

---

## `if-else`

```java
int age = 16;

if (age >= 18) {
    System.out.println("Eligible");
} else {
    System.out.println("Not Eligible");
}
```

Flow:

```text
Condition
   ↓
True? ── Yes ──► if block
   │
   No
   │
   ▼
else block
```

Exactly one block executes.

---

## `if-else if-else`

```java
int score = 85;

if (score >= 90) {
    System.out.println("Grade A");
}
else if (score >= 80) {
    System.out.println("Grade B");
}
else {
    System.out.println("Grade C");
}
```

Output:

```text
Grade B
```

### Execution Process

1. Check `score >= 90`
2. If false, check `score >= 80`
3. If true, execute that block
4. Skip the remaining conditions

---

## Important Rule

```text
Only one block in an if-else-if chain can execute.

Once Java finds a true condition,
it executes that block and exits the chain.
```

---

#  2. Loops

Loops allow a block of code to execute repeatedly.

Java provides three major loops:

1. while
2. do-while
3. for

---

#  A. While Loop

The `while` loop checks the condition before executing.

### Syntax

```java
while(condition) {
    // code
}
```

### Example

```java
int count = 1;

while (count <= 3) {
    System.out.println(count);
    count++;
}
```

Output:

```text
1
2
3
```

---

## Execution Flow

```text
Check Condition
        ↓
      True
        ↓
   Execute Code
        ↓
 Update Variable
        ↓
Check Condition Again
```

---

## Infinite Loop Warning

```java
int count = 1;

while(count <= 3) {
    System.out.println(count);
}
```

Problem:

```text
count never changes
       ↓
condition always true
       ↓
infinite loop
```

Always ensure the loop variable changes.

---

#  B. Do-While Loop

The `do-while` loop executes the code first and checks the condition afterward.

### Syntax

```java
do {
    // code
}
while(condition);
```

---

### Example

```java
int x = 10;

do {
    System.out.println("Executed");
    x++;
}
while(x < 5);
```

Output:

```text
Executed
```

---

## Why?

Flow:

```text
Execute Code First
        ↓
Check Condition
        ↓
Stop
```

Even though:

```java
x < 5
```

is false, the loop executes once because the condition is checked after execution.

---

## Key Difference

```text
while
→ Check first, then execute

do-while
→ Execute first, then check
```

---

#  C. For Loop

Use a `for` loop when the number of repetitions is known.

### Syntax

```java
for(initialization; condition; update) {
    // code
}
```

---

### Example

```java
for(int i = 0; i < 3; i++) {
    System.out.println(i);
}
```

Output:

```text
0
1
2
```

---

## Components

### Initialization

```java
int i = 0
```

Runs once when the loop starts.

---

### Condition

```java
i < 3
```

Determines whether the loop continues.

---

### Update

```java
i++
```

Changes the loop variable after each iteration.

---

## Execution Flow

```text
Initialization
      ↓
Check Condition
      ↓
Execute Code
      ↓
Update Variable
      ↓
Check Condition Again
```

---

#  While vs Do-While vs For

| Loop     | Condition Check  | Minimum Executions |
| -------- | ---------------- | ------------------ |
| while    | Before execution | 0                  |
| do-while | After execution  | 1                  |
| for      | Before execution | 0                  |

---

# Summary:

### if-else-if

* Used for decision making.
* Conditions must evaluate to `true` or `false`.
* Only one block executes.

---

### while

* Checks condition first.
* May execute zero times.

---

### do-while

* Executes first.
* Always executes at least once.

---

### for

* Best when the number of iterations is known.
* Combines initialization, condition, and update in one statement.

---

## Memory Trick

```text
if      → Choose

while   → Repeat while condition is true

do-while → Execute once, then decide

for     → Count and repeat
```
