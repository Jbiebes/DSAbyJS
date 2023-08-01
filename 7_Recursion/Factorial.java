public class Factorial {
    public static int fact(int n){
      if(n==0 || n==1){
        return 1;
      }
      return(n*fact(n-1));
    }
    public static int Binomial(int n,int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nmr=fact(n-r);
        int bnc=fact_n/(fact_r*fact_nmr);
        return bnc;
    }
    public static void main(String[] args) {
        //int n=4;
       // fact(n);
        System.out.println("The factorial of number is:"+fact(5));
    }
}
