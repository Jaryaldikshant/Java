
public class FindMin {

    public static void main(String[] args) {

        int[] arr = {23, -1, 12, 65, 33};

        int ans = find_Min(arr);
        System.out.print("Minimum number in arr: " + ans);
    }

    static int find_Min(int[] arr) {

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }
}
