public class Uppercase {
    public static String upper(String str){
        StringBuilder sb=new StringBuilder("");
        char ch= Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append(str.charAt(i));
                sb.append(Character.toUpperCase(str.charAt(++i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        String sc="hi im Jagannath sarkar";
        // System.out.println(upper(sc)); 
        System.out.println(upper(sc));
    }
}
