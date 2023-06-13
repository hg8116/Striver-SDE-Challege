// https://www.codingninjas.com/codestudio/problems/set-matrix-zeros_8230862?challengeSlug=striver-sde-challenge

public class SetMatrixZeros {
    public static void setZeros(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] rowTemp = new int[n];
        int[] colTemp = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    rowTemp[i] = -1;
                    colTemp[j] = -1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (rowTemp[i] == -1) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            if (colTemp[i] == -1) {
                for (int j = 0; j < n; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
