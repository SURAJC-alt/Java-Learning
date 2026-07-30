public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        selectSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int minimumIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[minimumIndex]) {
                    minimumIndex = j;
                }
            }
            int temp = arr[minimumIndex];
            arr[minimumIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
