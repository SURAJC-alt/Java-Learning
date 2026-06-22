import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = {1,2,4,5,32,67};
        // int key = sc.nextInt();
        // System.out.printf(key+" is at Index "+linear(arr, key));
        // System.out.println("Enter a String : ");
        // String str = sc.nextLine();
        // System.out.println("Enter the char to find : ");
        // char key = sc.next().trim().charAt(0);
        // if(linearInString(str,key)){
        // System.out.println(key + " is in "+str);
        // }else{
        // System.out.println(key + " is not in "+str);
        // }

        // int[] arr = {1,2,3,4,5,6,7,89,12};
        // int key = 11, start = 2, end = 8;
        // System.out.println(java.util.Arrays.toString(arr));
        // System.out.println(key + " is at "+linearInRange(arr,key,start,end)+"th
        // Index");

        // int[] arr = {3,4,5,61,2,42};
        // System.out.println(minimunNumber(arr));

        // int[][] arr = { { 3, 2, 1 },
        //         { 4, 5, 2 },
        //         { 9, 8, 11 } };
        // // System.out.println(java.util.Arrays.toString(array2D(arr,2)));
        // System.out.println(max(arr));

        // int num = 1234;
        // int digit = digitFinder(num);
        // if(digit % 2 == 0){
        //     System.out.println("even");
        // }

        // int[][] accounts = {{1,2,3},
        //                     {3,2,1}};
        // System.out.println(maxWealth(accounts));
    }
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    //  int maxWealth(int[][] arr){
    //     int maxWealth = 0;
    //     for(int i = 0; i < arr.length; i++ ){
    //         int wealth = 0;
    //         for(int j = 0; j < arr[i].length; j++){
    //             wealth += arr[i][j];
    //         }
    //         if(wealth > maxWealth){
    //             maxWealth = wealth;
    //         }
    //     }
    //     return maxWealth;
        
    // }


    // static int digitFinder(int num){
    //     int count = 0;
    //     while(num > 0){
    //         count++;
    //         num /= 10;
    //     }
    //     return count;
    // }
    // //Linear Search:
    // static int linear(int[] arr, int key){
    // if(arr.length == 0) return -1;
    // for(int i = 0; i< arr.length; i++) {
    // if(key == arr[i]) return i;
    // }
    // return -1;
    // }

    // //Linear Search in string:
    // static boolean linearInString(String str,char key){
    // for(int i = 0; i < str.length(); i++){
    // if(key == str.charAt(i)) return true;
    // }
    // return false;
    // }

    // //Linear Search in Specified range:
    // static int linearInRange(int[] arr, int key, int start, int end){
    // for(int i = start; i <= end; i++ ){
    // if(key == arr[i]) return i;
    // }
    // return -1;
    // }

    // //Minimum number:
    // static int minimunNumber(int[] arr){
    // int min = arr[0];
    // for(int i = 1; i < arr.length; i++ ){
    // if(min > arr[i]) min = arr[i];
    // }
    // return min;
    // }

    // // Linear Search in 2D array:
    // static int[] array2D(int[][] arr, int key){
    // int[] index = {-1,-1};
    // for(int i = 0; i < arr.length; i++){
    // for(int j = 0; j < arr[i].length; j++){
    // if(key == arr[i][j]){
    // index[0] = i;
    // index[1] = j;
    // return index;
    // }
    // }
    // }
    // return index;
    // }

    // static int max(int[][] arr) {
    //     int max = arr[0][0];
    //     for (int[] row : arr) {
    //         for (int value : row) {
    //             if (max < value) {
    //                 max = value;
    //             }
    //         }
    //     }
    //     return max;
    // }    

    
}
