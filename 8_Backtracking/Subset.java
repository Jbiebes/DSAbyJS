public class Subset {
    public static void ShowSubSet(String str,String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("NULL");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        //yes
        ShowSubSet(str,ans+str.charAt(i),i+1);
        //no
        ShowSubSet(str,ans,i+1);
    }

    public static void subset(String str,String nStr,int i){
        if(i==str.length()){
            if(nStr.length()==0){
                System.out.println("{\u03A6}");
            }else{

                System.out.println("{"+nStr+"}");
            }
            return;
        }
        subset(str, nStr+str.charAt(i), i+1);
        subset(str, nStr, i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        subset(str,"",0);
    }
}
