// https://www.codingninjas.com/studio/problems/k-most-frequent-elements_8230853?challengeSlug=striver-sde-challenge

/*
 * Use hash map to store the frequency of each element.
 * Use a priority queue to store the elements of all the arrays.
 * Then, pop the elements from the priority queue and store them in the answer array.
 * Time Complexity: O(NlogN)
 * Space Complexity: O(N)
 */

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KMostFrequentElements74 {
    public static int[] KMostFrequent(int n, int k, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr)
            map.put(x, map.getOrDefault(x, 0) + 1);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (Integer x : map.keySet())
            pq.add(new int[] { x, map.get(x) });

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll()[0];
        }

        return ans;
    }
}
