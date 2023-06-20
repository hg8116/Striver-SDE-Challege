// https://www.codingninjas.com/codestudio/problems/merge-intervals_8230700?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Start by sorting the array according to start time
 * Pick initial start and finish time
 * Iterate through the array
 * If the ith start < initial finish -> update finish to max(ith finish, initial finish)
 * Else add the initial start and finish to ans and set initial start and finish to ith start and finish
 * After loop ends add initial start and finish to the answer
 */

class Interval {
    int start, finish;

    public Interval(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

public class MergeIntervals8 {

    public static List<Interval> mergeIntervals(Interval[] intervals) {
        List<Interval> ans = new ArrayList<>();
        if (intervals.length == 0 || intervals == null)
            return ans;

        Arrays.sort(intervals, (a, b) -> a.start - b.start);

        int start = intervals[0].start;
        int finish = intervals[0].finish;
        for (Interval interval : intervals) {
            if (interval.start <= finish)
                finish = Math.max(interval.finish, finish);
            else {
                ans.add(new Interval(start, finish));
                start = interval.start;
                finish = interval.finish;
            }
        }

        ans.add(new Interval(start, finish));
        return ans;
    }
}
