
public class Ith_bit {

    public static void main(String[] args) {
        int num = 37;
        int k = 2;

        int ibit = (num & (1 << k));

        
        System.out.println("Value of ibit: " + ibit);


        System.out.print((ibit != 0) ? 1 : 0);

    }
}
