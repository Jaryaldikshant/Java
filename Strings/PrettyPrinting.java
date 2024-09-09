
public class PrettyPrinting {

    public static void main(String[] args) {

// if u wanna print upto 2 demical places
        float a = 453.2345f;
        System.out.printf("Formated number is: %.2f", a);

        System.out.println();

        System.out.println(Math.PI);

        System.out.printf("Pie: %.3f", Math.PI);

        System.out.println();

        System.out.printf("Hello my name is %s and i am a %s", "Dikshant", "Good Person");

        System.out.println();

// Format Specifiers in Java
// %c: Character
        char ch = 'A';
        System.out.printf("Character: %c%n", ch);

// %d: Decimal number (base 10)
        int num = 123;
        System.out.printf("Decimal number: %d%n", num);

// %e: Exponential floating-point number
        double num1 = 1234.5678;
        System.out.printf("Exponential: %e%n", num1);

// %f: Floating-point number
        double num2 = 1234.5678;
        System.out.printf("Floating-point number: %.2f%n", num2);


// for exact date and time
java.util.Date date = new java.util.Date();

  System.out.printf("Date and time: %tF %<tT%n", date);


    }
}
