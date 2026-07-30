import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5,4,3,2,1 };
        Sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }
        int mid = start + (end - start) / 2;
        Sort(arr, start, mid);
        Sort(arr, mid, end);
        merge(arr,start,mid,end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] ans = new int[end-start];
        int i = start, j = mid, k = 0;
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                ans[k] = arr[i];
                i++;
            } else {
                ans[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid) {
            ans[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            ans[k] = arr[j];
            j++;
            k++;
        }
        for(int l = 0; l < ans.length; l++){
            arr[start+l] = ans[l];
        }
    }
}
