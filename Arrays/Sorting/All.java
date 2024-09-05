
// Bubble Sort:   
// Compares adjacent elements,  Repeatedly swaps adjacent elements
// Time Complexity: O(n²) (worst, average), O(n)(best case)


// Selection Sort: 
// Finds the smallest element, Swaps after finding the smallest
// Time Complexity: O(n²) (all cases worst,best,average)


// Insertion Sort:
// Inserts elements into sorted part,   Shifts elements to insert new one
// Time Complexity: O(n²) (worst, average), O(n) best


public class All {

    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 5, 9, 2};

        System.out.print("Bubble Sort: ");
        BubbleSort(arr);
        printArr(arr);

        System.out.print("Selection Sort: ");
        SelectionSort(arr);
        printArr(arr);

        System.out.print("Insertion Sort: ");
        InsertionSort(arr);
        printArr(arr);

    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

// BUBBLE SORT
    static void BubbleSort(int[] arr) {

        // Here Time Complexity: O(N^2)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

// SELECTION SORT
    static void SelectionSort(int[] arr) {

        // Here Time Complexity: O(N^2)
        for (int i = 0; i < arr.length - 1; i++) {
            int small = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[small] > arr[j]) {
                    j = small;
                }
            }

            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }

    }

// INSERTION SORT
    static void InsertionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }
    }

}
