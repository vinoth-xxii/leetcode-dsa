class Node {
    int val;
    int min;

    public Node(int val, int min) {
        this.val = val;
        this.min = min;
    }
}

class MinStack {

    Stack<Node> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        int lastMin;

        if (!stack.isEmpty()) {
            Node lastNode = stack.peek();
            lastMin = lastNode.min;
        } else {
            lastMin = val;
        }
        int temp = Math.min(val, lastMin);
        Node newNode = new Node(val, temp);
        stack.push(newNode);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        Node lastNode = stack.peek();
        return lastNode.val;
    }

    public int getMin() {
        Node lastNode = stack.peek();
        return lastNode.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */