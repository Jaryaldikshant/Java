
public class Search_String {

    public static void main(String[] args) {

        String name = "Dikshant";
        char tg = 't';

        System.out.print(search(name, tg));

        System.out.println();

        int ans = index(name, tg);

        System.out.print("Character found at index: " + ans);
    }

    static boolean search(String str, char tg) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (tg == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static int index(String str, char tg) {

        if (str.length() == 0) {
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (tg == str.charAt(i)) {
                return i;
            }
        }

        return -1;

    }

}
