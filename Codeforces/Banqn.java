import java.util.*;
public class Banqn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = a/5;
        int res = 0;
        if(a <= 5){
            System.out.println("1");
            return ;
        }
        else if(a % 5 ==0){
            System.out.println(count);
            return ;
        }
        else{
            res = count + 1;
        }
        System.out.println(res);
    }
}
