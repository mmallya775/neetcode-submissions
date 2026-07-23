class Solution {
  public int maxArea(int[] heights) {
    int res = 0;
    int l = 0, r = heights.length - 1;
    int area;

    while (l < r) {
      area = (r - l) * Math.min(heights[l], heights[r]);
      res = Math.max(res, area);

      if (heights[l] <= heights[r])
        l++;
      else
        r--;
    }

    return res;
  }
}