
// _ _ _ *
// _ _ * *
// _ * * *
// * * * * 

public class practice {
    public static void main(String args[]){
      int n=4;
      int i;
      for(i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
      }
        }
    }

