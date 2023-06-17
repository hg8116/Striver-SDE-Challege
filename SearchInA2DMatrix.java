// https://www.codingninjas.com/codestudio/problems/search-in-a-2d-matrix_8230773?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;

/*
 * Since the array is sorted both row and column wise
 * Start from the top right corner
 * If the current element is equal to the target return true
 * If the current element is greater than target move left
 * If the current element is smaller than target move down
 * If element does not exist return false
 */

public class SearchInA2DMatrix {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        int n = mat.size();
        int m = mat.get(0).size();

        int i = 0, j = m - 1;

        while (i < n && j >= 0) {
            if (mat.get(i).get(j) == target)
                return true;
            else if (mat.get(i).get(j) > target)
                j--;
            else
                i++;
        }

        return false;
    }
}
