// https://www.codingninjas.com/studio/problems/preorder-traversal_8230856?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;
import java.util.List;

/*
 * Use recursion to traverse the tree in preorder fashion and store the data in a list.
 * Also can be done using stack iteratively.
 */

public class PreorderTraversal112 {
    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.data = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.data = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> getPreOrderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }

    static void helper(TreeNode root, List<Integer> ans) {
        if (root == null)
            return;

        ans.add(root.data);
        helper(root.left, ans);
        helper(root.right, ans);
    }
}
