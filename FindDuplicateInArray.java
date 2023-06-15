// https://www.codingninjas.com/codestudio/problems/find-duplicate-in-array_8230816?challengeSlug=striver-sde-challenge&leftPanelTab=1

import java.util.ArrayList;

/*
* Using index of the array as visited index
* Mark the element of the visited index by multiplying it with -1
* If its already visited, return the element
*/

public class FindDuplicateInArray {
    public static int findDuplicate(ArrayList<Integer> arr, int n) {
        for (int i = 0; i < arr.size(); i++) {
            int ind = Math.abs(arr.get(i)) - 1;
            if (arr.get(ind) > 0) {
                arr.set(ind, -arr.get(ind));
            } else
                return Math.abs(arr.get(i));
        }

        return -1;
    }
}
