
import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int ans = BtoD(num);
        System.err.println(ans);
    }

    static int BtoD(int n) {
        return solve(n, 0);
    }

    static int solve(int n, int i) {

        if (n == 0) {
            return 0;
        }

        int lastbit = n % 10;

        int remaining = solve(n / 10, i + 1);

        return (lastbit * (int) Math.pow(2, i)) + remaining;

    }

}
