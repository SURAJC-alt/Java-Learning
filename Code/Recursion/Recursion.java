public class Recursion {
    public static void main(String[] args) {
    //    int[] arr = {1,4,3,-5,-4,8,6};
        //SumTringle(arr);
        // int[] result = maxAndMin(arr, 0, 0, 0);

        // System.out.println("Max: " + result[0]);
        // System.out.println("Min: " + result[1]);

        // System.out.println(upperCaseFinder("suarJ",0));

        // printTillN(5);

        // System.out.println(strLength("SURAJ CHITRAGAR"));

        // sort(arr, arr.length);
        // System.out.println(java.util.Arrays.toString(arr));
    }
    // //   Sum Triangle from Array GFG:
    // static void SumTringle(int[] arr){
    //     if(arr.length < 1){
    //         return;
    //     }
    //     int[] temp = new int[arr.length-1];
    //     for(int i = 0; i < temp.length; i++){
    //         temp[i] = arr[i]+arr[i+1];
    //     }
    //     SumTringle(temp);
    //     System.out.println(java.util.Arrays.toString(arr));
    // }

    // //Maximum and Minimum value in an array GFG
    // static int[] maxAndMin(int[] arr, int max, int min, int index) {
    //     if (index == arr.length) { 
    //         return new int[]{arr[max], arr[min]}; 
    //     } 
    //     if (arr[index] > arr[max]) { 
    //         max = index; 
    //     } 
    //     if (arr[index] < arr[min]) { 
    //         min = index; 
    //     } 
    //     return maxAndMin(arr, max, min, index + 1); 
    // }

    //First Uppercase Letter in a String GFG
    // static char upperCaseFinder(String str, int i){
    //     if(str == null || i >= str.length()){ 
    //         return '\0'; 
    //     } 
    //     if(Character.isUpperCase(str.charAt(i))){
    //         return str.charAt(i);
    //     }
    //     return upperCaseFinder(str, i+1);
    // }

    // // Print 1 To N Without Loop GFG
    // static void printTillN(int n) {
    // if(n <= 0){
    //     return;
    // }
    // printTillN(n-1);
    // System.out.print(n+" ");
    // }

    // //Length of string using Recursion GFG
    // static int strLength(String str){
    //     if (str == null || str.length() <= 0) {
    //         return 0;
    //     }
    //     return strLength(str.substring(1))+1;
    // }

    // //Bubble Sort using recursion:
    // static void sort(int[] arr, int n){
    //     if(n == 1){
    //         return;
    //     }
    //     int count = 0;
    //     for(int i = 0; i < n - 1; i++){
    //         if (arr[i] > arr[i+1]) {
    //             int temp = arr[i];
    //             arr[i] = arr[i+1];
    //             arr[i+1] = temp;
    //             count = count + 1;
    //         }
    //     }
    //     if(count == 0){
    //         return;
    //     }
    //     sort(arr,n-1);
    // }
}