import java.util.*;
public class Min_dist_bw_Nodes {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null; 
        }
    }
    public static Node getlca2(Node root,int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftlca = getlca2(root.left, n1, n2);
        Node rightlca = getlca2(root.right, n1, n2);
        if(rightlca == null){
            return leftlca;
        }
        if(leftlca == null){
            return rightlca;
        }
        return root;
    }
    public static int lcadist(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int ldist = lcadist(root.left, n);
        int rdist = lcadist(root.right,n);
        if(ldist == -1 && rdist == -1){
            return -1;
        }
        else if(ldist == -1){
            return rdist +1;
        }
        else{
            return ldist +1;
        }
    }
    public static int getmin(Node root, int n1 , int n2){
        Node lca = getlca2(root, n1, n2);
        int dist1 = lcadist(lca, n1);
        int dist2 = lcadist(root, n2);
        return dist1 + dist2;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7); 
        int n1 =4, n2=6;
        System.out.println(getmin(root, n1, n2));
        
    }
}
