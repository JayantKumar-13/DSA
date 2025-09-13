public class Search_in_Rotated_array {
    public static int search(int arr[], int target, int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid = si+(ei-si)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[si]<= arr[mid]){                              // Mid on L1
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr, target, si, mid);         // case a
            }
            else{
                return search(arr, target, mid+1, ei);      // case b
            }             
        }
        else{                                              // Mid on L2
            if(arr[mid]<=target && target<= arr[ei]){
                return search(arr, target, mid+1, ei);    // case c
            }
            else{
                return search(arr, target, si, mid-1);    // case d
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int taridx = search(arr, target,0,arr.length-1);
        System.out.println(taridx);
    }
}
