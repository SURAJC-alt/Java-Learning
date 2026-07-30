import java.util.Scanner;

public class PrintMultTillN {
    public static void main(String[] args){
        System.out.println("Enter any Number, for the Product till that number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(product(n));
        sc.close();
    }
    static int product(int n){
        if (n == 1) {
            return 1;
        }
        return product(n-1) * n;
    }
}
