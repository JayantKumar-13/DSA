import java.util.*;
public class Reverse_stack {
    public static void Push_at_bottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        Push_at_bottom(s, data);
        s.push(top);
    }
    public static void reverse_stack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse_stack(s);
        Push_at_bottom(s, top);
    }
    public static void prints(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        reverse_stack(s);
        prints(s);
    }
}
