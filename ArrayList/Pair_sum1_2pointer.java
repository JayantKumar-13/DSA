import java.util.*;
public class Pair_sum1_2pointer {
    public static boolean Pair_sum1(ArrayList<Integer> list, int target){
        int lp = 0;                                                             // TC is O(n)
        int rp = list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }
            else if(list.get(rp)+list.get(lp)<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 5;
        System.out.println(Pair_sum1(list, target));
    }
}
