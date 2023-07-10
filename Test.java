import java.util.*;

public class Test {
    public static void main(String[] args) {
//        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] arr = {1};

        int k = 1;

        int[] ans = helper(arr, k);
//        System.out.println(Arrays.toString(ans));
    }

    static int[] helper(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n - k + 1];
        List<Integer> temp = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int i = 0, j = 0;
        while (j < n) {
            if (j - i + 1 <= k) {
                pq.add(arr[j]);
                j++;
            } else {
                temp.add(pq.peek());
                pq.remove(arr[i]);
                i++;
            }
        }
        temp.add(pq.peek());
//        System.out.println("i " + i + " j " + j);
        System.out.println(temp);
//        System.out.println(pq.peek());
        return ans;
    }

// [1, 3, -1, 2, 1, 3, 6, 7]
}



