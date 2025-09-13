public class Clear_Last_ith_bits {
    public static int Clearlastithbit(int n, int i){
        int Bitmask = ~0<<i;
        return n&Bitmask;
    }
    public static void main(String[] args) {
        System.out.println(Clearlastithbit(15, 2));
    }
}
