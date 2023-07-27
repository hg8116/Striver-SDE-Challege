// https://www.codingninjas.com/studio/problems/bottom-view-of-binary-tree_8230745?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/*
 * Do level order traversal and store the index and value of nodes in a map.
 * The last value of each index will be the bottom view of the tree.
 */

public class BottomViewOfBinaryTree115 {
    class BinaryTreeNode {
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;

        BinaryTreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class Pair {
        BinaryTreeNode node;
        int lvl;

        Pair(BinaryTreeNode node, int lvl) {
            this.node = node;
            this.lvl = lvl;
        }
    }

    public static ArrayList<Integer> bottomView(BinaryTreeNode root) {
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair temp = q.poll();
            map.put(temp.lvl, temp.node.val);
            if (temp.node.left != null)
                q.add(new Pair(temp.node.left, temp.lvl - 1));
            if (temp.node.right != null)
                q.add(new Pair(temp.node.right, temp.lvl + 1));
        }

        return new ArrayList<>(map.values());
    }
}
