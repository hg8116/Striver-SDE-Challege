import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println(helper(new int[]{6, -8, -9, 5, 3, -18}));
    }

    static int helper(int[] arr){
        int min = Integer.MAX_VALUE;
        int min_end = 0;
        int k = arr.length;
        for(int i=0; i<k; i++){
            min_end = min_end + arr[i];
            if(min > min_end)
                min = min_end;
            if(min_end < 0)
                min_end = 0;
        }
        return min;
    }

}



