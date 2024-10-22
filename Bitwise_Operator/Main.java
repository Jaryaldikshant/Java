// Bitwise Operator: 

// 1: AND: a&b--> when you &1 with any number , digit remain the same
// 2: OR: a||b --> opposite of AND
// 3: XOR: a^b --> same same 0 and dif dif 1
//     a^1 = a'
//     a^0 = a
//     a^a = 0
// 4: Complement: ~a--> opposite of any number ~a = a'
// 5: Left-Shift: a << 1 ---> moves bits toward left side
// a << b = a * 2 raise to power b
// 6: Right-Shift: a >> 1 --> moves bits towards right side
// a >> b = a / 2 raise to power b
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(isOdd(num));

    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

}
