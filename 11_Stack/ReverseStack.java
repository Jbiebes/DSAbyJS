import java.util.Stack;

public class ReverseStack {
     public static void bottom(Stack<Integer> stack,int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int e=stack.pop();
        bottom(stack, data);
        stack.push(e);
    }

    public static void reverse(Stack<Integer> s){
        if(s.empty()){
            // bottom(s, data);
            return;
        }
        int e=s.pop();
        reverse(s);
        bottom(s,e);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(22);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
