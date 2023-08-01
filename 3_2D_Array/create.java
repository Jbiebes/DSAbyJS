import java.util.Scanner;

public class create {
    public static void maxMin(int arr[][]){
        int n=arr.length,m=arr[0].length;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                min=Math.min(min,arr[i][j]);
                max=Math.max(max,arr[i][j]);
            }
        }
        System.out.println(max+" & "+min);
    }
    public static void main(String args[]){
        int arr[][]=new int[3][3];
        int n=arr.length,m=arr[0].length;

        Scanner sc= new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        maxMin(arr);

    }
}
