
public class FindMax {

    public static void main(String[] args) {

        int[] arr = {-1, 2, -12, -3, 0};

        int ans = max(arr);
        System.out.print("Max element in arr: " + ans);
    }

    static int max(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
