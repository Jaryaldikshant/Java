// Agnostic order: Here we know that our array is sorted, but we don't know weather it is accending or descending 

import java.util.Scanner;

public class Agnostic_Order {

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

        boolean isAsc;

        if (arr[st] < arr[ed]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (st <= ed) {
            int mid = st + (ed - st) / 2;

            if (arr[mid] == tg) {
                return mid;
            }

            if (isAsc) {

                if (tg < arr[mid]) {
                    ed = mid - 1;
                } else  {
                    st = mid + 1;
                } 
            } 
            
            else {

                if (tg > arr[mid]) {
                    ed = mid - 1;
                } else {
                    st = mid + 1;
                } 
            }

        }
        return -1;
    }

}
