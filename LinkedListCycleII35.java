// https://www.codingninjas.com/studio/challenges/striver-sde-challenge?activeProblems=true

/*
* Use hare and tortoise approach
* Increment the fast and slow pointer
* If they become equal at any point it means cycle exists
* Now take either slow or fast and point it to head
* While slow and fast are not equal, increment slow and fast again but this time both by one
* Return the fast pointer
* If cycle does not exist return null
*/

public class LinkedListCycleII35 {
    public static Node firstNode(Node head) {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }

                return fast;
            }
        }

        return null;
    }
}
