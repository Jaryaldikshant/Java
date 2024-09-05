import java.util.Scanner;

public class Upper_Lower_char {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char ch = input.next().trim().charAt(0);

        System.out.print(ch);

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println(" is UpperCase");
        }

        else if (ch >='a' && ch <= 'z') {
            System.out.println(" is LowerCase");
        }

        else {
            System.out.println(" is a Special Character");
        }


    }
}
