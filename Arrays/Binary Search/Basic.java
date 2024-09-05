
import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int tg = in.nextInt();

        int ans = binarySearch(arr, tg);

        System.out.print(ans);

    }

    static int binarySearch(int[] arr, int tg) {

        int st = 0;
        int ed = arr.length - 1;

        while (st <= ed) {
            int mid = st + (ed - st) / 2;

            if (tg < arr[mid]) {
                ed = mid - 1;
            } else if (tg > arr[mid]) {
                st = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

}
