
public class Count_Rotation {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 2};

        int ans = findPivot(arr);

        System.out.print("Array is Rotated: "+(ans + 1)+" times");

    }

    static int findPivot(int[] arr) {
        int st = 0;
        int ed = arr.length - 1;

        while (st <= ed) {
            int mid = st + (ed - st) / 2;

            if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (arr[mid] <= arr[st]) {
                ed = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return -1;
    }
}
