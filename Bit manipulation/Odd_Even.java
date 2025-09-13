import java.util.*;
public class Odd_Even {
    public static void odd_or_even(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
    public static void main(String[] args) {
        odd_or_even(3);
        odd_or_even(4);
    }
}