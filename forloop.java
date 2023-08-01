// sum of first n no.
import java.util.*;
public class forloop {
    public static void main (String args[]){
        Scanner sr= new Scanner(System.in);
        int n,s=0;
        n=sr.nextInt();
        for(int c=1;c<=n;c++){
            s=s+c;
        }
        System.out.print(s);
    }
}
