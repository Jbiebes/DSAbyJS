public class Linkedlist {
    //create a class of node 
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //....................add methods.......................//
    public void addFirst(int data){
        //1.create a node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        // 2.point next toards head
        newNode.next=head;
        //3.update head with new node
        head=newNode;
    }

    public void addLast(int data){
        //1.create a node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        //2.next of tail point to the newnode
        tail.next=newNode;

        //3.next of newNode point to the null
        newNode.next=null; 
        tail=newNode;

    }

    public void addIndex(int data,int index){
        if(index==0){
            addFirst(index);
            return;
        }
        //1.
        Node newNode = new Node(data);
        size++;
        //2.
        Node tmp=head;
        for(int i=0;i<index-1;i++){
            tmp=tmp.next;
        }
        //3.
        newNode.next=tmp.next;
        tmp.next=newNode;
    }

    //...............romove methods...............//
    public int removeFirst(){
        if(head==null){
            System.out.println("No node was found");
            return -1;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        Node tmp=head;
        int val=tmp.data;
        head=tmp.next;
        size--;
        return val;
    }
    public void removeLast(){
         if(head==null){
            System.out.println("No node was found");
        }
        else if(size==1){
            head=tail=null;
            size--; //size=0
        }
        Node tmp=head;


        while(tmp.next!=tail){
            tmp=tmp.next;
        }
        tmp.next=null;
        tmp=tail;
        size--;
         
    }
   //.............delete from n'th frm end.......//
   public void remove(int idx){
        if(idx==size){
            head=head.next;
            return;
        }
        int n=size-idx;
        Node tmp=head;
        for(int i=0;i<n-1;i++){
            tmp=tmp.next;
        }
        tmp.next=tmp.next.next;
   }
    public void show(){
        // if(head==null){
        //     System.out.println("NULL");
        //     return;
        // }
        Node tmp=head;
        while(tmp!=null){
            System.out.print(tmp.data+"->");
            tmp=tmp.next;
        }
        System.out.println("NULL");
    }

    //........... searching in linked list..................//
     public int search(int key){
        Node tmp=head;
        int i=0;
        while(tmp!=null){
            if(tmp.data==key){
                return i;
            }
            tmp=tmp.next;
            i++;
        }
        return -1;
    }

    //recursive approach
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        //base case
        if(head.data==key){
            return 0;
        }
        //work
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int rSearch(int key){
        return helper(head, key);
    }
    //.......reverse a linkd list..............//
    public void reverse(){
        Node prev=null;
        Node cur=tail=head; //head er value tail & cur e 
        Node nextI;
        while(cur!=null){
            nextI = cur.next;
            cur.next=prev;

            prev=cur;
            cur=nextI;
        }
        head=prev;
    }

    //.........find palindrome...........//
    public Node findMid(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next; //+2
        }
        return slow;
    }

    public boolean palindrome(){
        //base case
        if(head==null || head.next==null){
            return true;
        }
        //find middle
        Node mid=findMid();
        //reverse
        Node curr=mid;
        Node prev=null,next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }
        Node right=prev; //head of the right node
        Node left=head;

        //compare from the left and right node
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
        
    }
    
    public static boolean cycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        //identify is cycle exist;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
               cycle=true;
               break;
            }
        }

        if(cycle==false){
            return;
        }
        //remove cycle
        slow=head;
        Node prev=null;
        while(slow!=fast){
        prev=fast;
        fast=fast.next;
        slow=slow.next;
        }
        prev.next=null;

    }
     public void zigZag(){
        Node slow=head;
        Node fast=head.next;
        //find mid
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        //reverse 2'nd part
        Node curr = mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }

        //zigzag
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;

            nextR=right.next;
            right.next=nextL;


            left=nextL;
            right=nextR;
        }
     }
    public static void main(String args[]){
        Linkedlist ll = new Linkedlist();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.show();
        ll.zigZag();
        ll.show();
        
    }
}
