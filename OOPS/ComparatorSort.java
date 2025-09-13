import java.util.*;
public class ComparatorSort {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i %10 > j%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(39);
        arr.add(31);
        arr.add(45);
        Collections.sort(arr,com);
        System.out.println(arr);
    }
}
