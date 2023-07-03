// https://www.codingninjas.com/studio/problems/return-subsets-sum-to-k_8230706?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;

/*
 * Find all the subsets and keep track of the sum
 * If sum equals to k, add to answer (Use for loop for recursion call in helper function)
 * Return answer
 */

public class ReturnSubsetsSumToK51 {
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helper(arr, 0, 0, k, new ArrayList<>(), ans);
        return ans;
    }

    static void helper(ArrayList<Integer> arr, int ind, int sum, int k, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> ans) {
        if (sum == k)
            ans.add(new ArrayList<>(temp));

        for (int i = ind; i < arr.size(); i++) {
            sum += arr.get(i);
            temp.add(arr.get(i));
            helper(arr, i + 1, sum, k, temp, ans);
            sum -= arr.get(i);
            temp.remove(temp.size() - 1);
        }
    }
}
