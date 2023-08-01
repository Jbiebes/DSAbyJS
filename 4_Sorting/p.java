class p{
   public static void qS(int arr[],int si,int ei){
    //base case
    if(si>=ei){
        return;
    }
    int pidx = partision(arr,si,ei);
    qS(arr,si,pidx-1);
    qS(arr,pidx+1, ei);

   }

   public static int partision(int arr[],int si,int ei){
    int pivot=arr[ei];
    int i=si-1;
    for(int j=si;j<ei;j++){
        if(arr[j]<pivot){
            i++;
            int tmp=arr[j];
            arr[j]=arr[i];
            arr[i]=tmp;
        }
    }
    i++;
    int tmp=pivot;
    arr[ei]=arr[i];
    arr[i]=tmp;
    return i;
    
   }
  
    public static void show(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]={2,4,1,10,5,7};
        qS(arr,0,arr.length-1);
        show(arr);
    }
}
 