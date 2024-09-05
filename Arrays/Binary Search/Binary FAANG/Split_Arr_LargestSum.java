
public class Split_Arr_LargestSum {

    public static void main(String[] args) {
        int[] arr = {6,4,5,1,5,6,6,6,5,2};

        int m = 6;

        System.out.print(splitArr(arr, m));

    }

    static int splitArr(int[] arr, int m) {
        int st = 0;
        int ed = 0;

        for (int i = 0; i < arr.length; i++) {
            st = Math.max(st, arr[i]); // it will store the max ele in the array
            ed = ed + arr[i]; // it will store the sum of ele present in the array
        }

        while (st < ed) {
        // try for the mid as potential ans

            int mid = st + (ed - st) / 2;

            // calculate the pieces or count that we can devide this with the maxSum
            int sum = 0;
            int pieces = 1;

            for (int num : arr) {
                if (sum + num > mid) {
                    // you can't add this in subbarr , make new one

                    // now you have add this num in new subarr, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                st = mid + 1;
            } else {
                ed = mid;
            }

        }
        return ed; //Here st == ed
    }
}
