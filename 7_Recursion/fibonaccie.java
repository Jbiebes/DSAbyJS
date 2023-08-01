public class fibonaccie {
    public static int findfibo(int n){
        if(n==1 ||n==0){
            return n;
        }

        int fibo = findfibo(n-1)+findfibo(n-2);
        return fibo;
    }
    public static void main(String[] args) {
        int n=12;
        
        System.out.println(findfibo(n));
    }
}
