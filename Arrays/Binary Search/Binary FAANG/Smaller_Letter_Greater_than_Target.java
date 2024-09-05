
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/


class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int st = 0;
        int ed = letters.length - 1;

        while (st <= ed) {

            int mid = st + (ed - st) / 2;


         if (target < letters[mid]) {
            ed = mid - 1;
            }else{
                st = mid + 1;
            }
        }
        return letters[st % letters.length];
    }
}