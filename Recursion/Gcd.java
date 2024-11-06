
import java.util.Scanner;


public class Gcd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int ans = solve(num1,num2);

        System.out.println(ans);

    }

    static int solve(int a, int b){

        if(b == 0) return a;

        return solve(b, a%b);
    }
}
