// codingninjas.com/codestudio/problems/missing-and-repeating-numbers_8230733?challengeSlug=striver-sde-challenge&leftPanelTab=1

import java.util.ArrayList;

public class MissingAndRepeatingNumbers {
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int[] ans = {-1, -1};

        for (int i = 0; i < arr.size(); i++) {
            int ind = Math.abs(arr.get(i)) - 1;
            if (arr.get(ind) > 0)
                arr.set(ind, -arr.get(ind));
            else {
                ans[1] = Math.abs(arr.get(i));
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                ans[0] = i + 1;
                break;
            }
        }

        return ans;
    }
}
