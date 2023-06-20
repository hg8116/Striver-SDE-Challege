// https://www.codingninjas.com/codestudio/problems/pair-sum_8230699?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.*;

public class PairSum19 {
    public static List<int[]> pairSum(int[] arr, int s) {
        List<int[]> ans = new ArrayList<>();
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int diff = s - num;
            if (map.containsKey(diff)) {
                for (int i = 0; i < map.get(diff); i++) {
                    ans.add(new int[]{Math.min(num, diff), Math.max(num, diff)});
                }
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Collections.sort(ans, (a, b) -> a[0] - b[0]);

        return ans;
    }
}
