import java.util.*;
public class PushB {
    public static void bottom(Stack<Integer> stack,int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int e=stack.pop();
        bottom(stack, data);
        stack.push(e);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(30);
        s.push(20);
        bottom(s,40);
        while(!s.isEmpty()){
            System.out.println(s.pop());

        }

    }
}
