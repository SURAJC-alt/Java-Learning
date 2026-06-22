import java.util.Scanner;

public class Basic_Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.Temperature celsius to Fahrenheits:
        System.out.print("Enter Temperature in celsius :");
        float temperature = sc.nextFloat();
        System.out.print("Temperature in Fahrenheits: "+((temperature * 1.8f) + 32));

        //2.Write a program to print whether a number is even or odd from user input.
        System.out.println("Enter a Number : ");
        int number = sc.nextInt();
        if (number % 2 == 0){
        System.out.println(number+" is Even");
        }else{
        System.out.println(number+" is odd");
        }

        //3.Take name as input and print a greeting message for that particular name.
        System.out.println("Enter Your Name : ");
        System.out.println("Hello "+sc.nextLine());

        //Write a program to input principal, time, and rate (P, T, R) from the user
        and find Simple Interest.
        System.out.println("Enter principal, time, and rate (P, T, R) : ");
        float p = sc.nextFloat();
        float t = sc.nextFloat();
        float r = sc.nextFloat();
        float simpleInterest = (p*r*t)/100;
        System.out.println("simpleIterest is : "+simpleInterest+"\n the total amount
        is : "+(p+simpleInterest));

        //4.Take in two numbers and an operator (+, -, *, /) and calculate the value.(Use if conditions)
        System.out.println("Enter a, operator and b: ");
        float a = sc.nextFloat();
        char c = sc.next().charAt(0);
        float b = sc.nextFloat();
        if(c == '+'){
        System.out.println("a + b : "+(a+b));
        }else if(c == '-'){
        System.out.println("a - b :"+(a-b));
        }else if(c == '*'){
        System.out.println("a x b :"+(a*b));
        }else if (c == '/') {
        if (b == 0) {
        System.out.println("Error: Cannot divide by zero.");
        } else {
        System.out.println("a / b : " + (a / b));
        }
        } else if (c == '%') {
        // Check for modulo by zero
        if (b == 0) {
        System.out.println("Error: Cannot calculate remainder using zero.");
        } else {
        System.out.println("a % b : " + (a % b));
        }
        } else {
        System.out.println("Invalid Operator");
        }

        //5.Take 2 numbers as input and print the largest number.
        System.out.println("Enter a(Number) : ");
        float a = sc.nextFloat();
        System.out.println("Enter b(Number) : ");
        float b = sc.nextFloat();
        if(a > b){
        System.out.println(a + " is Greater than "+ b);
        }else if(a < b){
        System.out.println(b + " is Greater than " + a);
        }else{
        System.out.println(a+" and "+b+" are equal");
        }

        // 5.2 Take 3 numbers as input and print the largest number.
        System.out.print("Enter a  : ");
        Float a = sc.nextFloat();
        System.out.print("Enter b : ");
        Float b = sc.nextFloat();
        System.out.print("Enter c : ");
        Float c = sc.nextFloat();
        if (a >= b && a >= c) {
            System.out.println(a + " is the Greatest");
        } else if (b >= c && b >= a) {
            System.out.println(b + " is the Greatest");
        } else {
            System.out.println(c + " is the Greatest");
        }

        //6.Input currency in rupees and output in USD.
        System.out.println("Enter Rupees : ");
        float Rupees = sc.nextFloat();
        System.out.println(Rupees+" is "+ (Rupees*0.01045)+" USD");

        //7.To calculate Fibonacci Series up to n numbers in forward.
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int prev1 = 0;
        int prev2 = 1;
        System.out.print(prev1 + " " + prev2 + " ");
        for (int i = 2; i <= n; i++) {
        int next = prev1 + prev2;
        System.out.print(next + " ");
        prev1 = prev2;
        prev2 = next;
        }

        //8.To calculate Fibonacci Series up to n numbers in reverse.
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 2; i < n; i++ ){
        int next = a + b;
        a = b;
        b = next;
        }
        int prev1 = b;
        int prev2 = a;
        System.out.print(prev1 + " " + prev2 + " ");
        for (int i = 0; i < n-2; i++ ){
        int next = prev1-prev2;
        System.out.print(next+" ");
        prev1 = prev2;
        prev2 = next;
        }

        //9.Find the nth fibonacci
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int prev1 = 0;
        int prev2 = 1;
        for(int i = 2; i <= n; i++){
        int next = prev1+prev2;
        prev1 = prev2;
        prev2 = next;
        }
        System.out.println(prev2);

        //10.Find if the given number is fibonacci or not
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int prev1 = 0;
        int prev2 = 1;
        for (int i = 2; i < num; i++){
        int next = prev1 + prev2;
        prev1 = prev2;
        prev2 = next;
        }
        int a = prev1+prev2;
        if (a == num){
        System.out.print(num+" is Fibonacci ");
        }else{
        System.out.print(num+" is not Fibonacci ");
        }

        11.1 To find out whether the given String is Palindrome or not.
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        boolean yesOrNo = true;
        for (int i = 0; i < str.length()/2; i++){
        if(str.charAt(i) != str.charAt(str.length()-1-i)){
        yesOrNo = false;
        break;
        }
        }
        if (yesOrNo){
        System.out.println(str+" is a palindrome");
        }else{
        System.out.println(str+" is not a palindrome");
        }

        //11.2 To find out whether the given String is Palindrome or not.
        System.out.println("Enter a string:");
        String str = sc.next();
        int left = 0; // Starts at the first character
        int right = str.length() - 1; // Starts at the last character
        boolean yesOrNo = true; // Assume it is a palindrome
        // Keep looping as long as the pointers haven't crossed each other
        while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
        yesOrNo = false;
        break;// Stop immediately on first mismatch
        }
        left++; // Move the left pointer forward
        right--; // Move the right pointer backward
        }
        if (yesOrNo) {
        System.out.println(str + " is a palindrome");
        } else {
        System.out.println(str + " is not a palindrome");
        }

        // To find Armstrong Number between two given number.
        System.out.println("Enter a number : ");
        int start = sc.nextInt();
        System.out.println("Enter another number :");
        int end = sc.nextInt();
        for (int num = start; num < end; num++){
        int count = 0;
        int temp1 = num;
        while (temp1 > 0) {
        temp1 = temp1 / 10;
        count++;
        }
        int sum = 0;
        int temp = num;
        while (temp > 0) {
        int digit = temp % 10;
        sum = sum + (int)Math.pow(digit, count);
        temp = temp / 10;
        }
        if (sum == num) {
        System.out.println(num + " is armstrong number");
        }
        }
      
         //Alphabates :
        int val = 0;
        for(char a = 'A'; a <= 'Z'; a++){
        System.out.print("("+a+" ");
        val = (int)a;
        System.out.print(val+") ");//ASCII value;
        }

        //Check if the given alphabate is Lower Case or Upper Case:
        System.out.print("Enter an Alphabate: ");
        char Alpha = sc.next().trim().charAt(0);
        if(Alpha >= 'a' && Alpha <= 'z'){
        System.out.println(Alpha+" is Lower Case");
        }else{
        System.out.println(Alpha+" is Upper Case");
        }
          
        //Find the nth Fibo number:
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int p1 = 0;
        int p2 = 1;
        int i = 2;
        while(i<=n){
        int temp = p1+p2;
        p1 = p2;
        p2 = temp;
        System.out.println(p2);//all fib till n
        i++;
        }
        System.out.println(p2);// the nth fib

      //Finding the occurance of number:
        int num = 1212;
        int n = 1;
        int count = 0;
        while (num > 0) {
        int digit = num % 10;
        if (digit == n) {
        count++;
        }
        num = num / 10;
        }
        System.out.println(count);

        // reverse a given set of numbers and print Type 1
        int number = sc.nextInt();
        while (number > 0) {
        int rem = number % 10;
        System.out.print(rem);
        number /= 10;
        }

        // reverse a given set of numbers and print Type 2
        int num = sc.nextInt();
        int ans = 0;
        while (num != 0) {
        int a = num % 10;
        ans = (ans*10)+a;
        num/=10;
        }
        System.out.println(ans);

    }

}
