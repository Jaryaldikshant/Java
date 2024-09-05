
public class P {

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 1, 4, 3};

        System.out.print("Bubble Sort: ");
        BubbleSort(arr);
        printArr(arr);

        System.out.print("Selection Sort: ");
        SelectionSort(arr);
        printArr(arr);

    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }

    }

    static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {

            int small = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }

            }

            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }

    }

}
