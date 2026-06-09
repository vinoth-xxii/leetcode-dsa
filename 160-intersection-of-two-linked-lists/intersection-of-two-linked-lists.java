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

/* I knew i had to traverse from last to first to get the intersecting value,
The problem was how do i achieve it or aka how to keep track or store it without
simply using hashmp or an array, then traverse it back. then i immediately thought of using 
stack, which follows LIFO*/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack<ListNode> stackA = new Stack<>();
        Stack<ListNode> stackB = new Stack<>();

        ListNode currA = headA;
        while(currA != null){
            stackA.push(currA);
            currA = currA.next;
        }

        ListNode currB = headB;
        while(currB != null){
            stackB.push(currB);
            currB = currB.next;
        }

        ListNode result = null;
        while(!stackA.isEmpty() && !stackB.isEmpty()){
            ListNode tempA = stackA.pop();
            ListNode tempB = stackB.pop();
            if(tempA == tempB){
                result = tempA;
            }
            else{
                break;
            }
        }
        return result;
    }
}