// https://www.codingninjas.com/studio/problems/rotate-linked-list_8230752?challengeSlug=striver-sde-challenge&leftPanelTab=0

public class RotateLinkedList37 {
    public static Node rotate(Node head, int k) {
        if (head == null || head.next == null)
            return head;

        int len = 0;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
            len++;
        }

        if (k == len)
            return head;
        if (k > len) {
            k = k % (len + 1);
        }
        curr.next = head;

        curr = head;
        while (len - k > 0) {
            k++;
            curr = curr.next;
        }

        Node newHead = curr.next;
        curr.next = null;
        return newHead;
    }
}
