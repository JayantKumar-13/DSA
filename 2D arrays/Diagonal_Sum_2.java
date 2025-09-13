import java.util.*;
public class Diagonal_Sum_2 {
    public static int DiagSum2(int matrix[][]){
        int sum =0;                                 // TC of this code is O(n)
        for(int i=0; i<matrix.length;i++){
            sum+= matrix[i][i];
            if(i != matrix.length-1-i){
                sum+= matrix[i][matrix.length-1-i];
            }
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        DiagSum2(matrix);
    }
}
