// https://www.codingninjas.com/studio/problems/trapping-rain-water_8230693?challengeSlug=striver-sde-challenge&leftPanelTab=0

/*
 * Bruteforce solution is that for every arr[i] find the left max and right max and apply the formula min(left max, right max) - arr[i]
 * To optimize this, create a left max and right max prefix arrays
 * To space optimize it use two pointer approach and keep left max and right max
 * Run a loop while left is less than right
 * If arr[left] is less than arr[right], check if curr left is greater than max left
 * If greater update it else add the difference to the answer
 * Similarly do for right pointer
 * Return the answer
 */

public class TrappingRainWater40 {
    public static long getTrappedWater(long[] arr, int n) {
        long ans = 0;
        int left = 0, right = n - 1;
        long maxl = 0, maxr = 0;

        while (left < right) {
            if (arr[left] <= arr[right]) {
                if (maxl < arr[left])
                    maxl = arr[left];
                else
                    ans += maxl - arr[left];
                left++;
            } else {
                if (maxr < arr[right])
                    maxr = arr[right];
                else
                    ans += maxr - arr[right];
                right--;
            }
        }

        return ans;
    }
}
