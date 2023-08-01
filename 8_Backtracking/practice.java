public class practice {
   public static void nq(char arr[][],int i){
        //base case
        if(i==arr.length){
            show(arr);
            return;
        }   
        for(int j=0;j<arr[0].length;j++){
            arr[i][j]='Q';
            nq(arr, i+1);
            arr[i][j]='X';
        }
   }


   public static void show(char arr[][]){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");

        }
        System.out.println();
    }
    System.out.println(".......................");
   }
   public static void main(String[] args) {
     char chess[][]=new char[2][2];
     for(int i=0;i<chess.length;i++){
        for(int j=0;j<chess[0].length;j++){
            chess[i][j]='X';
        }
     }
    //  show(chess);
    nq(chess, 0);
   }
}
