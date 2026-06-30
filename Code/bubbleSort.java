public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        boolean isSwapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (isSwapped != true) {
                break;
            }
        }
    }
}
