public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setcolour("Blue");
        System.out.println(p1.colour);
    }
}
class Pen{
    String colour;
    int tip;
    void setcolour(String newcolour){
        colour = newcolour;
    }
    void settip(int newtip){
        tip = newtip;
    }
}
