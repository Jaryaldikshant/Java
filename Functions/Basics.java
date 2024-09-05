
import java.util.Scanner;

public class Basics {

    public static void main(String[] args) {
        sum();
        
    }

    static void sum() {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter First number: ");
        int num = in.nextInt();

        System.out.print("Enter Second number: ");
        int num2 = in.nextInt();

        int sum = num + num2;

        System.out.print("Sum of 2 numbers: " + sum);

    }

}
