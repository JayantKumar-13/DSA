public class binomialCoeff {
    public static int Factorial(int n ){
        int f =1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int binCoeff(int n, int r){
        int fact_n=Factorial(n);
        int fact_r=Factorial(r);
        int fact_nmr=Factorial(n-r);
        int a =(fact_r)*(fact_nmr);
        int binCoeff=fact_n/a;
        return binCoeff;
    }
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int BinomialCoeffcient= binCoeff(n, r);
        System.out.println(BinomialCoeffcient);
    }
}
