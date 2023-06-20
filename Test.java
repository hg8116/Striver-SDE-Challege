import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] count = new int[26];

        String s = "abacdx";

        for(int i=0; i<s.length(); i++){
            count[(int)(s.charAt(i) - 'a')]++;
        }

        System.out.println(Arrays.toString(count));
    }

}



