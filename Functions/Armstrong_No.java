
import java.util.Scanner;

public class Armstrong_No {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter No: ");
        int num = in.nextInt();

        boolean ans = Armstrong(num);

        System.out.print("The number is Armstrong? " + ans);



// For printing the 3-digit Armstrong Number
        for(int i = 100; i<1000; i++){
            if(Armstrong(i)){
                System.out.println(i+ " ");
            }
        }

        
    }

    static boolean Armstrong(int n) {
        int rem;
        int actual = n;
        int sum = 0;


        while(n > 0){
            rem = n%10;
            sum += (rem*rem*rem);
            n = n/10;
        }

        return sum == actual;

    }
}
