
import java.util.HashSet;
import java.util.Scanner;


public class Pairs_with_k_diff {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 7;
        int n = 10;


        int ans = solve(arr,k);

        System.out.println(ans);
    }

    static int solve(int [] arr, int k){

        int count = 0;

        HashSet<Integer> st = new HashSet<>();

        for(int num : arr){
            st.add(num);
        }

        for(int num: arr){

            if(st.contains(num+k)){
                count++;
            }

            if(st.contains(num-k)){
                count++;
            }
        st.remove(num);
        }
        return count;
    }
}
