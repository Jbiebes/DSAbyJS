import java.util.*;
public class pattern7 {
    public static void main(String args[]){
        Scanner sr=new Scanner (System.in);
        System.out.println("Enter row:");
        int n=sr.nextInt();
        sr.close();
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
