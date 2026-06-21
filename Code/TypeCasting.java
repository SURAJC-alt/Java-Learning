//TypeCasting:
// import java.util.Scanner;
public class TypeCasting {
    
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        //1.Widening cast:automatic 
        int a = 2;
        float b = a;//Because float is larger than int, this happens automatically.
        System.out.println(b);//output: 2.0
        //byte->short->char->int->long->float->double

        //2.Narrowing: Manual Casting:
        float OriginalPrice = 2.99F;
        int roundPrice = (int) OriginalPrice;//Because int is smaller than float, this requires Manual casting :(type).
        System.out.println(roundPrice);//output:2 

        //Automatic Type Promotion in Expression:
        /*  When Java evaluates an arithmetic expression (like addition, multiplication, etc.),
        it looks at the data types of all the items involved. 
        To avoid losing precision, Java automatically promotes the smaller data types to match 
        the largest data type present in that expression before doing the math. */

        //Rule 1: Minimun int: 
        /* Java refuses to do math with types smaller than an int. 
        If your expression contains a byte, a short, or a char, 
        Java instantly upgrades them to an int before doing any calculation, 
        even if there are no other big data types around!:*/
        byte a1 = 40;
        byte b1 = 50;

        // byte c = a + b; COMPILE ERROR! 
        int c = a1 + b1;    //  SUCCESS : 90!
        System.out.println(c);
        //Rule 2: The "Largest data type" 
        /* If the expression contains larger data types, 
        the entire result is promoted to match the largest 
        type in the sequence based on this ranking hierarchy
        :int -> long -> float -> double*/
        byte b2 = 42;
        char c1 = 'a'; // ASCII value of 'a' is 97
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        
        // The grand expression:
        /* because the largest data type here is 
        Double the result will be in double*/
        double result = (f * b2) + (i / c1) - (d * s);
        System.out.println(result);//outPut 626.7784146484375

        
    }

}
