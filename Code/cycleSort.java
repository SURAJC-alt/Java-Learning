public class cycleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 4 };
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        System.out.println(java.util.Arrays.toString(arr));
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
