class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();

    // We need elements to the right to check against.
    // Don't let the loop enter after insufficient elements
    // on the right.
    for (int i = 0; i < nums.length - 2; i++) {
      // You cant form triplet sum of 0 with just
      // positive numbers. Since array is sorted
      // stop after first positive number.
      if (nums[i] > 0)
        break;

      // Skip duplicates!, the question requires that
      if (i > 0 && nums[i - 1] == nums[i])
        continue;

      int l = i + 1, r = nums.length - 1;
      while (l < r) {
        int sum = nums[i] + nums[l] + nums[r];

        if (sum < 0)
          l++;
        else if (sum > 0)
          r--;
        else {
          result.add(List.of(nums[i], nums[l], nums[r]));
          l++;
          r--;

          // handle case where left & right might be encountering duplicates
          while (l < r && nums[l] == nums[l - 1]) l++;
          while (l < r && nums[r] == nums[r + 1]) r--;
        }
      }
    }

    //        System.out.println(result);

    return result;
  }
}