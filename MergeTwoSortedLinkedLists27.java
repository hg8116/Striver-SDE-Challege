// https://www.codingninjas.com/studio/problems/merge-two-sorted-linked-lists_8230729?challengeSlug=striver-sde-challenge&leftPanelTab=1

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class MergeTwoSortedLinkedLists27 {
    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        LinkedListNode<Integer> head = new LinkedListNode<>(0);
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> currFirst = first;
        LinkedListNode<Integer> currSecond = second;

        while (currFirst != null && currSecond != null) {
            if (currFirst.data < currSecond.data) {
                LinkedListNode<Integer> newNode = new LinkedListNode<>(currFirst.data);
                curr.next = newNode;
                currFirst = currFirst.next;
            } else {
                LinkedListNode<Integer> newNode = new LinkedListNode<>(currSecond.data);
                curr.next = newNode;
                currSecond = currSecond.next;
            }
            curr = curr.next;
        }

        if (currFirst != null)
            curr.next = currFirst;

        if (currSecond != null)
            curr.next = currSecond;

        return head.next;
    }
}
