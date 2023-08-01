public class qs {
    public static void QuickSort(int arr[],int si,int ei) {
        //base case
        if(si>=ei){
            return ;
        }
        int pidx = partision(arr,si,ei);
        QuickSort(arr, si, pidx-1);
        QuickSort(arr,pidx+1,ei);
    }

    public static int partision(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(pivot>=arr[j]){
                i++;
                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
            }
           
        }
         i++;
        int tmp=arr[ei];
        arr[ei]=arr[i];
        arr[i]=tmp;
        return i;

    }
     public static void show(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        QuickSort(arr,0,arr.length-1);
        show(arr);
    }
}
