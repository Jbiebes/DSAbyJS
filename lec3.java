import java.util.*;

public class lec3 {
    public static void main (String args[]){
        System.out.println("Enter two number:");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println("A is gretter than B");
        } 
        else if(a==b){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("B is gretter than A");
        }
    }
}
