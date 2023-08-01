public class digonalSum {

    public static int dSum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            //pd
            sum+=arr[i][i];
            //sd (i+j=n-1 || j=n-i-1)
            if(i!=arr.length-i-1){
                sum+=arr[i][arr.length-i-1];
            }
            
        }
        return sum;
    }
    public static int dSumbrutforce(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
                else if(i+j==arr.length-1){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }

     public static void main(String args[]){
        int matrix[][]={{1,2,3},
                        {5,6,7},
                        {9,10,11}};
        System.out.println(dSumbrutforce(matrix));
    }
}
