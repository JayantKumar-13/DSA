public class Largest_String {
    public static void main(String[] args) {
        String fruits[] = {"apple", "banana","mango"};         // TC is O(x*n) where x is the length of the largest string
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest= fruits[i];
            }
        }
        System.out.println(largest);
    }
}
