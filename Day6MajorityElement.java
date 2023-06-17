// https://www.codingninjas.com/codestudio/problems/day-6-majority-element_8230731?challengeSlug=striver-sde-challenge&leftPanelTab=0

/*
* Moore's voting algorithm
*/
public class Day6MajorityElement {
    public static int findMajority(int[] arr, int n) {
        int ans = arr[0];
        int count = 0;

        for (int x : arr) {
            if (ans == x)
                count++;
            else
                count--;
            if (count == 0) {
                ans = x;
                count = 1;
            }
        }

        count = 0;
        for (int x : arr) {
            if (x == ans)
                count++;
        }

        if (count <= n / 2)
            return -1;

        return ans;
    }
}
