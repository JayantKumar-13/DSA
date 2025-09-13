 import java.util.*;
public class Kadane {            // TC of this code is O(n)
    public static void Kadanes(int numbers[]){
        int ms= Integer.MIN_VALUE;
        int cs =0;
        for(int i=0;i<numbers.length;i++){
            cs = cs + numbers[i];
            if(cs<0){
                cs= 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("max sum is "+ms);
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,1,4,-1,5,-3};
        Kadanes(numbers);
    }
}
