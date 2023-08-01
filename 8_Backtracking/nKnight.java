public class nKnight {
     public static boolean isSafe(char board[][],int row,int col){
        //vertical
        if(board[row-2][col-1] =='H' || board[row-2][col+1]=='H'){
            return false;
        }
        //diagonal left
        if(board[col-2][row-1] =='H' || board[col-2][row+1]=='H'){
            return false;
        }

        //diagonal right
         if(board[col+2][row-1] =='H' || board[col+2][row+1]=='H'){
            return false;
        }
        return true;
    }
    public static void nQ(char board[][],int row){
        //base case
        if(row==board.length){
            printBoard(board);
            return;
        }

        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='H';
                nQ(board,row+1);
                //backtracking
                board[row][j]='x';
            }
        }

    }

    public static void printBoard(char board[][]){
        System.out.println("______");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int n=3;
        char board[][]=new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }

        nQ(board,0);
    }
}
