class practice{
  public static void spiralMatrix(int arr[][]){
    int sr=0,sc=0;
    int er=arr.length-1,ec=arr[0].length-1;
    while(sr<=er && sc<=ec){
      //top
      for(int i=sc;i<=ec;i++){
        System.out.print(arr[sr][i]+" ");
      }
      //right
      for(int j=sr+1;j<=er;j++){
        System.out.print(arr[j][ec]+" ");
      }
      //bottom
      for(int i=ec-1;i>=sc;i--){
        System.out.print(arr[er][i]+" ");
      }
      //right
      for(int j=er-1;j>sr;j--){
        System.out.print(arr[j][sr]+" ");
      }

      sr++;
      sc++;
      er--;
      ec--;
    }
  }

  public static int digonalSum(int arr[][]){
    int n=arr.length,sum=0;
    for(int i=0;i<n;i++){
      int j=n-1-i;
      sum+=arr[i][i];
      if(j!=i){
        sum+=arr[i][j];
      }
    }
    return sum;
  }
  public static void main(String[] args) {
     int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        // System.out.println(spiralMatrix(matrix));
        spiralMatrix(matrix);
        // System.out.println(digonalSum(matrix));
  }
}