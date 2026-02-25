import java.util.*;

class Solution {
    public List<Integer> findMajority(int[] nums) {
        int n = nums.length;

        int cand1 = 0, cand2 = 1; 
        int count1 = 0, count2 = 0;

        for (int x : nums) {
            if (x == cand1) count1++;
            else if (x == cand2) count2++;
            else if (count1 == 0) { cand1 = x; count1 = 1; }
            else if (count2 == 0) { cand2 = x; count2 = 1; }
            else { count1--; count2--; }
        }

      
        count1 = 0; count2 = 0;
        for (int x : nums) {
            if (x == cand1) count1++;
            else if (x == cand2) count2++;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        if (count1 > n / 3) ans.add(cand1);
        if (count2 > n / 3) ans.add(cand2);

        Collections.sort(ans);
        return ans;
    }
}