public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("In all directions");
    }
}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("UP, DOWN, LEFT, RIGHT");
    }
}
