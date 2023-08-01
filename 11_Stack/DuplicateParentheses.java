import java.util.*;
public class DuplicateParentheses {
    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            int c=0;
            char ch=str.charAt(i);
            //closing ) 
            if(ch==')'){
                while(s.pop()!='('){
                    c++;
                }
                if(c<1){
                    return true;
                }
            }
            //opening ( || operand || operator
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="((a+b)+(c+d))"; //not dupliate so op will be false
        System.out.println(isDuplicate(str));
    }
}
