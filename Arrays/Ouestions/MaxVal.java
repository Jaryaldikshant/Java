
import java.util.Scanner;

public class MaxVal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        input(arr);

        int res = MaxVal(arr);
        System.out.print(res);

    }

    static void input(int[] arr) {

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }

    static int MaxVal(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

}
