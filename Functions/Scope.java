
public class Scope {

    public static void main(String[] args) {

        int a = 1;

        // block scoping
        {
            int x = 78;
            a = 99;

            // Value intialised in this block, will remain in this block only
            System.out.print(x);

        }

        // Scoping in for loops
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            a = 45;
        }

        System.out.print(a);

        random(100);

    }

    static void random(int marks) {

        int num = 69;
        System.out.println(num);
        System.out.println(marks);

        // This change will only be valid in this function scope only
    }
}
