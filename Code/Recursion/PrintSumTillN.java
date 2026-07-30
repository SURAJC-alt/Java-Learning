import java.util.Scanner;

public class PrintSumTillN {
    public static void main(String[] args) {
        System.out.print("Enter any Number, for the sum till that number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The sum till "+n+" is :"+sum(n));
        sc.close();
    }

    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return sum(n - 1) + n;
    }
}
