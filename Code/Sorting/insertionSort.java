public class insertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 8, 1, 3 };
        insertSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }

        }
    }
}
