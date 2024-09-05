
import java.util.Arrays;

public class Search_in_Sorted_Matrix {

    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(Arrays.toString(search(arr, 6)));

    }

    static int[] binarySearch(int[][] arr, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colStart - colEnd) / 2;

            if (arr[row][mid] == target) {
                return new int[]{row, mid};
            }

            if (arr[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }

        }

        return new int[]{-1, -1};
    }

    static int[] search(int[][] arr, int target) {

        int row = arr.length;
        int col = arr[0].length;

        if (row == 1) {
            return binarySearch(arr, 0, 0, col - 1, target);
        }

        int rowStart = 0;
        int rowEnd = 0;
        int midCol = col / 2;

        while (rowStart < rowEnd - 1) {
            int mid = rowStart + (rowEnd - rowStart) / 2;

            if (arr[mid][midCol] == target) {
                return new int[]{mid, midCol};
            }

            if (arr[mid][midCol] < target) {
                rowStart = mid;
            } else {
                rowEnd = mid;
            }

        }

        if (arr[rowStart][midCol] == target) {
            return new int[]{rowStart, midCol};
        }

        if (arr[rowStart + 1][midCol] == target) {
            return new int[]{rowStart + 1, midCol};
        }

        if (target <= arr[rowStart][midCol - 1]) {
            return binarySearch(arr, rowStart, 0, midCol - 1, target);
        }

        if (target >= arr[rowStart][midCol + 1] && target <= arr[rowStart][col-1]) {
            return binarySearch(arr, rowStart, midCol + 1, col - 1, target);
        }

        if (target <= arr[rowStart + 1][midCol - 1]) {
            return binarySearch(arr, rowStart + 1, 0, midCol - 1, target);
        } else {
            return binarySearch(arr, rowStart + 1, midCol + 1, col - 1, target);
        }

    }
}
