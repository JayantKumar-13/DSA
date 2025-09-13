public class Arrays {
    public static void changearr(int arr[], int i, int val){              // TC and SC is O(n)
        if(i == arr.length){
            printarr(arr);
            return;
        }
        arr[i] = val;
        changearr(arr, i+1, val+1);
        arr[i] = arr[i]-2;
    }
    public static void printarr(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changearr(arr, 0, 1);
        printarr(arr);
    }
}
