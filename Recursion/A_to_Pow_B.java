
import java.util.Scanner;

public class A_to_Pow_B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int base = in.nextInt();
        int pow = in.nextInt();

        long res = solve(base, pow);

        System.out.println(res);
    }

    static long solve(int base, int pow) {

        if (pow == 0) {
            return 1;
        }

        if (pow == 1) {
            return base;
        }

        if (pow < 0) {
            return -1;
        }

        long ans = solve(base, pow / 2);

        //  if base is even
        if (pow % 2 == 0) {
            return ans * ans;
        } // if base is odd
        else {
            return base * ans * ans;
        }
    }
}
