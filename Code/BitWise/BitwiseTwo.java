package bitwise;

import java.util.ArrayList;
import java.util.Arrays;

public class BitwiseTwo {
    public static void main(String[] args) {
        // int n = 40;
        // getPrime(n);

        // factorsOptimized(36);
        // System.out.println(GCD());
        System.out.println(LCM(18,15));
    }

    // Sieve of Eratosthenes:
    static void getPrime(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        if (n >= 0)
            isPrime[0] = false;
        if (n >= 1)
            isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    static void bsSqu() {
        int n = 15;
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid == n / mid) {
                System.out.println(mid);
                break;
            } else if (mid < n / mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }

    static void factorsOptimized(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
        }
        for(int i = list.size()-1; i>= 0; i--){
            System.out.print(list.get(i)+" ");
        }
    }

    //GCD:
    // static int GCD(int a, int b){
    //     while (b != 0) {
    //         int temp = b;
    //         b = a % b;
    //         a = temp;
    //     }
    //     return a;
    // }

    //LCM :
    static int LCM(int a, int b){
        int Amulti = a;
        int Bmulti = b;
        while (Amulti != Bmulti) {
            if (Amulti < Bmulti) {
                Amulti += a;
            }else{
                Bmulti += b;
            }
        }
        return Amulti;
    }

}
