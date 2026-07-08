import java.util.Arrays;

public class StringsAndStringBuilderDemo {

    public static void main(String[] args) {

        // ============================================
        // 1. String Pool
        // ============================================

        String a = "Kunal";
        String b = "Kunal";

        System.out.println("----- String Pool -----");
        System.out.println(a == b);          // true
        System.out.println(a.equals(b));     // true


        // ============================================
        // 2. new Keyword
        // ============================================

        String c = new String("Kunal");
        String d = new String("Kunal");

        System.out.println("\n----- new Keyword -----");
        System.out.println(c == d);          // false
        System.out.println(c.equals(d));     // true


        // ============================================
        // 3. Immutability
        // ============================================

        String name = "Kunal";

        System.out.println("\nBefore Reassignment:");
        System.out.println(name);

        name = "Kushwaha";

        System.out.println("After Reassignment:");
        System.out.println(name);


        // ============================================
        // 4. Common String Methods
        // ============================================

        String str = "  Kunal Kushwaha  ";

        System.out.println("\n----- String Methods -----");

        System.out.println("Length       : " + str.length());

        System.out.println("charAt(2)    : " + str.charAt(2));

        System.out.println("Lower Case   : " + str.toLowerCase());

        System.out.println("Upper Case   : " + str.toUpperCase());

        System.out.println("indexOf('a') : " + str.indexOf('a'));

        System.out.println("lastIndexOf('a') : " + str.lastIndexOf('a'));

        System.out.println("strip()      : '" + str.strip() + "'");

        System.out.println("split()      : " +
                Arrays.toString(str.strip().split(" ")));

        System.out.println("toCharArray(): " +
                Arrays.toString(str.toCharArray()));


        // ============================================
        // 5. String Performance Problem
        // ============================================

        String series = "";

        for (int i = 0; i < 5; i++) {
            series += i;
        }

        System.out.println("\n----- String Concatenation -----");
        System.out.println(series);


        // ============================================
        // 6. StringBuilder
        // ============================================

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            builder.append(i);
        }

        System.out.println("\n----- StringBuilder -----");
        System.out.println(builder);


        builder.append(" Java");

        System.out.println(builder);

        builder.deleteCharAt(5);

        System.out.println(builder);

        builder.reverse();

        System.out.println(builder);

        String converted = builder.toString();

        System.out.println(converted);


        // ============================================
        // 7. Operator Overloading
        // ============================================

        System.out.println("\n----- Operator Overloading -----");

        System.out.println('a' + 'b');

        System.out.println("a" + 1);

        System.out.println("Hello " + true);

        System.out.println("Java " + 10 + 20);

        System.out.println(10 + 20 + " Java");


        // ============================================
        // 8. Printing Arrays
        // ============================================

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("\n----- Arrays -----");

        System.out.println(arr);

        System.out.println(Arrays.toString(arr));


        // ============================================
        // 9. Pretty Printing
        // ============================================

        String student = "Suraj";
        int age = 19;
        float pi = 3.141592f;

        System.out.println("\n----- printf() -----");

        System.out.printf("My name is %s and I am %d years old.%n",
                student, age);

        System.out.printf("Pi = %.2f%n", pi);

        System.out.printf("Pi = %.4f%n", pi);

        System.out.printf("Hexadecimal of 255 : %x%n", 255);

        System.out.printf("Octal of 8 : %o%n", 8);

        System.out.printf("Scientific : %e%n", 1000.0);
    }
}
