
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class UniqueChar {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = "champcodecodequotient";

        int ans = solve(str);

        System.out.println(ans);

    }

    static int solve(String str){

        Set<Character> stt = new HashSet<>();
        Set<Character> sttMore = new HashSet<>();


        for(char ch: str.toCharArray()){

            if(stt.contains(ch)){
                stt.remove(ch);
                sttMore.add(ch);
            }

            else if(!sttMore.contains(ch)){
                stt.add(ch);
            }
        }

        for(int i = 0; i< str.length(); i++){
            if(stt.contains(str.charAt(i))){
                return i;
            }
        }

        return -1;

    }
}
