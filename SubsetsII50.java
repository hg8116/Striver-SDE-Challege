// https://www.codingninjas.com/studio/problems/subsets-ii_8230855?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Use for loop to call the recursion at every index of the array
 * Skip the duplicates
 * Add current subset to answer
 * Return answer
 */

public class SubsetsII50 {
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        helper(arr, 0, new ArrayList<>(), ans);
        return ans;
    }

    static void helper(int[] arr, int ind, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> ans) {
        if (temp.size() != 0)
            ans.add(new ArrayList<>(temp));

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1])
                continue;
            temp.add(arr[i]);
            helper(arr, i + 1, temp, ans);
            temp.remove(temp.size() - 1);
        }
    }
}
