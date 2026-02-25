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

    /* Time - O(n)
       Space - O(1) 
    */
    public ListNode findNode(ListNode head, int n) {
        ListNode left, right;
        left = head;
        right = head;
        int count = 1; // n - 1 step different
        while (right != null) { 
            right = right.next;
            if (count > n && left != null) {
                left = left.next;
            }
            count++;
        }
        return left;
    }

    public ListNode moddedList(ListNode node, ListNode target) {
        if (node == null) {
            return node;
        }
        if (node == target) {
            node = moddedList(node.next, target);
        } else {
            node.next = moddedList(node.next, target);
        }
        return node;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = findNode(head, n);
        return moddedList(head, node);
    }
}