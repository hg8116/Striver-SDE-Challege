// https://www.codingninjas.com/studio/problems/add-two-numbers-as-linked-lists_8230833?challengeSlug=striver-sde-challenge&leftPanelTab=0

public class AddTwoNumbers29 {
    private class LinkedListNode {
        int data;
        LinkedListNode next;

        public LinkedListNode(int data) {
            this.data = data;
        }
    }

    LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        LinkedListNode ans = new LinkedListNode(0);
        LinkedListNode curr = ans;
        int carry = 0;

        while (head1 != null || head2 != null || carry != 0) {
            int sum = 0;
            if (head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }
            if (head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }

            sum += carry;
            carry = sum / 10;
            LinkedListNode newNode = new LinkedListNode(sum % 10);
            curr.next = newNode;
            curr = curr.next;
        }

        return ans.next;
    }
}
