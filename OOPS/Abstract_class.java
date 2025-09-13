public class Abstract_class {
    public static void main(String[] args) {
        Chicken h = new Chicken();
        h.eat();
        h.walk();
    }
    
}
abstract class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
