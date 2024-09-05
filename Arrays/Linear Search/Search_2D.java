
import java.util.Arrays;

public class Search_2D {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 5},
            {6, 8, 9},
            {0, 2, 4},};

        int tg = 9;

        int[] ans = search(arr, tg);

        System.out.print(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int tg) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == tg) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

}
