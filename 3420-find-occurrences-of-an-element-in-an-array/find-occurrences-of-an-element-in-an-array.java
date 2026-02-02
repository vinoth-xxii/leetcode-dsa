class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        HashMap<Integer, Integer> hashmap = new HashMap(); //O(N) space
        int[] answer = new int[queries.length]; //O(M) space
        int count = 0;
        for (int i = 0; i < nums.length; i++) { //O(N) time 
            if (nums[i] == x)
                hashmap.put(++count, i);
        }
        // for (int i = 0; i < queries.length; i++) { //O(M) time 
        //     if (queries[i] <= count) {
        //         answer[i] = hashmap.get(queries[i]);  //O(1) time
        //     } else
        //         answer[i] = -1;
        // }

        for (int i = 0; i < queries.length; i++) {
            if (hashmap.containsKey(queries[i]))  //using ContainsKey here
                answer[i] = hashmap.get(queries[i]);
            else
                answer[i] = -1;
        }
        return answer;
    }
}