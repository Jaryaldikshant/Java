
import java.util.Arrays;
import java.util.Scanner;

// Acc. to Recursion f(n) solved, but when again f(n) is called it will going to solved again, whihc take alot of time 
// and This Problem is called as "Overlapping sub Problem"

// Here, "Memoization" comes in, which tends to store the value of sub problem in some map/table

public class Fibonacci {

    public static int RecursionSol(int n){

        // Time Complexity: O(N^2) --> for every n it is going to again call the Recursion
        // Space Complexity: O(N) --> Recusion Stack space

        if(n <= 1) return n;

        return RecursionSol(n-1)+RecursionSol(n-2);
    }

    public static int MemoizationSol(int n, int [] dp){
        
        // Time Complexity: O(N) --> Linear Pattern
        // Space Complexity: O(2N) --> using Recusion stack space + Array O(n)+O(n)

        if(n <= 1) return n;
        
        if(dp[n] != -1) return dp[n];

        return dp[n] = MemoizationSol(n-1, dp) + MemoizationSol(n-2, dp);

    }


    public static int TabulationSol(int n, int[] dp){

        
        // Time Complexity: O(N)
        // Space Complexity: O(N) --> No Recursion stack space

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i<= n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }



    public static int Solve(int n){

        
        // Time Complexity: O(N)
        // Space Complexity: O(1) --> not uisng any kind of space
        int prev2 = 0;
        int prev = 1;

        for(int i = 2; i <= n; i++){
            int curr_i = prev+prev2;
            prev2 = prev;
            prev = curr_i;
        }
        return prev; 
    }


   
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter num: ");
        
        int num = in.nextInt();
       
       int[] dp = new int[num+1];

       Arrays.fill(dp,-1);

        int ans1 = RecursionSol(num);

        int ans2 = MemoizationSol(num,dp);

        int ans3 = TabulationSol(num,dp);

        int finalAns = Solve(num);

        System.out.println("Recursion: "+ans1);

        System.out.println("Memoization: "+ans2);

        System.out.println("Tabulation: "+ans3);

        System.out.println("Optimal: " +finalAns);



    }
}
