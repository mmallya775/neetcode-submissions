class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();

        for (int n: nums) {
          if (counter.containsKey(n)) return true;
          else counter.put(n, 1);
        } 

        return false;
    }
}