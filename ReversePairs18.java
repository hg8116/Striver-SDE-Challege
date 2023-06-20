// https://www.codingninjas.com/codestudio/problems/reverse-pairs_8230825?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;

/*
 * Implement Merge Sort
 * Modify the merge sort to count the arr[i] > 2 * arr[j]
 * Return the count
 */

public class ReversePairs18 {
    public static int reversePairs(ArrayList<Integer> temp) {
        int n = temp.size();
        int[] arr = new int[temp.size()];
        for (int i = 0; i < n; i++)
            arr[i] = temp.get(i);

        return mergeSort(arr, 0, n - 1);
    }

    static int mergeSort(int[] arr, int start, int end) {
        int count = 0;
        if (start < end) {
            int mid = start + (end - start) / 2;
            count += mergeSort(arr, start, mid);
            count += mergeSort(arr, mid + 1, end);
            count += merge(arr, start, mid, end);
        }
        return count;
    }

    static int merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        int count = 0;

        while (i <= mid && j <= end) {
            if (arr[i] > 2 * arr[j]) {
                count += (mid - i + 1);
                j++;
            } else
                i++;
        }

        i = start;
        j = mid + 1;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= end)
            temp[k++] = arr[j++];

        for (i = start; i <= end; i++)
            arr[i] = temp[i - start];

        return count;
    }
}
