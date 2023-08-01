public class Binomial {
    public static int fact(int n, int r) {
        int f = 1, k = 1, l = 1, j = (n - r), c;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        for (int i = 1; i <= r; i++) {
            k = k * i;
        }
        for (int i = 1; i <= j; i++) {
            l = l * i;
        }
        return c = f / (k * l);

    }

    public static void main(String[] args) {
        int n = 4, c = 2;
        // fact(n);
        System.out.println("The factorial of number is:" + fact(n, c));
    }

}
