public class Tiling_prblm {
    public static int tilingWays(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return tilingWays(n-1) + tilingWays(n-2);
    }
    public static void main(String[] args) {
        int n = 4N;
        System.out.println(tilingWays(n));
    }
}
