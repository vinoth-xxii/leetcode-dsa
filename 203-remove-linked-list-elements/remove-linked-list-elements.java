/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private int target;

    public ListNode getNext(ListNode node) {
        if (node == null) {
            return node;
        }
        if (node.val == target) {
            node = getNext(node.next); //pass the next node
        } else {
            node.next = getNext(node.next);
        }
        return node;
    }

    public ListNode removeElements(ListNode head, int val) {
        //From constraints, we could head is null
        this.target = val;
        head = getNext(head);
        return head;
    }
}