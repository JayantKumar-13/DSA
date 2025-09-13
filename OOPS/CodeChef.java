import java.util.*;
public class CodeChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int res = Integer.MIN_VALUE;
            for (int i = k - 1; i < n - k; i++) {
                int minS1 = arr[0];
                int maxS1 = arr[i];
                int minS2 = arr[i + 1];
                int maxS2 = arr[n - 1];
                
                int score = minS1 + maxS1 + minS2 + maxS2;
                res = Math.max(res, score);
            }
            
            System.out.println(res);
        }
    }
}
