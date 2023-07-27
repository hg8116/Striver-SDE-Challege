// https://www.codingninjas.com/studio/problems/left-view-of-a-binary-tree_8230757?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;

/*
 * Do preorder traversal and if the level is equal to the size of the list, add the node's data to the list.
 * Also can be done using level order traversal. 
 */

public class LeftViewOfABinaryTree114 {
    class TreeNode<T> {
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    };

    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root, ans, 0);

        return ans;
    }

    static void helper(TreeNode<Integer> root, ArrayList<Integer> ans, int level) {
        if (root == null)
            return;
        if (level == ans.size())
            ans.add(root.data);

        helper(root.left, ans, level + 1);
        helper(root.right, ans, level + 1);
    }
}
