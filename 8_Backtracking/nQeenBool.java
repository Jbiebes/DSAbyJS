public class nQeenBool {
    public static boolean isSafe(char board[][],int row,int col){
        //vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left
        for(int i=row-1,j=col-1;i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diagonal right
        for(int i=row-1,j=col+1; i>=0 && j<board.length;i--,j++){
             if(board[i][j]=='Q'){
               return false;
            }
        }

        return true;
    }
    public static boolean nQ(char board[][],int row){
        //base case
        if(row==board.length){
            // printBoard(board);
            c++;
            return true;
        }

        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(nQ(board,row+1)){
                    return true;
                }
                //backtracking
                board[row][j]='x';
            }
        }
        return false;

    }

    public static void printBoard(char board[][]){
        // int c=0;
        System.out.println("______");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }
     
    static int c=0;
    public static void main(String args[]){
        int n=4;
        char board[][]=new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        if(nQ(board,0)){
            System.out.println("possible");
            printBoard(board);
        }
        else{

            System.out.println("not possible");
        }
    }
}
