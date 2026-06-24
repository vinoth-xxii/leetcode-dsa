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
    public ListNode geteReveredLL(ListNode node) {
        ListNode temp = null;
        ListNode next = null;
        while (node.next != null) {
            temp = node.next;
            node.next = next;
            next = node;
            node = temp;
        }
        node.next = next;
        return node;
    }

    public void shuffleLL(ListNode left, ListNode mid) {
        ListNode right = mid.next;

        ListNode nextLeft = null;
        ListNode nextRight = null;
        ListNode temp1 = null;
        ListNode temp2 = null;

        while (left != mid) {
            nextLeft = left.next;
            nextRight = right.next;
            left.next = right;
            right.next = nextLeft;
            left = nextLeft;
            right = nextRight;
        }
        if (right == null) { //for odd elements
            left.next = null;
        } else {
            left.next = right; //for even elements
            right.next = null;
        }
    }

    public void reorderList(ListNode head) {
        ListNode left = head;
        ListNode right = head.next;

        if (right == null)
            return;

        while (right != null && right.next != null) {
            left = left.next;
            right = right.next.next;
        }

        left.next = geteReveredLL(left.next);
        shuffleLL(head, left);
    }
}