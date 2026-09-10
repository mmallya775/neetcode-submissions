class Solution {
  public int[] dailyTemperatures(int[] temperatures) {
    var res = new int[temperatures.length];
    var stack = new ArrayDeque<Integer>();

    for (int i = 0; i < temperatures.length; i++) {
      while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
        var pop = stack.pop();
        res[pop] = i - pop;
      }
      stack.push(i);
    }
    return res;
  }
}
