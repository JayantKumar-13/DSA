public class Ith_Bit {
    public static int get_ith_bit(int n, int i ){
        int bitMask = 1<<i;
        if((n & bitMask) ==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(get_ith_bit(15,2));
    }
}
