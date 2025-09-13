import java.util.*;
public class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long c = 0;
        sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        String s4 = sc.nextLine();
        if(s1.equals("Icosahedron") || s2.equals("Icosahedron") || s3.equals("Icosahedron") || s4.equals("Icosahedron")){
            c += 20;
        }
        if(s1.equals("Cube") || s2.equals("Cube") || s3.equals("Cube") || s4.equals("Cube")){
            c += 6;
        }
        if(s1.equals("Octahedron") || s2.equals("Octahedron") || s3.equals("Octahedron") || s4.equals("Octahedron")){
            c += 8;
        }
        if(s1.equals("Dodecahedron") || s2.equals("Dodecahedron") || s3.equals("Dodecahedron") || s4.equals("Dodecahedron")){
            c += 12;
        }   
        if(s1.equals("Tetrahedron") || s2.equals("Tetrahedron") || s3.equals("Tetrahedron") || s4.equals("Tetrahedron")){
            c += 4;
        }        
        System.out.println(c);

    }
}