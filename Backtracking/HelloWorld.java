import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int mx = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int res[] = new int[n];
            for(int i = 0 ; i<n ; i++){
                res[i] = arr[n-i-1];
            }
            int alice = 0;
            int bob = 0;
            boolean flag = true;
            for(int i=0;i<n;i++){
                if(flag == true && res[i] >= mx){
                    alice++;
                    flag = false;
                    mx = res[i];
                }
                else if(res[i] >= mx){
                    bob++;
                    flag = true;
                    mx = res[i];
                }
                else{
                    break;
                }
            }
            if(alice > bob){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }  
    }
    
}
