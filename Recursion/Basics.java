
public class Basics {

    public static void main(String[] args) {

        // write a function that takes in a number and prints it
        // Print first 5 number: 1 2 3 4 5

        Print(1);


    }


    // 1: Here function is calling another function 

    // 2: All of them have same body and same defination


    // static void Print1(int n) {
    //     System.out.print(n);
    //     Print2(2);
       
    // }

    // static void Print2(int n) {
    //     System.out.print(n);
    //     Print3(3);
        
    // }


    // static void Print3(int n) {
    //     System.out.print(n);
    //     Print4(4);
       
    // }


    // static void Print4(int n) {
    //     System.out.print(n);
    //     Print5(5);
    // }

    // static void Print5(int n) {
    //     System.out.print(n);
    // }




 // 3: To overcome this we Use RECURSION :  a function calling itself, rather than calling other function with same body and defination


    static void Print(int n){

        // Base case: A condition where our Recursion will stop making calls

        if(n == 5) {
            System.out.println(5);
            return;
        }

        // Printing the output 
        System.out.println(n);

        // Recursive   Call
        Print(n+1);
    }



}
