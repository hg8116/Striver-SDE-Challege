// https://www.codingninjas.com/studio/problems/palindrome-linked-list_8230717?challengeSlug=striver-sde-challenge&leftPanelTab=0

/*
 * Using hare and tortoise approach find the middle node
 * Reverse from the middle to the end
 * Put a pointer on head and on middle
 * Compare while middle pointer is not null
 * If at any point data is not equal return false
 * Else return true after the iteration is completed
 */

public class PalindromeLinkedList34 {
    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> slow = head, fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        LinkedListNode<Integer> curr = slow;
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        slow = prev;
        fast = head;

        while (slow != null) {
            if (fast.data != slow.data)
                return false;
            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }
}
