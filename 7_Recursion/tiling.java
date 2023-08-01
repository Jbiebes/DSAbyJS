public class tiling {
    public static int findWays(int n){
        //base case
        if(n==0||n==1){
            return 1;
        }
        //work to do(chose from horizontal or vertical)
        //vertical
        int vl =findWays(n-1);

        //horizontal
        int hl=findWays(n-2);

        int totalWays=hl+vl;

        return totalWays;
    }

     public static void removeDuplicate(String str,StringBuilder newStr,int index,boolean arr[]){
        //base case 
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }
        //work to do
        char letter=str.charAt(index);
        if(arr[letter-'a']==true){
            removeDuplicate(str, newStr, index+1, arr);
        }
        else{
            arr[letter-'a']=true;
            removeDuplicate(str, newStr.append(letter), index+1, arr);
        }
    }

    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    
    
    public static void main(String args[]){
        String str="appnacollege";
        // System.out.println(findWays(4));
        // removeDuplicate2(str,0, new StringBuilder(""),new boolean [26]);
        // System.out.println(fibo(50));
    }
}
