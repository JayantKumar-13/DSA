import java.util.*;
public class Binary_Search {
    public static int BinarySearch(int numbers[], int key){
        int start =0;
        int end = numbers.length-1;
        while(start<=end){                          // TC = O(logn)
            int mid = (start + end)/2;
            if(numbers[mid]== key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,3,6,10,9,7};
        Arrays.sort(numbers);
        int key = 10;
        System.out.println("index of key is at:"+ BinarySearch(numbers, key));
    }
}
