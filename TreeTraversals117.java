// https://www.codingninjas.com/studio/problems/tree-traversals_8230775?challengeSlug=striver-sde-challenge&leftPanelTab=0

import java.util.ArrayList;
import java.util.List;

/*
 * Do inorder, preorder and postorder traversal and store the values in a list.
 * Return the list of lists.
 * Time complexity: O(n)
 * Space complexity: O(n)
 */

public class TreeTraversals117 {
    class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }

    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        inorder(root, in);
        preorder(root, pre);
        postorder(root, post);

        ans.add(in);
        ans.add(pre);
        ans.add(post);

        return ans;
    }

    static void inorder(BinaryTreeNode<Integer> root, List<Integer> arr) {
        if (root == null)
            return;

        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }

    static void preorder(BinaryTreeNode<Integer> root, List<Integer> arr) {
        if (root == null)
            return;

        arr.add(root.data);
        preorder(root.left, arr);
        preorder(root.right, arr);
    }

    static void postorder(BinaryTreeNode<Integer> root, List<Integer> arr) {
        if (root == null)
            return;

        postorder(root.left, arr);
        postorder(root.right, arr);
        arr.add(root.data);
    }
}
