
import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/
public class SetMisMatch {

    public static void main(String[] args) {
        int[] arr = {4,8,1,5,2,7,4,6};

        int[] ans = FindNum(arr);

        System.err.println(Arrays.toString(ans));
    }

    static int[] FindNum(int[] arr) {

        int i = 0;

        while (i < arr.length) {

            int correctId = arr[i] - 1;

            if (arr[i] != arr[correctId]) {
                swap(arr, i, correctId);
            } else {
                i++;
            }

        }

        for (int id = 0; id < arr.length; id++) {
            if (arr[id] != id + 1) {
                return new int[]{arr[id], id + 1};
            }
        }

        return new int[]{-1, -1};

    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];

        arr[first] = arr[second];

        arr[second] = temp;
    }
}
