public class Linear_search {
    public static int LinearSearch(int numbers[], int key){
        for(int i=0;i<=numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] ={12,15,2,10,6,8,17};
        int key =10;
        int index = LinearSearch(numbers, key);
        if(index ==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("key is at index :"+ index);
        }
    }
}
