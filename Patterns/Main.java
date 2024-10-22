
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Pattern1(n);

        System.out.println();

        Pattern2(n);

        System.out.println();

        Pattern3(n);

        System.out.println();

        Pattern4(n);

        System.out.println();

        Pattern5(n);

        System.out.println();

        Pattern6(n);
    }

    static void Pattern2(int n) {

        for (int row = 1; row <= n; row++) {
            //  for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern1(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern3(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern4(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void Pattern5(int n) {

        for (int i = 1; i < 2 * n; i++) {

            int col = i > n ? 2 * n - i : i;

            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern6(int n) {

        for (int i = 0; i < 2 * n; i++) {

            int totalcol = i > n ? 2 * n - i : i;

            int space = n - totalcol;
            for (int sp = 0; sp < space; sp++) {
                System.out.print(" ");
            }

            for (int j = 0; j < totalcol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
