// https://www.codingninjas.com/studio/problems/single-element-in-a-sorted-array_8230826?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;

/*
 * Usually the duplicate for odd index will be on prev even index and for even index it will be next odd index
 * But if there is a single element before the current set of duplicates this logic will be reversed
 * So using binary search it is possible to find this index
 * Specially trick here is to use ^ xor because if even index is xor with 1 it gives next index and if odd is xor with 1 it gives previous index
 */

public class SingleElementInASortedArray63 {
    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        int low = 0, high = arr.size() - 2;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == arr.get(mid ^ 1))
                low = mid + 1;
            else
                high = mid - 1;
        }

        return arr.get(low);
    }
}
