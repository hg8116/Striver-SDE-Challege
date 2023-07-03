// https://www.codingninjas.com/studio/problems/subset-sum_8230859?challengeSlug=striver-sde-challenge&leftPanelTab=1

import java.util.ArrayList;
import java.util.Collections;

/*
 * Use recursion to find all the subsets (take and not take approach)
 * When pointer reaches end, add the sum to answer arraylist
 * Return answer
 */

public class SubsetSum49 {
    public static ArrayList<Integer> subsetSum(int num[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(num, 0, 0, ans);
        Collections.sort(ans);
        return ans;
    }

    static void helper(int[] arr, int i, int count, ArrayList<Integer> ans) {
        if (i >= arr.length) {
            ans.add(count);
            return;
        }

        helper(arr, i + 1, count + arr[i], ans);
        helper(arr, i + 1, count, ans);
    }
}
