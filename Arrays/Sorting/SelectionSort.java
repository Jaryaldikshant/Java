
import java.util.Arrays;

public class SelectionSort  {
public static void main(String[] args) {

    int [] arr = {4,5,1,2,3};

    Sort(arr);
    System.out.println(Arrays.toString(arr));
}

    static void Sort(int [] arr){

        for(int i = 0; i<arr.length; i++){

        int lastIndex = arr.length-i-1;
        int max = getMax(arr,0,lastIndex);

        Swap(arr,max, lastIndex);

        }
    }

    static void Swap(int [] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    static int getMax(int [] arr, int st , int ed){
        int max = st;

        for(int i = st; i<= ed; i++){

            if(arr[max] < arr[i]){
                max = i;
            }

        }

        return max;
    }
}