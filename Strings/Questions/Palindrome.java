
import java.util.Scanner;

// Check if a String is Palindrome or Not ?? 
public class Palindrome {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the String: ");

        String str = in.next();

        boolean ans = Palindrome(str);

        System.out.print(ans);

    }

    static boolean Palindrome(String str) {

        String sb = str;

        StringBuilder rev = new StringBuilder(str).reverse();

        return sb.equals(rev.toString());

    }
}
