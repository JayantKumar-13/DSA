enum Laptop{
    Mac(2000) , VivoBook(1000), ThinkPad(800);
    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
public class Enumclass {
    public static void main(String[] args) {
        Laptop l = Laptop.Mac;
        System.out.println(l.getPrice());
    }
    
}
