// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class First_and_Last_pos {

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};

        int target = 7;

        int[] result = Search_in_Range(arr, target);

        System.out.print(result[0] + " ");
        System.out.print(result[1]);

    }

    static int[] Search_in_Range(int[] nums, int tg) {

        int[] ans = {-1, -1};

        ans[0] = search(nums, tg, true);

        if (ans[0] != -1) {
            ans[1] = search(nums, tg, false);
        }

        return ans;
    }

    static int search(int[] nums, int tg, boolean findStart) {

        int ans = -1;

        int st = 0;
        int ed = nums.length - 1;

        while (st <= ed) {

            int mid = st + (ed - st) / 2;

            if (tg > nums[mid]) {
                st = mid + 1;
            } else if (tg < nums[mid]) {
                ed = mid - 1;
            } else {
                ans = mid;

                if (findStart) {
                    ed = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }

        return ans;
    }
}
