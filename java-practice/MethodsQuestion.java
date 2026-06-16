import java.util.Scanner;

public class FunctionsProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean check = true;
        check = checkIsPrime(num);
        armStrongNumber(1,1000);
        fibInFor(8);
        fiboInRev(sc.nextInt());
        fibOfNth(sc.nextInt());
        fibOrNot(8);
        System.out.println("Enter a string : ");
        String word = sc.nextLine();
        System.out.println(isPalindrom(word));
        int num = sc.nextInt();
        int find = sc.nextInt();
        System.out.println(findOccorance(num,find));
        reverseNumbers(1234);
        otherReverse(1234);
        sc.close();
    }

    //Prime number checker:
    static boolean checkIsPrime(int num){
    if (num <= 1){
    return false;
    }
    for (int i = 2; i*i <= num; i++){
    if(num % i == 0){
    return false;
    }
    }
    return true;
    }

    // print all the three digit armstrong numbers:
    static void armStrongNumber(int start, int end){
    for (int i = start; i < end; i ++ ){
    int temp = i;
    int count = 0;
    while(temp > 0){
    temp = temp/10;
    count++;

    }
    temp = i;
    int sum = 0;
    while (temp > 0){
    int digit = temp % 10;
    sum += (int) Math.pow(digit, count);
    temp = temp /10;
    }
    if (sum == i){
    System.out.println(i + " is an Armstrong number.");
    }
    }

    }

    // calculate the fibo till n in forward:
    static void fibInFor(int n){
    int first = 0, second = 1;
    System.out.print(second+" ");
    for(int i = 2; i <= n; i++){
    int next = first+second;
    first = second;
    second = next;
    System.out.print(next+" ");
    }
    }

    // calculate the fibo till n in rever
    static void fiboInRev(int n){
    // in reverse we need to find the last 2 digits just 0 and 1 in forward:
    int last = 0, lastSecond = 1;
    for(int i = 2; i <= n; i++){
    int next = last + lastSecond;
    last = lastSecond;
    lastSecond = next;
    }
    System.out.print(lastSecond + " " + last + " ");
    for (int i = 2; i < n; i++){
    int next = lastSecond-last;
    lastSecond = last;
    last = next;
    System.out.print(next+" ");
    }
    }

    //find the nth fibo:
    static void fibOfNth(int n){
    int a = 0, b = 1;
    for(int i = 2; i <= n; i++ ){
    int next = a + b;
    a = b;
    b = next;

    }
    System.out.println(b);
    }

    // find if the given number is fibonacci or not:
    static void fibOrNot(int num){
    int prev1 = 0;
    int prev2 = 1;
    while (prev2 < num){
    int next = prev1 + prev2;
    prev1 = prev2;
    prev2 = next;
    }
    if (prev2 == num){
    System.out.print(num+" is Fibonacci ");
    }else{
    System.out.print(num+" is not Fibonacci ");
    }
    }

    //check if the given String is palindrom or not:
    static boolean isPalindrom(String word){
    if(word == null) return false;
    int n = word.length();
    for(int i = 0; i < n/2; i++){
    if(word.charAt(i) != word.charAt(n-1-i)) return false;
    }
    return true;
    }

    //find the occorance of a number :
    static int findOccorance(int number, int n){
    int count = 0;
    while(number > 0){
        int digit = number % 10;
        if(digit == n) count++;
        number /= 10;
        }
        return count;
    }

    // reverse a given set of numbers and print:
    static void reverseNumbers(int number){
        int temp = number, count = 0;
        while (temp > 0){
            temp = temp / 10;
            count ++;
        }
        temp = number;
        for (int i = 1; i <= count; i++){
            int digit = temp % 10;
            System.out.print(" "+digit);
            temp = temp / 10;
        }
    }

    static void otherReverse(int number){
        int ans = 0;
        while (number != 0){
            int digit = number % 10;
            ans = (ans*10) + digit;
            number /= 10;
        }
        System.out.println(ans);
    }
}
