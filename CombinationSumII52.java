// https://www.codingninjas.com/studio/problems/combination-sum-ii_8230820?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;
import java.util.Collections;

/*
 * Similar approach to combination sum I
 * Skip the duplicates while iterating (Use for loop for recursive calls)
 * If the sum is equal to k, add to answer
 * Return answer
 */

public class CombinationSumII52 {
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target) {
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helper(arr, 0, 0, target, new ArrayList<>(), ans);
        return ans;
    }

    static void helper(ArrayList<Integer> arr, int ind, int sum, int k, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> ans) {
        if (sum == k)
            ans.add(new ArrayList<>(temp));

        for (int i = ind; i < arr.size(); i++) {
            if (i > ind && arr.get(i) == arr.get(i - 1))
                continue;

            sum += arr.get(i);
            temp.add(arr.get(i));
            helper(arr, i + 1, sum, k, temp, ans);
            sum -= arr.get(i);
            temp.remove(temp.size() - 1);
        }
    }
}
