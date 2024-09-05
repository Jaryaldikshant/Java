
import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        boolean ans = isprime(num);

        System.out.println(ans);
    }

    static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;

        }

    return (c*c > n);
    
    }
}


