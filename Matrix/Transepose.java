public class Transepose {
    public static void sumSecond(int arr[][]) {
        int row = arr.length, colm = arr[0].length;
        System.out.println(row+" "+colm);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <2; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 11, 12, 13 },
                { 21, 22, 23}

        };

        sumSecond(arr);
    }
}
