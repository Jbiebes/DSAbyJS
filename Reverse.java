import java.util.*;
 class Reverse {
    public static void main(String[] args) {
        Scanner sr =new Scanner(System.in);
        System.out.println("Enter any number to reverse: ");
        int n=sr.nextInt();
        sr.close();
        while(n>0){
            int last=n%10;
            System.out.print(last+" ");
            n=n/10;
        }
    }
}
