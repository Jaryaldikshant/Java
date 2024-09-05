
public class Swap {

    public static void main(String[] args) {
        int[] arr = {1, 3, 18, 69};

        swap(arr, 1, 3);
        print(arr);
    }


    static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

     static void print(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
   
}
