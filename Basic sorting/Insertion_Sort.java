public class Insertion_Sort {
    public static void Insertion(int array[]){             // TC of this code is O(n2)
        for(int i= 1;i<array.length;i++){
            int curr = array[i];
            int prev = i-1;
            while(prev>=0 && array[prev]>curr){
                array[prev+1] = array[prev];
                prev--;
            }
            array[prev+1] = curr;
        }
    }
    public static void PrintArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = {5,4,1,3,2};
        Insertion(array);
        PrintArray(array);
    }
}
