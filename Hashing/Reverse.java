import java.util.*;
public class Reverse {
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        int size = q.size();
        for(int i=0;i<size;i++){
            s.add(q.remove());
        }
        for(int i =0;i<size;i++){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(22);
        q.add(3);
        q.add(4);
        q.add(5);
        reverse(q);
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
