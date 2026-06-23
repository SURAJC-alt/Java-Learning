public class BinarySearch{
    public static void main(String[] args){
        int[] arr = {92,87,72,65,59,41,37,21,10};
        System.out.println(binarySearch(arr,92));
        System.out.println(orderAgnosticBS(arr,10));
    }
    //Binary Search: 
    static int binarySearch(int[] arr,int key){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2; //or (start+end)/2
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // order agnostic binary Search:
    static int orderAgnosticBS(int[] arr, int key){
        int start = 0, end = arr.length-1;
        boolean isAgno = arr[start] <= arr[end];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == key) {
                return mid;
            }
            if(isAgno){
                if(arr[mid] < key){
                start = mid + 1;
               } else {
                end = mid - 1;
                }
            }else{
                if(arr[mid] > key){
                start = mid + 1;
                } else {
                end = mid - 1;
                }
            }
        }
        return -1;

    }

}
