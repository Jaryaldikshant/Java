
public class Col_num_Fixed {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6},
            {7, 8, 9}
        };

        for (int[] arr1 : arr) {
            for (int col = 0; col < arr1.length; col++) {
                System.out.print(arr1[col] + " ");
            }
            System.out.println();
        }
    }
}
