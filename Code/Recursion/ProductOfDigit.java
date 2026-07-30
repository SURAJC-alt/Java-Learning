import java.util.Scanner;

public class ProductOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number more that 1 digit for thier product:");
        int n = sc.nextInt();
        System.out.println(digitMulti(n));
        sc.close();
    }

    static int digitMulti(int n) {
        if (n <= 1) {
            return 1;
        }
        return digitMulti(n / 10) * (n % 10);
    }
}
