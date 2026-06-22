#  Java Core Notes: Main Method, Input and Output

These notes explain how a Java program starts, displays output, and receives input from the user.

---

#  1. The `main()` Method Breakdown

Every Java application starts execution from the `main()` method.

```java
public static void main(String[] args) {
    // Program starts here
}
```

---

##  Keyword Definitions

### `public`

**Meaning:**

The method can be accessed from anywhere.

**Why is it required?**

The JVM (Java Virtual Machine) must be able to access the `main()` method to start the program.

Think of the JVM as the driver starting a car. If the ignition key is locked away (`private`), the JVM cannot start the program.

---

### `static`

**Meaning:**

The method belongs to the class itself rather than to an object of the class.

**Why is it required?**

When the program starts, no objects have been created yet.

`static` allows the JVM to call `main()` directly from the class without creating an object first.

---

### `void`

**Meaning:**

The method performs actions but returns no value.

```java
public static void main(String[] args)
```

After execution, nothing is returned back to the caller.

---

### `main`

**Meaning:**

The predefined method name that the JVM searches for when starting a Java application.

If the method name changes, the JVM will not recognize it as the entry point.

---

### `String[] args`

**Meaning:**

An array of strings used to receive command-line arguments when the program starts.

Example:

```bash
java Main Suraj 19 Student
```

Values received:

```java
args[0] = "Suraj";
args[1] = "19";
args[2] = "Student";
```

**Why `String[]`?**

The operating system passes command-line arguments as text, so Java receives them as strings.

---

##  Complete Meaning

```java
public static void main(String[] args)
```

```text
public      → JVM can access the method
static      → JVM can call it without creating an object
void        → Returns nothing
main        → Starting point of the program
String[]    → Receives command-line arguments
```

Together, this method acts as the entry point of every Java application.

---

#  2. Output: `System.out.println()`

To display output on the screen:

```java
System.out.println("Hello World");
```

---

##  Architectural Breakdown

### `System`

A built-in Java class that provides access to system-related resources.

It contains:

```text
System.in
System.out
System.err
```

---

### `out`

A `public static final` variable inside the `System` class.

Its type is:

```java
PrintStream
```

It represents the standard output stream connected to the terminal/screen.

---

### `PrintStream`

The data type of the `out` variable.

It contains methods such as:

```java
print()
println()
printf()
```

Its job is to convert Java data into a format that can be displayed on the screen.

---

## Understanding `System.out.println()`

```text
System (Class)
      ↓
out (PrintStream Variable)
      ↓
println() Method
      ↓
Terminal Output
```

When Java executes:

```java
System.out.println("Hello");
```

it:

1. Accesses the `out` variable inside the `System` class.
2. Uses the dot (`.`) operator to access `println()`.
3. Executes the method.
4. Displays the output on the terminal.

---

## `print()` vs `println()`

### `print()`

```java
System.out.print("Hello");
System.out.print("World");
```

Output:

```text
HelloWorld
```

Cursor remains on the same line.

---

### `println()`

```java
System.out.println("Hello");
System.out.println("World");
```

Output:

```text
Hello
World
```

Cursor automatically moves to the next line.

---

# 3. Input: Scanner Architecture

To take input from the keyboard:

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
```

---

## Component Breakdown

### `Scanner` (The Class)

The blueprint that contains methods for reading input.

Common methods:

```java
next()
nextLine()
nextInt()
nextDouble()
```

---

### `sc` (The Variable)

```java
Scanner sc = new Scanner(System.in);
```

Think of `sc` as a remote control.

Technical definition:

`sc` is a variable of type `Scanner` that allows access to Scanner methods through the dot operator.

Example:

```java
sc.nextInt();
sc.nextLine();
```

---

### `System.in`

A standard input stream provided by the `System` class.

Usually connected to the physical keyboard.

It receives raw input data entered by the user.

---

### `new Scanner(System.in)`

Creates a Scanner object.

Think of it as a smart translator.

It reads raw keyboard input from `System.in` and converts it into Java data types that the program can understand.

---

##  Input Flow

```text
 Keyboard
      ↓
System.in
      ↓
Scanner Object
      ↓
Scanner Methods
(nextInt(), nextLine(), etc.)
      ↓
Java Variables
```

---

## Example

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");

        int age = sc.nextInt();

        System.out.println("Age = " + age);
    }
}
```

---

## Program Flow

```text
Keyboard
    ↓
System.in
    ↓
Scanner Object
    ↓
nextInt()
    ↓
int age
```

---

# Summary:

```text
Program Start
      ↓
main()

Output
      ↓
System.out.println()

Input
      ↓
System.in
      ↓
Scanner
      ↓
Variables
```

These three concepts form the foundation of almost every Java program.
