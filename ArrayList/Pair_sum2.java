import java.util.*;
public class Pair_sum2 {
    public static boolean Pair_sum2(ArrayList<Integer> list, int target){     // TC is O(n)
        int bp = -1;                                                          // Finding pivot
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        while(lp!=rp){
            if(list.get(rp)+ list.get(lp) == target){
                return true;
            }
            else if(list.get(rp)+list.get(lp) <target){
                lp = (lp+1)%list.size();
            }
            else{
                rp = (list.size() + rp -1)%list.size();
            }
        }
        return false;  
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(Pair_sum2(list, target));
    }
}
