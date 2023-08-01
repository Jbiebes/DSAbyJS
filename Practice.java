public class Practice {
    public static void spiral(int arr[][]){
        int sr=0,er=arr.length-1;
        int sc=0,ec=arr[0].length-1;

        while(sr<=er && sc<=ec){
        //top
        for(int i=sc;i<=ec;i++){
            System.out.print(arr[sr][i]+" ");
        }
        //right
        for(int i=sr+1;i<=er;i++){
            System.out.print(arr[i][er]+" ");
        }
        //bottom
        for(int i=ec-1;i>=sc;i--){
            System.out.print(arr[er][i]+" ");
        }
        //left
        for(int i=er-1;i>=sr+1;i--){
            System.out.print(arr[i][sr]+" ");
        }
        

        sr++;
        sc++;
        er--;
        ec--;
        }
    }

    public static int digonalSum(int arr[][]){
        int pd=0,sd=0;
        int n=arr.length;
       
        for(int i=0;i<n;i++){
            pd+=arr[i][i];
            if(i!=n-1-i){
                sd+=arr[i][n-1-i];
            }
        }
        return (pd+sd);
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},
                        {5,6,7},
                        {9,10,11}};
        // spiral(matrix);
        System.out.println(digonalSum(matrix));
    }
}
