import java.util.Scanner;
public class Primitives{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        // Primitive Data Types:
        int i = 23;
        long l = 232134321234321L;
        float f = 23.98F;
        double d = 323432234.2432242;
        char c = 'a';
        boolean b = true; // or false
        
        System.out.print("Int : " + i + " Long : " + l + " Float : " + f + " Double : " + d + " Char : " + c + " Boolean : " + b);
        System.out.print("Enter an integer : ");
        int a1 = sc.nextInt();
        System.out.print("Enter a Long value : ");
        long a2 = sc.nextLong();
        System.out.print("Enter a floating value : ");
        float a3 = sc.nextFloat();
        System.out.print("Enter a double value : ");
        double a4 = sc.nextDouble();
        System.out.print("Enter a boolen value : ");
        boolean a6 = sc.nextBoolean();
        System.out.print("Int : " + a1 + " Long : " + a2 + " Float : " + a3 + " Double : " + a4 + " Boolean : " + a6);
        
    }
}
