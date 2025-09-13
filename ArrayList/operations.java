import java.util.ArrayList;
public class operations {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int element = list.get(2);             // get element
        System.out.println(element);
        list.remove(2);                        // remove element
        System.out.println(list);
        list.set(2, 10);               // set element
        System.out.println(list);   
        System.out.println(list.contains(1));      // checking for the availability of element 
        System.out.println(list.contains(11));    
        list.add(1,9);         
        System.out.println(list);                    // adding at index TC is O(N)
    }    
}
