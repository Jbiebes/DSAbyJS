import java.util.ArrayList;

public class MaxWatterTrap {
    public static int pointer_aproach(ArrayList<Integer> height){
        int li=0;
        int ri=height.size()-1;
        int max=Integer.MIN_VALUE;
        
        while(li<ri){
            int h=Math.min(height.get(li),height.get(ri));
            int wt=h*(ri-li);
            max=Math.max(wt,max);                                   //O(n)

            if(li<ri){
                li++;
            }
            else{
                ri--;
            }
        }
        return max;


    }

    public static int MwT(ArrayList<Integer> height){
        int n=height.size();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int h=Math.min(height.get(i),height.get(j));
                int waterTrapped=h*(j-i);                          //O(n2)
                if(waterTrapped>max){
                    max=waterTrapped;
                }
            }
            
        }
        return max;
    }
 public static void main(String args[]){
    ArrayList<Integer> height= new ArrayList<>();
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);

    // System.out.println(MwT(height));
    System.out.println(pointer_aproach(height));
 }   
}
