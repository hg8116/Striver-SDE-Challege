// https://www.codingninjas.com/studio/problems/reverse-linked-list_8230724?challengeSlug=striver-sde-challenge&leftPanelTab=1

/*
 * Create copy of head, named curr here
 * Create a pointer prev
 * Create a pointer next
 * Run the loop while curr is not null
 * Point the next to next of curr
 * Point the next of curr to prev
 * Point the prev to curr
 * Point the curr to next
 * Return the prev as it has become the new head of the previous linked list
 */

public class ReverseLinkedList25 {
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
