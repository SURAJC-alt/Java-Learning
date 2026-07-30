public class linearSearchRecusion {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 18, 9 };
        int key = 9;
        System.out.println(lineaSearch(arr, key));
    }
    static int lineaSearch(int[] arr, int key) {
        return helper(arr, key, 0);
    }

    static int helper(int[] arr, int key, int i) {
        if (i == arr.length ) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return helper(arr, key, i + 1);
    }
}
