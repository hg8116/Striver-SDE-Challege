// https://www.codingninjas.com/codestudio/problems/next-permutation_8230741?challengeSlug=striver-sde-challenge&leftPanelTab=1

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Start from n-2 and find i, where arr[i] < arr[i+1] && i >= 0
 * If i >= 0, start from n-1 and find j, where arr[j] > arr[i]
 * Swap i and j
 * Reverse the array from i+1 to n-1
 */

public class NextPermutation3 {
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) {
        if (permutation.size() <= 1)
            return permutation;

        int n = permutation.size();
        int i = n - 2, j = n - 1;

        while (i >= 0 && permutation.get(i) >= permutation.get(i + 1))
            i--;
        if (i >= 0) {
            while (permutation.get(j) <= permutation.get(i))
                j--;
            Collections.swap(permutation, i, j);
        }

        List<Integer> sublist = permutation.subList(i + 1, n);
        Collections.reverse(sublist);

        for (int x = i + 1; x < n; x++)
            permutation.set(x, sublist.get(x - i - 1));

        return permutation;
    }
}
