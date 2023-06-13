// https://www.codingninjas.com/codestudio/problems/best-time-to-buy-and-sell-stock_8230746?challengeSlug=striver-sde-challenge&leftPanelTab=3

import java.util.ArrayList;

public class BestTimeToBuyAndSellStock {
    public static int maximumProfit(ArrayList<Integer> prices) {
        int n = prices.size();
        int ans = 0;
        int currPrice = prices.get(n - 1);
        for (int i = n - 1; i >= 0; i--) {
            ans = Math.max(currPrice - prices.get(i), ans);
            currPrice = Math.max(currPrice, prices.get(i));
        }

        return ans;
    }
}
