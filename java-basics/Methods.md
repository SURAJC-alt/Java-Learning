# Java Methods

## What is a Method?

A method is a reusable block of code that executes when it is called.

Methods help:

* Avoid code duplication
* Improve readability
* Break large problems into smaller pieces

---

# Basic Method Syntax

```java
public static int addNumbers(int num1, int num2) {
    int sum = num1 + num2;
    return sum;
}
```

---

# Method Components

## Access Modifier

```java
public
```

Determines where the method can be accessed from.

Common modifiers:

* `public`
* `private`
* `protected`

---

## Static Keyword

```java
static
```

Allows the method to be called without creating an object.

Example:

```java
addNumbers(10, 20);
```

instead of

```java
Calculator obj = new Calculator();
obj.addNumbers(10, 20);
```

---

## Return Type

```java
int
```

Specifies what type of value the method returns.

Examples:

```java
int
double
String
boolean
void
```

If a method returns nothing:

```java
public static void display()
```

---

## Method Name

```java
addNumbers
```

The identifier used to call the method.

Convention:

* Use camelCase
* Start with lowercase letter

Examples:

```java
calculateArea()
findMaximum()
printDetails()
```

---

## Parameters

```java
(int num1, int num2)
```

Inputs required by the method.

Parameters are local variables that receive values during a method call.

---

## Return Statement

```java
return sum;
```

Ends method execution and sends a value back to the caller.

---

# Calling a Method

```java
public static void main(String[] args) {

    int result = addNumbers(20, 30);

    System.out.println(result);
}
```

Output:

```text
50
```

---

# Parameters vs Arguments

Parameters:

```java
int num1, int num2
```

Arguments:

```java
addNumbers(20, 30)
```

| Parameter                     | Argument                        |
| ----------------------------- | ------------------------------- |
| Variable in method definition | Actual value passed during call |
| Placeholder                   | Real data                       |

---

# Method Call Stack

When a method is called, Java creates a separate memory block called a Stack Frame.

Example:

```java
public static void main(String[] args) {

    int x = 10;

    int result = addNumbers(x, 5);

    System.out.println(result);
}
```

```java
public static int addNumbers(int num1, int num2) {

    int sum = num1 + num2;

    return sum;
}
```

---

## Execution Flow

### Step 1

Main method starts.

Stack:

```text
Main Frame
x = 10
```

---

### Step 2

Method is called:

```java
addNumbers(x, 5);
```

Java creates a new stack frame.

```text
addNumbers Frame
num1 = 10
num2 = 5
sum = 15
```

---

### Step 3

Method returns:

```java
return sum;
```

Value:

```text
15
```

is sent back to main.

The addNumbers frame is destroyed.

---

### Step 4

Main continues execution.

```java
result = 15
```

---

# Variable Scope

Variables exist only inside the method where they are declared.

Example:

```java
public static int addNumbers(int a, int b) {
    int sum = a + b;
    return sum;
}
```

The variable:

```java
sum
```

cannot be accessed from `main()`.

---

# Java is Pass-By-Value

Java always passes copies of values.

---

## Primitive Example

```java
public static void changeValue(int x) {
    x = 99;
}
```

```java
int num = 10;

changeValue(num);

System.out.println(num);
```

Output:

```text
10
```

Reason:

Java copies the value:

```text
num = 10
x = 10
```

Changing `x` does not affect `num`.

---

# Objects and References

Objects live on the Heap.

Variables store references (memory addresses).

Example:

```java
int[] arr = {1, 2, 3};
```

```text
Stack
arr ─────► Heap [1, 2, 3]
```

---

# Modifying Object Contents

```java
public static void changeFirstElement(int[] arr) {
    arr[0] = 99;
}
```

```java
int[] numbers = {1, 2, 3};

changeFirstElement(numbers);

System.out.println(numbers[0]);
```

Output:

```text
99
```

Reason:

Both variables point to the same array object.

---

# Reassigning a Reference

```java
public static void replaceArray(int[] arr) {
    arr = new int[]{99, 100, 101};
}
```

```java
int[] numbers = {1, 2, 3};

replaceArray(numbers);

System.out.println(numbers[0]);
```

Output:

```text
1
```

Reason:

Only the local copy of the reference changes.

The original reference remains unchanged.

---

# Strings are Immutable

```java
String name = "Suraj";
```

```java
public static void modifyString(String s) {
    s = "Kunal";
}
```

```java
modifyString(name);

System.out.println(name);
```

Output:

```text
Suraj
```

Reason:

Strings cannot be modified after creation.

A new String object is created instead.

---

# Summery:

* Methods are reusable blocks of code.
* Every method call creates a new Stack Frame.
* Local variables exist only inside their method.
* Java is always Pass-By-Value.
* Primitive values are copied directly.
* Object references are copied.
* Modifying object contents affects the original object.
* Reassigning a reference does not affect the original variable.
* Strings are immutable.
