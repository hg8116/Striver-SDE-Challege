// https://www.codingninjas.com/studio/problems/kth-smallest-and-largest-element-of-array_8230829?challengeSlug=striver-sde-challenge&leftPanelTab=0

/*
 * Sort the array and return the kth and (n-k)th element
 * Time Complexity: O(nlogn)
 * Space Complexity: O(1)
 */

import java.util.ArrayList;
import java.util.Collections;

public class KthSmallestAndLargestElementOfArray69 {
    public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.sort(arr);
        ans.add(arr.get(k - 1));
        ans.add(arr.get(arr.size() - k));
        return ans;
    }
}