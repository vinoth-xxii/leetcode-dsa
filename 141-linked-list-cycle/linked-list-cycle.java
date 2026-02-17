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
    public boolean hasCycle(ListNode head) {
        //creating set to store visited nodes
        Set<ListNode> hashmap = new HashSet<>(); //O(n) space
        ListNode currentNode = head;
        while (currentNode != null) {    //O(n) time
            if (!hashmap.contains(currentNode)) {  //O(1) time
                hashmap.add(currentNode);
                currentNode = currentNode.next;
            } else {
                return true; //list has a loop
            }
        }

        return false;

    }
}