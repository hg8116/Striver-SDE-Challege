// https://www.codingninjas.com/codestudio/problems/majority-element-ii_8230738?challengeSlug=striver-sde-challenge&leftPanelTab=1

import java.util.ArrayList;

/*
 * Modified Moore's Voting Algorithm
 * There can be only 2 elements with n/3 occurrence
 */
public class MajorityElementII {
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
        int n = arr.size();
        ArrayList<Integer> ans = new ArrayList<>();
        int el1 = 0, el2 = 0, count1 = 0, count2 = 0;

        for (int x : arr) {
            if (x == el1)
                count1++;
            else if (x == el2)
                count2++;
            else if (count1 == 0) {
                el1 = x;
                count1++;
            } else if (count2 == 0) {
                el2 = x;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int x : arr) {
            if (x == el1)
                count1++;
            if (x == el2)
                count2++;
        }

        if (count1 > n / 3)
            ans.add(el1);
        if (count2 > n / 3)
            ans.add(el2);
        return ans;
    }
}
