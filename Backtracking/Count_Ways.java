public class Count_Ways {
    public static boolean isSafe(char board[][], int row, int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){                                    // vertical  up
                return false;
            }
        }
        for(int i = row-1,j=col-1; i>=0 && j>=0;i--,j--){               // left diag up
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){      // right diag up
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void nqueens(char board[][], int row){
        if(row == board.length){                                      // base case
            count ++;
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nqueens(board, row+1);
                board[row][j] = 'x';
            }
        }
    }
    public static void printarr(char board[][]){
        System.out.println("-------------- chess board --------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int count =0;
    public static void main(String[] args) {
        int n=4;
        char board[][] = new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j] = 'x';
            }
        }
        nqueens(board, 0);
        System.out.println("Total no. of nqueens is " +count);
    }
}
