
import java.util.Scanner;


public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int ans = BtoD(num);
        System.err.println(ans);

    }

    static int BtoD(int n){
        return solve(n);
    }

    static int solve(int n){

            if(n == 0) return 0;

            int lastbit = n%2;

            int remaining = solve(n/2);

            return  remaining*10+lastbit;

    }
}
