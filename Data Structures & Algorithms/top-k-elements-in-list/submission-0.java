class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<List<Integer>> freq = new ArrayList<>(nums.length + 1);

        for (int i = 0; i <= nums.length; i++) {
            freq.add(new ArrayList<>());
        }

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        count.forEach((key, val) -> freq.get(val).add(key));

        int[] res = new int[k];
        int index = 0;

        for (int i = freq.size() - 1; i > 0 && index < k; i--) {
            for (int n : freq.get(i)) {
                if (index == k) break;
                res[index++] = n;
            }
        }

        return res;
    }
}
