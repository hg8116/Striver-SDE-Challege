// https://www.codingninjas.com/studio/problems/cycle-detection-in-a-singly-linked-list_8230683?challengeSlug=striver-sde-challenge&leftPanelTab=0

/*
 * Use hare and tortoise approach (slow and fast pointer)
 * If they become equal at any point it means that the cycle exists (return true)
 * Else return false
 */
public class CycleDetectionInASinglyLinkedList32 {
    public static boolean detectCycle(Node head) {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow)
                return true;
        }

        return false;
    }
}
