class Solution {
    public boolean isAnagram(String s, String t) {
        //create two hashmap, compare length, compare key - O(n) time and space
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : s.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char b : t.toCharArray()) {
            map2.put(b, map2.getOrDefault(b, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            char key = entry.getKey();
            if (!map2.containsKey(key))
                return false;
            if (!map2.get(key).equals(entry.getValue()))
                return false;
        }
        return true;
    }
}