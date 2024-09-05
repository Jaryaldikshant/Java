import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Pls Enter a: ");
        int a = input.nextInt();

        System.out.print("Pls Enter b: ");
        int b = input.nextInt();

        int c = a+b;

        System.out.println("Sum of a+b: "+c);
    }
}
