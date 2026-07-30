import java.util.Scanner;

public class PrintTillN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: "); 
        print(sc.nextInt());
        sc.close();
    }
    static void print(int n){
        if (n == 1) {
            return;
        }
        
        print(n-1);
        System.out.println(n);
    }
}
