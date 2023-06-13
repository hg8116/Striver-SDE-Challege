// https://www.codingninjas.com/codestudio/problems/sort-0-1-2_8230695?challengeSlug=striver-sde-challenge&leftPanelTab=1

public class Sort012 {
    public static void sort012(int[] arr) {
        int zeros = 0, ones = 0, twos = 0;

        for (int x : arr) {
            if (x == 0)
                zeros++;
            if (x == 1)
                ones++;
            if (x == 2)
                twos++;
        }

        int i = 0;
        while (zeros > 0) {
            arr[i++] = 0;
            zeros--;
        }

        while (ones > 0) {
            arr[i++] = 1;
            ones--;
        }

        while (twos > 0) {
            arr[i++] = 2;
            twos--;
        }
    }
}
