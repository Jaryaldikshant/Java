
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension_Arr {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // int[][] arr2 = {
        //     {1, 2, 3}, //0th index
        //     {4, 5}, // 1st index
        //     {7, 8, 9, 11} // 2nd index
        // };
        int[][] arr = new int[3][3];

        // System.out.print(arr.length); // it will gives the no. of rows
        // INPUT:
        for (int[] arr1 : arr) {
            // for each col in every row, i have to take input
            for (int col = 0; col < arr1.length; col++) {
                arr1[col] = in.nextInt();
            }
        }
// OUTPUT: 
        // for (int row = 0; row < arr.length; row++) {
        //     // for each col in every row, i have to take input
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }



// OutPut using  System.out.println(Arrays.toString();
        // for(int row = 0; row<arr.length; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }



// using Enhanced for Loop
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
