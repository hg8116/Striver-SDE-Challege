// https://www.codingninjas.com/studio/problems/day-13-print-permutations-string_8230703?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;
import java.util.List;

public class PrintPermutationsString55 {
    public static List<String> findPermutations(String s) {
        List<String> ans = new ArrayList<>();
        helper(s.toCharArray(), 0, ans);
        return ans;
    }

    static void helper(char[] s, int ind, List<String> ans) {
        if (ind == s.length) {
            ans.add(new String(s));
        }

        for (int i = ind; i < s.length; i++) {
            swap(s, i, ind);
            helper(s, ind + 1, ans);
            swap(s, i, ind);
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
