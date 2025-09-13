public class Optimized_power {
    public static int Optpow(int a, int n){
        if(n ==0){
            return 1;
        }
        /*int halfpow = Optpow(a, n/2)*Optpow(a, n/2);       // isme abhi bhi TC O(n) hi h
        if(n%2 != 0){
            halfpow = a*Optpow(a, n/2)*Optpow(a, n/2);
        }*/
        int halfpow = Optpow(a, n/2);
        int halfPowSq =  halfpow*halfpow;
        if(n%2 != 0){
            halfPowSq =  a*halfpow* halfpow;
        }
        return halfPowSq;
    } 
    public static void main(String[] args) {
        int a =5;
        int n = 5;
        System.out.println(Optpow(a, n));
     }
}
