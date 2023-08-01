public class Bitmanupulation {
    public static void getithbit(int n,int i){
        int bitmusk = 1<<i;
       
        if((bitmusk & n)==0){
            System.out.println("0");
        }
        else{
            System.out.println(1);
        }
    }
    public static void Setithbit(int n,int i){
        int bitmusk = 1<<i;
       System.out.println((bitmusk|n));
    }
    public static void OddorEven(int a){
        int bitmusk = 1;
        if((bitmusk & a)==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static int clearIBits(int n,int i){
        int bitmusk =(~0)<<i;
        return (bitmusk & i);
    }
    public static void main(String[] args) {
        // OddorEven(55);
        // OddorEven(5);
        // OddorEven(4);
        Setithbit(10,2);
    }
}
