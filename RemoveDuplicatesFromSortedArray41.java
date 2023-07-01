// https://www.codingninjas.com/studio/problems/remove-duplicates-from-sorted-array_8230811?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray41 {
    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr.get(i) != arr.get(i + 1))
                count++;
        }

        return count;
    }
}
