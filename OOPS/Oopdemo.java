import java.util.*;
public class Oopdemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int add = a+b;
        int sub = Math.abs(a-b);
        int mul = a*b;
        int div = a/b;
        int c = 10;
        if(c %2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        int d = 500;
        int count =0;
        for(int i =1;i<Math.sqrt(d);i++){
            if(d%i == 0){
                count++;
            }
        }
        if(count > 2){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }

        int a1 = 5;
        int b1 = 6;
        int add1 = 0, sub1 = 0, mul1 = 0, div1 = 0;
        int operation = 1;

        switch (operation) {
            case 1:
                add1 = a1 + b1;
                System.out.println("Addition: " + add1);
                break;
            case 2:
                sub1 = Math.abs(a1 - b1);
                System.out.println("Subtraction: " + sub1);
                break;
            case 3:
                mul1 = a1 * b1;
                System.out.println("Multiplication: " + mul1);
                break;
            case 4:
                div1 = a1 / b1;
                System.out.println("Division: " + div1);
                break;
            default:
                System.out.println("Invalid operation");
        }


    }
}
