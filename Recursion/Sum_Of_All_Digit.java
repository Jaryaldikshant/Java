
import java.util.Scanner;
// Other imports go here
// Do NOT change the class name

public class Sum_Of_All_Digit {

    public static void main(String[] args) {
        // Write your code here

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i = 0; i<n ;i++){
            int num = in.nextInt();
            int ans = sum(num);
            System.out.print(ans);
        }

      
    }

    static int sum(int n) {

        if (n == 0) {
            return 0;
        }

        return n % 10 + sum(n / 10);

    }
}
