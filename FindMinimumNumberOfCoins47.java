// https://www.codingninjas.com/studio/problems/find-minimum-number-of-coins_8230766?challengeSlug=striver-sde-challenge&leftPanelTab=0

public class FindMinimumNumberOfCoins47 {
    public static int findMinimumCoins(int amount) {
        int[] arr = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int ans = 0;
        for (int x : arr) {
            if (amount <= 0)
                break;
            if (amount >= x) {
                ans += amount / x;
                amount %= x;
            }
        }

        return ans;
    }
}
