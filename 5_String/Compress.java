public class Compress {
    public static String com(String str){
        StringBuilder ns=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer c=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)  ){
                c++;
                i++;
            }
            ns.append(str.charAt(i));
            if(c>0){
                ns.append(c.toString());
            }
        }
        return ns.toString();
    }
    public static void main(String args[]){
        String sc="aabbcd";
        System.out.println(com(sc));
    }
}
