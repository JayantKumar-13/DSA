public class Intro_LL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void main(String[] args) {                           // hmlog aage chal ke main me define nhi krege
        Intro_LL ll = new Intro_LL();                                  // balki hmlog class me methods bana dege
        ll.head = new Node(1);
        ll.head.next = new Node(2);
    }
}
