
public class Search_in_RotatedSortedArr {

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println("Pivot index: " + findPivot(arr));

        int tg = 3;
        int ans = search(arr, tg);

        System.out.println("Index of target: " + ans);

    }

    static int search(int[] nums, int tg) {
        int pivot = findPivot(nums);

        // If no pivot is found, the array is not rotated
        if (pivot == -1) {

            return binarySearch(nums, tg, 0, nums.length - 1);
        }

        // If the target is at the pivot
        if (nums[pivot] == tg) {
            return pivot;
        }

        // Determine which part of the array to search
        if (tg >= nums[0]) {
            return binarySearch(nums, tg, 0, pivot - 1);
        }

        return binarySearch(nums, tg, pivot + 1, nums.length - 1);

    }

    static int binarySearch(int[] arr, int tg, int st, int ed) {

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

// this will not for the duplicate values
    static int findPivot(int[] arr) {

        int st = 0;
        int ed = arr.length - 1;

        while (st <= ed) {
            int mid = st + (ed - st) / 2;

            // Check if mid is the pivot
            if (mid < ed && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > st && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Adjust the search range
            if (arr[mid] <= arr[st]) {
                ed = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return -1;
    }
}
