public class Update_ith_bit {
        public static int Set_ith_bit(int n, int i ){
            int bitMask = 1<<i;
            return n | bitMask;
        }
        public static int clear_ith_bit(int n, int i ){                         // there can be another code
            int bitMask = ~(1<<i);                                              // n = clearithbit(n,i)
            return n & bitMask;                                                 // int Bitmask = newbit << i
        }                                                                       // return n | Bitmask
    public static int updateIthbit(int n, int i, int newBit){
        if(newBit == 0){
            return clear_ith_bit(n, i);
        }
        else{
            return Set_ith_bit(n,i);
        }
    }
    public static void main(String[] args) {
        System.out.println(updateIthbit(10, 2, 1));
    }
}
