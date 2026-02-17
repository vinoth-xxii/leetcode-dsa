/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //I will do with hashmap approach 1st
        //O(n) time and O(n) space
        HashMap<ListNode, Integer> hashmap = new HashMap<>();
        ListNode currentNode = head;
        int count = -1;
        while (currentNode != null) { //will terminate in no cycle
            count++;
            if (!hashmap.containsKey(currentNode)) {
                hashmap.put(currentNode, count);
                currentNode = currentNode.next;
            } else {
                return currentNode;
            }
        }
        return null;
    }

}