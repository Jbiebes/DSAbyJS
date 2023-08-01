// import java.net.SocketTimeoutException;

import java.util.ArrayList;
public class My_class {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(i);
        }

        // System.out.println(list);


         int max=Integer.MIN_VALUE;
         for(int i=0;i<list.size();i++){
         if(list.get(i)>max){
         max=list.get(i);
        }


        System.out.println(max);
    }
    }


   

}
