import java.util.*;

public class BIntoDec {
    public static void Convertor(int n) {
        int pow = 0;
        int dec = 0;
        int ld = 0; // last digit
        while (n > 0) {
            ld = n % 10;
            dec = dec + ld * (int) Math.pow(2, pow);
            pow++;
            n = n / 10;
        }
        System.out.println("Its decimal number is " + dec);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary Number: ");
        int n = sc.nextInt();
        Convertor(n);
    }
}
