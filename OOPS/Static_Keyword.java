public class Static_Keyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolname = "Chinmaya";                                         // Saare objects ka school name same ho gaaya
        Student s2 = new Student();                                           
        System.out.println(s2.schoolname);
    }
}
class Student{
    String name;
    int roll;
    static String schoolname;
    void Setname(String name){
        this.name = name;
    }
    String getname(){
        return this.name;
    }
}
