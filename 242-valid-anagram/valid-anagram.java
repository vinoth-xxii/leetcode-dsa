class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        Map<Character, Integer> frequency = new HashMap<>();
        
        for(char ch : s.toCharArray()){
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
        
        for(char ch : t.toCharArray()){
            frequency.put(ch, frequency.getOrDefault(ch, -1) - 1);
        }

        for(int value : frequency.values()){
            if(value != 0) return false;
        }

        return true;
    }
}