import java.util.Stack;
public class ReverseStr {
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
        // char e=;
        rs.append(s.pop());
    }
    return rs.toString();

  }

  public static void main(String[] args) {
    String str="jag";
    System.out.println(reverse(str));
  }
}
