public class ArrayList{
  public static void main(String[] args){
        //Syntax:
        ArrayList<Integer> list = new ArrayList<>();
        //.add() adds the element in the array:
        list.add(6);
        list.add(12);
        list.add(24);
        printing the Array:
        System.out.println(list);
        int a = list.get(2);// a = 24 .get()gives the element at the specified Index:
        list.set(2, 48);//list = {6,12,48} .set() updates the array by the given index and value
        //or:
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //or:
        list.remove(2);//list = {6,12}Removes the element at the specified position in this list. Shifts any subsequent elements to the left (subtracts one from their indices).
        for(int i : list){
            System.out.print(i+" ");
        }
        //Inputing through looP: 
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter the "+i+"th element :");
            list.add(sc.nextInt());
            }
        for(int i = 0; i < list.size(); i++){ 
            System.out.print(list.get(i)+" ");
  }
}

