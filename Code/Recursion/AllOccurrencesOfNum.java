import java.util.ArrayList;

public class AllOccurrencesOfNum {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 4, 18, 9 };
        int key = 4;
        // Occurrences(arr, key);
        // System.out.println(list);
        System.out.println(helper(arr, key, 0, new ArrayList<Integer>()));
    }

    // static ArrayList<Integer> list = new ArrayList<>();

    // static void Occurrences(int[] arr, int key) {
    // }

    // static void helper(int[] arr, int key, int i) {
    //     if (i == arr.length) {
    //         return;
    //     }
    //     if (arr[i] == key) {
    //         list.add(i);
    //     }
    //     helper(arr, key, i + 1);
    // }

    static ArrayList helper(int[] arr, int key, int i, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == key) {
            list.add(i);
        }
        return helper(arr, key, i + 1, list);
    }

}
