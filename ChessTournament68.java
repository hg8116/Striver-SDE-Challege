// https://www.codingninjas.com/studio/problems/chess-tournament_8230779?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.Arrays;

/*
 * Use binary search here, as we have to find the minimum distance between the players.
 * So, we will use binary search on the range of distances from the minimum distance between the players to the maximum distance between the players.
 * We will check if the mid value is a valid answer or not, if it is valid, we will check for a better answer on the right side, else we will check on the left side.
 * We will keep on doing this until we get the minimum distance between the players.
 */

public class ChessTournament68 {
    public static int chessTournament(int[] positions, int n, int c) {
        Arrays.sort(positions);
        if (c > n)
            return -1;

        int low = 1;
        int min = positions[0];
        int max = positions[0];
        for (int x : positions) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        int high = max - min;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (valid(positions, n, c, mid)) {
                low = mid + 1;
            } else
                high = mid - 1;
        }

        return low - 1;
    }

    static boolean valid(int[] arr, int n, int c, int mid) {
        int count = 1;
        int pos = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] - pos >= mid) {
                pos = arr[i];
                count++;
            }
            if (count == c)
                return true;
        }

        return false;
    }
}
