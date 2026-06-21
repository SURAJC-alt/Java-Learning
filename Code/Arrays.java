import java.util.Scanner;
public class Arrays {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //primitive Array syntax:
        int[] arr; //Declaration 
        arr = new int[5]; //initialization, now the array looks like this: {0,0,0,0,0,0}
        // or :
        int[] number = {1,2,3,4,5,6,7};
        
        //non primitive array(ex: String):
        String[] arr; //Declaration 
        arr = new String[5]; //initialization, now the array looks like this: {null,null,null,null,null}
        arr[0] = "suraj";
        System.out.println(arr[0]+" "+arr[1]);// output: suarj null

        //Array Indexing:
        int[] arr = {1,2,43,43,6,9};
                  //[0,1,2,3,4,5,6] : index of the array
        
        //inputing the array elements via for loop:
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //outputing the array elemets:
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        // or Enhanced for loop of array:
        for(int i : arr){
            System.out.print(i+" ");
        }
        // or Arrays to String method:
        System.out.println(Arrays.toString(arr));

        //2D arrays:
        int[][] arr = new int[3][3];
        // System.out.println(arr.length);
        //Input in 2D array: 
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print("enter the "+i+""+j+"th Position element ");
                arr[i][j] = sc.nextInt();
            }
        }
        //Output of 2D array:
        for(int i = 0; i < arr.length; i++){
            System.out.print("[ ");
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("]");
            System.out.println();
        }
        //Or :
        for(int row = 0; row < arr.length; row++){
            System.out.println(java.util.Arrays.toString(arr[row]));
        }
        //Or:
        for(int[] row : arr){
            System.out.println(java.util.Arrays.toString(row));
        }
        }
        // //Swaping two index values
        // int[] arr = {1,2,3,4,5,6};
        // swap(arr);
        // System.out.println(java.util.Arrays.toString(arr));

        // //Maximun element in the array:
        // int[] arr = {2,7,15,9,4,30}; ;
        // System.out.println(maxElement(arr));

        //reversing an array:
        // int[] arr = {1,2,3,4,5,6,7};
        // reverseArray(arr);
        // reverseArray2(arr);
        // System.out.println(java.util.Arrays.toString(arr));
    }
    // static void swap(int[] arr, int i1, int i2){
    //     int tem = arr[i1];
    //     arr[i1] = arr[i2];
    //     arr[i2] = tem;
    // }

    // static int maxElement(int[] arr){
    //     int max = arr[0];
    //     for(int i : arr){
    //         if (i > max ){
    //             max = i;
    //         }
    //     }
    //     return max;
    // }

    // static int maxElement(int[] arr,int i1, int i2){
    // int max = 0;
    // for(int i = i1; i <= i2; i++){
    //     if(arr[i] > max){
    //         max = arr[i];
    //     }
    // }
    // return max;
        
    // }

    // static void reverseArray(int[] arr){
    // int n = arr.length-1;
    // int mid = arr.length/2;
    // for(int i = 0; i < mid; i++){
    //     int temp = arr[i];
    //     arr[i] = arr[n-i];
    //     arr[n-i] = temp;
    //         }
    // }

    // static void reverseArray(int[] arr){
    //     int start = 0, end = arr.length-1;
    //     while(start < end){
    //         int temp = arr[start];
    //         arr[start] = arr[end];
    //         arr[end] = temp;
    //         start++;
    //         end--;
    //     }
    // }

    // static void reverseArray2(int[] arr){
    // int start = 0, end = arr.length-1;
    // while(start < end){
    //     // int temp = arr[start];
    //     // arr[start] = arr[end];
    //     // arr[end] = temp;
    //     // or call the : that was created in the class 
    //     swap(arr,start,end);
    //     start++;
    //     end--;
    //     }
    // }
}
