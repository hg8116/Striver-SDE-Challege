// https://www.codingninjas.com/studio/problems/palindrome-partitioning_8230726?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;
import java.util.List;

/*
 * Write a function which checks whether a string is palindromic or not
 * Write a recursive function that goes through all subsequences of the string
 * Check if current substring is palindromic or not, if palindromic add it to an arraylist (Recursive calls using for loops)
 * If the index reaches end of the string add the arraylist to the answer
 * Return the answer
 */

public class PalindromePartitioning53 {
    public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        helper(s, 0, new ArrayList<>(), ans);
        return ans;
    }

    static void helper(String s, int ind, List<String> temp, List<List<String>> ans) {
        if (ind >= s.length()) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = ind; i < s.length(); i++) {
            String str = s.substring(ind, i + 1);
            if (isPal(str)) {
                temp.add(str);
                helper(s, i + 1, temp, ans);
                temp.remove(temp.size() - 1);
            }
        }
    }

    static boolean isPal(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }

        return true;
    }
}
