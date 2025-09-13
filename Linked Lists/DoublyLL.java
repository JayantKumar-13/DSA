import java.util.*;
public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addfirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int removefirst(){
        if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public int removelast(){
        if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node previous = tail.prev;
        int val = tail.data;
        size--;
        tail.prev = null;
        previous.next = null;
        return val;
    }
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);
        dll.addlast(5);
        dll.removelast();
        dll.print(); 
    }
}
