public class substring {
    public static String printsubstring(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static String ab(String str,int si,int ei){
        StringBuilder ns= new StringBuilder("");
        for(int i=si;i<ei;i++){
            ns.append(str.charAt(i));
        }
        return ns.toString();
    }
    public static void main(String[] args) {
        String str="jagannath";
        System.out.println(ab(str,0,4));
        System.out.println(str.substring(0,4));

    }
}
