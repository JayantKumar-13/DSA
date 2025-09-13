import java.util.*;
public class Creation_of_2d_array {

    public static void main(String[] args) {
        int n=3,m=3;                                 // n can also be obtained by n= matrix.length and m= matrix[o].length
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]= sc.nextInt(); 
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
