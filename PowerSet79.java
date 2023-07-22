// https://www.codingninjas.com/studio/problems/power-set_8230797?challengeSlug=striver-sde-challenge&leftPanelTab=0

/*
 * Use a set to store all the subsets of the given array.
 * Use a helper function to generate all the subsets.
 * In helper function, add the current subset to the set.
 * Then, for each element in the array, add it to the current subset and call the helper function recursively.
 * After the recursive call, remove the last element from the current subset.
 * Time Complexity: O(2^N)
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PowerSet79 {
    public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
        Set<ArrayList<Integer>> set = new HashSet<>();
        helper(0, arr, new ArrayList<>(), set);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans.addAll(set);
        return ans;
    }

    static void helper(int ind, ArrayList<Integer> arr, ArrayList<Integer> temp, Set<ArrayList<Integer>> set) {
        set.add(new ArrayList<>(temp));

        for (int i = ind; i < arr.size(); i++) {
            temp.add(arr.get(i));
            helper(i + 1, arr, temp, set);
            temp.remove(temp.size() - 1);
        }
    }
}
