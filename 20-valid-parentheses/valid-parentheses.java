/* Pointing this to a real life scenario in hospital management(hypothically):
    - if a called patient didn't show, he will be put in queue
    - after few times, after person didn't show he will be put in queue
    - here, we call back from the latest, and not the oldest
    - now, how would i store and solve the issue?
    - at the end of the, we need to ensure the system is working correctly
*/

/* forget the above one, it follows last in first out */

// Time - O(N) and Space - O(N)
class Solution {
    public boolean isValid(String s) {
        boolean isValid = true;
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> keyPairs = new HashMap<>();

        keyPairs.put('(', ')');
        keyPairs.put('{', '}');
        keyPairs.put('[', ']');

        for (char c : s.toCharArray()) {
            if (keyPairs.containsKey(c)) {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    char last_val = stack.pop();
                    if (keyPairs.get(last_val) == c) {
                        continue;
                    } else {
                        isValid = false;
                        return isValid;
                    }
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty() && isValid;
    }
}