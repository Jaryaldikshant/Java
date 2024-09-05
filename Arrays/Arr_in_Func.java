
import java.util.Arrays;

public class Arr_in_Func {

    public static void main(String[] args) {

        int[] num = {2, 4, 6, 8};

        System.out.print("Before Change_Num function: " + Arrays.toString(num));

        System.out.println('\n');

        change_num(num);
        System.out.print("After Change_Num function: " + Arrays.toString(num));
    }

    static void change_num(int[] num) {
        num[0] = 100;
    }
}
