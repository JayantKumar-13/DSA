import java.util.*;
public class Largest_num_in_array {
    public static int getLargest(int numbers[]){
        int Largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(Largest<numbers[i]){
                Largest= numbers[i];
            }
        }
        return Largest;

    }
    public static void main(String[] args) {
        int numbers[]={1,2,5,6,7,9};
        System.out.println("largest value is:"+ getLargest(numbers));
    }
}
