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
}
