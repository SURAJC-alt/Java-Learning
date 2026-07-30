import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count the numbers of Zero :");
        int n = sc.nextInt();
        System.out.println("The Total Number of Zeros in " + n + " is " + zeroCounter(n, 0));
        sc.close();
    }

    static int zeroCounter(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10 == 0) {
            count++;
        }
        return zeroCounter(n / 10, count);
    }
}
