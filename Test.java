import java.util.*;

public class Test {
    public static void main(String[] args) {
        int pass = 35006;
        int sumOfDay = 35006 % 5000;

        int day = (int) Math.sqrt(sumOfDay * 2 - 1);
        int label = (pass - (sumOfDay + day * 5000)) / 5000;
        System.out.println(label);
    }
}



