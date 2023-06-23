// https://www.codingninjas.com/studio/problems/middle-of-linked-list_8230764?challengeSlug=striver-sde-challenge&leftPanelTab=0

/*
 * Use hare and tortoise approach
 * Create a pointer slow and a pointer fast which will both initially point to the head
 * Iterate while fast is not null and next of fast is not null
 * Now fast will be incremented by two and slow will be incremented by one
 * As fast reached the end, slow will reach the middle
 * Return the slow pointer
 */

public class MiddleOfLinkedList26 {
    class Node {
        public int data;
        public Node next;

        Node() {
            this.data = 0;
            this.next = null;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static Node findMiddle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
