class Solution {
  public int calPoints(String[] operations) {
    List<Integer> res = new ArrayList<>();

    for (String operation : operations) {
      switch (operation) {
        case "C" -> res.removeLast();
        case "D" -> res.add(res.getLast() * 2);
        case "+" -> res.add(res.getLast() + res.get(res.size() - 2));
        default -> res.add(Integer.valueOf(operation));
      }
    }

    return res.stream().reduce(0, Integer::sum);
  }
}