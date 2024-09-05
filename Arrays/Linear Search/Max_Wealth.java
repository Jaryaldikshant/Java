
import java.util.Scanner;

// https://leetcode.com/problems/richest-customer-wealth/description/
public class Max_Wealth {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int row = in.nextInt();
        int col = in.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = in.nextInt();
            }
        }

    System.out.println(maxVal(arr));

    }

    static int maxVal(int[][] accounts) {

        int maxSum = Integer.MIN_VALUE;

        for (int row = 0; row < accounts.length; row++) {
            int sumRow = 0;

            for (int col = 0; col < accounts[row].length; col++) {
                sumRow += accounts[row][col];
            }

            if (maxSum < sumRow) {
                maxSum = sumRow;
            }

        }

        return maxSum;

    }
}
