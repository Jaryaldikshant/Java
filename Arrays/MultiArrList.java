
import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrList {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // String str = in.next();
        ArrayList<ArrayList<String>> list = new ArrayList<>();

// Initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

// Adding Elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.next());
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}
