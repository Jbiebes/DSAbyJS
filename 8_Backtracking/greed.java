public class greed {
    public static int greedWay(int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==m){
            return 0;
        }

        int w1=greedWay(i+1, j, n, m);
        int w2=greedWay(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String args[]){
        int n=3,m=4;
        System.out.println(greedWay(0,0,n,m));
    }
}
