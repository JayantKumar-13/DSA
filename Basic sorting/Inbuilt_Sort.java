import java.util.Arrays;             // TC is O(nlogn)
public class Inbuilt_Sort {
    public static void Printarr(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = {5,4,1,3,2};
        //Arrays.sort(array);
        Arrays.sort(array,0,4);
        Printarr(array);
    }
}
