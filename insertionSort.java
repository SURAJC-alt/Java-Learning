public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,4,8,1,3};
        insertSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
    static void insertSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
        }
    }
}
