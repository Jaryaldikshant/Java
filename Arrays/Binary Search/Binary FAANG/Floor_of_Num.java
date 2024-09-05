
import java.util.Scanner;

// Floor: The Largest number from  all the numbers which is smaller or equal to the target
// arr = {2,3,5,9,14,16,18} 
// tg = 15, so all the numbers which is smaller then 15 is: {2,3,5,9,14}, from here the largest number is 14, so that's the ans 
public class Floor_of_Num {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // int n = in.nextInt();
        int arr[] = {2, 3, 5, 9, 14, 16, 19};
        int tg = in.nextInt();

        int ans = Floor(arr, tg);

        System.out.print(ans);
    }

    static int Floor(int[] arr, int tg) {

        int st = 0;
        int ed = arr.length - 1;

        if (tg < arr[st]) {
            return -1;
        }

        while (st <= ed) {
            int mid = st + (ed - st) / 2;

            if (tg > arr[mid]) {
                st = mid + 1;
            } else if (tg < arr[mid]) {
                ed = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[ed];
    }
}
