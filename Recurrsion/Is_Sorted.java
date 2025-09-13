public class Is_Sorted { 
    public static boolean isSorted(int arr[],int i){                       // TC and SC is O(n)
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    } 
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,5};
        System.out.println(isSorted(arr, 0));
    }
}
