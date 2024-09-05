
public class Search_in_Matrix {

    public static void main(String[] args) {
        int[][] arr = {
            {18, 9, 12},
            {36, -4, 91},
            {44, 33, 16}
        };

        int target = 24; 

        System.out.print(search(arr, target));

    }

    static boolean search(int[][] arr, int target) {
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
