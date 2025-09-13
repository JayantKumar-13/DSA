public class One_solution {
    public static boolean isSafe(char board[][], int row, int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){                                  // vertical  up
                return false;
            }
        }
        for(int i = row-1,j=col-1; i>=0 && j>=0;i--,j--){             // left diag up
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
    public static boolean nqueens(char board[][], int row){
        if(row == board.length){                                      // base case
            return true;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(nqueens(board, row+1)){
                    return true;
                }
                board[row][j] = 'x';
            }
        }
        return false;
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
    public static void main(String[] args) {
        int n=4;
        char board[][] = new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j] = 'x';
            }
        }
        if(nqueens(board, 0)){
            System.out.println("Solution is possible");
            printarr(board);
        }
        else{
            System.out.println("solution is not possible");
        }
    }
}
