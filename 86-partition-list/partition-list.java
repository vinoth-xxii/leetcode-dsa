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

    public ListNode mergeList(ListNode node1Head, ListNode node1tail, ListNode node2Head) {
        if(node1Head == null){
            return node2Head;
        }
        node1tail.next = node2Head;
        return node1Head;
    }


    // O(N) time and O(N) space
    public ListNode partition(ListNode head, int x) {
        //initialise the two groups
        ListNode small = null;
        ListNode large = null;
        ListNode pt1 = null;
        ListNode pt2 = null;

        ListNode current = head;
        while (current != null) {   
            if (current.val < x) {
                if (small == null) {
                    small = new ListNode(current.val);
                    pt1 = small;
                } else {
                    small.next = new ListNode(current.val);
                    small = small.next;
                }
            } else {
                if (large == null) {
                    large = new ListNode(current.val);
                    pt2 = large;
                } else {
                    large.next = new ListNode(current.val);
                    large = large.next;
                }
            }
            current = current.next;
        }

        return mergeList(pt1, small, pt2);
    }
}