
public class Search_in_RotatedArr_with_Duplicates {

    public static void main(String[] args) {

        int[] arr = {2, 2, 2, 2, 2, 9};
        System.out.println(findPivot(arr));

// tg is the integer you are searching for
        int tg = 9;
        int ans = search(arr, tg);

        System.err.println(ans);
    }

    static int search(int[] arr, int tg) {
        int pivot = findPivot(arr);

        // if we didn't find pivot , means arr is not Rotated
        if (pivot == -1) {
            return binarySearch(arr, tg, 0, arr.length - 1);
        }

        // If target is at the pivot position
        if (arr[pivot] == tg) {
            return pivot;
        }

        // Determine which part of the array to search
        if (tg >= arr[0]) {
            return binarySearch(arr, tg, 0, pivot - 1);
        }

        return binarySearch(arr, tg, pivot + 1, arr.length - 1);

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

            // Handling duplicates by skipping them    
            if (arr[mid] == arr[st] && arr[mid] == arr[ed]) {

                // skip the duplicates
                if (arr[st] > arr[st + 1]) {
                    return st;
                }

                st++;

                if (arr[ed] < arr[ed - 1]) {
                    return ed - 1;
                }

                ed--;
            } 
            
            else if (arr[st] < arr[mid] || arr[st] == arr[mid] && arr[mid] > arr[ed]) {
                // Left side is sorted, pivot must be on the right side
                st = mid + 1;
            } else {
                // Right side is sorted, pivot must be on the left side
                ed = mid - 1;
            }

        }
        return -1;
    }
}
