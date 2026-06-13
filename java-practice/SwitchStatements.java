import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a fruit name : ");
        String fruit = sc.nextLine();
        switch (fruit) {
        case "mango":
        System.out.println("King of Fruits!");
        break;
        case "banana":
        System.out.println("a long Fruit");
        break;
        case "grapes":
        System.out.println("A small Fruit");
        break;
        case "orang":
        System.out.println("Round Fruit");
        break;
        default:
        System.out.println("!Invalid!");

        }

        // Another way of writing it:
        switch (fruit) {
        case "mango" -> System.out.println("King of Fruits!");
        case "banana" -> System.out.println("a long Fruit");
        case "grapes" -> System.out.println("A small Fruit");
        case "orang" -> System.out.println("Round Fruit");
        default -> System.out.println("!Invalid!");
        }

        // Take the day number(in week) and print the name of that day :
        System.out.println("Enter a number of the day in a week");
        int day = sc.nextInt();
        switch(day){
        case 1 -> System.out.println("The First day in a week is Monday");
        case 2 -> System.out.println("The Second day in a week is Tuesday");
        case 3 -> System.out.println("The Third day in a week is Wednesday");
        case 4 -> System.out.println("The Fourth day in a week is Thursday");
        case 5 -> System.out.println("The Fifth day in a week is Friday");
        case 6 -> System.out.println("The Sixth day in a week is Saturday");
        case 7 -> System.out.println("The Seventh day in a week is Sunday");
        default -> System.out.println("The day of that number does not exist");

        }

        System.out.println("Enter a number of the day in a week");
        int day2 = sc.nextInt();
        switch (day2) {
        case 1, 2, 3, 4, 5 -> System.out.println("Week Day");
        case 6, 7 -> System.out.println("Week End");
        default -> System.out.print("The day of that number does not exist");
        }

        //Calculator:
        while (true) {
            System.out.print("Enter the Operand Or x to exit: ");
            char op = sc.next().trim().charAt(0);
            if (op == 'x' || op == 'X') {
                break;
            }

            System.out.print("Enter the First number: ");
            int number1 = sc.nextInt();
            System.out.print("Enter the Second number: ");
            int number2 = sc.nextInt();
            switch (op) {
                case '+' -> System.out.println("The sum of " + number1 + " and " + number2 + " is: " + (number1 + number2));
                case '-' -> System.out.println("The sub of " + number1 + " and " + number2 + " is: " + (number1 - number2));
                case '*' -> System.out.println("The Mult of " + number1 + " and " + number2 + " is: " + (number1 * number2));
                case '/' -> {
                    if (number2 == 0) {
                        System.out.println(number1 + " can't divide by 0");
                    } else {
                        System.out.println("The division of " + number1 + " by " + number2 + " is: " + (number1 / number2));
                    }
                }
                case '%' -> {
                    if (number2 == 0) {
                        System.out.println(number1 + " can't modulo by 0");
                    } else {
                        System.out.println("The modulo of " + number1 + " by " + number2 + " is: " + (number1 % number2));
                    }
                }
                default -> System.out.println("Invalid operand! Please try again.");
            }
        }
        sc.close();
    }

}