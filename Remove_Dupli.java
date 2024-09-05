
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remove_Dupli {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        List<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!uniqueList.contains(arr[i])) {
                uniqueList.add(arr[i]);
            }
        }

        System.out.println(uniqueList.size());
        for (int num : uniqueList) {
            System.out.print(num + " ");
        }

    }
}
