package bitwise;

import java.util.Scanner;
import java.util.Arrays;

public class Bitwise {
    public static void main(String[] args) {
        // gitBitAt(182, 5);
        // setBitAt(86, 4);
        // resetBitAt(86, 5);
        // magicNumber(5);
        // pascalsTriSum(5);
        // int ans = twosPower(3);
        // if (ans == 0) {
        // System.out.println("It is 2's Power");
        // } else {
        // System.out.println("It is not 2's Power");
        // }
        findNumbsPower(2, 4);

        // System.out.println(getSetBit(10));

        // int a = 3;
        // int b = 9;
        // int ans = xor(b) ^ xor(a-1);
        // System.out.println(ans);

        // int [][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        // for (int i = 0; i < arr.length; i++) {
        // int start = 0;
        // int end = arr[i].length-1;
        // while (start <= end) {
        // int temp = (arr[i][start])^1;
        // arr[i][start] = (arr[i][end])^1;
        // arr[i][end] = temp;
        // start++;
        // end--;
        // }
        // }
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // System.out.print(arr[i][j]+" ");
        // }
        // System.out.println();
        // }
    }

    // static void isOddorEven(int n) {
    // if ((n & 1) == 1) {
    // System.out.println("Odd");
    // } else {
    // System.out.println("Even");
    // }
    // }

    // static void findUnique(int arr[]) {
    // int unique = 0;
    // for (int i : arr) {
    // unique ^= i;
    // }
    // System.out.println(unique);
    // }

    // static void gitBitAt(int number, int n) {
    // int mask = 1 << n - 1;
    // System.out.println(mask & number);
    // }

    // static void setBitAt(int number, int n) {
    // int mask = 1 << n - 1;
    // System.out.println(mask | number);
    // }

    // static void resetBitAt(int number, int n) {
    // int mask = ~(1 << n - 1);
    // System.out.println(mask & number);
    // }

    // static void magicNumber(int n) {
    // int base = 5;
    // int ans = 0;
    // while (n > 0) {
    // int last = n & 1;
    // ans += last * base;
    // base = base * 5;
    // n = n >> 1;
    // }
    // System.out.println(ans);
    // }

    // static void pascalsTriSum(int n) {
    // System.out.println(1 << n);
    // }

    // static int twosPower(int n) {
    // return n & (n - 1);
    // }

    static void findNumbsPower(int number, int power) {
        int ans = 1;
        while (power > 0) {
            int last = power & 1;
            if (last == 1) {
                ans *= number;
            }
            number *= number;
            power = power >> 1;
        }
        System.out.println(ans);
    }

    // static int getSetBit(int n) {
    // int count = 0;
    // while (n > 0) {
    // count++;
    // n = n & (n - 1);
    // }
    // return count;
    // }

    // static int xor(int n){
    // if(n % 4 == 0){
    // return n;
    // }
    // if(n % 4 == 1){
    // return 1;
    // }
    // if(n % 4 == 2){
    // return n+1;
    // }
    // return 0;
    // }
}
