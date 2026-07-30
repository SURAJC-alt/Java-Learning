import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to see if it is a Palindrom :");
        int n = sc.nextInt();
        System.out.println(palin(n));
        sc.close();
    }

    static int numReverse(int n, int sum) {
        if (n <= 0) {
            return sum;
        }
        sum = (sum * 10) + n % 10;
        return numReverse(n / 10, sum);
    }

    static boolean palin(int n) {
        return numReverse(n, 0) == n;
    }

}
