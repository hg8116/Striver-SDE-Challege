// https://www.codingninjas.com/studio/problems/allocate-books_8230810?challengeSlug=striver-sde-challenge&leftPanelTab=0

/*
 * Use binary search here, as we have to find the minimum number of pages that can be allocated to a student.
 * So, we will use binary search on the range of pages from the maximum number of pages in the array to the sum of all the pages in the array.
 * We will check if the mid value is a valid answer or not, if it is valid, we will check for a better answer on the left side, else we will check on the right side.
 * We will keep on doing this until we get the minimum number of pages that can be allocated to a student.
 */

public class AllocateBooks67 {
    public static long ayushGivesNinjatest(int n, int m, int[] time) {
        if (n > m)
            return -1;

        long low = 0;
        long high = 0;
        for (int x : time) {
            high += x;
            low = Math.max(low, x);
        }

        while (low <= high) {
            long mid = low + (high - low) / 2;
            int count = helper(time, mid);
            if (count > n)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return low;
    }

    static int helper(int[] arr, long limit) {
        int count = 1;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] <= limit)
                sum += arr[i];
            else {
                count++;
                sum = arr[i];
            }
        }

        return count;
    }
}