import java.util.*;
public class Input_And_output_in_Array {
    public static void main(String[] args) {
        int marks[]= new int [100];
        Scanner sc = new Scanner(System.in);
        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();
        System.out.println("phy marks is "+ marks[0]);
        System.out.println("maths marks is "+ marks[1]);
        System.out.println("chem marks is "+ marks[2]);
        marks[1]= marks[1]-5;
        System.out.println("updated maths marks is "+ marks[1]);
        System.out.println("lenght of the array is "+ marks.length);
    }

    
}