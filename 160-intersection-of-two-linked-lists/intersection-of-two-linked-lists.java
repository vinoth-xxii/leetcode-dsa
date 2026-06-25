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
        int lengthA = 0;
        int lengthB = 0;

        ListNode currA = headA;
        ListNode currB = headB;

        while (currA != null) {
            lengthA++;
            currA = currA.next;
        }

        while (currB != null) {
            lengthB++;
            currB = currB.next;
        }

        int diff = Math.abs(lengthA - lengthB);

        currA = headA;
        currB = headB;

        if (lengthA >= lengthB) {
            while (diff > 0) {
                currA = currA.next;
                diff--;
            }
        } else {
            while (diff > 0) {
                currB = currB.next;
                diff--;
            }
        }

        while (currA != null) {
            if (currA == currB) {
                return currA;
            }
            currA = currA.next;
            currB = currB.next;
        }

    return currA;    
    }
}