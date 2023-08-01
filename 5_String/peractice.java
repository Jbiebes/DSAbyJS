// import java.util.*;
public class peractice {
    public static int palinDrome(String str){
        int si=0;
        int ei=str.length()-1;
        while(ei>si){
            if(str.charAt(si)!=str.charAt(ei)){
                return -1;
            }
            si++;
            ei--;
        }
        return 1;
    }
    public static void main(String[] args) {
        String a="momab";
        int r=palinDrome(a);
        if(r!=1){
            System.out.println("N.P");
        }
        else{
            System.out.println("P");
        }
        
    }
}
