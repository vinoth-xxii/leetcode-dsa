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
    public ListNode deleteDuplicates(ListNode head) {
        //we can simply check if next's value is not same

        //from the constraints
        if(head == null) return head;
        ListNode currentNode = head; //O(1) space
        while(currentNode.next != null){ //O(n) time
            if(currentNode.val != currentNode.next.val){
                currentNode = currentNode.next;
            }
            else{
                //it will keep checking
                currentNode.next = currentNode.next.next;
            }
        }
        return head;
    }
}