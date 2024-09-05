
import java.util.Scanner;

public class Ele_Exist {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int k = in.nextInt();

        int ans = findEle_Index(arr, k);

        System.out.print("Found at index: "+ans);

        System.out.println();

        int res = findELe(arr,k);
        System.out.print(res);

    }

    static int findEle_Index(int[] arr, int k) {

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]) {
                return i;
            }
        }
        return -1;
    }


    static int findELe(int[] arr, int k){

        if(arr.length == 0) return 0;

        for(int i = 0; i < arr.length; i++){
            if(k == arr[i]){
                return k;
            }
        }
        return Integer.MAX_VALUE;
    }

}
