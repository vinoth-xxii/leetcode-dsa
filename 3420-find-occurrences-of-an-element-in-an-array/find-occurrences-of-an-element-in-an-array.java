class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        //Additional solution - without using HashMap
        List<Integer> indices = new ArrayList<>();  //List creation
        int[] answer = new int[queries.length];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == x) {
                indices.add(i); //since there are asking index, storing index here
            }
        }

        for(int i = 0; i < queries.length; i++){
            int occurance = queries[i];
            if(occurance <= indices.size()){ //for list use size()
                answer[i] = indices.get(occurance-1); //for list use get()
            }
            else answer[i] = -1;
        }
    
        return answer;
    }
}