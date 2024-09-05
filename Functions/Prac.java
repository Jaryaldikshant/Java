
import java.util.Scanner;

public class Prac {

    public static void main(String[] args) {
        
        greet();

        int ans = sum();
        System.out.println("Sum of 2 numbers: " + ans);

        System.out.println();

        String res = str();
        System.out.print(res);

        System.out.println();

        int rem = pass(20, 50);

        System.out.print(rem);

    }

    // pass the value of numbers when you are calling the method in main()
    static int pass(int a, int b) {
        int sum = (a + b) / 10;
        return sum;
    }

    static void greet() {
        System.out.println("Hello ");
    }

    // return the value
    static int sum() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = in.nextInt();

        System.out.print("Enter num2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;

        return sum;

    }

    static String str() {

        Scanner in = new Scanner(System.in);

        String st = in.next();

        return st;
    }
}
