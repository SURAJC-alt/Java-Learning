import java.util.Arrays; 

public class QuickSort { 
    public static void main(String[] args) { 
        int[] arr = {3,4,2,1,5,0}; 
        Sort(arr, 0, arr.length - 1); 
        System.out.print(Arrays.toString(arr)); 
    } 

    static void Sort(int[] arr, int low, int high) { 
        if (low >= high) { 
            return; 
        } 

        int s = low, e = high; 
        int mid = s + (e - s) / 2; 
        int pivot = arr[mid]; 

        while (s <= e) { 
            while (arr[s] < pivot) { 
                s++; 
            } 
            while (arr[e] > pivot) { 
                e--; 
            } 

            if (s <= e) { 
                int temp = arr[s]; 
                arr[s] = arr[e]; 
                arr[e] = temp; 
                s++; 
                e--; 
            } 
        } 
        Sort(arr, low, e); 
        Sort(arr, s, high); 
    } 
}
