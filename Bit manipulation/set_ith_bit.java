import java.util.Set;
public class set_ith_bit {
    public static int Set_ith_bit(int n, int i ){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(Set_ith_bit(10, 2));
    }

}

