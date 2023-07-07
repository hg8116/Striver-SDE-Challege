// https://www.codingninjas.com/studio/challenges/striver-sde-challenge?activeProblems=true

import java.util.ArrayList;
import java.util.List;

/*
 * Start by making an adjacency list for the graph
 * Take an array to store the color number
 * Write a recursive function which tries all the colors if the color of current node is zero
 * Write another function that checks the color of all the neighbours of the current node
 * If any neighbouring node has same color as the current node return false else true
 * Recursively call the function while the index doesn't reach the end
 * If at any point no combination is working return false
 * Else return true
 */

public class MColoringProblem58 {
    public static String graphColoring(int[][] mat, int m) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < mat.length; i++)
            adj.add(new ArrayList<>());

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        int[] color = new int[mat.length];
        if (helper(0, adj, color, m))
            return "YES";

        return "NO";
    }

    static boolean helper(int node, List<List<Integer>> adj, int[] color, int m) {
        if (node == adj.size())
            return true;

        if (color[node] == 0) {
            for (int c = 1; c <= m; c++) {
                if (isPossible(node, color, c, adj)) {
                    color[node] = c;
                    if (helper(node + 1, adj, color, m))
                        return true;
                    color[node] = 0;
                }
            }
            return false;
        }

        return true;
    }

    static boolean isPossible(int node, int[] color, int c, List<List<Integer>> adj) {
        for (Integer it : adj.get(node)) {
            if (color[it] == c)
                return false;
        }

        return true;
    }
}
