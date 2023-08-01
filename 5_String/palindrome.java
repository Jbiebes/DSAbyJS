public class palindrome {
    public static boolean ispalindrome(String ab){
        for(int i=0;i<ab.length()/2;i++){
            if(ab.charAt(i)!=ab.charAt(ab.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static boolean pali(String ab){
        int si=0,ei=ab.length();
        while(si<ei){
            if(ab.charAt(si)!=ab.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }
    public static float shortestpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N'){
                y++;
            }
            else if(path.charAt(i)=='S'){
                y--;
            }
            else if(path.charAt(i)=='E'){
               x++;
            }
            else{
                x--;
            }
        }
        int x2=(x*x);
        int y2=(y*y);

        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String str="mam";
        System.out.println(pali(str));
        // System.out.println(ispalindrome(str));
        // if(ispalindrome(str)){
        //     System.out.println("This is a palindrome number!");
        // }
        // else{
        //     System.out.println("Non palindrome number!");
        // }
        // System.out.println(shortestpath(str));
    }
}
