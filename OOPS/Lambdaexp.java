@FunctionalInterface
interface A {
    void show(int i);
    
}
@FunctionalInterface
interface B {
    int add(int i, int j);
    
}
public class Lambdaexp {
    public static void main(String[] args) {
        A obj = i -> System.out.println("show " + i);
        obj.show(5);
        B obj1 = (i,j) -> i+j;                     // We even dont need to write return, The compiler itself recognises the return statement
        System.out.println(obj1.add(5, 4));
    }
}
