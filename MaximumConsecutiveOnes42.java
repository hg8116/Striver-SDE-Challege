// https://www.codingninjas.com/studio/problems/maximum-consecutive-ones_8230736?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;

public class MaximumConsecutiveOnes42 {
    public static int longestSubSeg(ArrayList<Integer> arr, int n, int k) {
        int i = 0, j = 0, ans = 0;
        while (i < j) {
            if (arr.get(j) == 0)
                k--;
            if (k >= 0)
                ans = Math.max(ans, j - i + 1);
            if (k < 0) {
                if (arr.get(i) == 0)
                    k++;
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;

    }
}
