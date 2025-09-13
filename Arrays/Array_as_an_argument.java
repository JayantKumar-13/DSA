import java.util.*;
public class Array_as_an_argument {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
       int marks[]={97,98,96};
        update(marks);
        for(int i=0;i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
