public class Grid_ways {
    public static int gridways(int x, int y, int n, int m){               // TC is (2^n+m)
        if(x == n-1 && y == m-1){
            return 1;
        }
        else if(x ==n || y == n){
            return 0;
        }
        int w1 = gridways(x+1, y, n, m);
        int w2 = gridways(x, y+1, n, m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3, m=3;
        System.out.println(gridways(0, 0, n, m));
    }
}
