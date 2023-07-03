// https://www.codingninjas.com/studio/problems/job-sequencing-problem_8230832?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.Arrays;

/*
 * Sort the jobs according to the profit
 * Create an array to mark points of time
 * Iterate according to the deadline
 * If it gets a place in array, add the profit to answer
 * Return answer
 */

public class JobSequencingProblem45 {
    public static int jobScheduling(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> {
            if (a[1] != b[1])
                return b[1] - a[1];
            return a[0] - b[0];
        });
        int maxDead = 0;
        for (int[] x : jobs)
            maxDead = Math.max(maxDead, x[0]);

        int[] vis = new int[maxDead];
        Arrays.fill(vis, -1);
        int ans = 0;
        int i = 0;
        while (i < jobs.length) {
            int curDead = jobs[i][0];
            while (curDead > 0) {
                if (vis[curDead - 1] == -1) {
                    ans += jobs[i][1];
                    vis[curDead - 1] = 0;
                    break;
                }
                curDead--;
            }
            i++;
        }

        return ans;
    }
}
