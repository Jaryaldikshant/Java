
import java.util.Arrays;

// Methods that String provide
public class Methods {

    public static void main(String[] args) {

        String name = "Dikshant";

        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.length());

// Here, in String a new object is created, but the original didn't change
        System.out.println(name.toLowerCase());

        System.out.println(name.indexOf('k'));

        System.out.println(name.lastIndexOf('s'));

//  to remove extra spaces we use .strip method
        System.out.println("     Dikshant      ".strip());

        String str = "Thakur Dikshant Jaryal ";

        System.out.println(Arrays.toString(str.split(" ")));

    }
}
