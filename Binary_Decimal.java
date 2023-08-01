public class Binary_Decimal {
    public static void btd(int binary){
        int mynum=binary;
        int pow=0;
        int decimal=0;
        
        while(binary>0) {
            int lastdigit=binary%10;
            decimal=decimal+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binary=binary/10;
        }
        System.out.println("The decimal of "+mynum+" = "+decimal);
    }
    static void dtb(int deci){
        int mynum=deci;
        int pow=0;
        int binary=0;
        while(deci>0){
            int lastdigit=deci%2;
            binary=binary+(lastdigit*(int)Math.pow(10,pow));
            pow++;
            deci=deci/2;
        }
        System.out.println("The Binary of "+mynum+" = "+binary);

    }
    static void max(int a,int b){
        System.out.println(Math.max(a,b));
    }
    public static void main(String[] args) {
        max(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        ///dtb(Integer.parseInt(args[1]));
    }
}
