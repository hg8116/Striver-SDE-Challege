// https://www.codingninjas.com/studio/problems/3sum_8230739?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Sort the array
 * Start a loop from 0 to n
 * As the array is sorted use the two pointer approach to find the required sum
 * Add the triplet to the answer array
 * Skip duplicates
 */

public class ThreeSum39 {
    public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int k) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - 1;
            int target = k - arr[i];
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (target > sum)
                    left++;
                else if (target < sum)
                    right--;
                else {
                    int x = arr[left];
                    int y = arr[right];
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(x);
                    temp.add(y);
                    temp.add(arr[i]);
                    ans.add(temp);
                    while (left < right && arr[left] == x)
                        left++;
                    while (left < right && arr[right] == y)
                        right--;
                }
            }
            while (i < n - 1 && arr[i] == arr[i + 1])
                i++;
        }
        return ans;

    }
}
