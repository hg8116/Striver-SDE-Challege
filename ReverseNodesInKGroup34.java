// https://www.codingninjas.com/studio/problems/reverse-nodes-in-k-group_8230709?challengeSlug=striver-sde-challenge&leftPanelTab=0

/*
 * Write a function which reverses k nodes
 * Make this function recursive and pass index
 * Reverse the number of nodes according to the given index
 * Increment the index and reverse the nodes
 * Return the prev at the end
 */

public class ReverseNodesInKGroup34 {
    public static Node getListAfterReverseOperation(Node head, int n, int b[]) {
        if (head == null)
            return null;
        return helper(head, n, b, 0);
    }

    static Node helper(Node head, int n, int[] b, int i) {
        if (head == null || i >= n)
            return head;

        int k = b[i];
        if (k == 0)
            return helper(head, n, b, i + 1);

        int count = 0;
        Node curr = head, next = null, prev = null;

        while (count < k && curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        head.next = helper(next, n, b, i + 1);
        return prev;
    }
}
