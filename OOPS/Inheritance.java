public class Inheritance {
    public static void main(String[] args) {
        Animal shark = new Fish();
        shark.eat();
    }
}
class Animal{                              // Parent class
    String colour;

    void breathe(){
        System.out.println("breathes");
    }
    void eat(){
        System.out.println("eats");
    }
}
class Fish extends Animal{                // Derived class 
    int fins;
    void eat(){
        System.out.println("fish also eats");
    }
}
