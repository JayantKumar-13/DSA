import java.util.*;
import java.util.HashMap;
public class Iterations_on_hm {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 200);
        hm.put("China", 150);
        hm.put("Nepal", 50);
        hm.put("USA", 100);

        // Iterate
        // we can use use entrySet to iterate through the hashmap, we do not need additional for loop to operate in a entrySet

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key ="+ k + ", value " + hm.get(k) );
        }
    }
}
