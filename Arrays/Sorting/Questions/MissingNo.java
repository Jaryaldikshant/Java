// https://leetcode.com/problems/missing-number/

public class MissingNo {

    public static void main(String[] args) {

        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        int ans = missingNum(arr);

        System.out.print(ans);
    }

    static int missingNum(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int correct = arr[i];

            if (arr[i] < arr.length && arr[correct] != arr[i]) {
                swap(arr, i, correct);
            }
        }

        for (int ind = 0; ind < arr.length; ind++) {
            if (arr[ind] != ind) {
                return ind;
            }
        }

        return arr.length;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
