
import java.util.HashMap;
import java.util.Scanner;

public class Map_for_Char {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = "abadfc";

        HashMap<Character, Integer> mpp = new HashMap<>();

// putting string element in mpp
        for (int i = 0; i < str.length(); i++) {
            mpp.put(str.charAt(i), mpp.getOrDefault(str.charAt(i), 0) + 1);
        }

// just used to see how key and values are sotre in it 
        for (var it : mpp.entrySet()) {
            System.out.println(it.getKey() + " -> " + it.getValue());
        }

// used to search for the frequency of particular character
        int queries = in.nextInt();

        while ((queries--) != 0) {

            String s = in.next();

            char ch = s.charAt(0);

            System.out.println(ch + ": " +mpp.getOrDefault(ch ,0) + " ");

        }

    }
}
