class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> positions = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
          if (positions.containsKey(target-nums[i])) 
            return new int[]{positions.get(target-nums[i]), i};
          else 
            positions.put(nums[i],i);
        }
        return new int[]{};
    }
}
