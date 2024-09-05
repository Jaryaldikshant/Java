
import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float num = input.nextFloat();
        System.out.println(num);


// TypeCasting
        // int num = (int) (45.4f);
        // System.out.println(num);




// Automatic type promotion in expression
        // int a = 257;
        // byte b = (byte) (a); // (max size of byte is 256, if you're giving or adding out of this range it will do this->  257 % 267 = 1)
        // System.out.println(b);



        // byte x = 40;
        // byte y = 50;
        // byte z = 100;
        // int d = (x*y)/z; // Here java will auto. takes x, y,and z as a integer that's why this is possible
        // System.out.println(d);



        // byte b = 50;
        // b = b*2; // cant't perform this without explicit doing casting


        // int num = 'A'; // Here automatic type conversion works and it will give me the ASCI value of A 
        // System.out.println(num);


        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;

        double result = (f*b) + (i/c) - (d*s);

        // double =  float + int - double


        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);






    }
}
