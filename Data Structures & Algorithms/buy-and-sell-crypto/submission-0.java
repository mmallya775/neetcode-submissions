class Solution {
  public int maxProfit(int[] prices) {
    if (prices.length <= 1) {
      return 0;
    } else {
      int L = 0;
      int R = 1;

      int maxProfit = 0;

      while (R < prices.length) {
        if (prices[L] < prices[R]) {
          int profit = prices[R] - prices[L];
          maxProfit = Math.max(profit, maxProfit);
        } else {
          L = R;
        }

        R++;
      }

      return maxProfit;
    }
  }
}
