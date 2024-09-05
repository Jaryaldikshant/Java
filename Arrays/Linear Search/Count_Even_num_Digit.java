

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

import java.util.Scanner;

public class Count_Even_num_Digit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        int ans = findNum(nums);

        System.out.println(ans);

    }

    static int findNum(int[] arr) {
        int count = 0;

        for (int i : arr) {
            if (even(i)) {

                count++;

            }

        }
        return count;
    }

// function to check wheather a number is even digit  or  not ?
    static boolean even(int i) {
        int cnt = 0;

        while (i != 0) {
            i = i / 10;
            cnt++;
        }

        if (cnt % 2 == 0) {

            return true;
        } else {
            return false;
        }

    }

}
