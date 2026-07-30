public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 10, 1, 2, 3, 4 };
        int key = 10;
        int start = 0;
        int end = arr.length - 1;
        int pivot = miniMum(arr, start, end);
        int firsthalf = search(arr,start,pivot-1,key);
        int secondhalf = search(arr,pivot,end,key);
        if (firsthalf != -1) {
            System.out.println(firsthalf);
        }else{
            System.out.println(secondhalf);
        }
        
    }

    static int miniMum(int[] arr, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int search(int[] arr, int start, int end, int key) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[mid] > key) {
            return search(arr, start, mid - 1, key);
        }
        return search(arr, mid + 1, end, key);
    }
}
