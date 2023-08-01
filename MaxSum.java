public class MaxSum {
    public static void printMS(int number[]){
        int cursum=0;
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                cursum=0;
                for(int k=start;k<=end;k++){
                    cursum+=number[k];
                }
                System.out.println(cursum);
               if(cursum>MaxSum){
                MaxSum=cursum;
               }
            }
            
        }
        System.out.println("The Max sum is: "+MaxSum);
    
    }
    public static void main(String[] args) {
        int number[]={10,20,30,40};
        // Reverse(number);
        // for(int i=0;i<number.length;i++){
        //     System.out.print(number[i]+" ");
        // }
        printMS(number);
        System.out.println();
    }
    
}
