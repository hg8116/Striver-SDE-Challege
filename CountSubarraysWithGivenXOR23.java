// https://www.codingninjas.com/studio/problems/count-subarrays-with-given-xor_8230830?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Here we are using an approach similar to two sum
 * We maintain a HashMap which contains the xor up to current elements
 * We calculate according to the current xor what we need to find
 * And if that exists in the map, we increment the answer by the frequency of occurrence
 * Return the answer
 */

public class CountSubarraysWithGivenXOR23 {
    public static int subarraysXor(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor ^= arr.get(i);
            int find = xor ^ x;
            if (map.containsKey(find))
                ans += map.get(find);
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }

        return ans;
    }
}
