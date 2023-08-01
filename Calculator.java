// package practice;
import java.util.*;
public class Calculator {
    public static void main (String args[]) {
    System.out.println("Enter 1 to 4  and two number :");
    Scanner sr= new Scanner(System.in);
    int a = sr.nextInt();
    int b= sr.nextInt();
    int c = sr.nextInt();
    sr.close();
    switch (a) {
        case 1:
            System.out.println(b+c);
            break;
        case 2:
            System.out.println(b-c);
            break;
        case 3:
            System.out.println(b*c);
            break;
        case 4:
            System.out.println(b/c);
            break;
    
        default:
            System.out.println("Enter a valid number:");
            break;
    }
    }
}
