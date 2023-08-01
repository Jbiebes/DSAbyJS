public class prime {
    public static boolean isPrime(int n){
        //boolean isPrime =true;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void PrimeRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
       // int n=22;
        PrimeRange(20);
        // if(isPrime(n)){//it's mean if true
        //     System.out.println(n+" is a prime number");
        // }
        // else{
        //     System.out.println(n+ " is not a prime number:");
        // }
    }
}
