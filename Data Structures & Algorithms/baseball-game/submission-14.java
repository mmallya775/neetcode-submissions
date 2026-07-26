class Solution {
  public int calPoints(String[] operations) {
    Deque<Integer> res = new ArrayDeque<>();

    for (String op : operations) {
      switch (op) {
        case "+" -> {
          int last = res.pop();
          int lastToLast = res.pop();

          res.push(lastToLast);
          res.push(last);
          res.push(last + lastToLast);
        }
        case "C", "c" -> res.pop();
        case "D", "d" -> res.push(res.element() * 2);
        default -> res.push(Integer.valueOf(op));
      }
    }
    int sum = 0;
    for (int score : res) {
      sum += score;
    }

    return sum;
  }
}