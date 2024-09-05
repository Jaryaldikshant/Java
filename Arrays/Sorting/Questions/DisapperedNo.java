
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> st = new HashSet<>();

        for(int i: nums){
            st.add(i);
        }

        ArrayList<Integer> Lt = new ArrayList<>();

        for(int i = 1; i <= nums.length; i++){
            if(!st.contains(i)){
                Lt.add(i);
            }
        }


        return Lt;
        
    }
}


public class DisapperedNo {
public static void main(String[] args) {

}
}
