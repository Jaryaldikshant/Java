
// import java.util.Scanner;
import java.util.HashMap;
import java.util.Scanner;

public class Map {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // int n = in.nextInt();
        int n = 7;
        int[] arr = {1, 2, 3, 1, 3, 2, 12};

        // pre-compute
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        }


// can also iterate in the map
        for (var it : mpp.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue() + " ");
        }


        // this q is the queries or number user have to search for
        int q = in.nextInt();

        while ((q--) > 0) {
            int num = in.nextInt();

            // fetch
            System.out.print(mpp.getOrDefault(num, 0) + " ");
        }

    }
}
