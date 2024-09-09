
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.ArrayList;
import java.util.List;

public class AllDuplicate {

    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> res = findDuplicates(arr);

        System.err.print(res);

    }

    public static List<Integer> findDuplicates(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }

        }

        List<Integer> ans = new ArrayList<>();

        for (int id = 0; id < nums.length; id++) {

            if (nums[id] != id + 1) {
                ans.add(nums[id]);
            }
        }
        return ans;

    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
