// https://www.codingninjas.com/studio/problems/delete-node-in-a-linked-list_8230813?challengeSlug=striver-sde-challenge&leftPanelTab=0
public class DeleteNodeInALinkedList30 {
    public static void deleteNode(LinkedListNode<Integer> node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }
}
