public class DectoBIn {
    public static void DectoBin(int n){
        int pow =0;
        int myNum=n;
        int BinNum =0;
        while(n>0){
            int rem = n%2;
            BinNum = BinNum + (rem * (int)Math.pow(10,pow));
            pow++;
            n=n/2;

        }
        System.out.println("Binary form of "+myNum+" is"+ "="+BinNum);
    }
    public static void main(String[] args) {
        DectoBin(12);
    }
}
