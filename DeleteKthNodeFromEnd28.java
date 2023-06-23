/*
 * Start by creating a dummy pointer, pointing to head
 * Make to pointers, slow and fast
 * Move the fast point k times
 * Now ove the fast pointer and slow pointer until next of fast is not null
 * Remove the node next to slow pointer
 * Return the next of dummy node
 */

class Node {
    public int data;
    public Node next;
    public Node prev;

    Node() {
        this.data = 0;
        this.next = null;
        this.prev = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
        this.prev = next;
    }
}

public class DeleteKthNodeFromEnd28 {
    public static Node removeKthNode(Node head, int k) {
        Node dummy = new Node();
        dummy.next = head;
        Node slow = dummy;
        Node fast = dummy;

        while (k-- > 0)
            fast = fast.next;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
