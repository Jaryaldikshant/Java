
import java.util.Scanner;

public class PrimeFactor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        factor(num, 2);
    }

    static void factor(int num, int i) {

        if (num == 1) {
            return;
        }

        if (num % i == 0) {
            System.out.println(i + " ");
            factor(num / i, i);
        } else {
            factor(num, i + 1);
        }

    }
}
