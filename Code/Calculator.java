// import java.util.Scanner;

// public class Question {
//     public static void main() {
//         Scanner sc = new Scanner(System.in);
//         // calculator:

//         while (true) {
//         System.out.println("Enter the operand (+, -, *, /, %) or 'x' to exit: ");
//         char operand = sc.next().charAt(0);

//         if (operand == 'x' || operand == 'X') {
//             System.out.println("Exiting calculator!.");
//             break;
//         }

//         System.out.println("Enter the first number :");
//         int a = sc.nextInt();
//         System.out.println("Enter the Second number :");
//         int b = sc.nextInt();

//         if (operand == '+') {
//             System.out.println("The sum of " + a + " & " + b + " is : " + (a + b));
//         } else if (operand == '-') {
//             System.out.println("The subtraction of " + a + " & " + b + " is : " + (a - b));
//         } else if (operand == '*') {
//             System.out.println("The Multiplication of " + a + " & " + b + " is : " + (a * b));
//         } else if (operand == '/') {
//             if (b != 0) {
//                 System.out.println("The division of " + a + " by " + b + " is : " + (a / b));
//             } else {
//                 System.out.println("Error: Division by zero is not allowed.");
//             }
//         } else if (operand == '%') {
//             if (b != 0) {
//                 System.out.println("The remainder of " + a + " divided by " + b + " is : " + (a % b));
//             } else {
//                 System.out.println("Error: Division by zero is not allowed.");
//             }
//         } else {
//             System.out.println("Invalid Operation!");
//         }
    
    
//     }
//     }
//     }
    
