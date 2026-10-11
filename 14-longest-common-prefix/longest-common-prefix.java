class Solution {
    public String findCommon(String str1, String str2){
        int length = Math.min(str1.length(), str2.length());
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < length; i++){
            if(str1.charAt(i) != str2.charAt(i)) return res.toString();
            res.append(str1.charAt(i));
        }

        return res.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        return findCommon(strs[0], strs[strs.length - 1]);

    }
}