
import java.util.Scanner;



public class Basics {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String frt = in.next();
        System.out.println(frt);



// These are the multiple if statements for frt
        // if(frt.equals("Mango")){
        //       System.out.println("King of Fruits");
        // }
        // if(frt.equals("Apple")){
        //     System.out.println("A Sweet Red fruit");
        // }
        // if(frt.equals("Banana")){
        //     System.out.println("High in Carbohydrates");
        // }



// To overcome this we use SWITCH STATEMENTS 
        // switch (frt) {
        //     case "Mango":
        //         System.out.println("King of Fruits");
        //         break;
        //     case "Apple":
        //         System.out.println("A Red Sweet Fruit");
        //         break;
        //     default:
        //         System.out.println("No Fruits");
        // }




// This Format don't need break statements, an enhanced switch format
        // switch (frt) {
        //     case "Mango" ->
        //         System.out.println("King of Fruits");
        //     case "Apple" ->
        //         System.out.println("A Red Sweet Fruit");
        //     default ->
        //         System.out.println("No Fruits");
        // }



        // int day = in.nextInt();

        // switch (day) {
        //     case 1 ->
        //         System.out.print("Monday");

        //     case 2 ->
        //         System.out.print("Tuesday");

        //     case 3 ->
        //         System.out.print("Wednesday");

        //     case 4 ->
        //         System.out.print("Thrusday");

        //     case 5 ->
        //         System.out.print("Fridayday");

        //     case 6 ->
        //         System.out.print("Saturday");

        //     case 7 ->
        //         System.out.print("Sunday");

        // }


        // switch (day) {
        //    case 1,2,3,4,5 -> System.out.print("WeekDays");

        //    case 6,7 -> System.out.print("Weekends");
        // }

    }

}
