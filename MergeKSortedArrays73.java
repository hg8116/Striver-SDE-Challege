// https://www.codingninjas.com/studio/problems/merge-k-sorted-arrays_8230770?challengeSlug=striver-sde-challenge&leftPanelTab=0

/*
 * Use a priority queue to store the elements of all the arrays.
 * Then, pop the elements from the priority queue and store them in the answer array.
 * Time Complexity: O(NlogN)
 * Space Complexity: O(N)
 */

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArrays73 {
    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            for (int j : kArrays.get(i))
                pq.add(j);
        }
        while (!pq.isEmpty())
            ans.add(pq.poll());

        return ans;
    }
}
