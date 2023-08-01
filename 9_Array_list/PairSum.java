import java.util.*;
    
public class PairSum {
    public static ArrayList<Integer> twoSum(ArrayList<Integer> nums, int target) {
        int si=0,ei=nums.size()-1;
        ArrayList<Integer> arr=new ArrayList<>();
        // ArrayList<Integer> arr=new ArrayList<>();
        while(si<ei){
            int cs=nums.get(si)+nums.get(ei);
            if(cs==target){
                arr.add(si);
                arr.add(ei);

                return arr;
            }
            else if(cs>target){
                ei--;
            }
            else{
                si++;
            }
        }
        arr.add(0);
        return (arr);
    }
    //for roteted list 
    public static boolean pair_2(ArrayList<Integer> p, int target){
        int i,n=p.size();
        for(i=0;i<n;i++){
            if(p.get(i)>p.get(i+1)){
                break;
            }
        }
        int si=i+1,ei=i;

       while(si<ei){
            int cs=p.get(si)+p.get(ei);
            if(target==cs){
                return true;
            }
            else if(cs>target){
                //rs--
                ei=(n+ei-1)%n;
            }
            else{
                // ls++
                si=(si+1)%n;
            }
        }
        return false;
    }
    public static boolean pair(ArrayList<Integer> p, int target){
        int si=0,ei=p.size()-1;
        while(si<ei){
            int cs=p.get(si)+p.get(ei);
            if(target==cs){
                return true;
            }
            else if(target>cs){
                si++;
            }
            else{
                ei--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> p = new ArrayList<>();
        p.add(11);
        p.add(15);
        p.add(6);
        p.add(8);
        p.add(9);
        p.add(10);
        // System.out.println(pair(p,50));
        // System.out.println(twoSum(p, 50));
        System.out.println(pair_2(p, 16));
    }
}
