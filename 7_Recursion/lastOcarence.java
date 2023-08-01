public class lastOcarence {
    public static int LastIndex(int arr[],int k,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=LastIndex(arr, k, i+1);
        if(isFound==-1 && arr[i]==k){
            return ++i;
        }
        return (isFound);
    }

    public static void main(String[] args) {
        int  arr[]={1,5,3,3,2,6,3,5};
        int r=LastIndex(arr, 3, 0);
        if(r!=-1){
             System.out.println("The index found at positin: "+r);
        }
        else{
            System.out.println("not found");
        }
     }
}
