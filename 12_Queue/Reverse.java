import java.util.*;
class Reverse{
    public static void revQ(Queue<Integer> q){
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty()){
            s.add(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
       
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<5;i++){
            q.add(i+1);
        }
         revQ(q);
         System.out.println(q);

    }
}