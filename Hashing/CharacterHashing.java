
import java.util.Scanner;

public class CharacterHashing {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = "abedAbefc";

        int[] Hash = new int[256];

// // for lower case chracter only 
        // for(int i = 0; i < str.length(); i++){
        //     Hash[str.charAt(i) - 'a']++;
        // }
        // int queries = 5;
        // while((queries--) > 0){
        //     String s = in.next();
        //     char ch = s.charAt(0);
        //     System.out.print(ch+": "+Hash[ch - 'a'] + " ");
        //     System.out.println("");
        // }

        
        for (int i = 0; i < str.length(); i++) {

            Hash[str.charAt(i)]++;
        }

        int queries = 5;

        while ((queries--) > 0) {

            String s = in.next();

            char ch = s.charAt(0);

            System.out.print(ch + ": " + Hash[ch] + " ");
            System.out.println("");
        }

    }
}
