import java.util.Scanner;

public class Form_a_newNo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        for(int i = 0; i<size; i++){
            int n = in.nextInt();
            String ans = solve(Math.abs(n));

            if(ans.isEmpty()){
                System.out.println(0);
            }

            else if(n < 0){
            System.err.println("-"+ans);
            }

            else{
                System.out.println(ans);
            }
        }
    }

    static String solve(int n){

        if(n == 0) return "";

        int digit = Math.abs(n%10);

        String res = solve(n/10);

        if(digit % 2 == 0){
            return res+digit;
        }

        return res;

    }
}
