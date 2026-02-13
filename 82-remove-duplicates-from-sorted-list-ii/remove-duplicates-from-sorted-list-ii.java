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
        /* i can store the elements in hashmap
           and check it against the val of visiting node */

        // space - O(n)
        HashMap<Integer, Integer> hash = new HashMap<>();
        ListNode currentNode = head;

        // time - 2 * O(n) = O(n)
        while (currentNode != null) {
            if (hash.containsKey(currentNode.val)) {
                hash.put(currentNode.val, hash.get(currentNode.val) + 1);
            } else {
                hash.put(currentNode.val, 1);
            }
            currentNode = currentNode.next;
        }

        ListNode tempNode = head;

        while (tempNode != null && hash.get(tempNode.val) > 1) {
            head = tempNode.next;
            tempNode = tempNode.next;
        }

        while (tempNode != null && tempNode.next != null) {
            if (hash.get(tempNode.next.val) > 1) {
                tempNode.next = tempNode.next.next;
            } else {
                tempNode = tempNode.next;
            }
        }

        return head;
    }
}
