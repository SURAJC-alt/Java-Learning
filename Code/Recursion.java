public class Recursion {

    public static void main(String[] args) {
        // 1. Basic Recursion
        System.out.println("Print Numbers:");
        printNumbers(1);


        // 2. Factorial
        System.out.println("\nFactorial of 5:");
        System.out.println(factorial(5));

        // 3. Fibonacci
        System.out.println("\nFibonacci of 6:");
        System.out.println(fibonacci(6));

        // 4. Sum of Numbers
        System.out.println("\nSum from 1 to 5:");
        System.out.println(sum(5));
      
        // 5. Recursive Binary Search
        int[] arr = {2, 5, 7, 9, 13, 17, 21, 30};

        int target = 17;

        int index = binarySearch(arr, target, 0, arr.length - 1);

        System.out.println("\nBinary Search:");
        System.out.println("Target found at index : " + index);
    }

        // Print Numbers
    static void printNumbers(int n) {

        // Base Condition
        if (n == 5) {
            System.out.println(n);
            return;
        }

        System.out.println(n);

        // Recursive Call
        printNumbers(n + 1);
    }

    // Factorial
    static int factorial(int n) {

        if (n <= 1)
            return 1;

        return n * factorial(n - 1);
    }

    // Fibonacci

    static int fibonacci(int n) {

        if (n < 2)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Sum of First N Numbers
    static int sum(int n) {

        if (n == 1)
            return 1;

        return n + sum(n - 1);
    }

    // Recursive Binary Search
    static int binarySearch(int[] arr, int target, int start, int end) {

        // Base Condition

        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] == target)
            return mid;

        if (target < arr[mid])
            return binarySearch(arr, target, start, mid - 1);

        return binarySearch(arr, target, mid + 1, end);
    }
}
