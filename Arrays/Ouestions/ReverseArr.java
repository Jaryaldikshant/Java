
import java.util.Arrays;



public class ReverseArr {
public static void main(String[] args) {

    int[] arr = {1,3,23,9,18};

    reverseArr(arr);

    System.out.println();


// using two pointer method
    reverse(arr);
    System.out.print(Arrays.toString(arr));

    
}

    static void reverseArr(int[] arr){
        for(int i = arr.length-1; i >= 0 ;i--){
            System.out.print(arr[i] +" ");
        }
    }




// swapping
    static void swap(int[] arr, int a, int b){

        
            int temp  = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    


// implementing two pointer method
    static void reverse(int[] arr){
        int st = 0;
        int ed = arr.length-1;

        while(st < ed){
            swap(arr,st,ed);
            st++;
            ed--;
        }

    }
}