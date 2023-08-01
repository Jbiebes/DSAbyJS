public class pattern2 {
   public static void main(String args[]) {
      int m = 4, n = 5;

      for (int i = 1; i <= m; i++) {
         for (int j = 1; j <= n; j++) {

            if (i == 1 || j == 1 || i == m || j == n) {
               System.out.print("* ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();

      }
   }

}
/*
 * import java.util.*;
 * public class practice {
 * public static void main (String args[]){
 * int i,j;
 * Scanner sr= new Scanner(System.in);
 * System.out.println("Enter collom and row:");
 * int m=sr.nextInt();//i for collom
 * int n=sr.nextInt();//j for row
 * for(i=1;i<=m;i++){
 * for(j=1;j<=n;j++){
 * if(i==1||i==m||j==1||j==n){
 * 
 * System.out.print("*");
 * }
 * else{
 * System.out.print(" ");
 * }
 * }
 * System.out.println();
 * }
 * }
 * }
 */
