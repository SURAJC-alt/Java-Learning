1. The `main` Method Breakdown
The standard entry point of every Java application is:

public static void main(String[] args) {
    // Program starts here
}


🔍 Keyword Definitions

`public` (Access Modifier)

What it means:
The method can be accessed from anywhere.

Why it is required:
The JVM (Java Virtual Machine) must be able to access the `main()` method to start the program. Therefore, it must be declared `public`.


`static` (Class-Level Keyword)

What it means:
The method belongs to the class itself rather than to an object of the class.

Why it is required:
When a Java program starts, no objects have been created yet. The JVM needs to call `main()` directly from the class without creating an object first, so the method must be `static`.

`void` (Return Type)

What it means:
The method does not return any value after execution.

Example:
public static void main(String[] args)
After `main()` finishes, nothing is returned back to the caller.


`main` (Method Name)

**What it means:**
This is the predefined method name that the JVM looks for when starting a Java application.

If the method name is changed, the JVM will not recognize it as the entry point.


`String[] args` (Command-Line Arguments)

What it means:
An array of strings used to receive command-line arguments when the program is launched.

Example:
java Main Suraj 19 Student

The values received are:

args[0] = "Suraj";
args[1] = "19";
args[2] = "Student";


Why `String[]` is used:

The operating system passes command-line arguments as text. Therefore, Java receives them as an array of `String` values.


 Complete Meaning of:
public static void main(String[] args)
`public` → JVM can access the method.
`static` → JVM can call it without creating an object.
`void` → Returns nothing.
`main` → Starting point of the program.
`String[] args` → Receives command-line arguments.

Together, this method acts as the entry point from which the JVM begins executing a Java program.


2 Output: `System.out.println()`
When making Java display output on the screen, we use:

System.out.println("Hello World");

1.Architectural Breakdown
>System : A built-in Java class that provides access to system-related resources.
It contains standard input, output, and error streams.
>out : A public static final variable inside the System class.
Its type is PrintStream.
It represents the standard output stream, which is usually connected to the terminal/screen.
>PrintStream : The data type of the out variable.
It contains methods such as:
print()
println()
printf()
It converts Java data types (Strings, integers, doubles, booleans, etc.) into a format that can be displayed on the screen.

Understanding System.out.println()
System (Class)
      ↓
out (PrintStream variable)
      ↓
println() method
      ↓
Terminal Output

When Java executes: System.out.println("Hello");
it:
1.Accesses the out variable inside the System class.
2.Uses the dot (.) operator to access the println() method.
3.Executes the method.
4.Displays the output on the terminal.

3 Input: The Scanner Architecture
To take input from the user through the keyboard:

import java.util.Scanner;
Scanner sc = new Scanner(System.in);

Breakdown: 
Scanner (The Class): A built-in Java class used for taking input.
Contains methods such as:
nextLine()
next()
nextInt()
nextDouble()

sc (The Variable): 
Scanner sc = new Scanner(System.in);

sc is a variable of type Scanner.
It is used to access Scanner methods using the dot (.) operator.

Example:
sc.nextInt();
sc.nextLine();

System.in: 
1.A standard input stream provided by the System class.
2.Usually connected to the keyboard.
3.Receives raw input data entered by the user.

new Scanner(System.in): 
1.Creates a Scanner object.
2.The Scanner object reads data coming from System.in.
3.It converts raw keyboard input into Java data types that the program can use.

    Input Flow
Physical Keyboard
        ↓
     System.in
        ↓
  Scanner Object
        ↓
 Scanner Methods
(nextInt(), nextLine(), etc.)
        ↓
   Java Variables

Example:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");

        int age = sc.nextInt();

        System.out.println("Age = " + age);
    }
}

Flow:

Keyboard
   ↓
System.in
   ↓
Scanner Object
   ↓
nextInt()
   ↓
int age
