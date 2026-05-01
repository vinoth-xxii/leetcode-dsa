/*
how often do you want to swap the stack? whenever i do push operation. really? why not do it on pop
how do you ratain the origianl cerated stack? using tea as example, why do i even need to worry about the stack?
	i will pop unitl it near end, and put them back again; now that new end is the challenge, is it so? use size
*/
class MyQueue {

    Stack<Integer> glass1;
    Stack<Integer> glass2;

    public MyQueue() {
        glass1 = new Stack<>();
        glass2 = new Stack<>();
    }

    public int getGlassBottom() {
        int size = glass1.size();
        for (int i = 0; i < size - 1; i++) {
            int val = glass1.pop();
            glass2.push(val);
        }

        return glass1.peek();
    }

    public void contentsBacktoOriginal() {
        while (!glass2.isEmpty()) {
            glass1.push(glass2.pop());
        }
    }

    public void push(int x) {
        glass1.push(x);
    }

    public int pop() {
        int bottom = getGlassBottom();
        int var = glass1.pop();
        contentsBacktoOriginal();
        return var;
    }

    public int peek() {
        int bottom = getGlassBottom();
        contentsBacktoOriginal();
        return bottom;
    }

    public boolean empty() {
        return glass1.isEmpty();
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */