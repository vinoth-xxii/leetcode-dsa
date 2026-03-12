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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode head2, current;
        current = head;
        head2 = null;
        while(current != null){
            ListNode newNode = new ListNode(current.val, null);
            newNode.next = head2;
            head2 = newNode;
            current = current.next;
        }
        return head2;
    }
}