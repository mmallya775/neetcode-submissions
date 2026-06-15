class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0, crnt = 0;
        for (int n: nums){
            crnt = (n == 1) ? crnt + 1 : 0;
            res = Math.max(res, crnt);
        }

        return res;
    }
}