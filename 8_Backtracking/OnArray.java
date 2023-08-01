class OnArray{
    public static void num(int arr[],int i,int v){
        //base case
        if(i==arr.length){
            show(arr);
            return;
        }
        arr[i]=v;
        num(arr, i+1,v+1);
        arr[i]-=2;
    }
    public static void array(int arr[],int i,int v){
        //base case
        if(i==arr.length)
        {
            return;
        }
        arr[i]=v;
        array(arr, i+1, v+1);
        arr[i]=v-2;
    }
    public static void show(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        array(arr,0,1);
        show(arr);
    }
}