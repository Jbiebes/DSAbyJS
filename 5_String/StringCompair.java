public class StringCompair {
    public static void main(String[] args) {
        String s1="jagannath";
        String s2="jagannath";
        String s3=new String("jagannath");
        if(s1==s2){
            System.out.println("Equal");
        }
        else{
            System.out.println("not equal");
        }
        // if(s1==s3){
        //     System.out.println("Equal");
        // }
        // else{
        //     System.out.println("not equal");
        // }
        if(s1.equals(s3)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
