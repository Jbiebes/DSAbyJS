import java.util.*;
public class practice {

  public static String reverse(String str){
    Stack<Character> s=new Stack<>();
    int i=0;
    while(i<str.length()){
        char ch=str.charAt(i);
        s.push(ch);
        i++;
    }
    StringBuilder rs=new StringBuilder("");
    while(!s.isEmpty()){
        char e=s.pop();
        rs.append(e);
    }
    return rs.toString();

  }

  public static void main(String[] args) {
    String str="abc";
    System.out.println(reverse(str));
  }
}
