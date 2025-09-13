import java.util.*;
public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int res = 0;
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> mpp = new HashMap<>();
            for (int num : arr) {
                mpp.put(num, mpp.getOrDefault(num, 0) + 1);
            }
            for (int key : mpp.keySet()) {
                if (mpp.get(key) == 2) {
                    res++;
                }
            }
            System.out.println(res);
            
        }
    }
    
}
