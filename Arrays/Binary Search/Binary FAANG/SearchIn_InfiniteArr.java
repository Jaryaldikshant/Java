
public class SearchIn_InfiniteArr {

    public static void main(String[] args) {

        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};

        int tg = 10;

        System.out.println(ans(arr, tg));

    }

    static int ans(int[] arr, int tg) {

        // first find the range
        // Start the chunk with size of 2
        int st = 0;
        int ed = 1;

        // condition for the target to lies in the range
        while (tg > arr[ed]) {
            int newSt = ed + 1;

            // double the chunk value
            // end = previous end + sizeofchunk * 2
            ed = ed + (ed - st + 1) * 2;

            st = newSt;
        }
        
        return search(arr, tg, st, ed);
    }

    static int search(int[] arr, int tg, int st, int ed) {

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
        return -1;
    }

}
