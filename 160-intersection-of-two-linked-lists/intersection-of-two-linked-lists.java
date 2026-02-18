/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //1st i will go with hash approach
        Set<ListNode> hashmapA = new HashSet<>();

        if(headA == null || headB == null){
            return null;
        }

        ListNode current = headA;
        while(current != null){
            hashmapA.add(current);
            current = current.next;
        }

        ListNode current1 = headB;
        while(current1 != null){
            if(hashmapA.contains(current1)){
                return current1;
            }
            current1 = current1.next;
        }

        return null;
    }
}