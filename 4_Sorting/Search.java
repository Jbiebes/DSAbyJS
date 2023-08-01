import java.util.*;
public class Search {
     public static int LinerSearch(String menu[],String data){
         for(int i=0;i<menu.length;i++){
            if(menu[i]==data){
                return i;
            }
         }
         return -1;
     }

     public static int BinarySearch(int number[]){
        int start=0,end=number.length-1;
        while(start<end){
          int temp=number[start];
          number[start]=number[end];
          number[end]=temp;

          start++;
          end--;
        }
         return -1;
    }

    public static int Largest(int number[]){
         int max=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(max<number[i]){
                max=number[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number[]={12,23,43,54,64};
        sc.close();
       BinarySearch(number);
       for(int i=0;i<number.length;i++){
        System.out.print(number[i]+" ");
    }
    System.out.println();

    }
}
 