import java.util.*;
public class Spiral_matrix {

    public static void Spiral(int matrix[][]){
        int StartRow = 0;
        int StartCol = 0;
        int EndRow = matrix.length-1;
        int EndCol = matrix[0].length-1;
        while(StartRow<= EndRow && StartCol<=EndCol){
            for(int j=StartCol;j<=EndCol;j++){                      // top
                System.out.print(matrix[StartRow][j]+" ");
            }
            for(int i=StartRow+1;i<=EndRow;i++){                    // right
                System.out.print(matrix[i][EndCol] + " ");         
            }
            for(int j=EndCol-1;j>=StartCol;j--){                  // Bottom
                System.out.print(matrix[EndRow][j] + " ");
                if(StartRow==EndRow){
                    break;
                }
            }
            for(int i= EndRow-1;i>= StartRow+1;i--){             // left
                System.out.print(matrix[i][StartCol] + " ");
                if(StartCol==EndCol){
                    break;
                }
            }
            StartCol++;
            StartRow++;
            EndCol--;
            EndRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Spiral(matrix);
    }
}