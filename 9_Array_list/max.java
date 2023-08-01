import java.util.ArrayList;
public class max {
    public static void swap(ArrayList<Integer> list){
        int si=0,ei=list.size()-1;
        while(si<ei){
            int tmp=list.get(ei);
            list.set(ei,list.get(si));
            list.set(si,tmp);

            si++;
            ei--;
        }
    }
    public static void main(String args[]){
        ArrayList <Integer> a = new ArrayList<>();
        a.add(4);
        a.add(5);
        a.add(9);
        a.add(1);
        a.add(2);

        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<a.size();i++){
        //     if(a.get(i)>max){
        //         max=a.get(i);
        //     }
        // }
        System.out.println(a);
        swap(a);
        System.out.println(a);
    }
}
