public class OptimizePower {
    public static int optmPower(int x,int n){
       if(n==0){
        return 1;
       }
       int r=(optmPower(x, n/2)*optmPower(x, n/2));
       if(n%2!=0){
        //  System.out.println(n);
         r=r*x;
       }
       return r;
    }
    public static void main(String[] args) {
       System.out.println(optmPower(5,3));
    }
}
