// https://www.codingninjas.com/studio/problems/maximum-activities_8230800?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.Arrays;
import java.util.List;

public class MaximumActivities48 {
    public static int maximumActivities(List<Integer> start, List<Integer> end) {
        int n = start.size();
        int[][] arr = new int[n][2];

        if (n == 1)
            return n;

        for (int i = 0; i < n; i++) {
            arr[i][0] = start.get(i);
            arr[i][1] = end.get(i);
        }

        Arrays.sort(arr, (a, b) -> a[1] - b[1]);
        int ans = 1;
        int i = 1;
        int currEnd = arr[0][1];
        while (i < n) {
            if (arr[i][0] >= currEnd) {
                ans++;
                currEnd = arr[i][1];
            }
            i++;
        }

        return ans;
    }
}
