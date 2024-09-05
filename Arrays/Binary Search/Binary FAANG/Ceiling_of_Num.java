
// Ceiling: Smallest no. in the array which is greater or equal to the target
// arr = {2,3,5,9,14,16,20}
// tg = 4
// the arr which is greater then 4 is {5,9,14,16,20}, and the smallest element in that array is 5 , so Ceiling Ele is 5

// https://www.naukri.com/code360/problems/ceiling-in-a-sorted-array_1825401

import java.util.Scanner;

public class Ceiling_of_Num {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int tg = in.nextInt();

        int ans = Ceiling(arr, tg);

        System.out.print(ans);

    }

    static int Ceiling(int[] arr, int tg) {

        int st = 0;
        int ed = arr.length - 1;

        if(tg > arr[arr.length-1]){
            return -1;
        }

        while (st <= ed) {
            int mid = st + (ed - st) / 2;

            if (tg > arr[mid]) {
                st = mid + 1;
            } else if (tg < arr[mid]) {
                ed = mid - 1;
            } else {
                return mid;
            }
        }
        return arr[st];
    }

}
