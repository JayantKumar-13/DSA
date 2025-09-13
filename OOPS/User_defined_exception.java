class Myexception extends Exception{
    public Myexception(String str){
        super(str);                         // Agar hame constructor se print karane ke liye to super pass krna pdega 
    }
}
public class User_defined_exception {
    public static void main(String[] args) {
        int i =20;
        int j =0;
        try{
            j = 18/i;
            if(j == 0){
                throw new Myexception("Dont want to print zero"); 
            }
        }
        catch(Myexception e){
            j = 18/2;
            //System.out.println("handling the exception ");                               
            System.out.println(e);
        }
        catch(Exception e){                                   
            System.out.println("Something  is wrong ");
        }
        System.out.println(j);
        System.out.println("bye");
    }
}
