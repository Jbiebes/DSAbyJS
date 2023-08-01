public class QueueArr {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr=new int[n];
            size=n;
            front=rear=-1;
            // rear=-1;
        }

        public boolean isEmpty(){
            return rear==-1;
        }
        public boolean isFull(){
            if(rear==size-1){
                return true;
            }
            else{
                return false;
            }
        }
    
        public void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            //for 1'st element
            if(front==-1){
                front=0;
            }
            rear++;
            arr[rear]=data;
            if(isEmpty()){
                front=data;
            }
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            int element=arr[front];
            if(front==rear){
                front=rear=-1;
                // rear=-1;
                // return element;
            }else{
                front=front+1;
            }
            return element;
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        // q.add(4);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.add(30);
        System.out.println(q.remove());
        q.add(40);
        System.out.println(q.remove());
        // while(!q.isEmpty()){
        //     System.out.println(q.remove());
        // }
    }
}
