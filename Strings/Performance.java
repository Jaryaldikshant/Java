
// Here, if we want to add N character in a String, it will in O(N^2) which is not optimised and we have to create new objects each time if we want to add something in a String, to overcome this we use StringBuilder

public class Performance {

    public static void main(String[] args) {

        String str = "";

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            str += ch;

        }
        System.out.println(str);
    }
}
