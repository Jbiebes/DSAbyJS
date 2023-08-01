import java.util.*;
public  class StackAL {
    static class Stack{
        static ArrayList<Integer> stack = new ArrayList<>();

        public   boolean isEmpty(){
            return stack.size()==0;
        }
        //push
        public static void push(int data){
            stack.add(data);
        }
        //pop
        public   int pop(){
            if(isEmpty()==true){
                return -1;
            }
            int element=stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return element;
        }
        //peek
        public  int peek(){
             if(isEmpty()==true){
                return -1;
            }
            return stack.get(stack.size()-1);
        }

         

    }

    
    public static void main(String[] args) {
         Stack s=new Stack();
         StackAL.Stack.push(5); //static way
         Stack.push(5);
         Stack.push(10);  ///static method
        Stack.push(10);
         
         while(!s.isEmpty()){ //not static method
            //  System.out.println(s.peek()); 
             System.out.println(s.pop());
         }
    }
}
