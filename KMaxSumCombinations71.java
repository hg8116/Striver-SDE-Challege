// https://www.codingninjas.com/studio/problems/day-29-k-max-sum-combinations_8230768?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.*;

public class KMaxSumCombinations71 {
    public static ArrayList<Integer> kMaxSumCombination(ArrayList<Integer> a, ArrayList<Integer> b, int n, int k) {
        ArrayList<Integer> tempArray = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int currentSum = a.get(i) + b.get(j);
                tempArray.add(currentSum);
            }
        }
        Collections.sort(tempArray, Collections.reverseOrder());

        ArrayList<Integer> result = new ArrayList<Integer>();
        result.addAll(tempArray.subList(0, k));

        return result;
    }
}
