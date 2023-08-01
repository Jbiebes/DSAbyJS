public class SearchInSortedMatrix {
    public static int stairSearch(int arr[][],int key){
       int row=0,col=arr[0].length-1;
       while(row<arr.length && col>=0){
            if(arr[row][col]==key){
                return 1;
            }
            else if(arr[row][col]<key){
                row++;
            }
            else{
                col--;
            }
       }
       return -1;

    }
    public static int a(int arr[][],int key){
        int row=0,col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==key){
                return 1;
            }
            else if(arr[row][col]>key){
                col--;
            }
            else{
                row++;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[][]={ {10,20,30,40},
                      {15,25,35,45},
                      {27,29,37,48},
                      {32,33,39,50}};
        System.out.println(a(arr,270));
    }
}
