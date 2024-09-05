
import java.util.Scanner;

public class Temperature_conversion{
    public static void main(String[] args) {
        
        System.out.print("Enter Temperature in Celsius: ");

        Scanner input = new Scanner(System.in);

        float tempC = input.nextFloat();

        float tempF = (tempC * 9/5)+32;

        System.out.print("Celsius  to Fahrenhiet: " + tempF);

    }
}