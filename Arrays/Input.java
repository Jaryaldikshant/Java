
import java.util.Arrays;
import java.util.Scanner;



public class Input {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


// Arrays of Premitives
        // int[] arr = new int[5];
        // arr[0] = 22;
        // arr[1] = 80;
        // arr[2] = 67;
        // arr[3] = 12;
        // arr[4] = 54;

// Taking user input
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = in.nextInt();
        // }



// Printing the user input
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

 
// ENHANCED FOR LOOP
    // for(int i:arr){
    //     System.out.print(i + " "); // Here i represent the element of an array
    // }

// Other way to print an Array using [] and , it will gives like this [1,2,3,4]

// System.out.println(Arrays.toString(arr));




// Arrays of Objects

System.out.print("Enter sie of an Array of Objects: ");
int n = in.nextInt();


String[] str = new String[n];

System.out.print("Enter Elements of an Array: ");
for(int i = 0; i < str.length; i++){
    str[i] = in.next();
}

System.out.println();

System.out.println("Printing an Array: " + Arrays.toString(str));

    }
}
