import java.util.*;
public class Sub_Arrays {
    public static void SubArrays(int numbers[]){
        for(int i=0;i<numbers.length;i++){ 
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end =j;
                for(int k=start;k<=end;k++){                      //   j
                    System.out.print(numbers[k]+" ");             //   2 4 6 8 10 
                }                                                 //   0 1 2 3  4    n =5 
                System.out.println();                             //   i            
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10};
        SubArrays(numbers);
    }
}
