// https://www.codingninjas.com/studio/problems/level-order-traversal_8230716?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Do level order traversal and store the values in a list.
 * Time complexity: O(n)
 * Space complexity: O(n)
 */

public class LevelOrderTraversal121 {
    class BinaryTreeNode {
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;

        public BinaryTreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            BinaryTreeNode temp = q.poll();
            ans.add(temp.val);
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }

        return ans;
    }
}
