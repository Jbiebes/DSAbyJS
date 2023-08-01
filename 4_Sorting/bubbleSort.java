public class bubbleSort {
    public static void bsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void selectionsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minpos=i;
            for(int j=i+1;j<n;j++){
               if(arr[minpos]>arr[j]){
                minpos=j;
               }
            }
            //swap
            if(i!=minpos){
                int temp=arr[minpos];
                arr[minpos]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void insertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int tmp=arr[i];
            int j=i-1;
            while(j>=0 && tmp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=tmp;
        }
    }
    public static void  bp(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={12,34,5,6,7,2};
        // bsort(arr);
        // selectionsort(arr);
        insertionSort(arr);

        bp(arr);

    }
}
