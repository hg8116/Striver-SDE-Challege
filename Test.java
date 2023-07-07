import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[][] mat = {{1, 0, 1}, {1, 0, 1}, {1, 1, 1}};
        ArrayList<ArrayList<Integer>> ans = ratInAMaze(mat, 3);
        System.out.println(ans);
    }

    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0)
            return ans;

        solve(maze, 0, 0, ans);

        return ans;
    }

    static void solve(int[][] arr, int row, int col, ArrayList<ArrayList<Integer>> ans) {
        if (row >= arr.length || col >= arr.length || arr[row][col] == 0) {
            return;
        }

        if (row == arr.length - 1 && col == arr.length - 1) {
            // add ans
            arr[row][col] = 2;
            addMaze(arr, ans);
            return;
        }

        arr[row][col] = 2;

        // left
        if (col - 1 >= 0 && arr[row][col - 1] == 1) {
            solve(arr, row, col - 1, ans);
        }

        // right
        if (col + 1 < arr.length && arr[row][col + 1] == 1) {
            solve(arr, row, col + 1, ans);
        }

        // up
        if (row - 1 >= 0 && arr[row - 1][col] == 1) {
            solve(arr, row - 1, col, ans);
        }

        // down
        if (row + 1 < arr.length && arr[row + 1][col] == 1) {
            solve(arr, row + 1, col, ans);
        }

        arr[row][col] = 1;
    }

    static void addMaze(int[][] arr, ArrayList<ArrayList<Integer>> ans) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int[] x : arr) {
            System.out.println(Arrays.toString(x));
            for (int el : x) {
                if (el == 1 || el == 0)
                    temp.add(0);
                else
                    temp.add(1);
            }
        }
        System.out.println();

        ans.add(temp);
    }
}



