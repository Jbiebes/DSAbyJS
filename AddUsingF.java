import java.util.*;
public class AddUsingF {
    public static int sum(int i,int j){
       return(i+j);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The sum is : "+sum(a,b));
  
    }
}
