class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> parens = Map.of(']', '[', '}', '{', ')', '(');

        Deque<Character> res = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (parens.containsKey(c)) {
                if (res.isEmpty()) {
                    return false;
                }
                if (res.removeLast().equals(parens.get(c))) {
                } else {
                    return false;
                }
            } else {
                res.add(c);
            }
        }

        return res.isEmpty();
    }
}
