import java.util.*;
public class switch01 {
    public static void main(String args[]){
        System.out.println("Enter 1 to 3 switch:");
        Scanner sr = new Scanner (System.in);
        int button=sr.nextInt();
        sr.close();
        switch (button) {
            case 1:
            System.out.println("Jai jagannath");
                break;
        
            case 2:
                System.out.println("jagannath");
                 break;
            default:
            System.out.println("Jagannath Sarkar");
                break;
        }
    }
}
