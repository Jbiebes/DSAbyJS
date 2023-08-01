public class incresing_series {
    public static void series(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        series(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        series(10);
    }
}
