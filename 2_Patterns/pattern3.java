/**public class pattern3 {
    public static void main(String args[]){
        // System.out.println("Enterr");
        int n=4;
        // outer loof
        for(int i=1;i<=n;i--){
            //loof for-> space print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //loof for-> star print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

******************************************* */



/********************************************* */

public class pattern3 {
    public static void main(String args[]){
        // System.out.println("Enterr");
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
