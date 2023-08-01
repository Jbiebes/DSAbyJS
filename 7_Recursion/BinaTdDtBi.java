public class BinaTdDtBi {
    public static int btD(int n){
        int c=0,Dn=0;
        while(n>0){
            int r=n%10;
            if(r==1){
                Dn+=(int)Math.pow(2,c);
            }
            n=n/10;
            c++;
        }
        return Dn;
    }
    public static int decimalToBinary(int n){
        int r,Bn=0,c=0;
        while(n>0){
            r=n%2;
            Bn+=r*(int)Math.pow(10,c);
            n=n/2;
            c++;
        }
        return Bn;
    }
    
    public static void main(String[] args) {
        System.out.println(btD(1101));
        // System.out.println(decimalToBinary(11));
    }
}
