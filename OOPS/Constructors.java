public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Jayant" , 51);
        System.out.println(s1.name + " " + s1.roll);
    }
}
class Student{
    String name;
    int roll;
    Student(String name , int roll){
        this.name = name;
        this.roll = roll;
    }
}
