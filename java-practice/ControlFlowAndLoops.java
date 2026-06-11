//Control Flow and Loops:
public class ControlflowAndLoops {
    public static void main(String[] args) {
        // If ,Elseif and else Condition:
        int age = 19;
        if (age < 18) {
            System.out.print("Can't Vote");
        } else if (age >= 18) {
            System.out.print("Can Vote");
        } else {
            System.out.print("Invalid");
        }

        //loops:

        //While:
        int a = 1;
        System.out.println("While Loop:");
        while(a<=10){
            System.out.println(a);
            a++;
        }
        System.out.println("Do while Loop:");
        //Do-while:
        int b = 1;
        do{
            System.out.println(b);
            b++;
        }while(b<=10);
        System.out.println("For Loop:");
        //For loop:
        for(int i = 0; i<=10; i++){
            System.out.println(2 +" X "+ i + " = "+2*i);
        }
    }

}
