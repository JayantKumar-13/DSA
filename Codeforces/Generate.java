import java.util.Scanner;

public class Generate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String str = "aeiou";
        while(t -- > 0){
            int n = sc.nextInt();
            for(int i =0;i<5;i++){
                int repCt = (n / 5) + ((n % 5 != 0) && (n % 5 > i) ? 1 : 0);
                for(int j = 0; j < repCt; j++) {
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
