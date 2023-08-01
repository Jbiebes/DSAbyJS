import java.util.*;
public class Matrix{

    public static void MaxMin(int arr[][]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;i<arr[0].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
                 if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("The min value is: "+min+"And the max value is: "+max);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking inputs
        sc.close();
        int ab[][]=new int [3][4];
        for(int i=0;i<ab.length;i++){
            for(int j=0;j<4;j++){
                ab[i][j]=sc.nextInt();
            }
        }
        //printing outputs
        System.out.println("===============");
        for(int i=0;i<ab.length;i++){
            for(int j=0;j<ab[0].length;j++){
               System.out.print(ab[i][j]+" ");
            }
            System.out.println();
        }
        // MaxMin(ab);
        // System.out.println(ab[0].length);
      
    }
}
