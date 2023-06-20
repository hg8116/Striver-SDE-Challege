// https://www.codingninjas.com/codestudio/problems/find-four-elements-that-sums-to-a-given-value_8230785?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.Arrays;

public class FindFourElementsThatSumsToAGivenValue20 {
    public static String fourSum(int[] arr, int target, int n) {
        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int left = j + 1;
                int right = n - 1;
                int sum = arr[i] + arr[j];
                while (left < right) {
                    if (arr[left] + arr[right] == target - sum)
                        return "Yes";
                    else if (arr[left] + arr[right] > target - sum)
                        right--;
                    else
                        left++;
                }
            }
        }

        return "No";
    }
}
