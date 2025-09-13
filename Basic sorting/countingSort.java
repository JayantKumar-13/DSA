public class countingSort {
    public static void CountingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
    }
}
