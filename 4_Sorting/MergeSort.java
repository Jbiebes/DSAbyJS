public class MergeSort {
    public static void mG(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        //left
        mG(arr,si,mid);
        mG(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int tmp[]=new int[ei-si+1]; //5,9 :9-5+1=5
        int i=si;
        int j=mid+1;
        int k=0;

       while(i<=mid && j<=ei){
          if(arr[i]<arr[j]){
            tmp[k]=arr[i];
            i++;
          }
          else{
            tmp[k]=arr[j];
            j++;
          }
          k++;
       }
       while(i<=mid){
        tmp[k++]=arr[i++];
       }
       while(j<=ei){
        tmp[k++]=arr[j++];
       }

       for(k=0,i=si;k<tmp.length;k++,i++){
          arr[i]=tmp[k];
       }
    }
    public static void show(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2,10};
        mG(arr,0,arr.length-1);
        show(arr);
    }   
}
