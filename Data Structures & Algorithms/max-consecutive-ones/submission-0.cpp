class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int res = 0, crnt = 0;

        for (int n : nums) {
            crnt = n ? crnt + 1: 0;
            res = max(res, crnt);
        }

        return res;
    }
};