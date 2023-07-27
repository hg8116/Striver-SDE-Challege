// https://www.codingninjas.com/studio/problems/path-in-a-tree_8230860?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;

/*
 * Do preorder traversal and store the path in a list.
 * If the node is found, return the list.
 * If the node is not found, remove the last element from the list.
 * Time complexity: O(n)
 * Space complexity: O(n)
 */

public class PathInATree119 {
    class TreeNode {
        int data;
        TreeNode left, right;

        public TreeNode(int item) {
            data = item;
            left = right = null;
        }
    }

    public static ArrayList<Integer> pathInATree(TreeNode root, int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        helper(root, x, ans);
        return ans;
    }

    static void helper(TreeNode root, int x, ArrayList<Integer> ans) {
        if (root == null)
            return;
        ans.add(root.data);
        if (root.data == x)
            return;
        helper(root.left, x, ans);
        helper(root.right, x, ans);
        if (ans.get(ans.size() - 1) != x)
            ans.remove(ans.size() - 1);
    }
}
