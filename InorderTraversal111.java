// https://www.codingninjas.com/studio/problems/inorder-traversal_8230857?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;
import java.util.List;

/*
 * Use recursion to traverse the tree in inorder fashion and store the data in a list.
 * Also can be done using stack iteratively.
 */

public class InorderTraversal111 {
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

    public static List<Integer> getInOrderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);

        return ans;
    }

    static void helper(TreeNode root, List<Integer> ans) {
        if (root == null)
            return;

        helper(root.left, ans);
        ans.add(root.data);
        helper(root.right, ans);
    }

}
