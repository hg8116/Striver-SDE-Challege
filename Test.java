import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Integer[] temp = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5};
        arr.addAll(Arrays.asList(temp));

        int i=0, j=1, n = arr.size();
        while(j < arr.size()){
            if(arr.get(i) != arr.get(j)){
                i = j;
                j++;
            }
            else{
                arr.remove(j);
            }
        }
        System.out.println(arr);

    }

}



