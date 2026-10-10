class Solution {
    public String longestCommonPrefix(String[] strs) {
        int leastOne = strs[0].length();
        for(String str : strs){
            leastOne = Math.min(leastOne, str.length());
        }


        String result = "";
        for(int i = 0; i < leastOne; i++){
            char ch = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(ch != strs[j].charAt(i)) return result;
            }
            result += ch;
        }

        return result;
    }
}