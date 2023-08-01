public class MergeSort {
    public static void mgSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mgSort(arr,si,mid); //for left part
        mgSort(arr,mid+1,ei); //for rigth 
        merge(arr,si,mid,ei);
        System.out.println(si+" "+ei+" "+mid);
    }

    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si; //iteretor for left;
        int j=mid+1; //iteretor for right;
        int k=0; //iteretor for tmp array;
        
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy in array from temp array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }
    public static void show(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

   
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        mgSort(arr,0,arr.length-1);
        show(arr);
    }
}
