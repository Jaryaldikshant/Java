
import java.util.Scanner;

public class Nth_Fibonacci_Num {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        // int ans = solve(n);
        int res = fiboFormula(n);

        // System.out.println(ans);
        System.out.println(res);
    }

    static int fiboFormula(int n) {
        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

    static int solve(int n) {

        // base case 
        if (n < 2) {
            return n;
        }

// Tail Recursion: When we have the last statement in the function call
        // Recurence Relation: Any Recursive solution which can be converted into formula
        return solve(n - 1) + solve(n - 2);

// Here this last statement is not the Tail recursion, because it's not done yet it will first find for n-1 and then find for n-2 and then it will add the both 
    }
}
