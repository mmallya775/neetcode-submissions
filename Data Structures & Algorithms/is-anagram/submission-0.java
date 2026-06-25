class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> count = new HashMap<>();

        for (char c : s.toCharArray()) {
            count.merge(c, 1, Integer::sum);
        }
        for (char c : t.toCharArray()) {
            count.merge(c, -1, Integer::sum);
        }

        for (int v : count.values()) {
            if (v != 0) return false;
        }
        return true;
    }
}