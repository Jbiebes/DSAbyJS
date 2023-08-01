public class SPIRAL {
    public static void spiral(int arr[][]){
        int startrow=0;
        int startcolumn=0;
        int endrow=arr.length-1;
        int endcolumn=arr[0].length-1;
        
        while(startrow<=endrow && startcolumn<=endcolumn){
            //top (column to column)
            for(int j=startcolumn;j<=endcolumn;j++){
                System.out.print(arr[startrow][j]+" ");//hear start row is fixed 
            }
            //right(row to row)
            for(int j=startrow+1;j<=endrow;j++){
                System.out.print(arr[j][endcolumn]+" ");
            }
            //bottom(column to column)
            for(int j=endcolumn-1;j>=startcolumn;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(arr[endrow][j]+" ");
            }
            //left (row to row)
            for(int j=endrow-1;j>=startrow+1;j--){
                if(startcolumn==endcolumn){
                    break;
                }
                System.out.print(arr[j][startrow]+" ");
            }
            
            startcolumn++;
            startrow++;
            endcolumn--;
            endrow--;
        }
        System.out.println();
    }
    
public static int DigonalSum(int arr[][]){
    // for(int i=0;i<arr.length;i++){
    //     for(int j=0;j<arr[0].length;j++){
    //         if(i==j){
    //             sum+=(arr[i][j]);  //pd         //O(n^2)
    //         }
    //         else if((i+j)==arr.length-1){
    //             sum+=arr[i][j]; //sd
    //         }
    //     }
    // }
    int sum=0,j;
    for(int i=0;i<arr.length;i++){
      //primary digonal
      j=arr.length-i-1;                //(i+j=n-1)
      sum+=arr[i][i];
      if(i!=j){
        sum+=arr[i][j];
      }
    }
    return(sum);
}
public static boolean stairscase(int arr[][],int key){
    int row=0,column=arr[0].length-1;

    while(row<arr.length && column>=0){
        if(arr[row][column]==key){
            System.out.println("key found at :"+row+","+column);
            return true;
        }
        else if(arr[row][column]>key){
            column--;
        }
        else {
            row++;
        }
    }
    System.out.println("Key wasn't found in this matrix!");
    return false;
}
    public static void main(String[] args) {
        int matrix[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int key=33;
        // spiral(arr);
        // System.out.println("Total Digonal sum is: "+(DigonalSum(arr)));
        stairscase(matrix, key);
 
    }
}
