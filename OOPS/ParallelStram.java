import java.util.ArrayList;
import java.util.Random;

public class ParallelStram {
    public static void main(String[] args) {
        int size = 10_000;
        ArrayList<Integer> nums = new ArrayList<>(size);
        Random ran = new Random();
        for(int i=0;i<size;i++){
            nums.add(ran.nextInt(100));
        }
        //int sum1 = nums.stream()
          //              .map(i -> i*2)
            //            .reduce(0, (c,e) -> c+e);
        long startSeq = System.currentTimeMillis();
            int sum2 = nums.stream()
                       .map(i -> i*2)
                       .mapToInt(i -> i)                       // we are just adding the whole stream here but without using reduce
                       .sum();                                 // to use this sum we need to convert the stream to a integer stream 
        long endSeq = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                       .map(i -> i*2)
                       .mapToInt(i -> i)                
                       .sum();
        
        long endPara = System.currentTimeMillis();
        System.out.println(sum2 + " " + sum3);  
        System.out.println("Seq time " + (endSeq - startSeq));                // Every time parallel time is taking less time than 
        System.out.println("Para time " + (endPara - startPara));             // Although parallel stream creates multiple threads , still itis faster
    }
}
