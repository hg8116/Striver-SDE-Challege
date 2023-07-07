// https://www.codingninjas.com/studio/problems/valid-sudoku_8230704?challengeSlug=striver-sde-challenge&leftPanelTab=0

/*
 * As it can be seen that all possible combinations have to be tried so recursion with backtracking is the obvious approach
 * Create a recursive function and run for loops for traversing the matrix
 * If any cell contains zero, try to fit all numbers from 1 to 9 after checking if it's possible or not
 * If possible place it and call the function again, if function returns false at any point change the cell back to zero
 * If the loop completes successfully return true else false
 * When check a number can be placed or not, check in the same row, column and 3*3 box if number already exists or not
 * To check 3*3 box use arr[3*(row/3) + i/3][3*(col/3) + i%3]
 * If number exists return false else true
 */

public class ValidSudoku57 {
    public static boolean isItSudoku(int matrix[][]) {
        return solve(matrix);
    }

    static boolean solve(int[][] arr) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] == 0) {
                    for (int c = 1; c <= 9; c++) {
                        if (canPlace(i, j, arr, c)) {
                            arr[i][j] = c;
                            if (solve(arr))
                                return true;
                            else
                                arr[i][j] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static boolean canPlace(int i, int j, int[][] arr, int c) {
        for (int x = 0; x < 9; x++) {
            if (arr[x][j] == c) return false;
            if (arr[i][x] == c) return false;
            if (arr[3 * (i / 3) + x / 3][3 * (j / 3) + x % 3] == c) return false;
        }
        return true;
    }
}
