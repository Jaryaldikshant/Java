
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int ans = factorial(n);

        System.out.println(ans);
    }

    static int factorial(int n) {

        if (n == 0) {
            return 1;
        }

        int small = factorial(n - 1);

        int big = n * small;

        return big;
    }
}
