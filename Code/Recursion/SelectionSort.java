// import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 3 };
        // for(int i = 0; i < arr.length-1; i++){
        //     int minIndex = i;
        //     for (int j = i+1; j < arr.length; j++) {
        //         if (arr[j] < arr[j-1]) {
        //             minIndex = j;
        //         }
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[minIndex];
        //     arr[minIndex] = temp;
        // }
        sort(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int i){
        if (i == arr.length-1) {
            return;
        }
        int minIndex = i;
        for (int j = i+1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
        sort(arr, i+1);
    }
}
