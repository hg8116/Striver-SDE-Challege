// https://www.codingninjas.com/studio/problems/maximum-width-in-binary-tree_8230710?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.LinkedList;
import java.util.Queue;

/*
 * Do level order traversal and store the size of each level.
 * The maximum size will be the maximum width of the tree.
 * Time complexity: O(n)
 * Space complexity: O(n)
 */

public class MaximumWidthInBinaryTree120 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static int getMaxWidth(TreeNode root) {
        int ans = 0;
        if (root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            ans = Math.max(ans, size);
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
        }
        return ans;
    }
}
