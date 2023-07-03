// https://www.codingninjas.com/studio/problems/fractional-knapsack_8230767?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.Arrays;

/*
 * Sort in descending order of value per unit
 * Iterate the array and if weight of curr item is less than equal to total weight add to answer
 * Else multiply the remaining of total weight with value per unit and add it
 * Return the answer
 */

public class FractionalKnapsack46 {
    class Pair {
        int weight;
        int value;

        Pair(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

    }

    public static double maximumValue(Pair[] items, int n, int w) {
        Arrays.sort(items, (a, b) -> {
            return b.value * a.weight - a.value * b.weight;
        });

        double ans = 0;
        for (int i = 0; i < n; i++) {
            if (items[i].weight <= w) {
                ans += items[i].value;
                w -= items[i].weight;
            } else {
                ans += (double) items[i].value * w / (double) items[i].weight;
                break;
            }
        }
        return ans;
    }
}
