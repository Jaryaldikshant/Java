
import java.util.Scanner;

public class Basics {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        int[] arr = {1, 3, 2, 1, 3};

        int queries = 5;

// percompute
        int[] Hash = new int[100];

        for (int i = 0; i < n; i++) {
            Hash[arr[i]] += 1;
        }

        while ((queries--) > 0) {
            int num = in.nextInt();

            // fetching method
            System.out.print(num + ": " + Hash[num] + " ");
            System.out.println();
        }
    }

}
