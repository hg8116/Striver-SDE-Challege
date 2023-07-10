// https://www.codingninjas.com/studio/problems/matrix-median_8230735?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;

/*
 * Find a number which has (n*m)/2 numbers smaller than it, it will be the answer
 * This can be done using binary search, take all integers as the search space
 * Now as it is given the rows are sorted, using another binary search function find how many smaller elements are there in every row
 * If the count is smaller than need increase the low to mid + 1 else high to mid - 1
 * Return low
 */

public class MatrixMedian62 {
    public static int getMedian(ArrayList<ArrayList<Integer>> matrix) {
        int low = 0, high = 1000000000;
        int n = matrix.size();
        int m = matrix.get(0).size();

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int i = 0; i < matrix.size(); i++)
                count += countBs(matrix.get(i), mid);

            if (count <= (n * m) / 2)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return low;
    }

    static int countBs(ArrayList<Integer> arr, int x) {
        int low = 0, high = arr.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) <= x)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return low;
    }
}
