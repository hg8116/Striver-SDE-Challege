import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrderTraversal {
    class TreeNode<T> {
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class Pair {
        TreeNode<Integer> node;
        int lvl;

        Pair(TreeNode<Integer> node, int lvl) {
            this.node = node;
            this.lvl = lvl;
        }
    }

    public static ArrayList<Integer> verticalOrderTraversal(TreeNode<Integer> root) {
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        if (root == null)
            return new ArrayList<>();
        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair temp = q.poll();
            ArrayList<Integer> arr = map.getOrDefault(temp.lvl, new ArrayList<>());
            arr.add(temp.node.data);
            map.put(temp.lvl, arr);
            if (temp.node.left != null)
                q.add(new Pair(temp.node.left, temp.lvl - 1));
            if (temp.node.right != null)
                q.add(new Pair(temp.node.right, temp.lvl + 1));
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (ArrayList<Integer> arr : map.values())
            ans.addAll(arr);

        return ans;
    }
}
