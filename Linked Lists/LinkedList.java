public class LinkedList {
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
    public static int size;

    public void addFirst(int data){         // TC is O(1)
        Node newNode = new Node(data);     // Step1 - create new node
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
       
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){                  // TC is O(N)
        Node temp = head;
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        
        while(temp!= null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
    public void add(int idx , int data){
        Node newNode = new Node(data);
        size++;
        int i=0;
        Node temp = head;
        while(i<idx-1){               // i=idx-1 --> temp = prev
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeF(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeL(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrsearch(int key){
        Node temp = head;
        int idx =0;
        while(temp!=null){
            if(temp.data == key){
                return idx;
               
            }
            temp =temp.next;
            idx++;
        }
        return -1;
    }
    public int helper(Node head , int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recsearch(int key){
        return helper(head, key);
    }
    public void reverse(){            // TC is O(N)
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void DeletefromNth(int n){
        int sz = 0;                               // calculating the size of list
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next;
            return;
        }
        int i =1;
        int idxtofind = sz-n;
        Node prev = head;
        while(i<idxtofind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public Node findMid(Node head){                                  // IS LL Pallindrome
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;                         //  +1
            fast = fast.next.next;                    // +2
        }
        return slow;
    }
    public boolean checkPallin(){
        if(head == null && head.next ==null){
            return true;
        }
        Node midNode = findMid(head);
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr !=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;               // right half head
        Node left = head;
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public boolean isCycle(){                         // isko run krwane ke liye new ll banana pdega main me
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;                         //  +1
            fast = fast.next.next;                    // +2
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;                         
            fast = fast.next.next;                    
            if(slow == fast){
                cycle = true;
                break;
            }
        }    
        if(cycle == false){
            return;
        }
        slow = head;                                    //
        Node prev = null;                              // finding last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;                         
            fast = fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1, Node head2){
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while(head1 != null && head2 !=null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2!=null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedll.next;
    }
    public Node mergesort(Node head){                                               // mergesort
        if(head == null || head.next == null){
            return head;
        }
        Node mid = getMid(head);
        Node righthead = mid.next;
        mid.next = null;
        Node newleft = mergesort(head);
        Node newright = mergesort(righthead);
        return merge(newleft, newright);
    }
    public void zigzag(){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){                                      // find the mid
            slow = slow.next;                         
            fast = fast.next.next;
        }
        Node mid = slow;                                                               // reversing the 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr !=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL,nextR;
        while(left !=null && right!=null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            left = nextL;
            right = nextR;
            
        }

    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); 
        ll.print();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
        ll.removeF();
        ll.print();
        ll.removeL();
        ll.print();
        System.out.println(ll.recsearch(9));
        System.out.println(ll.recsearch(12));
        ll.reverse();
        ll.print();
        ll.isCycle();
    }

}
