// https://www.codingninjas.com/codestudio/problems/count-inversions_8230680?challengeSlug=striver-sde-challenge&leftPanelTab=1

/*
* Use the mergesort logic here
* Increment the count while merging when arr[i] > arr[j]
* Add the returned value to a count variable
* Everything else will be same as Merge Sort
* Return the count
*/

public class CountInversions {
    public static long getInversions(long arr[], int n) {
        return mergeSort(arr, 0, n - 1);
    }

    static long mergeSort(long arr[], int l, int r) {
        long count = 0;
        if (l < r) {
            int m = l + (r - l) / 2;
            count += mergeSort(arr, l, m);
            count += mergeSort(arr, m + 1, r);
            count += merge(arr, l, m, r);
        }

        return count;
    }

    static long merge(long arr[], int l, int m, int r) {
        long count = 0;
        int i = l, j = m + 1, k = 0;
        long[] temp = new long[r - l + 1];
        while (i <= m && j <= r) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else {
                temp[k++] = arr[j++];
                count += (m - i + 1);
            }
        }

        while (i <= m)
            temp[k++] = arr[i++];
        while (j <= r)
            temp[k++] = arr[j++];
        for (k = 0; k < temp.length; k++)
            arr[l + k] = temp[k];

        return count;
    }
}
