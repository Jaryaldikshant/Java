
import java.util.ArrayList;
import java.util.Scanner;

public class Arr_List {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Syntax of Array List
        ArrayList<Integer> list = new ArrayList<>();

        // list.add(20);
        // list.add(30);
        // list.add(10);
        // list.add(80);
        // System.out.print(list + " " + "\n");
        // System.out.println(list.contains((10)));
        // list.set(3, 6969);
        // System.out.print(list + " " + "\n");
        // list.remove(2);
        // System.out.print(list + " " + "\n");
        // Input:
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // Output
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");  // Have to pass list.get(0) for index here, arr[0] syntax will not work here
        }

    }
}
