public class Get_and_set {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setcolour("Blue");
        System.out.println(p1.getcolour());
        p1.settip(5);
        System.out.println(p1.gettip());
    }
}
class Pen{
    private String colour;
    private int tip;
    String getcolour(){
        return this.colour;
    } 
    int gettip(){
        return this.tip;
    }
    void setcolour(String colour){
        this.colour = colour;
    }
    void settip(int tip){
        this.tip = tip;
    }
}