
import java.util.Scanner;

public class Nested_Switch {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int empNo = in.nextInt();

        switch (empNo) {
            case 1 -> System.out.print("Dikshant Jaryal");

            case 2 -> System.out.print("Pawan Gambhir");

            case 3 -> System.out.print("Rahul Sharma");

            case 4 -> {
                String deprt = in.next();

                switch (deprt) {
                    case "IT" -> System.out.print("IT Department");

                    case "Pharma" -> System.out.print("B Pharmacy");

                    default -> System.out.print("Not an Employee");

                }
            }

            default -> System.out.print("Enter Correct Id");
        }

    }
}
