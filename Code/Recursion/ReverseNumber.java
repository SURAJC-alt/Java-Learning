import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit for it's reverse : ");
        int n = sc.nextInt();
        numReverse(n);
        sc.close();
    }
    static void numReverse(int n){
        if (n < 1) {
            return;
        }
        System.out.print(n%10);
        numReverse(n/10);
    }
}
