public class TrynCatch {
    public static void main(String[] args) {
        int i =0;
        int j =0;
        int nums[] = new int[4];
        try{
            j = 18/i;
            System.out.println(j);           // pehle yhi execute ho gya , isliye array wala catch aaya hi nhi
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Cant divide with zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array length is wrong ");
        }
        catch(Exception e){                                       // It can handles every exception , to hmlog isko top pe nhi rakh skte h 
            System.out.println("Something  is wrong ");
        }
        System.out.println(j);
        System.out.println("bye");
    }
}
