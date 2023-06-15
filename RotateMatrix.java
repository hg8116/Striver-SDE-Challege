// https://www.codingninjas.com/codestudio/problems/rotate-matrix_8230774?challengeSlug=striver-sde-challenge&leftPanelTab=1

import java.util.ArrayList;

public class RotateMatrix {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int startRow = 0, startCol = 0, endRow = n - 1, endCol = m - 1;

        while (startRow < endRow && startCol < endCol) {
            int prev = mat.get(startRow + 1).get(startCol);
            for (int i = startCol; i <= endCol; i++) {
                int temp = mat.get(startRow).get(i);
                mat.get(startRow).set(i, prev);
                prev = temp;
            }
            startRow++;
            for (int i = startRow; i <= endRow; i++) {
                int temp = mat.get(i).get(endCol);
                mat.get(i).set(endCol, prev);
                prev = temp;
            }
            endCol--;
            for (int i = endCol; i >= startCol; i--) {
                int temp = mat.get(endRow).get(i);
                mat.get(endRow).set(i, prev);
                prev = temp;
            }
            endRow--;
            for (int i = endRow; i >= startRow; i--) {
                int temp = mat.get(i).get(startCol);
                mat.get(i).set(startCol, prev);
                prev = temp;
            }
            startCol++;
        }
    }
}
