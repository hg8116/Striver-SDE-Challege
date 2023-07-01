// https://www.codingninjas.com/studio/challenges/striver-sde-challenge?activeProblems=true

/*
 * Imagine there are only two linked list to merge
 * Write a function which merges children of two linked list
 * Now from the main function call this function while head is not null
 * Return the updated head
 */

public class FlattenALinkedList36 {
    class Node {
        public int data;
        public Node next;
        public Node child;

        Node() {
            this.data = 0;
            this.next = null;
            this.child = null;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
            this.child = null;
        }

        Node(int data, Node next, Node child) {
            this.data = data;
            this.next = next;
            this.child = child;
        }
    }

    public Node flattenLinkedList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            prev = helper(prev, curr);
            prev.next = null;
            curr = next;
        }

        return prev;

    }

    Node helper(Node a, Node b) {
        Node temp = new Node(0);
        Node ans = temp;

        while (a != null && b != null) {
            if (a.data < b.data) {
                temp.child = a;
                temp = temp.child;
                a = a.child;
            } else {
                temp.child = b;
                temp = temp.child;
                b = b.child;
            }
        }

        if (a != null)
            temp.child = a;
        else
            temp.child = b;

        return ans.child;
    }
}
