// When given no's from range 1,N => use CYCLE SORT

public class CycleSort {

    public static void main(String[] args) {

        int[] arr = {4, 2, 3, 1, 5};

        sort(arr);
        printArr(arr);
    }

    static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int correctIndex = arr[i] - 1;

            if (arr[correctIndex] != arr[i]) {
                swap(arr, correctIndex, i);
            }

        }

    }

    static void swap(int[] arr, int a, int b) {

        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    static void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
