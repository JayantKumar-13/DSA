public class S_D_copy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Jayant";
        s1.roll = 23;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 90;
        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 70;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    
    // Shallow copy
   // Student(Student s1){
    //   marks = new int[3];
    //  this.name = s1.name;
    //  this.roll = s1.roll;
    //  this.marks = s1.marks;
    //  }
    //}


    // Deep copy
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }
    Student(){
        marks = new int[3];
    }
}
