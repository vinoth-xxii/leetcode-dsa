//Time : O(max(N,M))
//Space : O(max(N,M))
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); //new list creation
        ListNode current = dummy;

        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){ //if carry has 1, it should be attached in the end
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            current.next = new ListNode(sum % 10);
            carry = sum / 10;

            current = current.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
    return dummy.next;
    }
}