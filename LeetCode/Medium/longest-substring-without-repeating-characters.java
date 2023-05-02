//problem: https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int longestSubString = 0;
        char ch;

        for (int i=0; i<s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.size() > longestSubString) {
                    longestSubString = map.size();
                }

                if (s.charAt(i-1) != s.charAt(i)) {
                    int j = map.get(s.charAt(i));
                    map.clear();

                    for (j+=1; j<i; j++)
                        map.put(s.charAt(j), j);
                } else {
                    map.clear();
                }
            }

            map.put(s.charAt(i), i);
        }

        return Math.max(longestSubString, map.size());
    }
}