/*Time : O(max(N,M)) -> 2N + 2M
Space : O(max(N,M)) -> N or M

Corrections : Time -> O(M + N)
	      Space -> O(M + N)
*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stackA = new Stack<>();
        Stack<Integer> stackB = new Stack<>();
        Stack<ListNode> resultGen = new Stack<>();

        int carry = 0;

        while (l1 != null || l2 != null) {
            if (l1 != null) {
                stackA.push(l1.val);
                l1 = l1.next;
            }
            if (l2 != null) {
                stackB.push(l2.val);
                l2 = l2.next;
            }
            resultGen.push(new ListNode());
        }

        ListNode temp = null;
        //!stackA.isEmpty() || !stackB.isEmpty()
        while (!resultGen.isEmpty()) {
            int a = (!stackA.isEmpty()) ? stackA.pop() : 0;
            int b = (!stackB.isEmpty()) ? stackB.pop() : 0;

            int sum = a + b + carry;
            int remainder = sum % 10;
            ListNode resNode = resultGen.pop();
            resNode.val = remainder;

            resNode.next = temp;

            carry = sum / 10;
            temp = resNode;
        }

        if (carry != 0) {
            ListNode newNode = new ListNode();
            newNode.val = carry;
            newNode.next = temp;
            temp = newNode;
        }

        return temp;
    }
}