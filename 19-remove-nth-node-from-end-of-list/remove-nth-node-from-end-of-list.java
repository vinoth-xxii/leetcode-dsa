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

    ListNode target = null;

    public ListNode removedList(ListNode node) {
        if (node == null) {
            return node;
        }

        node.next = removedList(node.next);
        return (node == target) ? node.next : node;
    }

    public ListNode findtheNode(ListNode node, int n) {
        ListNode left = node;
        ListNode right = node;
        int gap = n - 1;
        int count = 0;
        while (right != null) {
            right = right.next;
            if (count > gap) { //again making the same mistake here count >= gap
                left = left.next;
            }
            count++;
        }
        return left;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        /* First I will find the node to be removed;
        and i will pass that to remove function */

        /*since the last postition is 1 and not 0;
        in perception keep that the last is 0,1,2, etc;
        by subtracting the n by 1 -> n - 1;
        if n is 1 then it's 0; which has no gap b/w left and right; the gap is 0
        if n is 2, then gap is 1; left should start after right move n - 1 step*/

        target = findtheNode(head, n);
        return removedList(head);
    }
}