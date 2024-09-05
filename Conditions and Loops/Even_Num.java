import java.util.Scanner;

public class Even_Num {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        int num = input.nextInt();

// USING FOR LOOP
        for(int i = 1; i<=10; i++){
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }


//USING WHILE LOOP
//        while(num != 0){
//            if(num%2 == 0){
//                System.out.println(num);
//            }
//            num--;
//        }

    }
}
