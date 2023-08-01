public class DoublyLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addF(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void show(){
        Node tmp=head;
        while(tmp!=null){
            System.out.print(tmp.data+"<->");
            tmp=tmp.next;
        }
        System.out.println("NULL");
    }
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addF(3);
        dll.addF(10);
        dll.addF(30);
        dll.show();
        dll.reverse();
        dll.show();
    }
}
