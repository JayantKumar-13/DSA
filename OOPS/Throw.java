public class Throw {
    public static void main(String[] args) {
        int i =20;
        int j =0;
        try{
            j = 18/i;
            if(j == 0){
                throw new ArithmeticException("Dont want to print zero");          // Agar hmlog ye throw wala use nhi krte to catch kbhi call nhi hota , kyuki 18/20 = 0 hota h jo ki exception nhi h 
            }
        }
        catch(ArithmeticException e){
            j = 18/2;
            System.out.println("handling the exception ");                                // Ye print nhi ho rha kyuki hmlog e print kara rhe h , aur constructor se msg
            System.out.println(e);    // agar dono me msg dege to ye wala call hoga 
        }
        catch(Exception e){                                       // It can handles every exception , to hmlog isko top pe nhi rakh skte h 
            System.out.println("Something  is wrong ");
        }
        System.out.println(j);
        System.out.println("bye");
    }
}
