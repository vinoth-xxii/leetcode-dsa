class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int num : asteroids) {
            if (num > 0) {
                stack.push(num);
            } else {
                boolean isLargest = true;
                while (!stack.isEmpty()) {
                    //the abs val of num > top
                    if (stack.peek() > 0 && Math.abs(num) > stack.peek()) {
                        stack.pop();
                    } else if (Math.abs(num) == stack.peek()) {
                        stack.pop();
                        isLargest = false;
                        break;
                    } else {
                        if(stack.peek() > 0) isLargest = false;
                        break;
                    }
                }
                if (isLargest)
                    stack.push(num);
            }
        }

        int size = stack.size();
        int[] result = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}