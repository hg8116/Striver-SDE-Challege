import java.util.*;

public class Test {
    public static void main(String[] args) {
        String[] words = {"cd","ac","dc","ca","zz"};
        Set<String> set = new HashSet<>();
        int ans = 0;
        for(String word: words){
            StringBuilder sb = new StringBuilder(word);
            if(set.contains(word) || set.contains(sb.reverse().toString()))
                ans++;
            set.add(word);
        }
        System.out.println(ans);
    }

}



