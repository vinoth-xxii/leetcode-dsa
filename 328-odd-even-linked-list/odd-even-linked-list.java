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
    ListNode odd, even, evenPt;

    /* Time : O(n)
       Space : O(1) space*/

    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        odd = head;
        evenPt = head.next;
        even = head.next;

        while(even != null && even.next != null){

            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next; //moving the pointer
        }

        odd.next = evenPt;
        return head;  
    }
}