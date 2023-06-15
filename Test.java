import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(2);

        System.out.println(arr);
        int[] ans = {-1, -1};
        for (int i = 0; i < arr.size(); i++) {
            int ind = arr.get(i) - 1;
            int temp = arr.get(ind);
            arr.set(ind, arr.get(i));
            arr.set(i, temp);
        }
        System.out.println(arr);
    }

}



