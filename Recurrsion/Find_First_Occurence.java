public class Find_First_Occurence {
    public static int FirstOcc(int arr[],int key, int i){
        if(arr[i] == key){
            return i;
        }
        return FirstOcc(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int i =0;
        int key = 5;
        System.out.println(FirstOcc(arr, key, i));
    }
}
