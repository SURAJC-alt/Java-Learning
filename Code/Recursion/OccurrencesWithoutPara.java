import java.util.ArrayList;

public class OccurrencesWithoutPara {
    public static void main(String[] args){
        int[] arr = {3,2,4,4,18};
        System.out.println(OccurrencePara(arr,4,0));
    }
    static ArrayList<Integer> OccurrencePara(int[] arr,int key, int i){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == key) {
            list.add(i);
        }
        ArrayList<Integer> ans = OccurrencePara(arr, key, i+1);
        list.addAll(ans);
        return list;
    }
}
