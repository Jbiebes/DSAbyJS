//1
//12
//123
//4567 floyd's trangle:
public class pattern8 {
   public static void main (String args[]){
    int n=5,number=1;
    for(int i=1;i<=n;i++){
        for(int j=0;j<i;j++){
            System.out.print(number+" ");
            number++;
        }
        System.out.println();
    }
   } 
}
