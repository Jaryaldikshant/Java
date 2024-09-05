
public class Find_in_Mountain {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 3, 2};

        int tg = 2;

        int ans = search(arr,tg);

        System.out.print(ans);
    }
 

    static int search(int[]arr, int tg){

        int peak = Peak_Ele(arr);

        int firstTry = binarySearch(arr,tg,0,peak);

        if(firstTry != -1){
            return firstTry;
        }

        return binarySearch(arr, tg, peak+1,arr.length-1);
    }

    static int Peak_Ele(int[]arr){

         int st = 0;
        int ed = arr.length - 1;

        while (st < ed) {

            int mid = st + (ed - st) / 2;

            if (arr[mid] < arr[mid + 1]) {
                st = mid + 1;
            } else {
                ed = mid;
            }
        }

        return st;
    }

    

     static int binarySearch(int[] arr, int tg, int st, int ed) {
       

        boolean isAsc;

        if (arr[st] < arr[ed]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (st <= ed) {
            int mid = st + (ed - st) / 2;

            if (arr[mid] == tg) {
                return mid;
            }

            if (isAsc) {

                if (tg < arr[mid]) {
                    ed = mid - 1;
                } else  {
                    st = mid + 1;
                } 
            } 
            
            else {

                if (tg > arr[mid]) {
                    ed = mid - 1;
                } else {
                    st = mid + 1;
                } 
            }

        }
        return -1;
    }
}