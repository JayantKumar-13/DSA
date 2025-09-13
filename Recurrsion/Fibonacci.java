public class Fibonacci {
    public static int Fibo(int n){                         // TC is O(2^n)
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return Fibo(n-1) + Fibo(n-2);
    } 
    public static void main(String[] args) {
        int n = 25;
        System.out.println(Fibo(n));
    }
}
