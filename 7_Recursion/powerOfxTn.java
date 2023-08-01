// import java.util.*;
public class powerOfxTn {
    public static int pow(int x,int n){
        //base case
        if(n==0){
            return 1;
        }
        return (x*pow(x,n-1));
    }

    public static void main(String[] args) {
        // int x=5,n=3;
        // int x,n;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter 'x' and 'n': ");
        // x=sc.nextInt();
        // n=sc.nextInt();
        // sc.close();
        System.out.println("The result is: "+pow(5,2));
    }
}
