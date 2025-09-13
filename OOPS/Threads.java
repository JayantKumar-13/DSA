class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){                      // for i <10 , we are not getting simultaneous output , but it is running simultaneously
            System.out.println("hi");              // its just that our compiler is so fast that 10 operations are occuring very fast 
            try{
                Thread.sleep(2);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }            
        }                                          // for i <100 we are getting simultaneous values
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hello");
        }
    }
}
public class Threads {
    public static void main(String[] args) {
        A obj1 = new A();
        try{
            Thread.sleep(2);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }     
        B obj2 = new B(); 
        obj1.start();
        obj2.start();
    }
}
