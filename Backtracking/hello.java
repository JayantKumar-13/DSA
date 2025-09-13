import java.util.Arrays;

/**
 * hello
 */
public class hello {

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        Arrays.sort(arr);
        for(int i : arr)
            System.out.println(i + " ");
    }
}