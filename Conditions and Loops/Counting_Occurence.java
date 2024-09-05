import java.util.Scanner;

public class Counting_Occurence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
//
        int cnt = 0;
        int k  = input.nextInt();

        while(num > 0){
            int modulus = num%10;

            if(modulus == k){
                cnt++;
            }
            num = num/10;
        }

        System.out.print("No. of occurrence for " + k + ": " + cnt);





    }
}
