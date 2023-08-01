public class sumOfn {
    public static int sOn(int n){
        if(n==0){
            return 0;
        }
        return (n+sOn(n-1));
        
    }
    public static void main(String args[]){
        System.out.println(sOn(5));
    }
}
