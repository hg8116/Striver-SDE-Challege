// https://www.codingninjas.com/codestudio/problems/maximum-subarray-sum_8230694?challengeSlug=striver-sde-challenge&leftPanelTab=1

public class MaximumSubarraySum {
    public static long maxSubarraySum(int[] arr, int n) {
        long ans = 0;
        long curr = 0;
        for (int i = 0; i < n; i++) {
            curr += arr[i];
            if (curr < 0) {
                curr = 0;
            }
            ans = Math.max(curr, ans);
        }

        return ans;
    }
}
