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

/*just popped in my be head while looking at the picture
  we kn we have to use two pointer, how we use it is the challenge
  plus we could use swap logic until we get unique, plus i remember
  passing node.next in binary tree
*/
class Solution {
    public ListNode getNext(ListNode node) {
        if (node == null) {
            return node;
        }
        ListNode temp = node;
        if (temp.next != null && temp.val == temp.next.val) { //isDuplicate
            int dupVal = temp.val;
            while (temp != null && temp.val == dupVal) {
                temp = temp.next;
            }
            node = getNext(temp);
        } else {
            node.next = getNext(node.next);
        }
        return node;

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode modHead = getNext(head);
        return modHead;
    }
}