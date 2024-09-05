import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int n = input.nextInt();

     for(int i = 2; i<=n; i++){
         int temp = b;
         b = b+a;
         a = temp;
     }

     System.out.print(b);
    }
}
