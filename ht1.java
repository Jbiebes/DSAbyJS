
import java.util.*;
// public class ht1 {
//     public static void main (String args[]){

//         System.out.println("Enter 1 or 0:");
//         int n;
//         Scanner sr= new Scanner(System.in);
//         n=sr.nextInt();
//         if(n==1){
//             System.out.println("Enter The number out of 100:");
//             int ex=sr.nextInt();
//             if(ex>=90){
//                 System.out.println("This is good");
//             }
//             else if(ex>=60 && ex <=89){
//                 System.out.println("This is also Good");
//             }
//             else {
//                 System.out.println("This is Good as well");
//             }
//         }
//         else{
//             System.out.println("run again");
//         }
        
//     }
// }
public class ht1{
    public static void main (String args[]){
        System.out.println("Enter a number to check prime or not:");
        Scanner sr= new Scanner(System.in);
        int a=sr.nextInt();
        int i;
        for( i=2;i<=a/2;i++){
           if(a%i==0){
            System.out.println("This is not a prime number");
            break;
           }
        }
         if(i==(a/2)+1){
            System.out.println("This is a prime number");
        }
    }
}