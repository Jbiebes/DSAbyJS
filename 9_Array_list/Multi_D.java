import java.util.ArrayList;

public class Multi_D {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
        ArrayList<Integer> l1= new ArrayList <>();
        l1.add(3);
        l1.add(5);
        ArrayList<Integer> l2= new ArrayList <>();
        l2.add(8);
        l2.add(9);
        MainList.add(l1);
        MainList.add(l2);
        System.out.println(MainList);

        for(int i=0;i<MainList.size();i++){
            ArrayList<Integer> cr=MainList.get(i);
            for(int j=0;j<cr.size();j++){
                System.out.print(cr.get(j)+" ");
            }
            System.out.println();
        }
    }
}
