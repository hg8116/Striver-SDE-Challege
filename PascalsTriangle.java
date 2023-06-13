// https://www.codingninjas.com/codestudio/problems/pascal-s-triangle_8230805?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;

public class PascalsTriangle {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Long> row = new ArrayList<>();
            if (ans.size() == 0) {
                row.add((long) 1);
                ans.add(row);
                continue;
            }
            row.add((long) 1);
            ArrayList<Long> lastRow = ans.get(i - 1);
            for (int j = 0; j < lastRow.size() - 1; j++) {
                row.add(lastRow.get(j) + lastRow.get(j + 1));
            }
            row.add((long) 1);
            ans.add(row);
        }

        return ans;
    }
}
