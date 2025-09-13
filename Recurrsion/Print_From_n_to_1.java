import java.util.Scanner;

public class Print_From_n_to_1 {
    public static void Dec(int n , int sum){
        if(n < 1){
            System.out.println(sum);
            return;
        }
        //System.out.println("Jayant");
        Dec(n-1 , sum+n);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n=sc.nextInt();
        Dec(n , sum);
        //System.out.println(sum);
    }
}
