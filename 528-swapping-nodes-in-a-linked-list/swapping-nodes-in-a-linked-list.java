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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode nodeA = head;
        ListNode nodeB = head;
        ListNode advance = head;

        //imagaing starting from 1st position already, how many places do you want to move
        for(int i = 0; i < k - 1; i++){
            nodeA = nodeA.next;
        }

        //let's us find the nodeB's correct address
        //should it be advance or advance.next?
        //how long whould you wish to make nodeB wait if k = 1, no wait
        //and defanatily not equal to right
        int count = 0;
        while(advance != null){
            if(count > k - 1){
                advance = advance.next;
                nodeB = nodeB.next;
            }
            else{
                advance = advance.next;
                count++;
            }
        }

        int temp = nodeB.val;
        nodeB.val = nodeA.val;
        nodeA.val = temp;

        return head;
    }

}