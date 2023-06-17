// https://www.codingninjas.com/codestudio/problems/unique-paths_8230802?challengeSlug=striver-sde-challenge&leftPanelTab=1

/*
 * Can be done using combinations
 * Total number of down + right will be same for all i.e. n-1 + m-1
 * And to form all combinations we need to find the nCr
 */

public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        int N = m - 1 + n - 1;
        int r = m - 1;
        double ans = 1;

        for (int i = 1; i <= r; i++) {
            ans = ans * (N - r + i) / i;
        }
        return (int) ans;
    }
}
