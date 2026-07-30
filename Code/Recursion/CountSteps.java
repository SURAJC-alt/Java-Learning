public class CountSteps {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(numberOfSteps(n));

    }

    static int numberOfSteps(int n) {
        return helper(n,0);
    }
    static int helper(int n, int count){
        if (n == 0) {
            return count;
        }
        if (n % 2 == 0) {
            n = n / 2;
            count++;
        }else{
            n = n - 1;
            count++;
        }
        return helper(n, count);
    }

}
