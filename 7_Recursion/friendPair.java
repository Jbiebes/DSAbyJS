public class friendPair {
    public static int totalway(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }
        //single
        int w1=totalway(n-1);
        //pair
        int w2=(n-1)*totalway(n-2);
        return (w1+w2);
    
    }
    // public static void binaryString(int n,int lastplace,String str){
    //     //base case
    //     if(n==0){
    //         System.out.println(str);
    //         return;
    //     }

    //     // work
    //     binaryString(n-1,1,str+("1"));
    //     if(lastplace==1){
    //         binaryString(n-1,0,str+("0"));
    //     }
    // }
    public static void binaryString0(int n,int lastplace,String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }

        // work
        binaryString0(n-1,0,str+("0"));
        if(lastplace==0){
            binaryString0(n-1,1,str+("1"));
        }
    }
        public static void main(String[] args) {
        // System.out.println(totalway(3));
        binaryString0(3,1,(""));
        // String s="";
        // System.out.println(s+"0");

    }
}
