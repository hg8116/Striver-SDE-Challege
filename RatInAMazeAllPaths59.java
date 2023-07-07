// https://www.codingninjas.com/studio/problems/rat-in-a-maze-all-paths_8230705?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;

/*
 * As we need to try all combinations, recursion with backtracking is the solution here
 * Start by taking a visited mat to mark the nodes that have been visited
 * Write a recursive function that traverses in all four directions if possible
 * When reached bottom right corner add the current maze to the answer list
 * Return the answer list
 */

public class RatInAMazeAllPaths59 {
    static int[] x = {-1, 0, 1, 0};
    static int[] y = {0, -1, 0, 1};

    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int[][] vis = new int[n][n];
        vis[0][0] = 1;
        solve(maze, 0, 0, vis, ans);

        return ans;
    }

    static void solve(int[][] mat, int row, int col, int[][] vis, ArrayList<ArrayList<Integer>> ans) {
        if (row == mat.length - 1 && col == mat.length - 1) {
            addMaze(vis, ans);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nr = row + x[i];
            int nc = col + y[i];

            if (nr >= 0 && nc >= 0 && nr < mat.length && nc < mat.length && mat[nr][nc] == 1 && vis[nr][nc] == 0) {
                vis[nr][nc] = 1;
                solve(mat, nr, nc, vis, ans);
                vis[nr][nc] = 0;
            }
        }
    }

    static void addMaze(int[][] mat, ArrayList<ArrayList<Integer>> ans) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int[] arr : mat) {
            for (int el : arr) {
                temp.add(el);
            }
        }

        ans.add(temp);
        return;
    }
}
