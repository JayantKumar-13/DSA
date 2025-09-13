import java.util.Scanner;

public class ncrandnpr {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        
        int ncr = combination(n, r);
        int npr = permutation(n, r);
        
        System.out.println("nCr: " + ncr);
        System.out.println("nPr: " + npr);
        
        sc.close();
    }

    public static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static int permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
