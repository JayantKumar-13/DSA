public class Sum_of_n {
    public static int  Sum(int n){
        if(n ==1){
            return n;
        }
        return n+Sum(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Sum(n));
    }
}
