// https://www.codingninjas.com/studio/problems/intersection-of-two-linked-lists_8230688?challengeSlug=striver-sde-challenge&leftPanelTab=0

/*
 * We know that the length of both paths might not be same
 * So when traversing, if we reach at the end of any one path we assign it to other path
 * Keep doing this until they are both nodes are not equal
 * Return any one node
 */

public class IntersectionOfTwoLinkedLists31 {
    public static int findIntersection(Node firstHead, Node secondHead) {
        if (firstHead == null || secondHead == null)
            return 0;

        Node first = firstHead;
        Node second = secondHead;

        while (first != second) {
            first = first == null ? secondHead : first.next;
            second = second == null ? firstHead : second.next;
        }

        return first.data;
    }
}
