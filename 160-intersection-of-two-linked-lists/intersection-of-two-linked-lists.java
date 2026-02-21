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
        /*Approach 1 : hashSet
          Approach 2 : two pointer - Quadratic time*/
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pt1 = headA;
        while (pt1 != null) {
            ListNode pt2 = headB;
            while (pt2 != null) {
                if (pt1 == pt2) {
                    return pt1;
                }
                pt2 = pt2.next;
            }
            pt1 = pt1.next;
        }
        return null;
    }
}