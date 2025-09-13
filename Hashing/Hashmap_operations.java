import java.util.*;
public class Hashmap_operations {                             // All operations are O(1)
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India" , 150);
        hm.put("China" , 200);
        hm.put("USA", 100);
        System.out.print(hm);
        int population = hm.get("India");
        System.out.println(population);
        
        // Contains key
        System.out.println(hm.containsKey("India"));


        // remove key            It returns the data
        System.out.println(hm.remove("China"));
        System.out.println(hm);
        

        // Size
        System.out.println(hm.size());

        // isEmpty
        
        System.out.println(hm.isEmpty()); 


        // clear deletes the hashmap
    }
}
