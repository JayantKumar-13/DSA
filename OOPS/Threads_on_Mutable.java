class counter{
    int count;
    public synchronized void incremet(){
        count++;
    }
}
public class Threads_on_Mutable {
    public static void main(String[] args) throws InterruptedException{
        counter c = new counter();
        Runnable obj1  = () -> {
            for(int i =0;i<10000;i++){
                c.incremet();
            }
        };
        Runnable obj2  = () -> {
            for(int i =0;i<10000;i++){
                c.incremet();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
