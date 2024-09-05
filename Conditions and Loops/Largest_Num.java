import java.util.Scanner;

public class Largest_Num {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = input.nextInt();

        System.out.print("Enter b: ");
        int b = input.nextInt();


        System.out.print("Enter c: ");
        int c = input.nextInt();


//  find Largest number from these three numbers

//        if(a > b && a> c){
//            System.out.println(a+" is the largest number");
//        }
//
//        else if(b > a && b > c){
//            System.out.println(b + " is the Largest Number");
//        }
//
//        else{
//            System.out.println(c +" is the Greater number");
//        }


// IN-BUILT FUNCTION TO FIND MAX ELEMENT: Math.max(a,b)

        int max = Math.max(c,Math.max(a,b));
        System.out.print(max);
    }
}
