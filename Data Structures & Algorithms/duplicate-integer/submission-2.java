class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> counter = new HashSet<>();

        for (int n: nums) {
          if (counter.contains(n)) return true;
          else counter.add(n);
        } 

        return false;
    }
}