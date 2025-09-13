import java.util.*;
public class Selection_Sort {                          // TC is O(N2)
    public static void SelectionSort(int array[]){
        for(int i=0;i<array.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<array.length;j++){
                if(array[minPos]>array[j]){
                    minPos=j;
                }
            }
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
        }
    }
    public static void Printarray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = {5,4,1,3,2};
        SelectionSort(array);
        Printarray(array);
    }
}
