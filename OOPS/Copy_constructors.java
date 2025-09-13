public class Copy_constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Jayant";
        s1.roll = 23;
        s1.password = "abcd";
        Student s2 = new Student(s1);
        s2.password = "xyz";
    }
}
class Student{
    String name;
    int roll;
    String password;
    Student(){
        System.out.println("Constructor has been made");
    }
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }
}

