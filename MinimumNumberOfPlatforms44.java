// https://www.codingninjas.com/studio/problems/minimum-number-of-platforms_8230720?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.Arrays;

/*
 * Main intuition behind this problem is that we need to sort both arrays separately
 * Traverse using different pointers for both arrays
 * Increment the number of platforms if at is less than dp time
 * Answer is the maximum number of platforms at any time
 */

public class MinimumNumberOfPlatforms44 {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        Arrays.sort(at);
        Arrays.sort(dt);

        int ans = 0;
        int i = 0, j = 0;
        int curr = 0;
        while (i < n && j < n) {
            if (at[i] <= dt[j]) {
                curr++;
                i++;
                ans = Math.max(curr, ans);
            } else {
                j++;
                curr--;
            }
        }

        return ans;
    }
}
