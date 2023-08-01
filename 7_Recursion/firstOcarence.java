  public class firstOcarence {
    public static int FirstIndex(int arr[],int k,int i){
      //base case
      if(i==arr.length){
        return -1;
      }
      if(arr[i]==k){
        return i;
      }
      return FirstIndex(arr,k,i+1);
    }
    public static void main(String[] args) {
       int  arr[]={1,4,5,2,6,3,5};
       int r=FirstIndex(arr, 50, 0);
       if(r!=-1){
            System.out.println("The index found at positin "+r);
       }
       else{
        System.out.println("key wasn't found ");
       }
    }
}
