
import java.util.*;
public class BubbleSort {                                   // TC of this code O(N2)
    public static void Bubblesort(int array[]){
        for(int turn=0;turn<array.length -1; turn++){       //optimized bubble sort --->  boolean swap = false   ---> TC is O(n) in best case
            for(int j=0;j<array.length-1-turn;j++){
                if(array[j]>array[j+1]){                   // Swap
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1]= temp;
                }                                                                         // swap = true
            }
        }                                                                                   // if(swap == false){
                                                                                                // break
    }
    public static void Printarr(int array[]){
        for(int i =0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = {5,4,1,3,2};
        Bubblesort(array);
        Printarr(array);
    }
        
}

