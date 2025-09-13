public class Fact {
    public static int Factorial(int n){
        if(n == 1){
            return n;
        }
        return n*Factorial(n-1);
    }    
    public static void main(String[] args) {
        int n =6;
        System.out.println(Factorial(n));
    }
}
