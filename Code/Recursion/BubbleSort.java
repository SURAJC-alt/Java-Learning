import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
       int[] arr = {2,1,3,7,3,4,5};
       int n = arr.length;
       sort(arr, 0,arr.length);
       System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int i, int n){
        if (n <= 1) {
            return;
        }
        if (i < n-1) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            sort(arr, i+1, n);
        }else{
            sort(arr, 0, n-1);
        }
    }
}
