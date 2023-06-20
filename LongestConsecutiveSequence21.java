//https://www.codingninjas.com/studio/problems/longest-consecutive-sequence_8230708?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.Arrays;

/*
 * Skip duplicates
 */

public class LongestConsecutiveSequence21 {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int n) {
        Arrays.sort(arr);
        int ans = 1, curr = 1, last = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] == last + 1) {
                curr++;
                last = arr[i];
            } else if (arr[i] != last) {
                curr = 1;
                last = arr[i];
            }
            ans = Math.max(curr, ans);
        }

        return ans;
    }
}
