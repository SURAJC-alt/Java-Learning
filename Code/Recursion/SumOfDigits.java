import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number more than 1 digit for thier sum : ");
        int n = sc.nextInt();
        System.out.println(digitSum(n));
        sc.close();
    }
    static int digitSum(int n){
        if (n <= 1) {
            return 1;
        }
        // int last = n % 10;
        // int remin = n / 10;
        // return digitSum(remin) + last; Or:
        return digitSum(n / 10) + n % 10;
    }
}
