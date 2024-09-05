
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = in.nextInt();

        System.out.print("Enter b: ");
        int b = in.nextInt();

        swap(a, b);

        System.out.println(a + " " + b);

    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);

    }
}
