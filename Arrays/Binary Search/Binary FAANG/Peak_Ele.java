
public class Peak_Ele {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 3, 2};

        int ans = peakEle(arr);

        System.out.print(ans);
    }

    static int peakEle(int[] arr) {
        int st = 0;
        int ed = arr.length - 1;

        while (st < ed) {

            int mid = st + (ed - st) / 2;

            if (arr[mid] < arr[mid + 1]) {
                st = mid + 1;
            } else {
                ed = mid;
            }
        }

        return st;
    }
}
