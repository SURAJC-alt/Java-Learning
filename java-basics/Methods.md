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


## Scope in Java

When you hear the word **Scope** in Java, think of:

* **Visibility** → Where a variable can be accessed.
* **Lifetime** → How long a variable exists in memory.

## Rule

A variable is only alive inside the curly braces `{}` where it was declared.

---

## Method Scope

Variables declared inside a method are only visible within that method.

```java
public static void main(String[] args) {
    int mainValue = 50;

    System.out.println(mainValue); // Works
}

public static void anotherMethod() {
    int methodValue = 100;

    System.out.println(methodValue); // Works
}
```

### Under the Hood

Each method gets its own **Stack Frame**.

```text
Main Frame
└── mainValue

anotherMethod Frame
└── methodValue
```

Since stack frames are isolated, one method cannot access another method's local variables.

---

## Block Scope

Any code inside `{}` creates a new scope.

```java
int outer = 10;

if (outer > 5) {

    int inner = 99;

    System.out.println(outer);
    System.out.println(inner);

}

System.out.println(outer);

// System.out.println(inner); Error
```

### Rule

* Outer variables are visible inside inner blocks.
* Inner variables are not visible outside their block.

---

## Loop Scope

### For Loop

```java
for (int i = 0; i < 3; i++) {
    System.out.println(i);
}

// System.out.println(i); Error
```

The variable `i` exists only inside the loop.

If you need it afterward:

```java
int i;

for (i = 0; i < 3; i++) {

}

System.out.println(i);
```

---

## Shadowing

Shadowing occurs when a local variable hides another variable with the same name.

```java
public class Main {

    static int x = 90;

    public static void main(String[] args) {

        int x = 20;

        System.out.println(x); // 20

        changeValue();
    }

    public static void changeValue() {
        System.out.println(x); // 90
    }
}
```

The local variable shadows the class variable inside its scope.

---

## Scope Summary

| Scope        | Visible Where?    | Dies When?   |
| ------------ | ----------------- | ------------ |
| Method Scope | Inside the method | Method ends  |
| Block Scope  | Inside the block  | Block ends   |
| Loop Scope   | Inside the loop   | Loop ends    |
| Class Scope  | Entire class      | Program ends |

---

# Variable Arguments (Varargs)

Varargs allow a method to accept **zero or more arguments** of the same type.

Introduced in Java 5.

---

## Syntax

```java
public static void printNumbers(int... numbers) {

    for (int num : numbers) {
        System.out.print(num + " ");
    }
}
```

---

## Usage

```java
printNumbers();

printNumbers(10);

printNumbers(1, 2, 3, 4, 5);
```

All of these calls are valid.

---

## What Happens Internally?

Java converts:

```java
printNumbers(1, 2, 3);
```

into:

```java
printNumbers(new int[]{1, 2, 3});
```

A varargs parameter is simply an array behind the scenes.

---

## Memory View

```text
Heap
└── [1, 2, 3]

Stack Frame
└── numbers ──► Heap Array
```

The parameter stores a reference to the generated array.

---

## Rule 1: Varargs Must Be Last

```java
public static void display(String name, int... scores) {
}
```

Valid.

```java
public static void display(int... scores, String name) {
}
```

Invalid.

---

## Rule 2: Only One Varargs Parameter

```java
public static void process(int... nums, String... texts) {
}
```

Invalid.

A method can have only one varargs parameter.

---

## Varargs and Scope

The varargs variable has **Method Scope**.

```java
public static void printNumbers(int... numbers) {

}
```

`numbers` exists only inside that method.

When the method ends:

```text
Stack Frame Destroyed
↓
numbers Removed
```

The variable is removed from memory just like any other local variable.

---

# Summery:

* Scope controls variable visibility and lifetime.
* Java creates separate stack frames for each method call.
* Variables die when their scope ends.
* Shadowing occurs when an inner variable hides an outer variable.
* Varargs (`...`) allow flexible argument counts.
* Internally, varargs are converted into arrays.
* A varargs parameter must be the last parameter.
* Only one varargs parameter is allowed per method.
