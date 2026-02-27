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

    int k;

    public ListNode getFromLeft(ListNode node) { // O(n) time
        for (int i = 1; i < k; i++) {
            node = node.next;
        }
        return node;
    }

    public ListNode getFromRight(ListNode node) { // O(n) time
        int count = 1;
        ListNode left = node;
        ListNode right = node;
        while (right.next != null) {
            right = right.next;
            if (count >= k) {
                left = left.next;
            }
            count++;
        }
        return left;
    }

    public ListNode swapNodes(ListNode head, int k) {
        /*
        Approach 1: 
        I will store the kth node from the beginning and from the end;
        using the knowledge from the removing nth node; and will swap those element
        
        Approach 2: (Given hint)
        Using array and indexing (kth value from the input)
        */
        this.k = k;
        ListNode a = getFromLeft(head); //1 is for left, -1 is from right, reverse
        ListNode b = getFromRight(head);

        int temp = a.val; // O(1) time
        a.val = b.val;
        b.val = temp;

        return head;
    }
}