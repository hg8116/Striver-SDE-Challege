// https://www.codingninjas.com/studio/problems/maximum-meetings_8230795?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Sort according to the end time of meetings
 * Select the meeting if the start time is greater than the end time of last meeting
 */

public class MaximumMeetings43 {
    public static List<Integer> maximumMeetings(int[] start, int[] end) {
        int n = start.length;
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = start[i];
            arr[i][1] = end[i];
            arr[i][2] = i;
        }

        Arrays.sort(arr, (a, b) -> a[1] - b[1]);
        List<Integer> ans = new ArrayList<>();
        int curEnd = arr[0][1];
        ans.add(arr[0][2] + 1);

        int i = 1;
        while (i < n) {
            if (arr[i][0] > curEnd) {
                ans.add(arr[i][2] + 1);
                curEnd = arr[i][1];
            }
            i++;
        }

        return ans;
    }
}
