// https://www.codingninjas.com/studio/problems/longest-subarray-zero-sum_8230747?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
* As we traverse the array, if at any point we find the sum as zero we can update the answer
* Also, lets say the array is of the length 10 and after taking the sum of first three elements we get 5
* And we continue adding the elements and traversing the array and after 7th element we get the sum again as 5
* This means that the sum of elements after the 3rd element and before the 7th element is zero
* This approach can be used to find the largest consecutive subarray having zero sum
* Use HashMap to implement this
*/

public class LongestSubarrayZeroSum22 {
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int currSum = 0, ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            currSum += arr.get(i);
            if (currSum == 0)
                ans = i + 1;
            else {
                if (map.containsKey(currSum)) {
                    int lastInd = map.get(currSum);
                    ans = Math.max(ans, i - lastInd);
                } else
                    map.put(currSum, i);
            }

        }

        return ans;
    }
}
