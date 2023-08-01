public class QuickSort {
    public static void qS(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        
        int pidx=partision(arr,si,ei);
        qS(arr,si,pidx-1);//for left
        qS(arr,pidx+1,ei);//for right

    }

    public static int partision(int arr[],int si,int ei){
        int pivot =arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int tmp=arr[j];
                arr[j]=arr[i];
                arr[i]=tmp;
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
        qS(arr,0,arr.length-1);
        show(arr);
    }
}
