// https://www.codingninjas.com/studio/problems/copy-list-with-random-pointer_8230734?challengeSlug=striver-sde-challenge&leftPanelTab=0

/*
 * Divide the problem into three parts
 * First insert copy of every node just after it
 * Connect the copy with new random nodes
 * Create a linked list of just new nodes
 * Return the head of new linked list
 */

public class CopyListWithRandomPointer38 {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
        LinkedListNode<T> random;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

    public LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
        if (head == null)
            return null;
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> next = null;
        while (curr != null) {
            next = curr.next;
            LinkedListNode<Integer> temp = new LinkedListNode<>(curr.data);
            temp.random = null;
            temp.next = curr.next;
            curr.next = temp;
            curr = next;
        }

        curr = head;
        while (curr != null) {
            if (curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }

        curr = head;
        LinkedListNode<Integer> newHead = new LinkedListNode<>(0);
        LinkedListNode<Integer> newCurr = newHead;
        newHead.next = curr.next;
        while (curr != null) {
            next = curr.next.next;
            newCurr.next = curr.next;
            newCurr = newCurr.next;
            curr.next = next;
            curr = next;
        }

        return newHead.next;
    }
}
