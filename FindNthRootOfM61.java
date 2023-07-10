// https://www.codingninjas.com/studio/problems/find-nth-root-of-m_8230799?challengeSlug=striver-sde-challenge&leftPanelTab=0

/*
 * Brute force is just loop through 1 to m and find nth power of every number and if it is equal to m return it
 * Binary search can be used for optimization here as the search space will be divided into half every time making the solution O(logN)
 */

public class FindNthRootOfM61 {
    public static int NthRoot(int n, int m) {
        if (n == 1)
            return m;

        int low = 1, high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (Math.pow(mid, n) == m)
                return mid;
            else if (Math.pow(mid, n) > m)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }
}
