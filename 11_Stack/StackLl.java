// import java.util.*;
public class StackLl {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head=null;

        public boolean isEmpty(){
            return head==null;
        }

        public void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int element=head.data;
            head=head.next;
            return element;
        }
        public int peek(){
             if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(5);
        s.push(10);
        s.push(7);
        
        while(!s.isEmpty()){
           //  System.out.println(s.peek());
            System.out.println(s.pop());
        }
    }   
}
