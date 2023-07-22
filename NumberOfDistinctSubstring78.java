// https://www.codingninjas.com/studio/challenges/striver-sde-challenge?activeProblems=true

/*
 * Use a set to store all the substrings of the given string.
 * Time Complexity: O(N^2)
 */

import java.util.*;

public class NumberOfDistinctSubstring78 {
    public static int distinctSubstring(String word) {
        int n = word.length();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = i; j < n; j++) {
                s += word.charAt(j);
                set.add(s);
            }
        }

        return set.size();

    }
}
